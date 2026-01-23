package com.robinhood.android.jointaccounts.onboarding.intro.primary;

import com.robinhood.android.jointaccounts.onboarding.JointAccountOnboardingAsset;
import com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPrimaryIntroViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.jointaccounts.api.onboarding.ApiJointAccountPrimaryIntroResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: JointAccountPrimaryIntroDataState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroDataState;", "", "source", "", "isErrorState", "", "response", "Lcom/robinhood/models/jointaccounts/api/onboarding/ApiJointAccountPrimaryIntroResponse;", "<init>", "(Ljava/lang/String;ZLcom/robinhood/models/jointaccounts/api/onboarding/ApiJointAccountPrimaryIntroResponse;)V", "getSource", "()Ljava/lang/String;", "()Z", "getResponse", "()Lcom/robinhood/models/jointaccounts/api/onboarding/ApiJointAccountPrimaryIntroResponse;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class JointAccountPrimaryIntroDataState {
    private final boolean isErrorState;
    private final ApiJointAccountPrimaryIntroResponse response;
    private final String source;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ JointAccountPrimaryIntroDataState copy$default(JointAccountPrimaryIntroDataState jointAccountPrimaryIntroDataState, String str, boolean z, ApiJointAccountPrimaryIntroResponse apiJointAccountPrimaryIntroResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jointAccountPrimaryIntroDataState.source;
        }
        if ((i & 2) != 0) {
            z = jointAccountPrimaryIntroDataState.isErrorState;
        }
        if ((i & 4) != 0) {
            apiJointAccountPrimaryIntroResponse = jointAccountPrimaryIntroDataState.response;
        }
        return jointAccountPrimaryIntroDataState.copy(str, z, apiJointAccountPrimaryIntroResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsErrorState() {
        return this.isErrorState;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiJointAccountPrimaryIntroResponse getResponse() {
        return this.response;
    }

    public final JointAccountPrimaryIntroDataState copy(String source, boolean isErrorState, ApiJointAccountPrimaryIntroResponse response) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new JointAccountPrimaryIntroDataState(source, isErrorState, response);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JointAccountPrimaryIntroDataState)) {
            return false;
        }
        JointAccountPrimaryIntroDataState jointAccountPrimaryIntroDataState = (JointAccountPrimaryIntroDataState) other;
        return Intrinsics.areEqual(this.source, jointAccountPrimaryIntroDataState.source) && this.isErrorState == jointAccountPrimaryIntroDataState.isErrorState && Intrinsics.areEqual(this.response, jointAccountPrimaryIntroDataState.response);
    }

    public int hashCode() {
        int iHashCode = ((this.source.hashCode() * 31) + Boolean.hashCode(this.isErrorState)) * 31;
        ApiJointAccountPrimaryIntroResponse apiJointAccountPrimaryIntroResponse = this.response;
        return iHashCode + (apiJointAccountPrimaryIntroResponse == null ? 0 : apiJointAccountPrimaryIntroResponse.hashCode());
    }

    public String toString() {
        return "JointAccountPrimaryIntroDataState(source=" + this.source + ", isErrorState=" + this.isErrorState + ", response=" + this.response + ")";
    }

    public JointAccountPrimaryIntroDataState(String source, boolean z, ApiJointAccountPrimaryIntroResponse apiJointAccountPrimaryIntroResponse) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.isErrorState = z;
        this.response = apiJointAccountPrimaryIntroResponse;
    }

    public /* synthetic */ JointAccountPrimaryIntroDataState(String str, boolean z, ApiJointAccountPrimaryIntroResponse apiJointAccountPrimaryIntroResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : apiJointAccountPrimaryIntroResponse);
    }

    public final String getSource() {
        return this.source;
    }

    public final boolean isErrorState() {
        return this.isErrorState;
    }

    public final ApiJointAccountPrimaryIntroResponse getResponse() {
        return this.response;
    }

    /* compiled from: JointAccountPrimaryIntroDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroDataState;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroViewState;", "<init>", "()V", "reduce", "dataState", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StateProvider<JointAccountPrimaryIntroDataState, JointAccountPrimaryIntroViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public JointAccountPrimaryIntroViewState reduce(JointAccountPrimaryIntroDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            ApiJointAccountPrimaryIntroResponse response = dataState.getResponse();
            ApiJointAccountPrimaryIntroResponse.VariantViewModel variant_2_view_model = response != null ? response.getVariant_2_view_model() : null;
            if (dataState.isErrorState()) {
                return JointAccountPrimaryIntroViewState.Error.INSTANCE;
            }
            if (variant_2_view_model == null) {
                return JointAccountPrimaryIntroViewState.Loading.INSTANCE;
            }
            ApiJointAccountPrimaryIntroResponse.VariantViewModel variantViewModel = variant_2_view_model;
            return new JointAccountPrimaryIntroViewState.Loaded(JointAccountOnboardingAsset.Fullscreen.PrimaryIntroVariant2.INSTANCE, variantViewModel.getImage_url(), extensions2.toPersistentList(variantViewModel.getBody_content()), extensions2.toPersistentList(variantViewModel.getSticky_content()), variantViewModel.getButton_text(), variantViewModel.getButton_logging_identifier(), dataState.getSource(), dataState.getResponse().getIneligible_bottom_sheet());
        }
    }
}
