package com.robinhood.android.jointaccounts.onboarding.intro.secondary.authenticated;

import com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountSecondaryIntroViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.jointaccounts.api.onboarding.ApiJointAccountSecondaryIntroResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AuthenticatedJointAccountSecondaryIntroDataState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/authenticated/AuthenticatedJointAccountSecondaryIntroDataState;", "", "isErrorState", "", "viewModel", "Lcom/robinhood/models/jointaccounts/api/onboarding/ApiJointAccountSecondaryIntroResponse;", "<init>", "(ZLcom/robinhood/models/jointaccounts/api/onboarding/ApiJointAccountSecondaryIntroResponse;)V", "()Z", "getViewModel", "()Lcom/robinhood/models/jointaccounts/api/onboarding/ApiJointAccountSecondaryIntroResponse;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AuthenticatedJointAccountSecondaryIntroDataState {
    private static final String LOGGING_IDENTIFIER = "authenticated";
    private final boolean isErrorState;
    private final ApiJointAccountSecondaryIntroResponse viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public AuthenticatedJointAccountSecondaryIntroDataState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AuthenticatedJointAccountSecondaryIntroDataState copy$default(AuthenticatedJointAccountSecondaryIntroDataState authenticatedJointAccountSecondaryIntroDataState, boolean z, ApiJointAccountSecondaryIntroResponse apiJointAccountSecondaryIntroResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            z = authenticatedJointAccountSecondaryIntroDataState.isErrorState;
        }
        if ((i & 2) != 0) {
            apiJointAccountSecondaryIntroResponse = authenticatedJointAccountSecondaryIntroDataState.viewModel;
        }
        return authenticatedJointAccountSecondaryIntroDataState.copy(z, apiJointAccountSecondaryIntroResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsErrorState() {
        return this.isErrorState;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiJointAccountSecondaryIntroResponse getViewModel() {
        return this.viewModel;
    }

    public final AuthenticatedJointAccountSecondaryIntroDataState copy(boolean isErrorState, ApiJointAccountSecondaryIntroResponse viewModel) {
        return new AuthenticatedJointAccountSecondaryIntroDataState(isErrorState, viewModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthenticatedJointAccountSecondaryIntroDataState)) {
            return false;
        }
        AuthenticatedJointAccountSecondaryIntroDataState authenticatedJointAccountSecondaryIntroDataState = (AuthenticatedJointAccountSecondaryIntroDataState) other;
        return this.isErrorState == authenticatedJointAccountSecondaryIntroDataState.isErrorState && Intrinsics.areEqual(this.viewModel, authenticatedJointAccountSecondaryIntroDataState.viewModel);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isErrorState) * 31;
        ApiJointAccountSecondaryIntroResponse apiJointAccountSecondaryIntroResponse = this.viewModel;
        return iHashCode + (apiJointAccountSecondaryIntroResponse == null ? 0 : apiJointAccountSecondaryIntroResponse.hashCode());
    }

    public String toString() {
        return "AuthenticatedJointAccountSecondaryIntroDataState(isErrorState=" + this.isErrorState + ", viewModel=" + this.viewModel + ")";
    }

    public AuthenticatedJointAccountSecondaryIntroDataState(boolean z, ApiJointAccountSecondaryIntroResponse apiJointAccountSecondaryIntroResponse) {
        this.isErrorState = z;
        this.viewModel = apiJointAccountSecondaryIntroResponse;
    }

    public /* synthetic */ AuthenticatedJointAccountSecondaryIntroDataState(boolean z, ApiJointAccountSecondaryIntroResponse apiJointAccountSecondaryIntroResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : apiJointAccountSecondaryIntroResponse);
    }

    public final boolean isErrorState() {
        return this.isErrorState;
    }

    public final ApiJointAccountSecondaryIntroResponse getViewModel() {
        return this.viewModel;
    }

    /* compiled from: AuthenticatedJointAccountSecondaryIntroDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/authenticated/AuthenticatedJointAccountSecondaryIntroDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/authenticated/AuthenticatedJointAccountSecondaryIntroDataState;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/JointAccountSecondaryIntroViewState;", "<init>", "()V", "LOGGING_IDENTIFIER", "", "reduce", "dataState", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StateProvider<AuthenticatedJointAccountSecondaryIntroDataState, JointAccountSecondaryIntroViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public JointAccountSecondaryIntroViewState reduce(AuthenticatedJointAccountSecondaryIntroDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            return dataState.isErrorState() ? JointAccountSecondaryIntroViewState.Error.INSTANCE : dataState.getViewModel() == null ? JointAccountSecondaryIntroViewState.Loading.INSTANCE : new JointAccountSecondaryIntroViewState.Loaded(dataState.getViewModel(), AuthenticatedJointAccountSecondaryIntroDataState.LOGGING_IDENTIFIER);
        }
    }
}
