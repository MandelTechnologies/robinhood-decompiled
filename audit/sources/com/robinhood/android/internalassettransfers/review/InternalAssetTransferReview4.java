package com.robinhood.android.internalassettransfers.review;

import kotlin.Metadata;

/* compiled from: InternalAssetTransferReview.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewCallbacks;", "", "onNavigationBackClick", "", "onSubmitButtonClick", "viewState", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewViewState;", "onAssetsRowClick", "onInfoBannerClick", "onErrorDialogDismiss", "onContinueFromWarningAlerts", "onTryAgainSubmitWarning", "onEditTransferSelectionClick", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewCallbacks, reason: use source file name */
/* loaded from: classes10.dex */
public interface InternalAssetTransferReview4 {
    void onAssetsRowClick(InternalAssetTransferReviewViewState viewState);

    void onContinueFromWarningAlerts();

    void onEditTransferSelectionClick();

    void onErrorDialogDismiss();

    void onInfoBannerClick(InternalAssetTransferReviewViewState viewState);

    void onNavigationBackClick();

    void onSubmitButtonClick(InternalAssetTransferReviewViewState viewState);

    void onTryAgainSubmitWarning();
}
