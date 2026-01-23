package com.robinhood.android.advisory.onboarding.firstdeposit.transfertype;

import com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.advisory.api.contribution.ApiAdvisoryFirstTimeContributionViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryFundingMethodsDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsDataState;", "", "viewModel", "Lcom/robinhood/models/advisory/api/contribution/ApiAdvisoryFirstTimeContributionViewModel;", "error", "", "<init>", "(Lcom/robinhood/models/advisory/api/contribution/ApiAdvisoryFirstTimeContributionViewModel;Ljava/lang/Throwable;)V", "getViewModel", "()Lcom/robinhood/models/advisory/api/contribution/ApiAdvisoryFirstTimeContributionViewModel;", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AdvisoryFundingMethodsDataState {
    private final Throwable error;
    private final ApiAdvisoryFirstTimeContributionViewModel viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public AdvisoryFundingMethodsDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AdvisoryFundingMethodsDataState copy$default(AdvisoryFundingMethodsDataState advisoryFundingMethodsDataState, ApiAdvisoryFirstTimeContributionViewModel apiAdvisoryFirstTimeContributionViewModel, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            apiAdvisoryFirstTimeContributionViewModel = advisoryFundingMethodsDataState.viewModel;
        }
        if ((i & 2) != 0) {
            th = advisoryFundingMethodsDataState.error;
        }
        return advisoryFundingMethodsDataState.copy(apiAdvisoryFirstTimeContributionViewModel, th);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiAdvisoryFirstTimeContributionViewModel getViewModel() {
        return this.viewModel;
    }

    /* renamed from: component2, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    public final AdvisoryFundingMethodsDataState copy(ApiAdvisoryFirstTimeContributionViewModel viewModel, Throwable error) {
        return new AdvisoryFundingMethodsDataState(viewModel, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvisoryFundingMethodsDataState)) {
            return false;
        }
        AdvisoryFundingMethodsDataState advisoryFundingMethodsDataState = (AdvisoryFundingMethodsDataState) other;
        return Intrinsics.areEqual(this.viewModel, advisoryFundingMethodsDataState.viewModel) && Intrinsics.areEqual(this.error, advisoryFundingMethodsDataState.error);
    }

    public int hashCode() {
        ApiAdvisoryFirstTimeContributionViewModel apiAdvisoryFirstTimeContributionViewModel = this.viewModel;
        int iHashCode = (apiAdvisoryFirstTimeContributionViewModel == null ? 0 : apiAdvisoryFirstTimeContributionViewModel.hashCode()) * 31;
        Throwable th = this.error;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "AdvisoryFundingMethodsDataState(viewModel=" + this.viewModel + ", error=" + this.error + ")";
    }

    public AdvisoryFundingMethodsDataState(ApiAdvisoryFirstTimeContributionViewModel apiAdvisoryFirstTimeContributionViewModel, Throwable th) {
        this.viewModel = apiAdvisoryFirstTimeContributionViewModel;
        this.error = th;
    }

    public /* synthetic */ AdvisoryFundingMethodsDataState(ApiAdvisoryFirstTimeContributionViewModel apiAdvisoryFirstTimeContributionViewModel, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiAdvisoryFirstTimeContributionViewModel, (i & 2) != 0 ? null : th);
    }

    public final ApiAdvisoryFirstTimeContributionViewModel getViewModel() {
        return this.viewModel;
    }

    public final Throwable getError() {
        return this.error;
    }

    /* compiled from: AdvisoryFundingMethodsDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsDataState;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsViewState;", "<init>", "()V", "reduce", "dataState", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StateProvider<AdvisoryFundingMethodsDataState, AdvisoryFundingMethodsViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public AdvisoryFundingMethodsViewState reduce(AdvisoryFundingMethodsDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getViewModel() != null) {
                return new AdvisoryFundingMethodsViewState.Loaded(dataState.getViewModel());
            }
            return dataState.getError() != null ? AdvisoryFundingMethodsViewState.Error.INSTANCE : AdvisoryFundingMethodsViewState.Loading.INSTANCE;
        }
    }
}
