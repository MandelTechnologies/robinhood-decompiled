package com.robinhood.android.internalassettransfers.customselection;

import com.robinhood.android.internalassettransfers.customselection.equity.ShareSelection;
import com.robinhood.android.internalassettransfers.validation.AccountFeatureParityBottomSheetData;
import com.robinhood.android.models.internalassettransfers.p193db.EligibleAsset;
import com.robinhood.android.models.internalassettransfers.p193db.EligibleAssets;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferCustomSelectionEvent.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent;", "", "NavigateToCashSelectionScreen", "NavigateToNonTransferableAssetsScreen", "NavigateToAgreementsScreen", "NavigateBackToReviewScreen", "EditEquitySelection", "SelectEquity", "UnselectEquity", "ClearAssetSelection", "SelectAssets", "SelectCashSelection", "UnselectCashSelection", "EnableMarginAlert", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent$ClearAssetSelection;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent$EditEquitySelection;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent$EnableMarginAlert;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent$NavigateBackToReviewScreen;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent$NavigateToAgreementsScreen;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent$NavigateToCashSelectionScreen;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent$NavigateToNonTransferableAssetsScreen;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent$SelectAssets;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent$SelectCashSelection;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent$SelectEquity;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent$UnselectCashSelection;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent$UnselectEquity;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface InternalAssetTransferCustomSelectionEvent {

    /* compiled from: InternalAssetTransferCustomSelectionEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent$NavigateToCashSelectionScreen;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent;", "eligibleAssets", "Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "<init>", "(Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;)V", "getEligibleAssets", "()Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToCashSelectionScreen implements InternalAssetTransferCustomSelectionEvent {
        public static final int $stable = 8;
        private final EligibleAssets eligibleAssets;

        public static /* synthetic */ NavigateToCashSelectionScreen copy$default(NavigateToCashSelectionScreen navigateToCashSelectionScreen, EligibleAssets eligibleAssets, int i, Object obj) {
            if ((i & 1) != 0) {
                eligibleAssets = navigateToCashSelectionScreen.eligibleAssets;
            }
            return navigateToCashSelectionScreen.copy(eligibleAssets);
        }

        /* renamed from: component1, reason: from getter */
        public final EligibleAssets getEligibleAssets() {
            return this.eligibleAssets;
        }

        public final NavigateToCashSelectionScreen copy(EligibleAssets eligibleAssets) {
            Intrinsics.checkNotNullParameter(eligibleAssets, "eligibleAssets");
            return new NavigateToCashSelectionScreen(eligibleAssets);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToCashSelectionScreen) && Intrinsics.areEqual(this.eligibleAssets, ((NavigateToCashSelectionScreen) other).eligibleAssets);
        }

        public int hashCode() {
            return this.eligibleAssets.hashCode();
        }

        public String toString() {
            return "NavigateToCashSelectionScreen(eligibleAssets=" + this.eligibleAssets + ")";
        }

        public NavigateToCashSelectionScreen(EligibleAssets eligibleAssets) {
            Intrinsics.checkNotNullParameter(eligibleAssets, "eligibleAssets");
            this.eligibleAssets = eligibleAssets;
        }

        public final EligibleAssets getEligibleAssets() {
            return this.eligibleAssets;
        }
    }

    /* compiled from: InternalAssetTransferCustomSelectionEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent$NavigateToNonTransferableAssetsScreen;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToNonTransferableAssetsScreen implements InternalAssetTransferCustomSelectionEvent {
        public static final int $stable = 0;
        public static final NavigateToNonTransferableAssetsScreen INSTANCE = new NavigateToNonTransferableAssetsScreen();

        public boolean equals(Object other) {
            return this == other || (other instanceof NavigateToNonTransferableAssetsScreen);
        }

        public int hashCode() {
            return 1962355084;
        }

        public String toString() {
            return "NavigateToNonTransferableAssetsScreen";
        }

        private NavigateToNonTransferableAssetsScreen() {
        }
    }

    /* compiled from: InternalAssetTransferCustomSelectionEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent$NavigateToAgreementsScreen;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToAgreementsScreen implements InternalAssetTransferCustomSelectionEvent {
        public static final int $stable = 0;
        public static final NavigateToAgreementsScreen INSTANCE = new NavigateToAgreementsScreen();

        public boolean equals(Object other) {
            return this == other || (other instanceof NavigateToAgreementsScreen);
        }

        public int hashCode() {
            return 689119978;
        }

        public String toString() {
            return "NavigateToAgreementsScreen";
        }

        private NavigateToAgreementsScreen() {
        }
    }

    /* compiled from: InternalAssetTransferCustomSelectionEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent$NavigateBackToReviewScreen;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateBackToReviewScreen implements InternalAssetTransferCustomSelectionEvent {
        public static final int $stable = 0;
        public static final NavigateBackToReviewScreen INSTANCE = new NavigateBackToReviewScreen();

        public boolean equals(Object other) {
            return this == other || (other instanceof NavigateBackToReviewScreen);
        }

        public int hashCode() {
            return -82730592;
        }

        public String toString() {
            return "NavigateBackToReviewScreen";
        }

        private NavigateBackToReviewScreen() {
        }
    }

    /* compiled from: InternalAssetTransferCustomSelectionEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent$EditEquitySelection;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent;", "asset", "Lcom/robinhood/android/models/internalassettransfers/db/EligibleAsset;", "existingSelection", "Lcom/robinhood/android/internalassettransfers/customselection/equity/ShareSelection;", "<init>", "(Lcom/robinhood/android/models/internalassettransfers/db/EligibleAsset;Lcom/robinhood/android/internalassettransfers/customselection/equity/ShareSelection;)V", "getAsset", "()Lcom/robinhood/android/models/internalassettransfers/db/EligibleAsset;", "getExistingSelection", "()Lcom/robinhood/android/internalassettransfers/customselection/equity/ShareSelection;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EditEquitySelection implements InternalAssetTransferCustomSelectionEvent {
        public static final int $stable = 8;
        private final EligibleAsset asset;
        private final ShareSelection existingSelection;

        public static /* synthetic */ EditEquitySelection copy$default(EditEquitySelection editEquitySelection, EligibleAsset eligibleAsset, ShareSelection shareSelection, int i, Object obj) {
            if ((i & 1) != 0) {
                eligibleAsset = editEquitySelection.asset;
            }
            if ((i & 2) != 0) {
                shareSelection = editEquitySelection.existingSelection;
            }
            return editEquitySelection.copy(eligibleAsset, shareSelection);
        }

        /* renamed from: component1, reason: from getter */
        public final EligibleAsset getAsset() {
            return this.asset;
        }

        /* renamed from: component2, reason: from getter */
        public final ShareSelection getExistingSelection() {
            return this.existingSelection;
        }

        public final EditEquitySelection copy(EligibleAsset asset, ShareSelection existingSelection) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            Intrinsics.checkNotNullParameter(existingSelection, "existingSelection");
            return new EditEquitySelection(asset, existingSelection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditEquitySelection)) {
                return false;
            }
            EditEquitySelection editEquitySelection = (EditEquitySelection) other;
            return Intrinsics.areEqual(this.asset, editEquitySelection.asset) && Intrinsics.areEqual(this.existingSelection, editEquitySelection.existingSelection);
        }

        public int hashCode() {
            return (this.asset.hashCode() * 31) + this.existingSelection.hashCode();
        }

        public String toString() {
            return "EditEquitySelection(asset=" + this.asset + ", existingSelection=" + this.existingSelection + ")";
        }

        public EditEquitySelection(EligibleAsset asset, ShareSelection existingSelection) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            Intrinsics.checkNotNullParameter(existingSelection, "existingSelection");
            this.asset = asset;
            this.existingSelection = existingSelection;
        }

        public final EligibleAsset getAsset() {
            return this.asset;
        }

        public final ShareSelection getExistingSelection() {
            return this.existingSelection;
        }
    }

    /* compiled from: InternalAssetTransferCustomSelectionEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent$SelectEquity;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent;", "instrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInstrumentId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SelectEquity implements InternalAssetTransferCustomSelectionEvent {
        public static final int $stable = 8;
        private final UUID instrumentId;

        public static /* synthetic */ SelectEquity copy$default(SelectEquity selectEquity, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = selectEquity.instrumentId;
            }
            return selectEquity.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final SelectEquity copy(UUID instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            return new SelectEquity(instrumentId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelectEquity) && Intrinsics.areEqual(this.instrumentId, ((SelectEquity) other).instrumentId);
        }

        public int hashCode() {
            return this.instrumentId.hashCode();
        }

        public String toString() {
            return "SelectEquity(instrumentId=" + this.instrumentId + ")";
        }

        public SelectEquity(UUID instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.instrumentId = instrumentId;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }
    }

    /* compiled from: InternalAssetTransferCustomSelectionEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent$UnselectEquity;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent;", "instrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInstrumentId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UnselectEquity implements InternalAssetTransferCustomSelectionEvent {
        public static final int $stable = 8;
        private final UUID instrumentId;

        public static /* synthetic */ UnselectEquity copy$default(UnselectEquity unselectEquity, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = unselectEquity.instrumentId;
            }
            return unselectEquity.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final UnselectEquity copy(UUID instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            return new UnselectEquity(instrumentId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnselectEquity) && Intrinsics.areEqual(this.instrumentId, ((UnselectEquity) other).instrumentId);
        }

        public int hashCode() {
            return this.instrumentId.hashCode();
        }

        public String toString() {
            return "UnselectEquity(instrumentId=" + this.instrumentId + ")";
        }

        public UnselectEquity(UUID instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.instrumentId = instrumentId;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }
    }

    /* compiled from: InternalAssetTransferCustomSelectionEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent$ClearAssetSelection;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent;", "isCashVisible", "", "instrumentIds", "", "Ljava/util/UUID;", "<init>", "(ZLjava/util/List;)V", "()Z", "getInstrumentIds", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ClearAssetSelection implements InternalAssetTransferCustomSelectionEvent {
        public static final int $stable = 8;
        private final List<UUID> instrumentIds;
        private final boolean isCashVisible;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ClearAssetSelection copy$default(ClearAssetSelection clearAssetSelection, boolean z, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                z = clearAssetSelection.isCashVisible;
            }
            if ((i & 2) != 0) {
                list = clearAssetSelection.instrumentIds;
            }
            return clearAssetSelection.copy(z, list);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsCashVisible() {
            return this.isCashVisible;
        }

        public final List<UUID> component2() {
            return this.instrumentIds;
        }

        public final ClearAssetSelection copy(boolean isCashVisible, List<UUID> instrumentIds) {
            Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
            return new ClearAssetSelection(isCashVisible, instrumentIds);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClearAssetSelection)) {
                return false;
            }
            ClearAssetSelection clearAssetSelection = (ClearAssetSelection) other;
            return this.isCashVisible == clearAssetSelection.isCashVisible && Intrinsics.areEqual(this.instrumentIds, clearAssetSelection.instrumentIds);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isCashVisible) * 31) + this.instrumentIds.hashCode();
        }

        public String toString() {
            return "ClearAssetSelection(isCashVisible=" + this.isCashVisible + ", instrumentIds=" + this.instrumentIds + ")";
        }

        public ClearAssetSelection(boolean z, List<UUID> instrumentIds) {
            Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
            this.isCashVisible = z;
            this.instrumentIds = instrumentIds;
        }

        public final boolean isCashVisible() {
            return this.isCashVisible;
        }

        public final List<UUID> getInstrumentIds() {
            return this.instrumentIds;
        }
    }

    /* compiled from: InternalAssetTransferCustomSelectionEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent$SelectAssets;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent;", "isCashVisible", "", "instrumentIds", "", "Ljava/util/UUID;", "<init>", "(ZLjava/util/List;)V", "()Z", "getInstrumentIds", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SelectAssets implements InternalAssetTransferCustomSelectionEvent {
        public static final int $stable = 8;
        private final List<UUID> instrumentIds;
        private final boolean isCashVisible;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SelectAssets copy$default(SelectAssets selectAssets, boolean z, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                z = selectAssets.isCashVisible;
            }
            if ((i & 2) != 0) {
                list = selectAssets.instrumentIds;
            }
            return selectAssets.copy(z, list);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsCashVisible() {
            return this.isCashVisible;
        }

        public final List<UUID> component2() {
            return this.instrumentIds;
        }

        public final SelectAssets copy(boolean isCashVisible, List<UUID> instrumentIds) {
            Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
            return new SelectAssets(isCashVisible, instrumentIds);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectAssets)) {
                return false;
            }
            SelectAssets selectAssets = (SelectAssets) other;
            return this.isCashVisible == selectAssets.isCashVisible && Intrinsics.areEqual(this.instrumentIds, selectAssets.instrumentIds);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isCashVisible) * 31) + this.instrumentIds.hashCode();
        }

        public String toString() {
            return "SelectAssets(isCashVisible=" + this.isCashVisible + ", instrumentIds=" + this.instrumentIds + ")";
        }

        public SelectAssets(boolean z, List<UUID> instrumentIds) {
            Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
            this.isCashVisible = z;
            this.instrumentIds = instrumentIds;
        }

        public final boolean isCashVisible() {
            return this.isCashVisible;
        }

        public final List<UUID> getInstrumentIds() {
            return this.instrumentIds;
        }
    }

    /* compiled from: InternalAssetTransferCustomSelectionEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent$SelectCashSelection;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SelectCashSelection implements InternalAssetTransferCustomSelectionEvent {
        public static final int $stable = 0;
        public static final SelectCashSelection INSTANCE = new SelectCashSelection();

        public boolean equals(Object other) {
            return this == other || (other instanceof SelectCashSelection);
        }

        public int hashCode() {
            return -932993388;
        }

        public String toString() {
            return "SelectCashSelection";
        }

        private SelectCashSelection() {
        }
    }

    /* compiled from: InternalAssetTransferCustomSelectionEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent$UnselectCashSelection;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UnselectCashSelection implements InternalAssetTransferCustomSelectionEvent {
        public static final int $stable = 0;
        public static final UnselectCashSelection INSTANCE = new UnselectCashSelection();

        public boolean equals(Object other) {
            return this == other || (other instanceof UnselectCashSelection);
        }

        public int hashCode() {
            return -1955353189;
        }

        public String toString() {
            return "UnselectCashSelection";
        }

        private UnselectCashSelection() {
        }
    }

    /* compiled from: InternalAssetTransferCustomSelectionEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent$EnableMarginAlert;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent;", "bottomSheetData", "Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityBottomSheetData;", "<init>", "(Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityBottomSheetData;)V", "getBottomSheetData", "()Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityBottomSheetData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EnableMarginAlert implements InternalAssetTransferCustomSelectionEvent {
        public static final int $stable = StringResource.$stable;
        private final AccountFeatureParityBottomSheetData bottomSheetData;

        public static /* synthetic */ EnableMarginAlert copy$default(EnableMarginAlert enableMarginAlert, AccountFeatureParityBottomSheetData accountFeatureParityBottomSheetData, int i, Object obj) {
            if ((i & 1) != 0) {
                accountFeatureParityBottomSheetData = enableMarginAlert.bottomSheetData;
            }
            return enableMarginAlert.copy(accountFeatureParityBottomSheetData);
        }

        /* renamed from: component1, reason: from getter */
        public final AccountFeatureParityBottomSheetData getBottomSheetData() {
            return this.bottomSheetData;
        }

        public final EnableMarginAlert copy(AccountFeatureParityBottomSheetData bottomSheetData) {
            Intrinsics.checkNotNullParameter(bottomSheetData, "bottomSheetData");
            return new EnableMarginAlert(bottomSheetData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EnableMarginAlert) && Intrinsics.areEqual(this.bottomSheetData, ((EnableMarginAlert) other).bottomSheetData);
        }

        public int hashCode() {
            return this.bottomSheetData.hashCode();
        }

        public String toString() {
            return "EnableMarginAlert(bottomSheetData=" + this.bottomSheetData + ")";
        }

        public EnableMarginAlert(AccountFeatureParityBottomSheetData bottomSheetData) {
            Intrinsics.checkNotNullParameter(bottomSheetData, "bottomSheetData");
            this.bottomSheetData = bottomSheetData;
        }

        public final AccountFeatureParityBottomSheetData getBottomSheetData() {
            return this.bottomSheetData;
        }
    }
}
