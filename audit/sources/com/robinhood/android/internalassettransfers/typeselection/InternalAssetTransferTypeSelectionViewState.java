package com.robinhood.android.internalassettransfers.typeselection;

import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.android.internalassettransfers.accountselection.UiIatAccount;
import com.robinhood.android.internalassettransfers.review.models.UiAssets3;
import com.robinhood.android.internalassettransfers.validation.AccountFeatureParityBottomSheetData;
import com.robinhood.android.models.internalassettransfers.p193db.EligibleAssets;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferTypeSelectionViewState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003JS\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010)\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u001d\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u001f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b \u0010\u0018¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionViewState;", "", "eligibleAssets", "Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "disableTransferAllAssets", "", "transferAllAssetsDescriptionOverride", "Lcom/robinhood/utils/resource/StringResource;", "isLoading", "enableMarginDialogData", "Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityBottomSheetData;", "<init>", "(Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;ZLcom/robinhood/utils/resource/StringResource;ZLcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityBottomSheetData;)V", "getEligibleAssets", "()Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "getSinkAccount", "()Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "getSourceAccount", "getDisableTransferAllAssets", "()Z", "getTransferAllAssetsDescriptionOverride", "()Lcom/robinhood/utils/resource/StringResource;", "getEnableMarginDialogData", "()Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityBottomSheetData;", "allAssetsAreTransferable", "getAllAssetsAreTransferable", "allAssetsTransferTitleStringResource", "getAllAssetsTransferTitleStringResource", "allAssetsTransferDescriptionStringResource", "getAllAssetsTransferDescriptionStringResource", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InternalAssetTransferTypeSelectionViewState {
    public static final int $stable = 8;
    private final boolean disableTransferAllAssets;
    private final EligibleAssets eligibleAssets;
    private final AccountFeatureParityBottomSheetData enableMarginDialogData;
    private final boolean isLoading;
    private final UiIatAccount sinkAccount;
    private final UiIatAccount sourceAccount;
    private final StringResource transferAllAssetsDescriptionOverride;

    public static /* synthetic */ InternalAssetTransferTypeSelectionViewState copy$default(InternalAssetTransferTypeSelectionViewState internalAssetTransferTypeSelectionViewState, EligibleAssets eligibleAssets, UiIatAccount uiIatAccount, UiIatAccount uiIatAccount2, boolean z, StringResource stringResource, boolean z2, AccountFeatureParityBottomSheetData accountFeatureParityBottomSheetData, int i, Object obj) {
        if ((i & 1) != 0) {
            eligibleAssets = internalAssetTransferTypeSelectionViewState.eligibleAssets;
        }
        if ((i & 2) != 0) {
            uiIatAccount = internalAssetTransferTypeSelectionViewState.sinkAccount;
        }
        if ((i & 4) != 0) {
            uiIatAccount2 = internalAssetTransferTypeSelectionViewState.sourceAccount;
        }
        if ((i & 8) != 0) {
            z = internalAssetTransferTypeSelectionViewState.disableTransferAllAssets;
        }
        if ((i & 16) != 0) {
            stringResource = internalAssetTransferTypeSelectionViewState.transferAllAssetsDescriptionOverride;
        }
        if ((i & 32) != 0) {
            z2 = internalAssetTransferTypeSelectionViewState.isLoading;
        }
        if ((i & 64) != 0) {
            accountFeatureParityBottomSheetData = internalAssetTransferTypeSelectionViewState.enableMarginDialogData;
        }
        boolean z3 = z2;
        AccountFeatureParityBottomSheetData accountFeatureParityBottomSheetData2 = accountFeatureParityBottomSheetData;
        StringResource stringResource2 = stringResource;
        UiIatAccount uiIatAccount3 = uiIatAccount2;
        return internalAssetTransferTypeSelectionViewState.copy(eligibleAssets, uiIatAccount, uiIatAccount3, z, stringResource2, z3, accountFeatureParityBottomSheetData2);
    }

    /* renamed from: component1, reason: from getter */
    public final EligibleAssets getEligibleAssets() {
        return this.eligibleAssets;
    }

    /* renamed from: component2, reason: from getter */
    public final UiIatAccount getSinkAccount() {
        return this.sinkAccount;
    }

    /* renamed from: component3, reason: from getter */
    public final UiIatAccount getSourceAccount() {
        return this.sourceAccount;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getDisableTransferAllAssets() {
        return this.disableTransferAllAssets;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getTransferAllAssetsDescriptionOverride() {
        return this.transferAllAssetsDescriptionOverride;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component7, reason: from getter */
    public final AccountFeatureParityBottomSheetData getEnableMarginDialogData() {
        return this.enableMarginDialogData;
    }

    public final InternalAssetTransferTypeSelectionViewState copy(EligibleAssets eligibleAssets, UiIatAccount sinkAccount, UiIatAccount sourceAccount, boolean disableTransferAllAssets, StringResource transferAllAssetsDescriptionOverride, boolean isLoading, AccountFeatureParityBottomSheetData enableMarginDialogData) {
        Intrinsics.checkNotNullParameter(eligibleAssets, "eligibleAssets");
        Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        return new InternalAssetTransferTypeSelectionViewState(eligibleAssets, sinkAccount, sourceAccount, disableTransferAllAssets, transferAllAssetsDescriptionOverride, isLoading, enableMarginDialogData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalAssetTransferTypeSelectionViewState)) {
            return false;
        }
        InternalAssetTransferTypeSelectionViewState internalAssetTransferTypeSelectionViewState = (InternalAssetTransferTypeSelectionViewState) other;
        return Intrinsics.areEqual(this.eligibleAssets, internalAssetTransferTypeSelectionViewState.eligibleAssets) && Intrinsics.areEqual(this.sinkAccount, internalAssetTransferTypeSelectionViewState.sinkAccount) && Intrinsics.areEqual(this.sourceAccount, internalAssetTransferTypeSelectionViewState.sourceAccount) && this.disableTransferAllAssets == internalAssetTransferTypeSelectionViewState.disableTransferAllAssets && Intrinsics.areEqual(this.transferAllAssetsDescriptionOverride, internalAssetTransferTypeSelectionViewState.transferAllAssetsDescriptionOverride) && this.isLoading == internalAssetTransferTypeSelectionViewState.isLoading && Intrinsics.areEqual(this.enableMarginDialogData, internalAssetTransferTypeSelectionViewState.enableMarginDialogData);
    }

    public int hashCode() {
        int iHashCode = ((((((this.eligibleAssets.hashCode() * 31) + this.sinkAccount.hashCode()) * 31) + this.sourceAccount.hashCode()) * 31) + Boolean.hashCode(this.disableTransferAllAssets)) * 31;
        StringResource stringResource = this.transferAllAssetsDescriptionOverride;
        int iHashCode2 = (((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        AccountFeatureParityBottomSheetData accountFeatureParityBottomSheetData = this.enableMarginDialogData;
        return iHashCode2 + (accountFeatureParityBottomSheetData != null ? accountFeatureParityBottomSheetData.hashCode() : 0);
    }

    public String toString() {
        return "InternalAssetTransferTypeSelectionViewState(eligibleAssets=" + this.eligibleAssets + ", sinkAccount=" + this.sinkAccount + ", sourceAccount=" + this.sourceAccount + ", disableTransferAllAssets=" + this.disableTransferAllAssets + ", transferAllAssetsDescriptionOverride=" + this.transferAllAssetsDescriptionOverride + ", isLoading=" + this.isLoading + ", enableMarginDialogData=" + this.enableMarginDialogData + ")";
    }

    public InternalAssetTransferTypeSelectionViewState(EligibleAssets eligibleAssets, UiIatAccount sinkAccount, UiIatAccount sourceAccount, boolean z, StringResource stringResource, boolean z2, AccountFeatureParityBottomSheetData accountFeatureParityBottomSheetData) {
        Intrinsics.checkNotNullParameter(eligibleAssets, "eligibleAssets");
        Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        this.eligibleAssets = eligibleAssets;
        this.sinkAccount = sinkAccount;
        this.sourceAccount = sourceAccount;
        this.disableTransferAllAssets = z;
        this.transferAllAssetsDescriptionOverride = stringResource;
        this.isLoading = z2;
        this.enableMarginDialogData = accountFeatureParityBottomSheetData;
    }

    public /* synthetic */ InternalAssetTransferTypeSelectionViewState(EligibleAssets eligibleAssets, UiIatAccount uiIatAccount, UiIatAccount uiIatAccount2, boolean z, StringResource stringResource, boolean z2, AccountFeatureParityBottomSheetData accountFeatureParityBottomSheetData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eligibleAssets, uiIatAccount, uiIatAccount2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : stringResource, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : accountFeatureParityBottomSheetData);
    }

    public final EligibleAssets getEligibleAssets() {
        return this.eligibleAssets;
    }

    public final UiIatAccount getSinkAccount() {
        return this.sinkAccount;
    }

    public final UiIatAccount getSourceAccount() {
        return this.sourceAccount;
    }

    public final boolean getDisableTransferAllAssets() {
        return this.disableTransferAllAssets;
    }

    public final StringResource getTransferAllAssetsDescriptionOverride() {
        return this.transferAllAssetsDescriptionOverride;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final AccountFeatureParityBottomSheetData getEnableMarginDialogData() {
        return this.enableMarginDialogData;
    }

    private final boolean getAllAssetsAreTransferable() {
        return UiAssets3.toNontransferableUiModel(this.eligibleAssets).getAssetsCount() == 0;
    }

    public final StringResource getAllAssetsTransferTitleStringResource() {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        if (getAllAssetsAreTransferable()) {
            i = C18977R.string.iat_choice_all_assets_transferable_title;
        } else {
            i = C18977R.string.iat_choice_some_assets_nontransferable_title;
        }
        return companion.invoke(i, new Object[0]);
    }

    public final StringResource getAllAssetsTransferDescriptionStringResource() {
        StringResource stringResource = this.transferAllAssetsDescriptionOverride;
        if (stringResource != null) {
            return stringResource;
        }
        if (getAllAssetsAreTransferable()) {
            return StringResource.INSTANCE.invoke(C18977R.string.iat_choice_all_assets_transferable_description, this.sourceAccount.getDisplayNameWithAccountInSentence(), this.sinkAccount.getDisplayNameWithAccountInSentence());
        }
        return StringResource.INSTANCE.invoke(C18977R.string.iat_choice_some_assets_nontransferable_description, this.sinkAccount.getDisplayNameWithAccountInSentence());
    }
}
