package com.robinhood.android.jointaccounts.onboarding.nux;

import com.robinhood.models.jointaccounts.api.confirmation.ApiSecondarySetupViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SecondarySetupViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/nux/SecondarySetupViewState;", "", "viewModel", "Lcom/robinhood/models/jointaccounts/api/confirmation/ApiSecondarySetupViewModel;", "source", "", "<init>", "(Lcom/robinhood/models/jointaccounts/api/confirmation/ApiSecondarySetupViewModel;Ljava/lang/String;)V", "getViewModel", "()Lcom/robinhood/models/jointaccounts/api/confirmation/ApiSecondarySetupViewModel;", "getSource", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SecondarySetupViewState {
    public static final int $stable = 8;
    private final String source;
    private final ApiSecondarySetupViewModel viewModel;

    public static /* synthetic */ SecondarySetupViewState copy$default(SecondarySetupViewState secondarySetupViewState, ApiSecondarySetupViewModel apiSecondarySetupViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            apiSecondarySetupViewModel = secondarySetupViewState.viewModel;
        }
        if ((i & 2) != 0) {
            str = secondarySetupViewState.source;
        }
        return secondarySetupViewState.copy(apiSecondarySetupViewModel, str);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiSecondarySetupViewModel getViewModel() {
        return this.viewModel;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final SecondarySetupViewState copy(ApiSecondarySetupViewModel viewModel, String source) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(source, "source");
        return new SecondarySetupViewState(viewModel, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecondarySetupViewState)) {
            return false;
        }
        SecondarySetupViewState secondarySetupViewState = (SecondarySetupViewState) other;
        return Intrinsics.areEqual(this.viewModel, secondarySetupViewState.viewModel) && Intrinsics.areEqual(this.source, secondarySetupViewState.source);
    }

    public int hashCode() {
        return (this.viewModel.hashCode() * 31) + this.source.hashCode();
    }

    public String toString() {
        return "SecondarySetupViewState(viewModel=" + this.viewModel + ", source=" + this.source + ")";
    }

    public SecondarySetupViewState(ApiSecondarySetupViewModel viewModel, String source) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(source, "source");
        this.viewModel = viewModel;
        this.source = source;
    }

    public final ApiSecondarySetupViewModel getViewModel() {
        return this.viewModel;
    }

    public final String getSource() {
        return this.source;
    }
}
