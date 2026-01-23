package com.robinhood.android.internalassettransfers;

import com.robinhood.android.internalassettransfers.review.models.UiAssets;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTranferInfoBanner.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/InternalAssetTransferInfoBannerViewState;", "", "infoBannerState", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferInfoBannerViewState$InfoBannerState;", "nontransferableAssets", "Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;", "<init>", "(Lcom/robinhood/android/internalassettransfers/InternalAssetTransferInfoBannerViewState$InfoBannerState;Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;)V", "getInfoBannerState", "()Lcom/robinhood/android/internalassettransfers/InternalAssetTransferInfoBannerViewState$InfoBannerState;", "getNontransferableAssets", "()Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "InfoBannerState", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InternalAssetTransferInfoBannerViewState {
    public static final int $stable = 8;
    private final InfoBannerState infoBannerState;
    private final UiAssets nontransferableAssets;

    public static /* synthetic */ InternalAssetTransferInfoBannerViewState copy$default(InternalAssetTransferInfoBannerViewState internalAssetTransferInfoBannerViewState, InfoBannerState infoBannerState, UiAssets uiAssets, int i, Object obj) {
        if ((i & 1) != 0) {
            infoBannerState = internalAssetTransferInfoBannerViewState.infoBannerState;
        }
        if ((i & 2) != 0) {
            uiAssets = internalAssetTransferInfoBannerViewState.nontransferableAssets;
        }
        return internalAssetTransferInfoBannerViewState.copy(infoBannerState, uiAssets);
    }

    /* renamed from: component1, reason: from getter */
    public final InfoBannerState getInfoBannerState() {
        return this.infoBannerState;
    }

    /* renamed from: component2, reason: from getter */
    public final UiAssets getNontransferableAssets() {
        return this.nontransferableAssets;
    }

    public final InternalAssetTransferInfoBannerViewState copy(InfoBannerState infoBannerState, UiAssets nontransferableAssets) {
        Intrinsics.checkNotNullParameter(infoBannerState, "infoBannerState");
        Intrinsics.checkNotNullParameter(nontransferableAssets, "nontransferableAssets");
        return new InternalAssetTransferInfoBannerViewState(infoBannerState, nontransferableAssets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalAssetTransferInfoBannerViewState)) {
            return false;
        }
        InternalAssetTransferInfoBannerViewState internalAssetTransferInfoBannerViewState = (InternalAssetTransferInfoBannerViewState) other;
        return Intrinsics.areEqual(this.infoBannerState, internalAssetTransferInfoBannerViewState.infoBannerState) && Intrinsics.areEqual(this.nontransferableAssets, internalAssetTransferInfoBannerViewState.nontransferableAssets);
    }

    public int hashCode() {
        return (this.infoBannerState.hashCode() * 31) + this.nontransferableAssets.hashCode();
    }

    public String toString() {
        return "InternalAssetTransferInfoBannerViewState(infoBannerState=" + this.infoBannerState + ", nontransferableAssets=" + this.nontransferableAssets + ")";
    }

    public InternalAssetTransferInfoBannerViewState(InfoBannerState infoBannerState, UiAssets nontransferableAssets) {
        Intrinsics.checkNotNullParameter(infoBannerState, "infoBannerState");
        Intrinsics.checkNotNullParameter(nontransferableAssets, "nontransferableAssets");
        this.infoBannerState = infoBannerState;
        this.nontransferableAssets = nontransferableAssets;
    }

    public final InfoBannerState getInfoBannerState() {
        return this.infoBannerState;
    }

    public final UiAssets getNontransferableAssets() {
        return this.nontransferableAssets;
    }

    /* compiled from: InternalAssetTranferInfoBanner.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/InternalAssetTransferInfoBannerViewState$InfoBannerState;", "", "NoAvailableAssets", "HasIneligibleAssets", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferInfoBannerViewState$InfoBannerState$HasIneligibleAssets;", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferInfoBannerViewState$InfoBannerState$NoAvailableAssets;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface InfoBannerState {

        /* compiled from: InternalAssetTranferInfoBanner.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/InternalAssetTransferInfoBannerViewState$InfoBannerState$NoAvailableAssets;", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferInfoBannerViewState$InfoBannerState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NoAvailableAssets implements InfoBannerState {
            public static final int $stable = 0;
            public static final NoAvailableAssets INSTANCE = new NoAvailableAssets();

            public boolean equals(Object other) {
                return this == other || (other instanceof NoAvailableAssets);
            }

            public int hashCode() {
                return -185676193;
            }

            public String toString() {
                return "NoAvailableAssets";
            }

            private NoAvailableAssets() {
            }
        }

        /* compiled from: InternalAssetTranferInfoBanner.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/InternalAssetTransferInfoBannerViewState$InfoBannerState$HasIneligibleAssets;", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferInfoBannerViewState$InfoBannerState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class HasIneligibleAssets implements InfoBannerState {
            public static final int $stable = 0;
            public static final HasIneligibleAssets INSTANCE = new HasIneligibleAssets();

            public boolean equals(Object other) {
                return this == other || (other instanceof HasIneligibleAssets);
            }

            public int hashCode() {
                return -876914419;
            }

            public String toString() {
                return "HasIneligibleAssets";
            }

            private HasIneligibleAssets() {
            }
        }
    }
}
