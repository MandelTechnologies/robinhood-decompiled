package com.robinhood.android.advisory.portfolio.restrictstocks;

import com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksViewState;
import com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksViewState3;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.advisory.p304db.portfolio.ManagedPortfolioAsset;
import com.robinhood.models.advisory.p304db.portfolio.RestrictedAsset;
import com.robinhood.models.advisory.p304db.portfolio.RestrictedStocksResponse;
import com.robinhood.utils.extensions.Uuids;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RestrictStocksStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksDataState;", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksViewState;", "<init>", "()V", "reduce", "dataState", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RestrictStocksStateProvider implements StateProvider<RestrictStocksDataState, RestrictStocksViewState> {
    public static final int $stable = 0;

    /* JADX WARN: Removed duplicated region for block: B:53:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ff  */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RestrictStocksViewState reduce(RestrictStocksDataState dataState) {
        RestrictStocksViewState3.SearchResultStatus searchResultStatus;
        List<ManagedPortfolioAsset> managedPortfolioAssets;
        Iterator<T> it;
        String str;
        Object next;
        BigDecimal allocationPercentage;
        String str2;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        RestrictedStocksResponse restrictedStocksResponse = dataState.getRestrictedStocksResponse();
        List<RestrictedAsset> searchRestrictableAssets = dataState.getSearchRestrictableAssets();
        List<ManagedPortfolioAsset> managedPortfolioAssets2 = dataState.getManagedPortfolioAssets();
        if (restrictedStocksResponse == null) {
            return RestrictStocksViewState.Loading.INSTANCE;
        }
        List<RestrictedAsset> restrictedAssets = restrictedStocksResponse.getRestrictedAssets();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(restrictedAssets, 10));
        for (RestrictedAsset restrictedAsset : restrictedAssets) {
            arrayList.add(new RestrictStocksViewState3.RestrictedStockRowData(Intrinsics.areEqual(restrictedAsset.getId(), dataState.isUpdatingAssetId()), restrictedAsset.getId(), restrictedAsset.getName(), restrictedAsset.getSymbol()));
        }
        ArrayList<ManagedPortfolioAsset> arrayList2 = new ArrayList();
        Iterator<T> it2 = managedPortfolioAssets2.iterator();
        while (true) {
            boolean z = true;
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            ManagedPortfolioAsset managedPortfolioAsset = (ManagedPortfolioAsset) next2;
            List<RestrictedAsset> restrictedAssets2 = restrictedStocksResponse.getRestrictedAssets();
            if ((restrictedAssets2 instanceof Collection) && restrictedAssets2.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it3 = restrictedAssets2.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.areEqual(Uuids.safeToString(managedPortfolioAsset.getId()), ((RestrictedAsset) it3.next()).getId())) {
                        break;
                    }
                }
                z = false;
            }
            if (!z) {
                arrayList2.add(next2);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (ManagedPortfolioAsset managedPortfolioAsset2 : arrayList2) {
            arrayList3.add(new RestrictStocksViewState3.ManagedPortfolioRowData(Intrinsics.areEqual(Uuids.safeToString(managedPortfolioAsset2.getId()), dataState.isUpdatingAssetId()), Uuids.safeToString(managedPortfolioAsset2.getId()), managedPortfolioAsset2.getName(), managedPortfolioAsset2.getSymbol(), Formats.getHundredthPercentFormat().format(managedPortfolioAsset2.getAllocationPercentage())));
        }
        RestrictStocksDisclosure restrictStocksDisclosure = new RestrictStocksDisclosure(restrictedStocksResponse.getDisclosureTitle(), restrictedStocksResponse.getDisclosureSubtitle(), restrictedStocksResponse.getDisclosureCtaText());
        int maxRestrictedAssetsAllowed = restrictedStocksResponse.getMaxRestrictedAssetsAllowed();
        boolean z2 = restrictedStocksResponse.getRestrictedAssets().size() < restrictedStocksResponse.getMaxRestrictedAssetsAllowed();
        List<RestrictedAsset> list = searchRestrictableAssets;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (RestrictedAsset restrictedAsset2 : list) {
            if (restrictedAsset2.isControlAsset()) {
                searchResultStatus = RestrictStocksViewState3.SearchResultStatus.CONTROL_ASSET;
            } else {
                List<RestrictedAsset> restrictedAssets3 = restrictedStocksResponse.getRestrictedAssets();
                if ((restrictedAssets3 instanceof Collection) && restrictedAssets3.isEmpty()) {
                    managedPortfolioAssets = dataState.getManagedPortfolioAssets();
                    if (managedPortfolioAssets instanceof Collection) {
                        it = managedPortfolioAssets.iterator();
                        while (it.hasNext()) {
                        }
                        searchResultStatus = RestrictStocksViewState3.SearchResultStatus.NOT_IN_MANAGED_PORTFOLIO;
                    }
                } else {
                    Iterator<T> it4 = restrictedAssets3.iterator();
                    while (it4.hasNext()) {
                        if (Intrinsics.areEqual(((RestrictedAsset) it4.next()).getId(), restrictedAsset2.getId())) {
                            searchResultStatus = RestrictStocksViewState3.SearchResultStatus.ALREADY_RESTRICTED;
                            break;
                        }
                    }
                    managedPortfolioAssets = dataState.getManagedPortfolioAssets();
                    if ((managedPortfolioAssets instanceof Collection) || !managedPortfolioAssets.isEmpty()) {
                        it = managedPortfolioAssets.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.areEqual(Uuids.safeToString(((ManagedPortfolioAsset) it.next()).getId()), restrictedAsset2.getId())) {
                                searchResultStatus = RestrictStocksViewState3.SearchResultStatus.IN_MANAGED_PORTFOLIO;
                                break;
                            }
                        }
                        searchResultStatus = RestrictStocksViewState3.SearchResultStatus.NOT_IN_MANAGED_PORTFOLIO;
                    } else {
                        searchResultStatus = RestrictStocksViewState3.SearchResultStatus.NOT_IN_MANAGED_PORTFOLIO;
                    }
                }
            }
            if (searchResultStatus == RestrictStocksViewState3.SearchResultStatus.IN_MANAGED_PORTFOLIO) {
                Iterator<T> it5 = dataState.getManagedPortfolioAssets().iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it5.next();
                    if (Intrinsics.areEqual(Uuids.safeToString(((ManagedPortfolioAsset) next).getId()), restrictedAsset2.getId())) {
                        break;
                    }
                }
                ManagedPortfolioAsset managedPortfolioAsset3 = (ManagedPortfolioAsset) next;
                str = (managedPortfolioAsset3 == null || (allocationPercentage = managedPortfolioAsset3.getAllocationPercentage()) == null || (str2 = Formats.getHundredthPercentFormat().format(allocationPercentage)) == null) ? "" : str2;
            }
            arrayList4.add(new RestrictStocksViewState3.SearchResultRowData(Intrinsics.areEqual(restrictedAsset2.getId(), dataState.isUpdatingAssetId()), restrictedAsset2.getId(), restrictedAsset2.getName(), restrictedAsset2.getSymbol(), searchResultStatus, str));
        }
        return new RestrictStocksViewState.Loaded(arrayList, arrayList3, arrayList4, restrictStocksDisclosure, maxRestrictedAssetsAllowed, z2, dataState.getCurrentSearchQuery());
    }
}
