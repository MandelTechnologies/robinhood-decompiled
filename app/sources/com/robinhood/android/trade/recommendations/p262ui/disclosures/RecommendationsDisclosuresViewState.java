package com.robinhood.android.trade.recommendations.p262ui.disclosures;

import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsDisclosures;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsDisclosuresViewState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/disclosures/RecommendationsDisclosuresViewState;", "", "isLoading", "", "disclosures", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsDisclosures;", "reviewed", "disclosureSigned", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "loadingErrorEvent", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(ZLcom/robinhood/recommendations/models/ui/UiRecommendationsDisclosures;ZZLcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/udf/UiEvent;)V", "()Z", "getDisclosures", "()Lcom/robinhood/recommendations/models/ui/UiRecommendationsDisclosures;", "getReviewed", "getDisclosureSigned", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getLoadingErrorEvent", "()Lcom/robinhood/udf/UiEvent;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RecommendationsDisclosuresViewState {
    public static final int $stable = 8;
    private final BrokerageAccountType brokerageAccountType;
    private final boolean disclosureSigned;
    private final UiRecommendationsDisclosures disclosures;
    private final boolean isLoading;
    private final UiEvent<Throwable> loadingErrorEvent;
    private final boolean reviewed;

    public RecommendationsDisclosuresViewState() {
        this(false, null, false, false, null, null, 63, null);
    }

    public static /* synthetic */ RecommendationsDisclosuresViewState copy$default(RecommendationsDisclosuresViewState recommendationsDisclosuresViewState, boolean z, UiRecommendationsDisclosures uiRecommendationsDisclosures, boolean z2, boolean z3, BrokerageAccountType brokerageAccountType, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            z = recommendationsDisclosuresViewState.isLoading;
        }
        if ((i & 2) != 0) {
            uiRecommendationsDisclosures = recommendationsDisclosuresViewState.disclosures;
        }
        if ((i & 4) != 0) {
            z2 = recommendationsDisclosuresViewState.reviewed;
        }
        if ((i & 8) != 0) {
            z3 = recommendationsDisclosuresViewState.disclosureSigned;
        }
        if ((i & 16) != 0) {
            brokerageAccountType = recommendationsDisclosuresViewState.brokerageAccountType;
        }
        if ((i & 32) != 0) {
            uiEvent = recommendationsDisclosuresViewState.loadingErrorEvent;
        }
        BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
        UiEvent uiEvent2 = uiEvent;
        return recommendationsDisclosuresViewState.copy(z, uiRecommendationsDisclosures, z2, z3, brokerageAccountType2, uiEvent2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final UiRecommendationsDisclosures getDisclosures() {
        return this.disclosures;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getReviewed() {
        return this.reviewed;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getDisclosureSigned() {
        return this.disclosureSigned;
    }

    /* renamed from: component5, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final UiEvent<Throwable> component6() {
        return this.loadingErrorEvent;
    }

    public final RecommendationsDisclosuresViewState copy(boolean isLoading, UiRecommendationsDisclosures disclosures, boolean reviewed, boolean disclosureSigned, BrokerageAccountType brokerageAccountType, UiEvent<Throwable> loadingErrorEvent) {
        return new RecommendationsDisclosuresViewState(isLoading, disclosures, reviewed, disclosureSigned, brokerageAccountType, loadingErrorEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendationsDisclosuresViewState)) {
            return false;
        }
        RecommendationsDisclosuresViewState recommendationsDisclosuresViewState = (RecommendationsDisclosuresViewState) other;
        return this.isLoading == recommendationsDisclosuresViewState.isLoading && Intrinsics.areEqual(this.disclosures, recommendationsDisclosuresViewState.disclosures) && this.reviewed == recommendationsDisclosuresViewState.reviewed && this.disclosureSigned == recommendationsDisclosuresViewState.disclosureSigned && this.brokerageAccountType == recommendationsDisclosuresViewState.brokerageAccountType && Intrinsics.areEqual(this.loadingErrorEvent, recommendationsDisclosuresViewState.loadingErrorEvent);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        UiRecommendationsDisclosures uiRecommendationsDisclosures = this.disclosures;
        int iHashCode2 = (((((iHashCode + (uiRecommendationsDisclosures == null ? 0 : uiRecommendationsDisclosures.hashCode())) * 31) + Boolean.hashCode(this.reviewed)) * 31) + Boolean.hashCode(this.disclosureSigned)) * 31;
        BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
        int iHashCode3 = (iHashCode2 + (brokerageAccountType == null ? 0 : brokerageAccountType.hashCode())) * 31;
        UiEvent<Throwable> uiEvent = this.loadingErrorEvent;
        return iHashCode3 + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "RecommendationsDisclosuresViewState(isLoading=" + this.isLoading + ", disclosures=" + this.disclosures + ", reviewed=" + this.reviewed + ", disclosureSigned=" + this.disclosureSigned + ", brokerageAccountType=" + this.brokerageAccountType + ", loadingErrorEvent=" + this.loadingErrorEvent + ")";
    }

    public RecommendationsDisclosuresViewState(boolean z, UiRecommendationsDisclosures uiRecommendationsDisclosures, boolean z2, boolean z3, BrokerageAccountType brokerageAccountType, UiEvent<Throwable> uiEvent) {
        this.isLoading = z;
        this.disclosures = uiRecommendationsDisclosures;
        this.reviewed = z2;
        this.disclosureSigned = z3;
        this.brokerageAccountType = brokerageAccountType;
        this.loadingErrorEvent = uiEvent;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ RecommendationsDisclosuresViewState(boolean r3, com.robinhood.recommendations.models.p363ui.UiRecommendationsDisclosures r4, boolean r5, boolean r6, com.robinhood.models.api.BrokerageAccountType r7, com.robinhood.udf.UiEvent r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r2 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L5
            r3 = 1
        L5:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto Lb
            r4 = r0
        Lb:
            r10 = r9 & 4
            r1 = 0
            if (r10 == 0) goto L11
            r5 = r1
        L11:
            r10 = r9 & 8
            if (r10 == 0) goto L16
            r6 = r1
        L16:
            r10 = r9 & 16
            if (r10 == 0) goto L1b
            r7 = r0
        L1b:
            r9 = r9 & 32
            if (r9 == 0) goto L27
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            goto L2e
        L27:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
        L2e:
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.trade.recommendations.p262ui.disclosures.RecommendationsDisclosuresViewState.<init>(boolean, com.robinhood.recommendations.models.ui.UiRecommendationsDisclosures, boolean, boolean, com.robinhood.models.api.BrokerageAccountType, com.robinhood.udf.UiEvent, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final UiRecommendationsDisclosures getDisclosures() {
        return this.disclosures;
    }

    public final boolean getReviewed() {
        return this.reviewed;
    }

    public final boolean getDisclosureSigned() {
        return this.disclosureSigned;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final UiEvent<Throwable> getLoadingErrorEvent() {
        return this.loadingErrorEvent;
    }
}
