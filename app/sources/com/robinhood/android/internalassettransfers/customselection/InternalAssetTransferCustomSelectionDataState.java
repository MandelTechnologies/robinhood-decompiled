package com.robinhood.android.internalassettransfers.customselection;

import bonfire.proto.idl.margin.p036v1.GetMultiAccountEligibilityResponseDto;
import com.robinhood.android.internalassettransfers.AccountSelection;
import com.robinhood.android.internalassettransfers.AssetSelection;
import com.robinhood.android.models.internalassettransfers.p193db.EligibleAssets;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferCustomSelectionDataState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jg\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010.\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionDataState;", "", "eligibleAssets", "Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "assetSelection", "Lcom/robinhood/android/internalassettransfers/AssetSelection;", "accountSelection", "Lcom/robinhood/android/internalassettransfers/AccountSelection;", "searchTextValue", "", "loading", "", "shouldAbortIatFlow", "disableMarginRow", "marginRowReasonText", "Lcom/robinhood/utils/resource/StringResource;", "sinkEligibility", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;", "<init>", "(Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;Lcom/robinhood/android/internalassettransfers/AssetSelection;Lcom/robinhood/android/internalassettransfers/AccountSelection;Ljava/lang/String;ZZZLcom/robinhood/utils/resource/StringResource;Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;)V", "getEligibleAssets", "()Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "getAssetSelection", "()Lcom/robinhood/android/internalassettransfers/AssetSelection;", "getAccountSelection", "()Lcom/robinhood/android/internalassettransfers/AccountSelection;", "getSearchTextValue", "()Ljava/lang/String;", "getLoading", "()Z", "getShouldAbortIatFlow", "getDisableMarginRow", "getMarginRowReasonText", "()Lcom/robinhood/utils/resource/StringResource;", "getSinkEligibility", "()Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InternalAssetTransferCustomSelectionDataState {
    public static final int $stable = 8;
    private final AccountSelection accountSelection;
    private final AssetSelection assetSelection;
    private final boolean disableMarginRow;
    private final EligibleAssets eligibleAssets;
    private final boolean loading;
    private final StringResource marginRowReasonText;
    private final String searchTextValue;
    private final boolean shouldAbortIatFlow;
    private final GetMultiAccountEligibilityResponseDto sinkEligibility;

    public static /* synthetic */ InternalAssetTransferCustomSelectionDataState copy$default(InternalAssetTransferCustomSelectionDataState internalAssetTransferCustomSelectionDataState, EligibleAssets eligibleAssets, AssetSelection assetSelection, AccountSelection accountSelection, String str, boolean z, boolean z2, boolean z3, StringResource stringResource, GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto, int i, Object obj) {
        if ((i & 1) != 0) {
            eligibleAssets = internalAssetTransferCustomSelectionDataState.eligibleAssets;
        }
        if ((i & 2) != 0) {
            assetSelection = internalAssetTransferCustomSelectionDataState.assetSelection;
        }
        if ((i & 4) != 0) {
            accountSelection = internalAssetTransferCustomSelectionDataState.accountSelection;
        }
        if ((i & 8) != 0) {
            str = internalAssetTransferCustomSelectionDataState.searchTextValue;
        }
        if ((i & 16) != 0) {
            z = internalAssetTransferCustomSelectionDataState.loading;
        }
        if ((i & 32) != 0) {
            z2 = internalAssetTransferCustomSelectionDataState.shouldAbortIatFlow;
        }
        if ((i & 64) != 0) {
            z3 = internalAssetTransferCustomSelectionDataState.disableMarginRow;
        }
        if ((i & 128) != 0) {
            stringResource = internalAssetTransferCustomSelectionDataState.marginRowReasonText;
        }
        if ((i & 256) != 0) {
            getMultiAccountEligibilityResponseDto = internalAssetTransferCustomSelectionDataState.sinkEligibility;
        }
        StringResource stringResource2 = stringResource;
        GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto2 = getMultiAccountEligibilityResponseDto;
        boolean z4 = z2;
        boolean z5 = z3;
        boolean z6 = z;
        AccountSelection accountSelection2 = accountSelection;
        return internalAssetTransferCustomSelectionDataState.copy(eligibleAssets, assetSelection, accountSelection2, str, z6, z4, z5, stringResource2, getMultiAccountEligibilityResponseDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final EligibleAssets getEligibleAssets() {
        return this.eligibleAssets;
    }

    /* renamed from: component2, reason: from getter */
    public final AssetSelection getAssetSelection() {
        return this.assetSelection;
    }

    /* renamed from: component3, reason: from getter */
    public final AccountSelection getAccountSelection() {
        return this.accountSelection;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSearchTextValue() {
        return this.searchTextValue;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShouldAbortIatFlow() {
        return this.shouldAbortIatFlow;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getDisableMarginRow() {
        return this.disableMarginRow;
    }

    /* renamed from: component8, reason: from getter */
    public final StringResource getMarginRowReasonText() {
        return this.marginRowReasonText;
    }

    /* renamed from: component9, reason: from getter */
    public final GetMultiAccountEligibilityResponseDto getSinkEligibility() {
        return this.sinkEligibility;
    }

    public final InternalAssetTransferCustomSelectionDataState copy(EligibleAssets eligibleAssets, AssetSelection assetSelection, AccountSelection accountSelection, String searchTextValue, boolean loading, boolean shouldAbortIatFlow, boolean disableMarginRow, StringResource marginRowReasonText, GetMultiAccountEligibilityResponseDto sinkEligibility) {
        Intrinsics.checkNotNullParameter(eligibleAssets, "eligibleAssets");
        Intrinsics.checkNotNullParameter(assetSelection, "assetSelection");
        Intrinsics.checkNotNullParameter(accountSelection, "accountSelection");
        Intrinsics.checkNotNullParameter(searchTextValue, "searchTextValue");
        return new InternalAssetTransferCustomSelectionDataState(eligibleAssets, assetSelection, accountSelection, searchTextValue, loading, shouldAbortIatFlow, disableMarginRow, marginRowReasonText, sinkEligibility);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalAssetTransferCustomSelectionDataState)) {
            return false;
        }
        InternalAssetTransferCustomSelectionDataState internalAssetTransferCustomSelectionDataState = (InternalAssetTransferCustomSelectionDataState) other;
        return Intrinsics.areEqual(this.eligibleAssets, internalAssetTransferCustomSelectionDataState.eligibleAssets) && Intrinsics.areEqual(this.assetSelection, internalAssetTransferCustomSelectionDataState.assetSelection) && Intrinsics.areEqual(this.accountSelection, internalAssetTransferCustomSelectionDataState.accountSelection) && Intrinsics.areEqual(this.searchTextValue, internalAssetTransferCustomSelectionDataState.searchTextValue) && this.loading == internalAssetTransferCustomSelectionDataState.loading && this.shouldAbortIatFlow == internalAssetTransferCustomSelectionDataState.shouldAbortIatFlow && this.disableMarginRow == internalAssetTransferCustomSelectionDataState.disableMarginRow && Intrinsics.areEqual(this.marginRowReasonText, internalAssetTransferCustomSelectionDataState.marginRowReasonText) && Intrinsics.areEqual(this.sinkEligibility, internalAssetTransferCustomSelectionDataState.sinkEligibility);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.eligibleAssets.hashCode() * 31) + this.assetSelection.hashCode()) * 31) + this.accountSelection.hashCode()) * 31) + this.searchTextValue.hashCode()) * 31) + Boolean.hashCode(this.loading)) * 31) + Boolean.hashCode(this.shouldAbortIatFlow)) * 31) + Boolean.hashCode(this.disableMarginRow)) * 31;
        StringResource stringResource = this.marginRowReasonText;
        int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto = this.sinkEligibility;
        return iHashCode2 + (getMultiAccountEligibilityResponseDto != null ? getMultiAccountEligibilityResponseDto.hashCode() : 0);
    }

    public String toString() {
        return "InternalAssetTransferCustomSelectionDataState(eligibleAssets=" + this.eligibleAssets + ", assetSelection=" + this.assetSelection + ", accountSelection=" + this.accountSelection + ", searchTextValue=" + this.searchTextValue + ", loading=" + this.loading + ", shouldAbortIatFlow=" + this.shouldAbortIatFlow + ", disableMarginRow=" + this.disableMarginRow + ", marginRowReasonText=" + this.marginRowReasonText + ", sinkEligibility=" + this.sinkEligibility + ")";
    }

    public InternalAssetTransferCustomSelectionDataState(EligibleAssets eligibleAssets, AssetSelection assetSelection, AccountSelection accountSelection, String searchTextValue, boolean z, boolean z2, boolean z3, StringResource stringResource, GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto) {
        Intrinsics.checkNotNullParameter(eligibleAssets, "eligibleAssets");
        Intrinsics.checkNotNullParameter(assetSelection, "assetSelection");
        Intrinsics.checkNotNullParameter(accountSelection, "accountSelection");
        Intrinsics.checkNotNullParameter(searchTextValue, "searchTextValue");
        this.eligibleAssets = eligibleAssets;
        this.assetSelection = assetSelection;
        this.accountSelection = accountSelection;
        this.searchTextValue = searchTextValue;
        this.loading = z;
        this.shouldAbortIatFlow = z2;
        this.disableMarginRow = z3;
        this.marginRowReasonText = stringResource;
        this.sinkEligibility = getMultiAccountEligibilityResponseDto;
    }

    public final EligibleAssets getEligibleAssets() {
        return this.eligibleAssets;
    }

    public final AssetSelection getAssetSelection() {
        return this.assetSelection;
    }

    public final AccountSelection getAccountSelection() {
        return this.accountSelection;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ InternalAssetTransferCustomSelectionDataState(com.robinhood.android.models.internalassettransfers.p193db.EligibleAssets r13, com.robinhood.android.internalassettransfers.AssetSelection r14, com.robinhood.android.internalassettransfers.AccountSelection r15, java.lang.String r16, boolean r17, boolean r18, boolean r19, com.robinhood.utils.resource.StringResource r20, bonfire.proto.idl.margin.p036v1.GetMultiAccountEligibilityResponseDto r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 8
            if (r1 == 0) goto La
            java.lang.String r1 = ""
            r6 = r1
            goto Lc
        La:
            r6 = r16
        Lc:
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L13
            r7 = r2
            goto L15
        L13:
            r7 = r17
        L15:
            r1 = r0 & 32
            if (r1 == 0) goto L1b
            r8 = r2
            goto L1d
        L1b:
            r8 = r18
        L1d:
            r1 = r0 & 64
            if (r1 == 0) goto L23
            r9 = r2
            goto L25
        L23:
            r9 = r19
        L25:
            r1 = r0 & 128(0x80, float:1.794E-43)
            r2 = 0
            if (r1 == 0) goto L2c
            r10 = r2
            goto L2e
        L2c:
            r10 = r20
        L2e:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L38
            r11 = r2
            r3 = r13
            r4 = r14
            r5 = r15
            r2 = r12
            goto L3e
        L38:
            r11 = r21
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
        L3e:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDataState.<init>(com.robinhood.android.models.internalassettransfers.db.EligibleAssets, com.robinhood.android.internalassettransfers.AssetSelection, com.robinhood.android.internalassettransfers.AccountSelection, java.lang.String, boolean, boolean, boolean, com.robinhood.utils.resource.StringResource, bonfire.proto.idl.margin.v1.GetMultiAccountEligibilityResponseDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getSearchTextValue() {
        return this.searchTextValue;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final boolean getShouldAbortIatFlow() {
        return this.shouldAbortIatFlow;
    }

    public final boolean getDisableMarginRow() {
        return this.disableMarginRow;
    }

    public final StringResource getMarginRowReasonText() {
        return this.marginRowReasonText;
    }

    public final GetMultiAccountEligibilityResponseDto getSinkEligibility() {
        return this.sinkEligibility;
    }
}
