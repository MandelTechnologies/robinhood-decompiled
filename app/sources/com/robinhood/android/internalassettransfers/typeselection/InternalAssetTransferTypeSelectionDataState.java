package com.robinhood.android.internalassettransfers.typeselection;

import bonfire.proto.idl.margin.p036v1.GetMultiAccountEligibilityResponseDto;
import com.robinhood.android.internalassettransfers.accountselection.UiIatAccount;
import com.robinhood.android.internalassettransfers.validation.AccountFeatureParityBottomSheetData;
import com.robinhood.android.models.internalassettransfers.p193db.EligibleAssets;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferTypeSelectionDataState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003Ja\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010(\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionDataState;", "", "eligibleAssets", "Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "isInMibExperiment", "", "transferAllAssetsDescriptionOverride", "Lcom/robinhood/utils/resource/StringResource;", "sinkEligibility", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;", "sourceEligibility", "enableMarginDialogData", "Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityBottomSheetData;", "<init>", "(Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;ZLcom/robinhood/utils/resource/StringResource;Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityBottomSheetData;)V", "getEligibleAssets", "()Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "getSourceAccount", "()Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "getSinkAccount", "()Z", "getTransferAllAssetsDescriptionOverride", "()Lcom/robinhood/utils/resource/StringResource;", "getSinkEligibility", "()Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;", "getSourceEligibility", "getEnableMarginDialogData", "()Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityBottomSheetData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InternalAssetTransferTypeSelectionDataState {
    public static final int $stable = 8;
    private final EligibleAssets eligibleAssets;
    private final AccountFeatureParityBottomSheetData enableMarginDialogData;
    private final boolean isInMibExperiment;
    private final UiIatAccount sinkAccount;
    private final GetMultiAccountEligibilityResponseDto sinkEligibility;
    private final UiIatAccount sourceAccount;
    private final GetMultiAccountEligibilityResponseDto sourceEligibility;
    private final StringResource transferAllAssetsDescriptionOverride;

    public static /* synthetic */ InternalAssetTransferTypeSelectionDataState copy$default(InternalAssetTransferTypeSelectionDataState internalAssetTransferTypeSelectionDataState, EligibleAssets eligibleAssets, UiIatAccount uiIatAccount, UiIatAccount uiIatAccount2, boolean z, StringResource stringResource, GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto, GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto2, AccountFeatureParityBottomSheetData accountFeatureParityBottomSheetData, int i, Object obj) {
        if ((i & 1) != 0) {
            eligibleAssets = internalAssetTransferTypeSelectionDataState.eligibleAssets;
        }
        if ((i & 2) != 0) {
            uiIatAccount = internalAssetTransferTypeSelectionDataState.sourceAccount;
        }
        if ((i & 4) != 0) {
            uiIatAccount2 = internalAssetTransferTypeSelectionDataState.sinkAccount;
        }
        if ((i & 8) != 0) {
            z = internalAssetTransferTypeSelectionDataState.isInMibExperiment;
        }
        if ((i & 16) != 0) {
            stringResource = internalAssetTransferTypeSelectionDataState.transferAllAssetsDescriptionOverride;
        }
        if ((i & 32) != 0) {
            getMultiAccountEligibilityResponseDto = internalAssetTransferTypeSelectionDataState.sinkEligibility;
        }
        if ((i & 64) != 0) {
            getMultiAccountEligibilityResponseDto2 = internalAssetTransferTypeSelectionDataState.sourceEligibility;
        }
        if ((i & 128) != 0) {
            accountFeatureParityBottomSheetData = internalAssetTransferTypeSelectionDataState.enableMarginDialogData;
        }
        GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto3 = getMultiAccountEligibilityResponseDto2;
        AccountFeatureParityBottomSheetData accountFeatureParityBottomSheetData2 = accountFeatureParityBottomSheetData;
        StringResource stringResource2 = stringResource;
        GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto4 = getMultiAccountEligibilityResponseDto;
        return internalAssetTransferTypeSelectionDataState.copy(eligibleAssets, uiIatAccount, uiIatAccount2, z, stringResource2, getMultiAccountEligibilityResponseDto4, getMultiAccountEligibilityResponseDto3, accountFeatureParityBottomSheetData2);
    }

    /* renamed from: component1, reason: from getter */
    public final EligibleAssets getEligibleAssets() {
        return this.eligibleAssets;
    }

    /* renamed from: component2, reason: from getter */
    public final UiIatAccount getSourceAccount() {
        return this.sourceAccount;
    }

    /* renamed from: component3, reason: from getter */
    public final UiIatAccount getSinkAccount() {
        return this.sinkAccount;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsInMibExperiment() {
        return this.isInMibExperiment;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getTransferAllAssetsDescriptionOverride() {
        return this.transferAllAssetsDescriptionOverride;
    }

    /* renamed from: component6, reason: from getter */
    public final GetMultiAccountEligibilityResponseDto getSinkEligibility() {
        return this.sinkEligibility;
    }

    /* renamed from: component7, reason: from getter */
    public final GetMultiAccountEligibilityResponseDto getSourceEligibility() {
        return this.sourceEligibility;
    }

    /* renamed from: component8, reason: from getter */
    public final AccountFeatureParityBottomSheetData getEnableMarginDialogData() {
        return this.enableMarginDialogData;
    }

    public final InternalAssetTransferTypeSelectionDataState copy(EligibleAssets eligibleAssets, UiIatAccount sourceAccount, UiIatAccount sinkAccount, boolean isInMibExperiment, StringResource transferAllAssetsDescriptionOverride, GetMultiAccountEligibilityResponseDto sinkEligibility, GetMultiAccountEligibilityResponseDto sourceEligibility, AccountFeatureParityBottomSheetData enableMarginDialogData) {
        Intrinsics.checkNotNullParameter(eligibleAssets, "eligibleAssets");
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
        return new InternalAssetTransferTypeSelectionDataState(eligibleAssets, sourceAccount, sinkAccount, isInMibExperiment, transferAllAssetsDescriptionOverride, sinkEligibility, sourceEligibility, enableMarginDialogData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalAssetTransferTypeSelectionDataState)) {
            return false;
        }
        InternalAssetTransferTypeSelectionDataState internalAssetTransferTypeSelectionDataState = (InternalAssetTransferTypeSelectionDataState) other;
        return Intrinsics.areEqual(this.eligibleAssets, internalAssetTransferTypeSelectionDataState.eligibleAssets) && Intrinsics.areEqual(this.sourceAccount, internalAssetTransferTypeSelectionDataState.sourceAccount) && Intrinsics.areEqual(this.sinkAccount, internalAssetTransferTypeSelectionDataState.sinkAccount) && this.isInMibExperiment == internalAssetTransferTypeSelectionDataState.isInMibExperiment && Intrinsics.areEqual(this.transferAllAssetsDescriptionOverride, internalAssetTransferTypeSelectionDataState.transferAllAssetsDescriptionOverride) && Intrinsics.areEqual(this.sinkEligibility, internalAssetTransferTypeSelectionDataState.sinkEligibility) && Intrinsics.areEqual(this.sourceEligibility, internalAssetTransferTypeSelectionDataState.sourceEligibility) && Intrinsics.areEqual(this.enableMarginDialogData, internalAssetTransferTypeSelectionDataState.enableMarginDialogData);
    }

    public int hashCode() {
        int iHashCode = ((((((this.eligibleAssets.hashCode() * 31) + this.sourceAccount.hashCode()) * 31) + this.sinkAccount.hashCode()) * 31) + Boolean.hashCode(this.isInMibExperiment)) * 31;
        StringResource stringResource = this.transferAllAssetsDescriptionOverride;
        int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto = this.sinkEligibility;
        int iHashCode3 = (iHashCode2 + (getMultiAccountEligibilityResponseDto == null ? 0 : getMultiAccountEligibilityResponseDto.hashCode())) * 31;
        GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto2 = this.sourceEligibility;
        int iHashCode4 = (iHashCode3 + (getMultiAccountEligibilityResponseDto2 == null ? 0 : getMultiAccountEligibilityResponseDto2.hashCode())) * 31;
        AccountFeatureParityBottomSheetData accountFeatureParityBottomSheetData = this.enableMarginDialogData;
        return iHashCode4 + (accountFeatureParityBottomSheetData != null ? accountFeatureParityBottomSheetData.hashCode() : 0);
    }

    public String toString() {
        return "InternalAssetTransferTypeSelectionDataState(eligibleAssets=" + this.eligibleAssets + ", sourceAccount=" + this.sourceAccount + ", sinkAccount=" + this.sinkAccount + ", isInMibExperiment=" + this.isInMibExperiment + ", transferAllAssetsDescriptionOverride=" + this.transferAllAssetsDescriptionOverride + ", sinkEligibility=" + this.sinkEligibility + ", sourceEligibility=" + this.sourceEligibility + ", enableMarginDialogData=" + this.enableMarginDialogData + ")";
    }

    public InternalAssetTransferTypeSelectionDataState(EligibleAssets eligibleAssets, UiIatAccount sourceAccount, UiIatAccount sinkAccount, boolean z, StringResource stringResource, GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto, GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto2, AccountFeatureParityBottomSheetData accountFeatureParityBottomSheetData) {
        Intrinsics.checkNotNullParameter(eligibleAssets, "eligibleAssets");
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
        this.eligibleAssets = eligibleAssets;
        this.sourceAccount = sourceAccount;
        this.sinkAccount = sinkAccount;
        this.isInMibExperiment = z;
        this.transferAllAssetsDescriptionOverride = stringResource;
        this.sinkEligibility = getMultiAccountEligibilityResponseDto;
        this.sourceEligibility = getMultiAccountEligibilityResponseDto2;
        this.enableMarginDialogData = accountFeatureParityBottomSheetData;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ InternalAssetTransferTypeSelectionDataState(com.robinhood.android.models.internalassettransfers.p193db.EligibleAssets r10, com.robinhood.android.internalassettransfers.accountselection.UiIatAccount r11, com.robinhood.android.internalassettransfers.accountselection.UiIatAccount r12, boolean r13, com.robinhood.utils.resource.StringResource r14, bonfire.proto.idl.margin.p036v1.GetMultiAccountEligibilityResponseDto r15, bonfire.proto.idl.margin.p036v1.GetMultiAccountEligibilityResponseDto r16, com.robinhood.android.internalassettransfers.validation.AccountFeatureParityBottomSheetData r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 8
            if (r1 == 0) goto L7
            r13 = 0
        L7:
            r4 = r13
            r13 = r0 & 16
            r1 = 0
            if (r13 == 0) goto Lf
            r5 = r1
            goto L10
        Lf:
            r5 = r14
        L10:
            r13 = r0 & 32
            if (r13 == 0) goto L16
            r6 = r1
            goto L17
        L16:
            r6 = r15
        L17:
            r13 = r0 & 64
            if (r13 == 0) goto L1d
            r7 = r1
            goto L1f
        L1d:
            r7 = r16
        L1f:
            r13 = r0 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L29
            r8 = r1
            r0 = r9
            r2 = r11
            r3 = r12
            r1 = r10
            goto L2f
        L29:
            r8 = r17
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
        L2f:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDataState.<init>(com.robinhood.android.models.internalassettransfers.db.EligibleAssets, com.robinhood.android.internalassettransfers.accountselection.UiIatAccount, com.robinhood.android.internalassettransfers.accountselection.UiIatAccount, boolean, com.robinhood.utils.resource.StringResource, bonfire.proto.idl.margin.v1.GetMultiAccountEligibilityResponseDto, bonfire.proto.idl.margin.v1.GetMultiAccountEligibilityResponseDto, com.robinhood.android.internalassettransfers.validation.AccountFeatureParityBottomSheetData, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final EligibleAssets getEligibleAssets() {
        return this.eligibleAssets;
    }

    public final UiIatAccount getSourceAccount() {
        return this.sourceAccount;
    }

    public final UiIatAccount getSinkAccount() {
        return this.sinkAccount;
    }

    public final boolean isInMibExperiment() {
        return this.isInMibExperiment;
    }

    public final StringResource getTransferAllAssetsDescriptionOverride() {
        return this.transferAllAssetsDescriptionOverride;
    }

    public final GetMultiAccountEligibilityResponseDto getSinkEligibility() {
        return this.sinkEligibility;
    }

    public final GetMultiAccountEligibilityResponseDto getSourceEligibility() {
        return this.sourceEligibility;
    }

    public final AccountFeatureParityBottomSheetData getEnableMarginDialogData() {
        return this.enableMarginDialogData;
    }
}
