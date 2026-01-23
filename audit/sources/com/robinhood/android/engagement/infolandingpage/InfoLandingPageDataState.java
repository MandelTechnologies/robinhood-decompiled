package com.robinhood.android.engagement.infolandingpage;

import com.robinhood.models.api.rewardoffer.ApiRewardOfferDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InfoLandingPageViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageDataState;", "", "content", "Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferDetails;", "error", "", "<init>", "(Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferDetails;Ljava/lang/Throwable;)V", "getContent", "()Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferDetails;", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-info-landing-page_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class InfoLandingPageDataState {
    public static final int $stable = 8;
    private final ApiRewardOfferDetails content;
    private final Throwable error;

    /* JADX WARN: Multi-variable type inference failed */
    public InfoLandingPageDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ InfoLandingPageDataState copy$default(InfoLandingPageDataState infoLandingPageDataState, ApiRewardOfferDetails apiRewardOfferDetails, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            apiRewardOfferDetails = infoLandingPageDataState.content;
        }
        if ((i & 2) != 0) {
            th = infoLandingPageDataState.error;
        }
        return infoLandingPageDataState.copy(apiRewardOfferDetails, th);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiRewardOfferDetails getContent() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    public final InfoLandingPageDataState copy(ApiRewardOfferDetails content, Throwable error) {
        return new InfoLandingPageDataState(content, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoLandingPageDataState)) {
            return false;
        }
        InfoLandingPageDataState infoLandingPageDataState = (InfoLandingPageDataState) other;
        return Intrinsics.areEqual(this.content, infoLandingPageDataState.content) && Intrinsics.areEqual(this.error, infoLandingPageDataState.error);
    }

    public int hashCode() {
        ApiRewardOfferDetails apiRewardOfferDetails = this.content;
        int iHashCode = (apiRewardOfferDetails == null ? 0 : apiRewardOfferDetails.hashCode()) * 31;
        Throwable th = this.error;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "InfoLandingPageDataState(content=" + this.content + ", error=" + this.error + ")";
    }

    public InfoLandingPageDataState(ApiRewardOfferDetails apiRewardOfferDetails, Throwable th) {
        this.content = apiRewardOfferDetails;
        this.error = th;
    }

    public /* synthetic */ InfoLandingPageDataState(ApiRewardOfferDetails apiRewardOfferDetails, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiRewardOfferDetails, (i & 2) != 0 ? null : th);
    }

    public final ApiRewardOfferDetails getContent() {
        return this.content;
    }

    public final Throwable getError() {
        return this.error;
    }
}
