package com.robinhood.android.advisory.portfolio.holdings;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState;
import com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState3;
import com.robinhood.models.advisory.p304db.portfolio.AssetClass3;
import com.robinhood.models.advisory.p304db.portfolio.AssetClass5;
import com.robinhood.utils.resource.StringResource;
import com.singular.sdk.internal.Constants;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: HoldingsDrillDownScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/holdings/ViewStateParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownViewState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.portfolio.holdings.ViewStateParameterProvider, reason: use source file name */
/* loaded from: classes7.dex */
final class HoldingsDrillDownScreen7 implements PreviewParameterProvider<HoldingsDrillDownViewState> {
    private final Sequence<HoldingsDrillDownViewState> values;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public HoldingsDrillDownScreen7() {
        AssetClass3 assetClass3 = AssetClass3.US_EQUITY;
        HoldingsDrillDownViewState.Loading loading = new HoldingsDrillDownViewState.Loading(assetClass3);
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke("US Stocks");
        StringResource stringResourceInvoke2 = companion.invoke("Your equity");
        HoldingsDrillDownViewState3.AssetRegionTabData assetRegionTabData = new HoldingsDrillDownViewState3.AssetRegionTabData(assetClass3, companion.invoke("All"), companion.invoke("All assets in this category"), new BigDecimal(Constants.SdidMigrationStatusCodes.ALREADY_SDID));
        AssetClass5 assetClass5 = AssetClass5.US_GROWTH_STOCKS;
        HoldingsDrillDownViewState3.SubAssetCategoryTabData subAssetCategoryTabData = new HoldingsDrillDownViewState3.SubAssetCategoryTabData(assetClass5, companion.invoke("Growth"), companion.invoke("High growth potential"), new BigDecimal("0.75"));
        AssetClass5 assetClass52 = AssetClass5.US_BROAD_US_LC_STOCKS;
        ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(assetRegionTabData, subAssetCategoryTabData, new HoldingsDrillDownViewState3.SubAssetCategoryTabData(assetClass52, companion.invoke("Large Cap"), companion.invoke("Large cap stocks"), new BigDecimal("0.25")));
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        AllocationRowData allocationRowData = new AllocationRowData(uuidRandomUUID, "MRK", "Merck & Co.", new BigDecimal("0.4"), "40%", "$4000", assetClass5, false, 128, null);
        UUID uuidRandomUUID2 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID2, "randomUUID(...)");
        AllocationRowData allocationRowData2 = new AllocationRowData(uuidRandomUUID2, "AMZN", "Amazon Inc.", new BigDecimal("0.2"), "20%", "$2000", assetClass5, false, 128, null);
        UUID uuidRandomUUID3 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID3, "randomUUID(...)");
        this.values = SequencesKt.sequenceOf(loading, new HoldingsDrillDownViewState.Loaded(assetClass3, stringResourceInvoke, stringResourceInvoke2, "", extensions2.persistentListOf(allocationRowData, allocationRowData2, new AllocationRowData(uuidRandomUUID3, "AAPL", "Apple Inc.", new BigDecimal("0.4"), "40%", "$4000", assetClass52, false, 128, null)), immutableList3PersistentListOf, true, true, null));
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<HoldingsDrillDownViewState> getValues() {
        return this.values;
    }
}
