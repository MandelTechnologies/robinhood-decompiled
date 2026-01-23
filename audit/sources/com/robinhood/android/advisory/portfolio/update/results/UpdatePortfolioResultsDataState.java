package com.robinhood.android.advisory.portfolio.update.results;

import com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsResponse;
import com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsViewState;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: UpdatePortfolioResultsDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsDataState;", "", "response", "Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsResponse;", "error", "", "<init>", "(Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsResponse;Ljava/lang/Throwable;)V", "getResponse", "()Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsResponse;", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UpdatePortfolioResultsDataState {
    private final Throwable error;
    private final UpdatePortfolioResultsResponse response;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public UpdatePortfolioResultsDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UpdatePortfolioResultsDataState copy$default(UpdatePortfolioResultsDataState updatePortfolioResultsDataState, UpdatePortfolioResultsResponse updatePortfolioResultsResponse, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            updatePortfolioResultsResponse = updatePortfolioResultsDataState.response;
        }
        if ((i & 2) != 0) {
            th = updatePortfolioResultsDataState.error;
        }
        return updatePortfolioResultsDataState.copy(updatePortfolioResultsResponse, th);
    }

    /* renamed from: component1, reason: from getter */
    public final UpdatePortfolioResultsResponse getResponse() {
        return this.response;
    }

    /* renamed from: component2, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    public final UpdatePortfolioResultsDataState copy(UpdatePortfolioResultsResponse response, Throwable error) {
        return new UpdatePortfolioResultsDataState(response, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdatePortfolioResultsDataState)) {
            return false;
        }
        UpdatePortfolioResultsDataState updatePortfolioResultsDataState = (UpdatePortfolioResultsDataState) other;
        return Intrinsics.areEqual(this.response, updatePortfolioResultsDataState.response) && Intrinsics.areEqual(this.error, updatePortfolioResultsDataState.error);
    }

    public int hashCode() {
        UpdatePortfolioResultsResponse updatePortfolioResultsResponse = this.response;
        int iHashCode = (updatePortfolioResultsResponse == null ? 0 : updatePortfolioResultsResponse.hashCode()) * 31;
        Throwable th = this.error;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "UpdatePortfolioResultsDataState(response=" + this.response + ", error=" + this.error + ")";
    }

    public UpdatePortfolioResultsDataState(UpdatePortfolioResultsResponse updatePortfolioResultsResponse, Throwable th) {
        this.response = updatePortfolioResultsResponse;
        this.error = th;
    }

    public /* synthetic */ UpdatePortfolioResultsDataState(UpdatePortfolioResultsResponse updatePortfolioResultsResponse, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : updatePortfolioResultsResponse, (i & 2) != 0 ? null : th);
    }

    public final UpdatePortfolioResultsResponse getResponse() {
        return this.response;
    }

    public final Throwable getError() {
        return this.error;
    }

    /* compiled from: UpdatePortfolioResultsDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsDataState;", "Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsViewState;", "<init>", "()V", "reduce", "dataState", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StateProvider<UpdatePortfolioResultsDataState, UpdatePortfolioResultsViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public UpdatePortfolioResultsViewState reduce(UpdatePortfolioResultsDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getResponse() == null) {
                return dataState.getError() != null ? UpdatePortfolioResultsViewState.Error.INSTANCE : UpdatePortfolioResultsViewState.Loading.INSTANCE;
            }
            UpdatePortfolioResultsResponse.Details details = dataState.getResponse().getDetails();
            if (details instanceof UpdatePortfolioResultsResponse.Details.Change) {
                UpdatePortfolioResultsResponse.Details.Change change = (UpdatePortfolioResultsResponse.Details.Change) details;
                return new UpdatePortfolioResultsViewState.Change(dataState.getResponse().getTitle(), dataState.getResponse().getSubtitle(), change.getDisclosure(), extensions2.toPersistentList(change.getRows()));
            }
            if (!(details instanceof UpdatePortfolioResultsResponse.Details.NoChange)) {
                throw new NoWhenBranchMatchedException();
            }
            UpdatePortfolioResultsResponse.Details.NoChange noChange = (UpdatePortfolioResultsResponse.Details.NoChange) details;
            return new UpdatePortfolioResultsViewState.NoChange(dataState.getResponse().getTitle(), dataState.getResponse().getSubtitle(), noChange.getLottieUrlDark(), noChange.getLottieUrlLight());
        }
    }
}
