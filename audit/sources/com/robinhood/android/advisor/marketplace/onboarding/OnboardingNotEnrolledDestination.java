package com.robinhood.android.advisor.marketplace.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import com.robinhood.models.advisor.marketplace.p303db.onboarding.AdvisorDashboardState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Destinations.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/advisor/marketplace/onboarding/OnboardingNotEnrolledDestination;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;", "Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorDashboardState$NotEnrolled;", "<init>", "()V", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "feature-advisor-marketplace-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class OnboardingNotEnrolledDestination extends ComposableDestinationWithArgs<AdvisorDashboardState.NotEnrolled> {
    public static final OnboardingNotEnrolledDestination INSTANCE = new OnboardingNotEnrolledDestination();
    public static final int $stable = ComposableDestinationWithArgs.$stable;
    public static final Parcelable.Creator<OnboardingNotEnrolledDestination> CREATOR = new Creator();

    /* compiled from: Destinations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<OnboardingNotEnrolledDestination> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OnboardingNotEnrolledDestination createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return OnboardingNotEnrolledDestination.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OnboardingNotEnrolledDestination[] newArray(int i) {
            return new OnboardingNotEnrolledDestination[i];
        }
    }

    @Override // com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    private OnboardingNotEnrolledDestination() {
        super("advisor_marketplace_onboarding_not_enrolled", AdvisorDashboardState.NotEnrolled.class, null, null, null, 28, null);
    }
}
