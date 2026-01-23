package com.robinhood.android.advisory.dashboard.portfolio.holdings;

import advisory.proto.p008v1.BreakdownUnit;
import com.robinhood.android.advisory.dashboard.LoggingUtils2;
import com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsViewState;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.advisory.p304db.ManagedAccountState;
import com.robinhood.models.advisory.p304db.portfolio.AssetClass3;
import com.robinhood.models.advisory.p304db.portfolio.ManagedPortfolioRegion;
import com.robinhood.models.advisory.p304db.portfolio.ManagedPortfolioSubAssetClassCategory;
import com.robinhood.models.advisory.p304db.portfolio.ManagedPortfolioSummary;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: PortfolioHoldingsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/PortfolioHoldingsStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/PortfolioHoldingsDataState;", "Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/PortfolioHoldingsViewState;", "<init>", "()V", "reduce", "dataState", "getHoldingRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/HoldingRowData;", "managedPortfolioSummary", "Lcom/robinhood/models/advisory/db/portfolio/ManagedPortfolioSummary;", "Companion", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class PortfolioHoldingsStateProvider implements StateProvider<PortfolioHoldingsDataState, PortfolioHoldingsViewState> {
    public static final int $stable = 0;
    private static final List<AssetClass3> ASSET_CLASS_REGIONS_WITHOUT_SECONDARY_TEXT = CollectionsKt.listOf((Object[]) new AssetClass3[]{AssetClass3.CASH, AssetClass3.UNSPECIFIED});

    @Override // com.robinhood.android.udf.StateProvider
    public PortfolioHoldingsViewState reduce(PortfolioHoldingsDataState dataState) {
        PortfolioHoldings3 portfolioHoldings3;
        PortfolioHoldingsViewState2 portfolioHoldingsViewState2;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getManagedPortfolio() != null && dataState.getBrokerageAccountType() != null) {
            boolean zIsInvested = dataState.getManagedPortfolio().isInvested();
            if (dataState.getManagedPortfolio().getDefaultBreakdownUnit() == BreakdownUnit.UNIT_DOLLAR) {
                portfolioHoldings3 = PortfolioHoldings3.DOLLAR;
            } else {
                portfolioHoldings3 = PortfolioHoldings3.PERCENT;
            }
            PortfolioHoldings3 portfolioHoldings32 = portfolioHoldings3;
            boolean z = dataState.getManagedPortfolio().getAccountState() != ManagedAccountState.UNFUNDED;
            BrokerageAccountType brokerageAccountType = dataState.getBrokerageAccountType();
            ImmutableList<HoldingRowData> holdingRows = getHoldingRows(dataState.getManagedPortfolio());
            String disclosure = dataState.getManagedPortfolio().getDisclosure();
            Context contextBuildManagedAccountLoggingContext = LoggingUtils2.buildManagedAccountLoggingContext(dataState.getManagedPortfolio().getAccountState(), dataState.getBrokerageAccountType());
            if (dataState.getInTaxLossHarvestingExperiment() && !dataState.getBrokerageAccountType().isRetirement()) {
                portfolioHoldingsViewState2 = PortfolioHoldingsViewState2.FULL_ACCOUNT_SECTION;
            } else {
                portfolioHoldingsViewState2 = PortfolioHoldingsViewState2.ADJUST_PORTFOLIO_CTA_ONLY;
            }
            return new PortfolioHoldingsViewState.Loaded(zIsInvested, portfolioHoldings32, holdingRows, z, brokerageAccountType, disclosure, contextBuildManagedAccountLoggingContext, portfolioHoldingsViewState2);
        }
        return PortfolioHoldingsViewState.Loading.INSTANCE;
    }

    private final ImmutableList<HoldingRowData> getHoldingRows(ManagedPortfolioSummary managedPortfolioSummary) {
        String strJoinToString$default;
        String lowercaseShortName;
        List<ManagedPortfolioRegion> regions = managedPortfolioSummary.getRegions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(regions, 10));
        for (ManagedPortfolioRegion managedPortfolioRegion : regions) {
            List listSortedWith = CollectionsKt.sortedWith(managedPortfolioRegion.getSubAssetClassCategories(), new Comparator() { // from class: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsStateProvider$getHoldingRows$lambda$5$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((ManagedPortfolioSubAssetClassCategory) t2).getAllocationPercentage(), ((ManagedPortfolioSubAssetClassCategory) t).getAllocationPercentage());
                }
            });
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            Iterator it = listSortedWith.iterator();
            BigDecimal bigDecimalAdd = bigDecimalValueOf;
            while (it.hasNext()) {
                bigDecimalAdd = bigDecimalAdd.add(((ManagedPortfolioSubAssetClassCategory) it.next()).getAllocationPercentage());
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            }
            String shortName = managedPortfolioRegion.getDetails().getShortName();
            Money money = null;
            if (ASSET_CLASS_REGIONS_WITHOUT_SECONDARY_TEXT.contains(managedPortfolioRegion.getRegion())) {
                strJoinToString$default = null;
            } else {
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
                int i = 0;
                for (Object obj : listSortedWith) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    ManagedPortfolioSubAssetClassCategory managedPortfolioSubAssetClassCategory = (ManagedPortfolioSubAssetClassCategory) obj;
                    if (i == 0) {
                        lowercaseShortName = managedPortfolioSubAssetClassCategory.getDetails().getShortName();
                    } else {
                        lowercaseShortName = managedPortfolioSubAssetClassCategory.getDetails().getLowercaseShortName();
                    }
                    arrayList2.add(lowercaseShortName);
                    i = i2;
                }
                strJoinToString$default = CollectionsKt.joinToString$default(arrayList2, null, null, null, 0, null, null, 63, null);
            }
            AssetClass3 region = managedPortfolioRegion.getRegion();
            Iterator it2 = listSortedWith.iterator();
            if (it2.hasNext()) {
                money = ((ManagedPortfolioSubAssetClassCategory) it2.next()).getTotalValue();
                while (it2.hasNext()) {
                    money = money.plus(((ManagedPortfolioSubAssetClassCategory) it2.next()).getTotalValue());
                }
            }
            if (money == null) {
                Currency currency = Currencies.USD;
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                money = new Money(currency, ZERO);
            }
            arrayList.add(new HoldingRowData(shortName, strJoinToString$default, region, money, bigDecimalAdd, Formats.getHundredthPercentFormat().format(bigDecimalAdd)));
        }
        return extensions2.toPersistentList(CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsStateProvider$getHoldingRows$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((HoldingRowData) t2).getPercentage(), ((HoldingRowData) t).getPercentage());
            }
        }));
    }
}
