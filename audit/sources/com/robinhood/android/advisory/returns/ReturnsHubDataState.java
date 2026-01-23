package com.robinhood.android.advisory.returns;

import com.robinhood.android.advisory.returns.ReturnsHubViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.advisory.p304db.returns.ReturnsHubResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReturnsHubDataState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/advisory/returns/ReturnsHubDataState;", "", "toolTipHasShown", "", "returnsHubResponse", "Lcom/robinhood/models/advisory/db/returns/ReturnsHubResponse;", "<init>", "(ZLcom/robinhood/models/advisory/db/returns/ReturnsHubResponse;)V", "getToolTipHasShown", "()Z", "getReturnsHubResponse", "()Lcom/robinhood/models/advisory/db/returns/ReturnsHubResponse;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Reducer", "feature-returns-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ReturnsHubDataState {
    private final ReturnsHubResponse returnsHubResponse;
    private final boolean toolTipHasShown;

    /* renamed from: Reducer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public ReturnsHubDataState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ReturnsHubDataState copy$default(ReturnsHubDataState returnsHubDataState, boolean z, ReturnsHubResponse returnsHubResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            z = returnsHubDataState.toolTipHasShown;
        }
        if ((i & 2) != 0) {
            returnsHubResponse = returnsHubDataState.returnsHubResponse;
        }
        return returnsHubDataState.copy(z, returnsHubResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getToolTipHasShown() {
        return this.toolTipHasShown;
    }

    /* renamed from: component2, reason: from getter */
    public final ReturnsHubResponse getReturnsHubResponse() {
        return this.returnsHubResponse;
    }

    public final ReturnsHubDataState copy(boolean toolTipHasShown, ReturnsHubResponse returnsHubResponse) {
        return new ReturnsHubDataState(toolTipHasShown, returnsHubResponse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnsHubDataState)) {
            return false;
        }
        ReturnsHubDataState returnsHubDataState = (ReturnsHubDataState) other;
        return this.toolTipHasShown == returnsHubDataState.toolTipHasShown && Intrinsics.areEqual(this.returnsHubResponse, returnsHubDataState.returnsHubResponse);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.toolTipHasShown) * 31;
        ReturnsHubResponse returnsHubResponse = this.returnsHubResponse;
        return iHashCode + (returnsHubResponse == null ? 0 : returnsHubResponse.hashCode());
    }

    public String toString() {
        return "ReturnsHubDataState(toolTipHasShown=" + this.toolTipHasShown + ", returnsHubResponse=" + this.returnsHubResponse + ")";
    }

    public ReturnsHubDataState(boolean z, ReturnsHubResponse returnsHubResponse) {
        this.toolTipHasShown = z;
        this.returnsHubResponse = returnsHubResponse;
    }

    public /* synthetic */ ReturnsHubDataState(boolean z, ReturnsHubResponse returnsHubResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : returnsHubResponse);
    }

    public final boolean getToolTipHasShown() {
        return this.toolTipHasShown;
    }

    public final ReturnsHubResponse getReturnsHubResponse() {
        return this.returnsHubResponse;
    }

    /* compiled from: ReturnsHubDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/returns/ReturnsHubDataState$Reducer;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advisory/returns/ReturnsHubDataState;", "Lcom/robinhood/android/advisory/returns/ReturnsHubViewState;", "<init>", "()V", "reduce", "dataState", "feature-returns-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.returns.ReturnsHubDataState$Reducer, reason: from kotlin metadata */
    public static final class Companion implements StateProvider<ReturnsHubDataState, ReturnsHubViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public ReturnsHubViewState reduce(ReturnsHubDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getReturnsHubResponse() == null) {
                return ReturnsHubViewState.Loading.INSTANCE;
            }
            return new ReturnsHubViewState.Loaded(dataState.getReturnsHubResponse(), !dataState.getToolTipHasShown());
        }
    }
}
