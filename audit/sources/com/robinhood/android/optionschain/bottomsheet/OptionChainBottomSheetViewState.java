package com.robinhood.android.optionschain.bottomsheet;

import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.optionschain.SelectedLegItem;
import com.robinhood.models.api.ApiOptionsProfitLossChartRequestParams;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionChainBottomSheetViewState.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u00ad\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\u0013\u0010@\u001a\u00020\u00032\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020CHÖ\u0001J\t\u0010D\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b0\u0010.¨\u0006E"}, m3636d2 = {"Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetViewState;", "", "addedToWatchlist", "", "hasExpandedBottomSheet", "legItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/optionschain/SelectedLegItem;", "simulatedReturnSectionState", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetSimulatedChartSectionState;", "showEditRatio", "showTooManyLegsError", "showWatchlistButton", "singleLegBundle", "Lcom/robinhood/models/ui/OptionLegBundle;", "strategyCode", "", "optionOrderIntentKey", "Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;", "profitLossChartParams", "Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams;", "strategySubtitle", "Lcom/robinhood/utils/resource/StringResource;", "strategyTitle", "noQuoteFallbackContent", "<init>", "(ZZLkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetSimulatedChartSectionState;ZZZLcom/robinhood/models/ui/OptionLegBundle;Ljava/lang/String;Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getAddedToWatchlist", "()Z", "getHasExpandedBottomSheet", "getLegItems", "()Lkotlinx/collections/immutable/ImmutableList;", "getSimulatedReturnSectionState", "()Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetSimulatedChartSectionState;", "getShowEditRatio", "getShowTooManyLegsError", "getShowWatchlistButton", "getSingleLegBundle", "()Lcom/robinhood/models/ui/OptionLegBundle;", "getStrategyCode", "()Ljava/lang/String;", "getOptionOrderIntentKey", "()Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;", "getProfitLossChartParams", "()Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams;", "getStrategySubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "getStrategyTitle", "getNoQuoteFallbackContent", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "", "toString", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionChainBottomSheetViewState {
    public static final int $stable = 8;
    private final boolean addedToWatchlist;
    private final boolean hasExpandedBottomSheet;
    private final ImmutableList<SelectedLegItem> legItems;
    private final StringResource noQuoteFallbackContent;
    private final OptionOrderIntentKey.FromOptionOrderBundle optionOrderIntentKey;
    private final ApiOptionsProfitLossChartRequestParams profitLossChartParams;
    private final boolean showEditRatio;
    private final boolean showTooManyLegsError;
    private final boolean showWatchlistButton;
    private final OptionChainBottomSheetSimulatedReturnSection4 simulatedReturnSectionState;
    private final OptionLegBundle singleLegBundle;
    private final String strategyCode;
    private final StringResource strategySubtitle;
    private final StringResource strategyTitle;

    /* renamed from: component1, reason: from getter */
    public final boolean getAddedToWatchlist() {
        return this.addedToWatchlist;
    }

    /* renamed from: component10, reason: from getter */
    public final OptionOrderIntentKey.FromOptionOrderBundle getOptionOrderIntentKey() {
        return this.optionOrderIntentKey;
    }

    /* renamed from: component11, reason: from getter */
    public final ApiOptionsProfitLossChartRequestParams getProfitLossChartParams() {
        return this.profitLossChartParams;
    }

    /* renamed from: component12, reason: from getter */
    public final StringResource getStrategySubtitle() {
        return this.strategySubtitle;
    }

    /* renamed from: component13, reason: from getter */
    public final StringResource getStrategyTitle() {
        return this.strategyTitle;
    }

    /* renamed from: component14, reason: from getter */
    public final StringResource getNoQuoteFallbackContent() {
        return this.noQuoteFallbackContent;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasExpandedBottomSheet() {
        return this.hasExpandedBottomSheet;
    }

    public final ImmutableList<SelectedLegItem> component3() {
        return this.legItems;
    }

    /* renamed from: component4, reason: from getter */
    public final OptionChainBottomSheetSimulatedReturnSection4 getSimulatedReturnSectionState() {
        return this.simulatedReturnSectionState;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowEditRatio() {
        return this.showEditRatio;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowTooManyLegsError() {
        return this.showTooManyLegsError;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowWatchlistButton() {
        return this.showWatchlistButton;
    }

    /* renamed from: component8, reason: from getter */
    public final OptionLegBundle getSingleLegBundle() {
        return this.singleLegBundle;
    }

    /* renamed from: component9, reason: from getter */
    public final String getStrategyCode() {
        return this.strategyCode;
    }

    public final OptionChainBottomSheetViewState copy(boolean addedToWatchlist, boolean hasExpandedBottomSheet, ImmutableList<SelectedLegItem> legItems, OptionChainBottomSheetSimulatedReturnSection4 simulatedReturnSectionState, boolean showEditRatio, boolean showTooManyLegsError, boolean showWatchlistButton, OptionLegBundle singleLegBundle, String strategyCode, OptionOrderIntentKey.FromOptionOrderBundle optionOrderIntentKey, ApiOptionsProfitLossChartRequestParams profitLossChartParams, StringResource strategySubtitle, StringResource strategyTitle, StringResource noQuoteFallbackContent) {
        return new OptionChainBottomSheetViewState(addedToWatchlist, hasExpandedBottomSheet, legItems, simulatedReturnSectionState, showEditRatio, showTooManyLegsError, showWatchlistButton, singleLegBundle, strategyCode, optionOrderIntentKey, profitLossChartParams, strategySubtitle, strategyTitle, noQuoteFallbackContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionChainBottomSheetViewState)) {
            return false;
        }
        OptionChainBottomSheetViewState optionChainBottomSheetViewState = (OptionChainBottomSheetViewState) other;
        return this.addedToWatchlist == optionChainBottomSheetViewState.addedToWatchlist && this.hasExpandedBottomSheet == optionChainBottomSheetViewState.hasExpandedBottomSheet && Intrinsics.areEqual(this.legItems, optionChainBottomSheetViewState.legItems) && Intrinsics.areEqual(this.simulatedReturnSectionState, optionChainBottomSheetViewState.simulatedReturnSectionState) && this.showEditRatio == optionChainBottomSheetViewState.showEditRatio && this.showTooManyLegsError == optionChainBottomSheetViewState.showTooManyLegsError && this.showWatchlistButton == optionChainBottomSheetViewState.showWatchlistButton && Intrinsics.areEqual(this.singleLegBundle, optionChainBottomSheetViewState.singleLegBundle) && Intrinsics.areEqual(this.strategyCode, optionChainBottomSheetViewState.strategyCode) && Intrinsics.areEqual(this.optionOrderIntentKey, optionChainBottomSheetViewState.optionOrderIntentKey) && Intrinsics.areEqual(this.profitLossChartParams, optionChainBottomSheetViewState.profitLossChartParams) && Intrinsics.areEqual(this.strategySubtitle, optionChainBottomSheetViewState.strategySubtitle) && Intrinsics.areEqual(this.strategyTitle, optionChainBottomSheetViewState.strategyTitle) && Intrinsics.areEqual(this.noQuoteFallbackContent, optionChainBottomSheetViewState.noQuoteFallbackContent);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.addedToWatchlist) * 31) + Boolean.hashCode(this.hasExpandedBottomSheet)) * 31;
        ImmutableList<SelectedLegItem> immutableList = this.legItems;
        int iHashCode2 = (iHashCode + (immutableList == null ? 0 : immutableList.hashCode())) * 31;
        OptionChainBottomSheetSimulatedReturnSection4 optionChainBottomSheetSimulatedReturnSection4 = this.simulatedReturnSectionState;
        int iHashCode3 = (((((((iHashCode2 + (optionChainBottomSheetSimulatedReturnSection4 == null ? 0 : optionChainBottomSheetSimulatedReturnSection4.hashCode())) * 31) + Boolean.hashCode(this.showEditRatio)) * 31) + Boolean.hashCode(this.showTooManyLegsError)) * 31) + Boolean.hashCode(this.showWatchlistButton)) * 31;
        OptionLegBundle optionLegBundle = this.singleLegBundle;
        int iHashCode4 = (iHashCode3 + (optionLegBundle == null ? 0 : optionLegBundle.hashCode())) * 31;
        String str = this.strategyCode;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle = this.optionOrderIntentKey;
        int iHashCode6 = (iHashCode5 + (fromOptionOrderBundle == null ? 0 : fromOptionOrderBundle.hashCode())) * 31;
        ApiOptionsProfitLossChartRequestParams apiOptionsProfitLossChartRequestParams = this.profitLossChartParams;
        int iHashCode7 = (iHashCode6 + (apiOptionsProfitLossChartRequestParams == null ? 0 : apiOptionsProfitLossChartRequestParams.hashCode())) * 31;
        StringResource stringResource = this.strategySubtitle;
        int iHashCode8 = (iHashCode7 + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        StringResource stringResource2 = this.strategyTitle;
        int iHashCode9 = (iHashCode8 + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31;
        StringResource stringResource3 = this.noQuoteFallbackContent;
        return iHashCode9 + (stringResource3 != null ? stringResource3.hashCode() : 0);
    }

    public String toString() {
        return "OptionChainBottomSheetViewState(addedToWatchlist=" + this.addedToWatchlist + ", hasExpandedBottomSheet=" + this.hasExpandedBottomSheet + ", legItems=" + this.legItems + ", simulatedReturnSectionState=" + this.simulatedReturnSectionState + ", showEditRatio=" + this.showEditRatio + ", showTooManyLegsError=" + this.showTooManyLegsError + ", showWatchlistButton=" + this.showWatchlistButton + ", singleLegBundle=" + this.singleLegBundle + ", strategyCode=" + this.strategyCode + ", optionOrderIntentKey=" + this.optionOrderIntentKey + ", profitLossChartParams=" + this.profitLossChartParams + ", strategySubtitle=" + this.strategySubtitle + ", strategyTitle=" + this.strategyTitle + ", noQuoteFallbackContent=" + this.noQuoteFallbackContent + ")";
    }

    public OptionChainBottomSheetViewState(boolean z, boolean z2, ImmutableList<SelectedLegItem> immutableList, OptionChainBottomSheetSimulatedReturnSection4 optionChainBottomSheetSimulatedReturnSection4, boolean z3, boolean z4, boolean z5, OptionLegBundle optionLegBundle, String str, OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle, ApiOptionsProfitLossChartRequestParams apiOptionsProfitLossChartRequestParams, StringResource stringResource, StringResource stringResource2, StringResource stringResource3) {
        this.addedToWatchlist = z;
        this.hasExpandedBottomSheet = z2;
        this.legItems = immutableList;
        this.simulatedReturnSectionState = optionChainBottomSheetSimulatedReturnSection4;
        this.showEditRatio = z3;
        this.showTooManyLegsError = z4;
        this.showWatchlistButton = z5;
        this.singleLegBundle = optionLegBundle;
        this.strategyCode = str;
        this.optionOrderIntentKey = fromOptionOrderBundle;
        this.profitLossChartParams = apiOptionsProfitLossChartRequestParams;
        this.strategySubtitle = stringResource;
        this.strategyTitle = stringResource2;
        this.noQuoteFallbackContent = stringResource3;
    }

    public /* synthetic */ OptionChainBottomSheetViewState(boolean z, boolean z2, ImmutableList immutableList, OptionChainBottomSheetSimulatedReturnSection4 optionChainBottomSheetSimulatedReturnSection4, boolean z3, boolean z4, boolean z5, OptionLegBundle optionLegBundle, String str, OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle, ApiOptionsProfitLossChartRequestParams apiOptionsProfitLossChartRequestParams, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, immutableList, optionChainBottomSheetSimulatedReturnSection4, z3, z4, z5, optionLegBundle, str, (i & 512) != 0 ? null : fromOptionOrderBundle, apiOptionsProfitLossChartRequestParams, stringResource, stringResource2, stringResource3);
    }

    public final boolean getAddedToWatchlist() {
        return this.addedToWatchlist;
    }

    public final boolean getHasExpandedBottomSheet() {
        return this.hasExpandedBottomSheet;
    }

    public final ImmutableList<SelectedLegItem> getLegItems() {
        return this.legItems;
    }

    public final OptionChainBottomSheetSimulatedReturnSection4 getSimulatedReturnSectionState() {
        return this.simulatedReturnSectionState;
    }

    public final boolean getShowEditRatio() {
        return this.showEditRatio;
    }

    public final boolean getShowTooManyLegsError() {
        return this.showTooManyLegsError;
    }

    public final boolean getShowWatchlistButton() {
        return this.showWatchlistButton;
    }

    public final OptionLegBundle getSingleLegBundle() {
        return this.singleLegBundle;
    }

    public final String getStrategyCode() {
        return this.strategyCode;
    }

    public final OptionOrderIntentKey.FromOptionOrderBundle getOptionOrderIntentKey() {
        return this.optionOrderIntentKey;
    }

    public final ApiOptionsProfitLossChartRequestParams getProfitLossChartParams() {
        return this.profitLossChartParams;
    }

    public final StringResource getStrategySubtitle() {
        return this.strategySubtitle;
    }

    public final StringResource getStrategyTitle() {
        return this.strategyTitle;
    }

    public final StringResource getNoQuoteFallbackContent() {
        return this.noQuoteFallbackContent;
    }
}
