package com.robinhood.android.jointaccounts.onboarding.confirmation;

import com.robinhood.models.jointaccounts.api.confirmation.ApiConfirmSecondaryViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JointAccountConfirmSecondaryViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryViewState;", "", "Loading", "Loaded", "Error", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryViewState$Error;", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryViewState$Loaded;", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryViewState$Loading;", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface JointAccountConfirmSecondaryViewState {

    /* compiled from: JointAccountConfirmSecondaryViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryViewState$Loading;", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements JointAccountConfirmSecondaryViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 64597931;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: JointAccountConfirmSecondaryViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryViewState$Loaded;", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryViewState;", "viewModel", "Lcom/robinhood/models/jointaccounts/api/confirmation/ApiConfirmSecondaryViewModel;", "postingRejection", "", "source", "", "<init>", "(Lcom/robinhood/models/jointaccounts/api/confirmation/ApiConfirmSecondaryViewModel;ZLjava/lang/String;)V", "getViewModel", "()Lcom/robinhood/models/jointaccounts/api/confirmation/ApiConfirmSecondaryViewModel;", "getPostingRejection", "()Z", "getSource", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements JointAccountConfirmSecondaryViewState {
        public static final int $stable = 8;
        private final boolean postingRejection;
        private final String source;
        private final ApiConfirmSecondaryViewModel viewModel;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, ApiConfirmSecondaryViewModel apiConfirmSecondaryViewModel, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                apiConfirmSecondaryViewModel = loaded.viewModel;
            }
            if ((i & 2) != 0) {
                z = loaded.postingRejection;
            }
            if ((i & 4) != 0) {
                str = loaded.source;
            }
            return loaded.copy(apiConfirmSecondaryViewModel, z, str);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiConfirmSecondaryViewModel getViewModel() {
            return this.viewModel;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getPostingRejection() {
            return this.postingRejection;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final Loaded copy(ApiConfirmSecondaryViewModel viewModel, boolean postingRejection, String source) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Loaded(viewModel, postingRejection, source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.viewModel, loaded.viewModel) && this.postingRejection == loaded.postingRejection && Intrinsics.areEqual(this.source, loaded.source);
        }

        public int hashCode() {
            return (((this.viewModel.hashCode() * 31) + Boolean.hashCode(this.postingRejection)) * 31) + this.source.hashCode();
        }

        public String toString() {
            return "Loaded(viewModel=" + this.viewModel + ", postingRejection=" + this.postingRejection + ", source=" + this.source + ")";
        }

        public Loaded(ApiConfirmSecondaryViewModel viewModel, boolean z, String source) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            Intrinsics.checkNotNullParameter(source, "source");
            this.viewModel = viewModel;
            this.postingRejection = z;
            this.source = source;
        }

        public final ApiConfirmSecondaryViewModel getViewModel() {
            return this.viewModel;
        }

        public final boolean getPostingRejection() {
            return this.postingRejection;
        }

        public final String getSource() {
            return this.source;
        }
    }

    /* compiled from: JointAccountConfirmSecondaryViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryViewState$Error;", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements JointAccountConfirmSecondaryViewState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return -453218249;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
        }
    }
}
