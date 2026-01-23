package com.robinhood.android.internalassettransfers.customselection;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: InternalAssetTransferCustomSelection.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\u001e\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\u001e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\b\u0010\u0010\u001a\u00020\u0003H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0005H&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0003H&¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionCallbacks;", "", "onEquityRowClicked", "", "instrumentId", "", "onEquityCheckClicked", "onCashRowClicked", "onCashCheckClicked", "onClearButtonClicked", "isCashVisible", "", "instrumentIds", "", "Ljava/util/UUID;", "onSelectAllButtonClicked", "onBackNavigationClicked", "onSearchValueChanged", "value", "onInfoBannerLinkClicked", "completeSelection", "navigateToAgreementsScreen", "tryAgainPresubmitWarning", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface InternalAssetTransferCustomSelectionCallbacks {
    void completeSelection();

    void navigateToAgreementsScreen();

    void onBackNavigationClicked();

    void onCashCheckClicked();

    void onCashRowClicked();

    void onClearButtonClicked(boolean isCashVisible, List<UUID> instrumentIds);

    void onEquityCheckClicked(String instrumentId);

    void onEquityRowClicked(String instrumentId);

    void onInfoBannerLinkClicked();

    void onSearchValueChanged(String value);

    void onSelectAllButtonClicked(boolean isCashVisible, List<UUID> instrumentIds);

    void tryAgainPresubmitWarning();
}
