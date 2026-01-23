package com.robinhood.android.retirement.partnerships.matchhub;

import com.robinhood.android.models.retirement.api.ApiRetirementMatchHubResponse;
import com.robinhood.android.retirement.partnerships.matchhub.RetirementMatchHubViewState;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: RetirementMatchHubDataState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bHÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/retirement/partnerships/matchhub/RetirementMatchHubDataState;", "", "source", "", "response", "Lcom/robinhood/android/models/retirement/api/ApiRetirementMatchHubResponse;", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/retirement/api/ApiRetirementMatchHubResponse;Ljava/lang/Exception;)V", "getSource", "()Ljava/lang/String;", "getResponse", "()Lcom/robinhood/android/models/retirement/api/ApiRetirementMatchHubResponse;", "getError", "()Ljava/lang/Exception;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Provider", "feature-retirement-partnerships_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RetirementMatchHubDataState {
    private final Exception error;
    private final ApiRetirementMatchHubResponse response;
    private final String source;

    /* renamed from: Provider, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ RetirementMatchHubDataState copy$default(RetirementMatchHubDataState retirementMatchHubDataState, String str, ApiRetirementMatchHubResponse apiRetirementMatchHubResponse, Exception exc, int i, Object obj) {
        if ((i & 1) != 0) {
            str = retirementMatchHubDataState.source;
        }
        if ((i & 2) != 0) {
            apiRetirementMatchHubResponse = retirementMatchHubDataState.response;
        }
        if ((i & 4) != 0) {
            exc = retirementMatchHubDataState.error;
        }
        return retirementMatchHubDataState.copy(str, apiRetirementMatchHubResponse, exc);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiRetirementMatchHubResponse getResponse() {
        return this.response;
    }

    /* renamed from: component3, reason: from getter */
    public final Exception getError() {
        return this.error;
    }

    public final RetirementMatchHubDataState copy(String source, ApiRetirementMatchHubResponse response, Exception error) {
        return new RetirementMatchHubDataState(source, response, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetirementMatchHubDataState)) {
            return false;
        }
        RetirementMatchHubDataState retirementMatchHubDataState = (RetirementMatchHubDataState) other;
        return Intrinsics.areEqual(this.source, retirementMatchHubDataState.source) && Intrinsics.areEqual(this.response, retirementMatchHubDataState.response) && Intrinsics.areEqual(this.error, retirementMatchHubDataState.error);
    }

    public int hashCode() {
        String str = this.source;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ApiRetirementMatchHubResponse apiRetirementMatchHubResponse = this.response;
        int iHashCode2 = (iHashCode + (apiRetirementMatchHubResponse == null ? 0 : apiRetirementMatchHubResponse.hashCode())) * 31;
        Exception exc = this.error;
        return iHashCode2 + (exc != null ? exc.hashCode() : 0);
    }

    public String toString() {
        return "RetirementMatchHubDataState(source=" + this.source + ", response=" + this.response + ", error=" + this.error + ")";
    }

    public RetirementMatchHubDataState(String str, ApiRetirementMatchHubResponse apiRetirementMatchHubResponse, Exception exc) {
        this.source = str;
        this.response = apiRetirementMatchHubResponse;
        this.error = exc;
    }

    public /* synthetic */ RetirementMatchHubDataState(String str, ApiRetirementMatchHubResponse apiRetirementMatchHubResponse, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : apiRetirementMatchHubResponse, (i & 4) != 0 ? null : exc);
    }

    public final String getSource() {
        return this.source;
    }

    public final ApiRetirementMatchHubResponse getResponse() {
        return this.response;
    }

    public final Exception getError() {
        return this.error;
    }

    /* compiled from: RetirementMatchHubDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirement/partnerships/matchhub/RetirementMatchHubDataState$Provider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/retirement/partnerships/matchhub/RetirementMatchHubDataState;", "Lcom/robinhood/android/retirement/partnerships/matchhub/RetirementMatchHubViewState;", "<init>", "()V", "reduce", "dataState", "feature-retirement-partnerships_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.retirement.partnerships.matchhub.RetirementMatchHubDataState$Provider, reason: from kotlin metadata */
    public static final class Companion implements StateProvider<RetirementMatchHubDataState, RetirementMatchHubViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public RetirementMatchHubViewState reduce(RetirementMatchHubDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getResponse() == null) {
                return dataState.getError() != null ? RetirementMatchHubViewState.Error.INSTANCE : RetirementMatchHubViewState.Loading.INSTANCE;
            }
            ApiRetirementMatchHubResponse.MatchHubViewModel mobile_view_model = dataState.getResponse().getMobile_view_model();
            String source = dataState.getSource();
            if (source == null) {
                source = "";
            }
            return new RetirementMatchHubViewState.Loaded(source, mobile_view_model.getHeader(), extensions2.toImmutableList(mobile_view_model.getContent()), extensions2.toImmutableList(mobile_view_model.getFooter_content()), mobile_view_model.getLogging_identifier());
        }
    }
}
