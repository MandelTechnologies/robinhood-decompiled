package com.robinhood.android.advisor.marketplace.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import com.robinhood.models.advisor.marketplace.p303db.onboarding.AdvisorDashboardState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Destinations.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0002\t\nB\u001f\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/advisor/marketplace/onboarding/OnboardingInitialDestination;", "T", "Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorDashboardState;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;", "argumentClass", "Ljava/lang/Class;", "argument", "<init>", "(Ljava/lang/Class;Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorDashboardState;)V", "Error", "NotEnrolled", "Lcom/robinhood/android/advisor/marketplace/onboarding/OnboardingInitialDestination$Error;", "Lcom/robinhood/android/advisor/marketplace/onboarding/OnboardingInitialDestination$NotEnrolled;", "feature-advisor-marketplace-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public abstract class OnboardingInitialDestination<T extends AdvisorDashboardState> extends ComposableDestinationWithArgs<T> {
    public static final int $stable = ComposableDestinationWithArgs.$stable;

    public /* synthetic */ OnboardingInitialDestination(Class cls, AdvisorDashboardState advisorDashboardState, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, advisorDashboardState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvisorDashboardState _init_$lambda$0(AdvisorDashboardState advisorDashboardState) {
        return advisorDashboardState;
    }

    private OnboardingInitialDestination(Class<T> cls, final T t) {
        super("onboarding_initial_destination", cls, new Function0() { // from class: com.robinhood.android.advisor.marketplace.onboarding.OnboardingInitialDestination$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OnboardingInitialDestination._init_$lambda$0(t);
            }
        }, null, null, 24, null);
    }

    /* compiled from: Destinations.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0011\u0010\u0003\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/advisor/marketplace/onboarding/OnboardingInitialDestination$Error;", "Lcom/robinhood/android/advisor/marketplace/onboarding/OnboardingInitialDestination;", "Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorDashboardState$Error;", "state", "<init>", "(Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorDashboardState$Error;)V", "getState", "()Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorDashboardState$Error;", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "feature-advisor-marketplace-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Error extends OnboardingInitialDestination<AdvisorDashboardState.Error> {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Error> CREATOR = new Creator();
        private final AdvisorDashboardState.Error state;

        /* compiled from: Destinations.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Error> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Error((AdvisorDashboardState.Error) parcel.readParcelable(Error.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }

        @Override // com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.state, flags);
        }

        public final AdvisorDashboardState.Error getState() {
            return this.state;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(AdvisorDashboardState.Error state) {
            super(AdvisorDashboardState.Error.class, state, null);
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
        }
    }

    /* compiled from: Destinations.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0011\u0010\u0003\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/advisor/marketplace/onboarding/OnboardingInitialDestination$NotEnrolled;", "Lcom/robinhood/android/advisor/marketplace/onboarding/OnboardingInitialDestination;", "Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorDashboardState$NotEnrolled;", "state", "<init>", "(Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorDashboardState$NotEnrolled;)V", "getState", "()Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorDashboardState$NotEnrolled;", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "feature-advisor-marketplace-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NotEnrolled extends OnboardingInitialDestination<AdvisorDashboardState.NotEnrolled> {
        public static final int $stable = 8;
        public static final Parcelable.Creator<NotEnrolled> CREATOR = new Creator();
        private final AdvisorDashboardState.NotEnrolled state;

        /* compiled from: Destinations.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<NotEnrolled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NotEnrolled createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NotEnrolled((AdvisorDashboardState.NotEnrolled) parcel.readParcelable(NotEnrolled.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NotEnrolled[] newArray(int i) {
                return new NotEnrolled[i];
            }
        }

        @Override // com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.state, flags);
        }

        public final AdvisorDashboardState.NotEnrolled getState() {
            return this.state;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotEnrolled(AdvisorDashboardState.NotEnrolled state) {
            super(AdvisorDashboardState.NotEnrolled.class, state, null);
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
        }
    }
}
