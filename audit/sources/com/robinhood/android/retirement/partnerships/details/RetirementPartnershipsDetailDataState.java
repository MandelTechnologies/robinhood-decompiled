package com.robinhood.android.retirement.partnerships.details;

import com.robinhood.android.models.retirement.api.partnerships.ApiRetirementPartnershipDetailResponse;
import com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailViewState;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: RetirementPartnershipsDetailDataState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailDataState;", "", "source", "", "responseViewModel", "Lcom/robinhood/android/models/retirement/api/partnerships/ApiRetirementPartnershipDetailResponse$PartnershipDetailViewModel;", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "isClaimInProgress", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/retirement/api/partnerships/ApiRetirementPartnershipDetailResponse$PartnershipDetailViewModel;Ljava/lang/Exception;Z)V", "getSource", "()Ljava/lang/String;", "getResponseViewModel", "()Lcom/robinhood/android/models/retirement/api/partnerships/ApiRetirementPartnershipDetailResponse$PartnershipDetailViewModel;", "getError", "()Ljava/lang/Exception;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Provider", "feature-retirement-partnerships_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RetirementPartnershipsDetailDataState {
    private final Exception error;
    private final boolean isClaimInProgress;
    private final ApiRetirementPartnershipDetailResponse.PartnershipDetailViewModel responseViewModel;
    private final String source;

    /* renamed from: Provider, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ RetirementPartnershipsDetailDataState copy$default(RetirementPartnershipsDetailDataState retirementPartnershipsDetailDataState, String str, ApiRetirementPartnershipDetailResponse.PartnershipDetailViewModel partnershipDetailViewModel, Exception exc, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = retirementPartnershipsDetailDataState.source;
        }
        if ((i & 2) != 0) {
            partnershipDetailViewModel = retirementPartnershipsDetailDataState.responseViewModel;
        }
        if ((i & 4) != 0) {
            exc = retirementPartnershipsDetailDataState.error;
        }
        if ((i & 8) != 0) {
            z = retirementPartnershipsDetailDataState.isClaimInProgress;
        }
        return retirementPartnershipsDetailDataState.copy(str, partnershipDetailViewModel, exc, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiRetirementPartnershipDetailResponse.PartnershipDetailViewModel getResponseViewModel() {
        return this.responseViewModel;
    }

    /* renamed from: component3, reason: from getter */
    public final Exception getError() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsClaimInProgress() {
        return this.isClaimInProgress;
    }

    public final RetirementPartnershipsDetailDataState copy(String source, ApiRetirementPartnershipDetailResponse.PartnershipDetailViewModel responseViewModel, Exception error, boolean isClaimInProgress) {
        return new RetirementPartnershipsDetailDataState(source, responseViewModel, error, isClaimInProgress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetirementPartnershipsDetailDataState)) {
            return false;
        }
        RetirementPartnershipsDetailDataState retirementPartnershipsDetailDataState = (RetirementPartnershipsDetailDataState) other;
        return Intrinsics.areEqual(this.source, retirementPartnershipsDetailDataState.source) && Intrinsics.areEqual(this.responseViewModel, retirementPartnershipsDetailDataState.responseViewModel) && Intrinsics.areEqual(this.error, retirementPartnershipsDetailDataState.error) && this.isClaimInProgress == retirementPartnershipsDetailDataState.isClaimInProgress;
    }

    public int hashCode() {
        String str = this.source;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ApiRetirementPartnershipDetailResponse.PartnershipDetailViewModel partnershipDetailViewModel = this.responseViewModel;
        int iHashCode2 = (iHashCode + (partnershipDetailViewModel == null ? 0 : partnershipDetailViewModel.hashCode())) * 31;
        Exception exc = this.error;
        return ((iHashCode2 + (exc != null ? exc.hashCode() : 0)) * 31) + Boolean.hashCode(this.isClaimInProgress);
    }

    public String toString() {
        return "RetirementPartnershipsDetailDataState(source=" + this.source + ", responseViewModel=" + this.responseViewModel + ", error=" + this.error + ", isClaimInProgress=" + this.isClaimInProgress + ")";
    }

    public RetirementPartnershipsDetailDataState(String str, ApiRetirementPartnershipDetailResponse.PartnershipDetailViewModel partnershipDetailViewModel, Exception exc, boolean z) {
        this.source = str;
        this.responseViewModel = partnershipDetailViewModel;
        this.error = exc;
        this.isClaimInProgress = z;
    }

    public /* synthetic */ RetirementPartnershipsDetailDataState(String str, ApiRetirementPartnershipDetailResponse.PartnershipDetailViewModel partnershipDetailViewModel, Exception exc, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : partnershipDetailViewModel, (i & 4) != 0 ? null : exc, (i & 8) != 0 ? false : z);
    }

    public final String getSource() {
        return this.source;
    }

    public final ApiRetirementPartnershipDetailResponse.PartnershipDetailViewModel getResponseViewModel() {
        return this.responseViewModel;
    }

    public final Exception getError() {
        return this.error;
    }

    public final boolean isClaimInProgress() {
        return this.isClaimInProgress;
    }

    /* compiled from: RetirementPartnershipsDetailDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailDataState$Provider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailDataState;", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailViewState;", "<init>", "()V", "reduce", "dataState", "feature-retirement-partnerships_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailDataState$Provider, reason: from kotlin metadata */
    public static final class Companion implements StateProvider<RetirementPartnershipsDetailDataState, RetirementPartnershipsDetailViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public RetirementPartnershipsDetailViewState reduce(RetirementPartnershipsDetailDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.isClaimInProgress()) {
                return RetirementPartnershipsDetailViewState.Loading.INSTANCE;
            }
            if (dataState.getResponseViewModel() != null) {
                ApiRetirementPartnershipDetailResponse.PartnershipDetailViewModel responseViewModel = dataState.getResponseViewModel();
                String source = dataState.getSource();
                if (source == null) {
                    source = "";
                }
                return new RetirementPartnershipsDetailViewState.Loaded(source, responseViewModel.getLogging_identifier(), responseViewModel.getHeader(), extensions2.toImmutableList(responseViewModel.getContent()), responseViewModel.getFooter());
            }
            if (dataState.getError() != null) {
                return new RetirementPartnershipsDetailViewState.Error(dataState.getError());
            }
            return RetirementPartnershipsDetailViewState.Loading.INSTANCE;
        }
    }
}
