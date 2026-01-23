package com.robinhood.android.advisory.portfolio.holdings;

import com.robinhood.android.advisory.portfolio.C9151R;
import com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState;
import com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState3;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.advisory.p304db.portfolio.AssetClass3;
import com.robinhood.models.advisory.p304db.portfolio.AssetClass5;
import com.robinhood.models.advisory.p304db.portfolio.ManagedPortfolioAsset;
import com.robinhood.models.advisory.p304db.portfolio.ManagedPortfolioRegion;
import com.robinhood.models.advisory.p304db.portfolio.ManagedPortfolioSubAssetClassCategory;
import com.robinhood.models.advisory.p304db.portfolio.ManagedPortfolioSummary;
import com.robinhood.models.util.Money;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: HoldingsDrillDownStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownDataState;", "Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownViewState;", "<init>", "()V", "reduce", "dataState", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class HoldingsDrillDownStateProvider implements StateProvider<HoldingsDrillDownDataState, HoldingsDrillDownViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public HoldingsDrillDownViewState reduce(HoldingsDrillDownDataState dataState) {
        Object next;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        HoldingsDrillDownViewState.Loading loading = new HoldingsDrillDownViewState.Loading(dataState.getRegion());
        ManagedPortfolioSummary managedPortfolioSummary = dataState.getManagedPortfolioSummary();
        if (managedPortfolioSummary == null) {
            return loading;
        }
        Iterator<T> it = managedPortfolioSummary.getRegions().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ManagedPortfolioRegion) next).getRegion() == dataState.getRegion()) {
                break;
            }
        }
        ManagedPortfolioRegion managedPortfolioRegion = (ManagedPortfolioRegion) next;
        if (managedPortfolioRegion == null) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Region " + dataState.getRegion() + " not present in managed portfolio response"), true, null, 4, null);
            return loading;
        }
        AssetClass3 region = managedPortfolioRegion.getRegion();
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(C9151R.string.portfolio_sub_asset_category_all, new Object[0]);
        StringResource stringResourceInvoke2 = companion.invoke(managedPortfolioRegion.getDetails().getDescription());
        List<ManagedPortfolioSubAssetClassCategory> subAssetClassCategories = managedPortfolioRegion.getSubAssetClassCategories();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        Iterator<T> it2 = subAssetClassCategories.iterator();
        while (it2.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(((ManagedPortfolioSubAssetClassCategory) it2.next()).getAllocationPercentage());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        HoldingsDrillDownViewState3.AssetRegionTabData assetRegionTabData = new HoldingsDrillDownViewState3.AssetRegionTabData(region, stringResourceInvoke, stringResourceInvoke2, bigDecimalValueOf);
        List<ManagedPortfolioSubAssetClassCategory> subAssetClassCategories2 = managedPortfolioRegion.getSubAssetClassCategories();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(subAssetClassCategories2, 10));
        for (ManagedPortfolioSubAssetClassCategory managedPortfolioSubAssetClassCategory : subAssetClassCategories2) {
            AssetClass5 subAssetClassCategory = managedPortfolioSubAssetClassCategory.getSubAssetClassCategory();
            StringResource.Companion companion2 = StringResource.INSTANCE;
            arrayList.add(new HoldingsDrillDownViewState3.SubAssetCategoryTabData(subAssetClassCategory, companion2.invoke(managedPortfolioSubAssetClassCategory.getDetails().getShortName()), companion2.invoke(managedPortfolioSubAssetClassCategory.getDetails().getDescription()), managedPortfolioSubAssetClassCategory.getAllocationPercentage()));
        }
        List listSortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownStateProvider$reduce$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((HoldingsDrillDownViewState3.SubAssetCategoryTabData) t2).getPercentage(), ((HoldingsDrillDownViewState3.SubAssetCategoryTabData) t).getPercentage());
            }
        });
        ImmutableList3 immutableList3PersistentListOf = listSortedWith.size() <= 1 ? extensions2.persistentListOf(assetRegionTabData) : extensions2.toPersistentList(CollectionsKt.plus((Collection) CollectionsKt.listOf(assetRegionTabData), (Iterable) listSortedWith));
        AssetClass3 region2 = dataState.getRegion();
        StringResource.Companion companion3 = StringResource.INSTANCE;
        StringResource stringResourceInvoke3 = companion3.invoke(managedPortfolioRegion.getDetails().getShortName());
        StringResource stringResourceInvoke4 = companion3.invoke(dataState.getRegion() == AssetClass3.CASH ? C9151R.string.portfolio_holdings_tab_cash : C9151R.string.portfolio_holdings_tab_equity, new Object[0]);
        String accountNumber = dataState.getAccountNumber();
        boolean zIsInvested = managedPortfolioSummary.isInvested();
        List<ManagedPortfolioSubAssetClassCategory> subAssetClassCategories3 = managedPortfolioRegion.getSubAssetClassCategories();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(subAssetClassCategories3, 10));
        for (ManagedPortfolioSubAssetClassCategory managedPortfolioSubAssetClassCategory2 : subAssetClassCategories3) {
            List<ManagedPortfolioAsset> assets = managedPortfolioSubAssetClassCategory2.getAssets();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(assets, 10));
            for (ManagedPortfolioAsset managedPortfolioAsset : assets) {
                arrayList3.add(new AllocationRowData(managedPortfolioAsset.getId(), managedPortfolioAsset.getSymbol(), managedPortfolioAsset.getName(), managedPortfolioAsset.getAllocationPercentage(), Formats.getHundredthPercentFormat().format(managedPortfolioAsset.getAllocationPercentage()), Money.format$default(managedPortfolioAsset.getEquity(), null, false, null, false, 0, null, false, null, false, false, 1023, null), managedPortfolioSubAssetClassCategory2.getSubAssetClassCategory(), managedPortfolioSubAssetClassCategory2.getSubAssetClassCategory() != AssetClass5.CASH));
            }
            arrayList2.add(arrayList3);
        }
        return new HoldingsDrillDownViewState.Loaded(region2, stringResourceInvoke3, stringResourceInvoke4, accountNumber, extensions2.toPersistentList(CollectionsKt.sortedWith(CollectionsKt.flatten(arrayList2), new Comparator() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownStateProvider$reduce$$inlined$sortedByDescending$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((AllocationRowData) t2).getPercentage(), ((AllocationRowData) t).getPercentage());
            }
        })), immutableList3PersistentListOf, zIsInvested, immutableList3PersistentListOf.size() > 1, (dataState.getRegion() != AssetClass3.CASH || dataState.getInterestEarningDisclosure() == null || dataState.getSweepEnrollmentData() == null) ? null : new DisclosureBottomSheet(dataState.getInterestEarningDisclosure(), dataState.getSweepEnrollmentData()));
    }
}
