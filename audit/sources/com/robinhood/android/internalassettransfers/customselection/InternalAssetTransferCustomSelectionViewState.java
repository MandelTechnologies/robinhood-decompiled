package com.robinhood.android.internalassettransfers.customselection;

import androidx.compose.p011ui.state.ToggleableState;
import com.robinhood.android.internalassettransfers.InternalAssetTransferInfoBannerViewState;
import com.robinhood.android.internalassettransfers.review.models.UiAssets;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: InternalAssetTransferCustomSelectionViewState.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\b\u0012\u0006\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010;\u001a\u00020\u000bHÆ\u0003J\t\u0010<\u001a\u00020\rHÆ\u0003J\t\u0010=\u001a\u00020\u000fHÆ\u0003J\t\u0010>\u001a\u00020\u000bHÆ\u0003J\t\u0010?\u001a\u00020\u000bHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010A\u001a\u00020\u0015HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u00102J\t\u0010C\u001a\u00020\rHÆ\u0003J\t\u0010D\u001a\u00020\u000bHÆ\u0003J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001b0\bHÆ\u0003J\t\u0010F\u001a\u00020\u000bHÆ\u0003JÀ\u0001\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\b\b\u0002\u0010\u001c\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020\u000b2\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020\u0017HÖ\u0001J\t\u0010L\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010&R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010&R\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u0011\u0010\u0018\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b4\u0010(R\u0011\u0010\u0019\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010&R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\b¢\u0006\b\n\u0000\u001a\u0004\b5\u0010%R\u0011\u0010\u001c\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b6\u0010&¨\u0006M"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionViewState;", "", "transferableAssets", "Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;", "nontransferableAssets", "infoBannerViewState", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferInfoBannerViewState;", "equityRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/internalassettransfers/customselection/EquityRow;", "isContinueButtonEnabled", "", "searchTextValue", "", "selectedCashBalance", "Ljava/math/BigDecimal;", "loading", "disableMarginRow", "marginRowReasonText", "Lcom/robinhood/utils/resource/StringResource;", "selectedCashBalanceCheck", "Landroidx/compose/ui/state/ToggleableState;", "cashBalanceMetaStringRes", "", "cashTitleString", "isCashVisible", "visibleInstrumentIds", "Ljava/util/UUID;", "areAllVisibleAssetsSelected", "<init>", "(Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;Lcom/robinhood/android/internalassettransfers/InternalAssetTransferInfoBannerViewState;Lkotlinx/collections/immutable/ImmutableList;ZLjava/lang/String;Ljava/math/BigDecimal;ZZLcom/robinhood/utils/resource/StringResource;Landroidx/compose/ui/state/ToggleableState;Ljava/lang/Integer;Ljava/lang/String;ZLkotlinx/collections/immutable/ImmutableList;Z)V", "getTransferableAssets", "()Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;", "getNontransferableAssets", "getInfoBannerViewState", "()Lcom/robinhood/android/internalassettransfers/InternalAssetTransferInfoBannerViewState;", "getEquityRows", "()Lkotlinx/collections/immutable/ImmutableList;", "()Z", "getSearchTextValue", "()Ljava/lang/String;", "getSelectedCashBalance", "()Ljava/math/BigDecimal;", "getLoading", "getDisableMarginRow", "getMarginRowReasonText", "()Lcom/robinhood/utils/resource/StringResource;", "getSelectedCashBalanceCheck", "()Landroidx/compose/ui/state/ToggleableState;", "getCashBalanceMetaStringRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCashTitleString", "getVisibleInstrumentIds", "getAreAllVisibleAssetsSelected", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;Lcom/robinhood/android/internalassettransfers/InternalAssetTransferInfoBannerViewState;Lkotlinx/collections/immutable/ImmutableList;ZLjava/lang/String;Ljava/math/BigDecimal;ZZLcom/robinhood/utils/resource/StringResource;Landroidx/compose/ui/state/ToggleableState;Ljava/lang/Integer;Ljava/lang/String;ZLkotlinx/collections/immutable/ImmutableList;Z)Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionViewState;", "equals", "other", "hashCode", "toString", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InternalAssetTransferCustomSelectionViewState {
    public static final int $stable = 8;
    private final boolean areAllVisibleAssetsSelected;
    private final Integer cashBalanceMetaStringRes;
    private final String cashTitleString;
    private final boolean disableMarginRow;
    private final ImmutableList<EquityRow> equityRows;
    private final InternalAssetTransferInfoBannerViewState infoBannerViewState;
    private final boolean isCashVisible;
    private final boolean isContinueButtonEnabled;
    private final boolean loading;
    private final StringResource marginRowReasonText;
    private final UiAssets nontransferableAssets;
    private final String searchTextValue;
    private final BigDecimal selectedCashBalance;
    private final ToggleableState selectedCashBalanceCheck;
    private final UiAssets transferableAssets;
    private final ImmutableList<UUID> visibleInstrumentIds;

    /* renamed from: component1, reason: from getter */
    public final UiAssets getTransferableAssets() {
        return this.transferableAssets;
    }

    /* renamed from: component10, reason: from getter */
    public final StringResource getMarginRowReasonText() {
        return this.marginRowReasonText;
    }

    /* renamed from: component11, reason: from getter */
    public final ToggleableState getSelectedCashBalanceCheck() {
        return this.selectedCashBalanceCheck;
    }

    /* renamed from: component12, reason: from getter */
    public final Integer getCashBalanceMetaStringRes() {
        return this.cashBalanceMetaStringRes;
    }

    /* renamed from: component13, reason: from getter */
    public final String getCashTitleString() {
        return this.cashTitleString;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsCashVisible() {
        return this.isCashVisible;
    }

    public final ImmutableList<UUID> component15() {
        return this.visibleInstrumentIds;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getAreAllVisibleAssetsSelected() {
        return this.areAllVisibleAssetsSelected;
    }

    /* renamed from: component2, reason: from getter */
    public final UiAssets getNontransferableAssets() {
        return this.nontransferableAssets;
    }

    /* renamed from: component3, reason: from getter */
    public final InternalAssetTransferInfoBannerViewState getInfoBannerViewState() {
        return this.infoBannerViewState;
    }

    public final ImmutableList<EquityRow> component4() {
        return this.equityRows;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsContinueButtonEnabled() {
        return this.isContinueButtonEnabled;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSearchTextValue() {
        return this.searchTextValue;
    }

    /* renamed from: component7, reason: from getter */
    public final BigDecimal getSelectedCashBalance() {
        return this.selectedCashBalance;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getDisableMarginRow() {
        return this.disableMarginRow;
    }

    public final InternalAssetTransferCustomSelectionViewState copy(UiAssets transferableAssets, UiAssets nontransferableAssets, InternalAssetTransferInfoBannerViewState infoBannerViewState, ImmutableList<EquityRow> equityRows, boolean isContinueButtonEnabled, String searchTextValue, BigDecimal selectedCashBalance, boolean loading, boolean disableMarginRow, StringResource marginRowReasonText, ToggleableState selectedCashBalanceCheck, Integer cashBalanceMetaStringRes, String cashTitleString, boolean isCashVisible, ImmutableList<UUID> visibleInstrumentIds, boolean areAllVisibleAssetsSelected) {
        Intrinsics.checkNotNullParameter(transferableAssets, "transferableAssets");
        Intrinsics.checkNotNullParameter(nontransferableAssets, "nontransferableAssets");
        Intrinsics.checkNotNullParameter(equityRows, "equityRows");
        Intrinsics.checkNotNullParameter(searchTextValue, "searchTextValue");
        Intrinsics.checkNotNullParameter(selectedCashBalance, "selectedCashBalance");
        Intrinsics.checkNotNullParameter(selectedCashBalanceCheck, "selectedCashBalanceCheck");
        Intrinsics.checkNotNullParameter(cashTitleString, "cashTitleString");
        Intrinsics.checkNotNullParameter(visibleInstrumentIds, "visibleInstrumentIds");
        return new InternalAssetTransferCustomSelectionViewState(transferableAssets, nontransferableAssets, infoBannerViewState, equityRows, isContinueButtonEnabled, searchTextValue, selectedCashBalance, loading, disableMarginRow, marginRowReasonText, selectedCashBalanceCheck, cashBalanceMetaStringRes, cashTitleString, isCashVisible, visibleInstrumentIds, areAllVisibleAssetsSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalAssetTransferCustomSelectionViewState)) {
            return false;
        }
        InternalAssetTransferCustomSelectionViewState internalAssetTransferCustomSelectionViewState = (InternalAssetTransferCustomSelectionViewState) other;
        return Intrinsics.areEqual(this.transferableAssets, internalAssetTransferCustomSelectionViewState.transferableAssets) && Intrinsics.areEqual(this.nontransferableAssets, internalAssetTransferCustomSelectionViewState.nontransferableAssets) && Intrinsics.areEqual(this.infoBannerViewState, internalAssetTransferCustomSelectionViewState.infoBannerViewState) && Intrinsics.areEqual(this.equityRows, internalAssetTransferCustomSelectionViewState.equityRows) && this.isContinueButtonEnabled == internalAssetTransferCustomSelectionViewState.isContinueButtonEnabled && Intrinsics.areEqual(this.searchTextValue, internalAssetTransferCustomSelectionViewState.searchTextValue) && Intrinsics.areEqual(this.selectedCashBalance, internalAssetTransferCustomSelectionViewState.selectedCashBalance) && this.loading == internalAssetTransferCustomSelectionViewState.loading && this.disableMarginRow == internalAssetTransferCustomSelectionViewState.disableMarginRow && Intrinsics.areEqual(this.marginRowReasonText, internalAssetTransferCustomSelectionViewState.marginRowReasonText) && this.selectedCashBalanceCheck == internalAssetTransferCustomSelectionViewState.selectedCashBalanceCheck && Intrinsics.areEqual(this.cashBalanceMetaStringRes, internalAssetTransferCustomSelectionViewState.cashBalanceMetaStringRes) && Intrinsics.areEqual(this.cashTitleString, internalAssetTransferCustomSelectionViewState.cashTitleString) && this.isCashVisible == internalAssetTransferCustomSelectionViewState.isCashVisible && Intrinsics.areEqual(this.visibleInstrumentIds, internalAssetTransferCustomSelectionViewState.visibleInstrumentIds) && this.areAllVisibleAssetsSelected == internalAssetTransferCustomSelectionViewState.areAllVisibleAssetsSelected;
    }

    public int hashCode() {
        int iHashCode = ((this.transferableAssets.hashCode() * 31) + this.nontransferableAssets.hashCode()) * 31;
        InternalAssetTransferInfoBannerViewState internalAssetTransferInfoBannerViewState = this.infoBannerViewState;
        int iHashCode2 = (((((((((((((iHashCode + (internalAssetTransferInfoBannerViewState == null ? 0 : internalAssetTransferInfoBannerViewState.hashCode())) * 31) + this.equityRows.hashCode()) * 31) + Boolean.hashCode(this.isContinueButtonEnabled)) * 31) + this.searchTextValue.hashCode()) * 31) + this.selectedCashBalance.hashCode()) * 31) + Boolean.hashCode(this.loading)) * 31) + Boolean.hashCode(this.disableMarginRow)) * 31;
        StringResource stringResource = this.marginRowReasonText;
        int iHashCode3 = (((iHashCode2 + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.selectedCashBalanceCheck.hashCode()) * 31;
        Integer num = this.cashBalanceMetaStringRes;
        return ((((((((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31) + this.cashTitleString.hashCode()) * 31) + Boolean.hashCode(this.isCashVisible)) * 31) + this.visibleInstrumentIds.hashCode()) * 31) + Boolean.hashCode(this.areAllVisibleAssetsSelected);
    }

    public String toString() {
        return "InternalAssetTransferCustomSelectionViewState(transferableAssets=" + this.transferableAssets + ", nontransferableAssets=" + this.nontransferableAssets + ", infoBannerViewState=" + this.infoBannerViewState + ", equityRows=" + this.equityRows + ", isContinueButtonEnabled=" + this.isContinueButtonEnabled + ", searchTextValue=" + this.searchTextValue + ", selectedCashBalance=" + this.selectedCashBalance + ", loading=" + this.loading + ", disableMarginRow=" + this.disableMarginRow + ", marginRowReasonText=" + this.marginRowReasonText + ", selectedCashBalanceCheck=" + this.selectedCashBalanceCheck + ", cashBalanceMetaStringRes=" + this.cashBalanceMetaStringRes + ", cashTitleString=" + this.cashTitleString + ", isCashVisible=" + this.isCashVisible + ", visibleInstrumentIds=" + this.visibleInstrumentIds + ", areAllVisibleAssetsSelected=" + this.areAllVisibleAssetsSelected + ")";
    }

    public InternalAssetTransferCustomSelectionViewState(UiAssets transferableAssets, UiAssets nontransferableAssets, InternalAssetTransferInfoBannerViewState internalAssetTransferInfoBannerViewState, ImmutableList<EquityRow> equityRows, boolean z, String searchTextValue, BigDecimal selectedCashBalance, boolean z2, boolean z3, StringResource stringResource, ToggleableState selectedCashBalanceCheck, Integer num, String cashTitleString, boolean z4, ImmutableList<UUID> visibleInstrumentIds, boolean z5) {
        Intrinsics.checkNotNullParameter(transferableAssets, "transferableAssets");
        Intrinsics.checkNotNullParameter(nontransferableAssets, "nontransferableAssets");
        Intrinsics.checkNotNullParameter(equityRows, "equityRows");
        Intrinsics.checkNotNullParameter(searchTextValue, "searchTextValue");
        Intrinsics.checkNotNullParameter(selectedCashBalance, "selectedCashBalance");
        Intrinsics.checkNotNullParameter(selectedCashBalanceCheck, "selectedCashBalanceCheck");
        Intrinsics.checkNotNullParameter(cashTitleString, "cashTitleString");
        Intrinsics.checkNotNullParameter(visibleInstrumentIds, "visibleInstrumentIds");
        this.transferableAssets = transferableAssets;
        this.nontransferableAssets = nontransferableAssets;
        this.infoBannerViewState = internalAssetTransferInfoBannerViewState;
        this.equityRows = equityRows;
        this.isContinueButtonEnabled = z;
        this.searchTextValue = searchTextValue;
        this.selectedCashBalance = selectedCashBalance;
        this.loading = z2;
        this.disableMarginRow = z3;
        this.marginRowReasonText = stringResource;
        this.selectedCashBalanceCheck = selectedCashBalanceCheck;
        this.cashBalanceMetaStringRes = num;
        this.cashTitleString = cashTitleString;
        this.isCashVisible = z4;
        this.visibleInstrumentIds = visibleInstrumentIds;
        this.areAllVisibleAssetsSelected = z5;
    }

    public /* synthetic */ InternalAssetTransferCustomSelectionViewState(UiAssets uiAssets, UiAssets uiAssets2, InternalAssetTransferInfoBannerViewState internalAssetTransferInfoBannerViewState, ImmutableList immutableList, boolean z, String str, BigDecimal bigDecimal, boolean z2, boolean z3, StringResource stringResource, ToggleableState toggleableState, Integer num, String str2, boolean z4, ImmutableList immutableList2, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uiAssets, uiAssets2, internalAssetTransferInfoBannerViewState, immutableList, z, str, bigDecimal, z2, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? null : stringResource, toggleableState, num, str2, z4, immutableList2, z5);
    }

    public final UiAssets getTransferableAssets() {
        return this.transferableAssets;
    }

    public final UiAssets getNontransferableAssets() {
        return this.nontransferableAssets;
    }

    public final InternalAssetTransferInfoBannerViewState getInfoBannerViewState() {
        return this.infoBannerViewState;
    }

    public final ImmutableList<EquityRow> getEquityRows() {
        return this.equityRows;
    }

    public final boolean isContinueButtonEnabled() {
        return this.isContinueButtonEnabled;
    }

    public final String getSearchTextValue() {
        return this.searchTextValue;
    }

    public final BigDecimal getSelectedCashBalance() {
        return this.selectedCashBalance;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final boolean getDisableMarginRow() {
        return this.disableMarginRow;
    }

    public final StringResource getMarginRowReasonText() {
        return this.marginRowReasonText;
    }

    public final ToggleableState getSelectedCashBalanceCheck() {
        return this.selectedCashBalanceCheck;
    }

    public final Integer getCashBalanceMetaStringRes() {
        return this.cashBalanceMetaStringRes;
    }

    public final String getCashTitleString() {
        return this.cashTitleString;
    }

    public final boolean isCashVisible() {
        return this.isCashVisible;
    }

    public final ImmutableList<UUID> getVisibleInstrumentIds() {
        return this.visibleInstrumentIds;
    }

    public final boolean getAreAllVisibleAssetsSelected() {
        return this.areAllVisibleAssetsSelected;
    }
}
