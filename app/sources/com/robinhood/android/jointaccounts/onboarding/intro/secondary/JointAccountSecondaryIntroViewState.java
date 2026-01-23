package com.robinhood.android.jointaccounts.onboarding.intro.secondary;

import com.robinhood.models.jointaccounts.api.onboarding.ApiJointAccountSecondaryIntroResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JointAccountSecondaryIntroViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/JointAccountSecondaryIntroViewState;", "", "Loading", "Loaded", "Error", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/JointAccountSecondaryIntroViewState$Error;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/JointAccountSecondaryIntroViewState$Loaded;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/JointAccountSecondaryIntroViewState$Loading;", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface JointAccountSecondaryIntroViewState {

    /* compiled from: JointAccountSecondaryIntroViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/JointAccountSecondaryIntroViewState$Loading;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/JointAccountSecondaryIntroViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements JointAccountSecondaryIntroViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1444327550;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: JointAccountSecondaryIntroViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/JointAccountSecondaryIntroViewState$Loaded;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/JointAccountSecondaryIntroViewState;", "viewModel", "Lcom/robinhood/models/jointaccounts/api/onboarding/ApiJointAccountSecondaryIntroResponse;", "loggingIdentifier", "", "<init>", "(Lcom/robinhood/models/jointaccounts/api/onboarding/ApiJointAccountSecondaryIntroResponse;Ljava/lang/String;)V", "getViewModel", "()Lcom/robinhood/models/jointaccounts/api/onboarding/ApiJointAccountSecondaryIntroResponse;", "getLoggingIdentifier", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements JointAccountSecondaryIntroViewState {
        public static final int $stable = 8;
        private final String loggingIdentifier;
        private final ApiJointAccountSecondaryIntroResponse viewModel;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, ApiJointAccountSecondaryIntroResponse apiJointAccountSecondaryIntroResponse, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                apiJointAccountSecondaryIntroResponse = loaded.viewModel;
            }
            if ((i & 2) != 0) {
                str = loaded.loggingIdentifier;
            }
            return loaded.copy(apiJointAccountSecondaryIntroResponse, str);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiJointAccountSecondaryIntroResponse getViewModel() {
            return this.viewModel;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }

        public final Loaded copy(ApiJointAccountSecondaryIntroResponse viewModel, String loggingIdentifier) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
            return new Loaded(viewModel, loggingIdentifier);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.viewModel, loaded.viewModel) && Intrinsics.areEqual(this.loggingIdentifier, loaded.loggingIdentifier);
        }

        public int hashCode() {
            return (this.viewModel.hashCode() * 31) + this.loggingIdentifier.hashCode();
        }

        public String toString() {
            return "Loaded(viewModel=" + this.viewModel + ", loggingIdentifier=" + this.loggingIdentifier + ")";
        }

        public Loaded(ApiJointAccountSecondaryIntroResponse viewModel, String loggingIdentifier) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
            this.viewModel = viewModel;
            this.loggingIdentifier = loggingIdentifier;
        }

        public final ApiJointAccountSecondaryIntroResponse getViewModel() {
            return this.viewModel;
        }

        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }
    }

    /* compiled from: JointAccountSecondaryIntroViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/JointAccountSecondaryIntroViewState$Error;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/JointAccountSecondaryIntroViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements JointAccountSecondaryIntroViewState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return 1364203982;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
        }
    }
}
