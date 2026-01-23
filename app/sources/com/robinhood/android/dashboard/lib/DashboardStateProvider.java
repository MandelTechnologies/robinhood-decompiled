package com.robinhood.android.dashboard.lib;

import com.robinhood.android.dashboard.lib.DashboardViewState;
import com.robinhood.android.dashboard.store.DashboardComponentsBuilder;
import com.robinhood.android.dashboard.store.HomeDashboardUtils;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.librobinhood.data.store.AccountFeature;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.FeatureDiscoveryLocation;
import com.robinhood.models.home.HomeState;
import com.robinhood.models.home.api.HomeStateOrdering;
import com.robinhood.models.home.component.DashboardComponent;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: DashboardStateProvider.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J:\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0002H\u0016R\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/DashboardStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/dashboard/lib/DashboardDataState;", "Lcom/robinhood/android/dashboard/lib/DashboardViewState;", "<init>", "()V", "positionInstrumentType", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "Lcom/robinhood/models/home/api/HomeStateOrdering;", "getPositionInstrumentType", "(Lcom/robinhood/models/home/api/HomeStateOrdering;)Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "buildAccountDashboardComponents", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/home/component/DashboardComponent;", "dashboardType", "Lcom/robinhood/android/home/contracts/HomeDashboardType$Account;", "account", "Lcom/robinhood/models/db/Account;", "accessibleFeatures", "", "Lcom/robinhood/librobinhood/data/store/AccountFeature;", "sections", "", "reduce", "dataState", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DashboardStateProvider implements StateProvider<DashboardDataState, DashboardViewState> {
    public static final int $stable = 0;
    public static final DashboardStateProvider INSTANCE = new DashboardStateProvider();

    /* compiled from: DashboardStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[HomeStateOrdering.values().length];
            try {
                iArr[HomeStateOrdering.HOLDINGS_EQUITIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeStateOrdering.HOLDINGS_EVENT_CONTRACTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeStateOrdering.HOLDINGS_EVENT_CONTRACTS_PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HomeStateOrdering.HOLDINGS_FUTURES_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HomeStateOrdering.HOLDINGS_FUTURES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HomeStateOrdering.HOLDINGS_OPTIONS_PENDING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HomeStateOrdering.HOLDINGS_OPTIONS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HomeStateOrdering.HOLDINGS_CRYPTO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HomeStateOrdering.TOP_LEVEL_BANNER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[HomeStateOrdering.BELOW_CHART_BANNER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[HomeStateOrdering.FIRST_TRADE_UPSELL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[HomeStateOrdering.CHART.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[HomeStateOrdering.BUYING_POWER.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[HomeStateOrdering.NOTIFICATION_CARDS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[HomeStateOrdering.CASH_SWEEP.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[HomeStateOrdering.CONTRIBUTIONS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[HomeStateOrdering.RECURRING_INVESTMENTS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[HomeStateOrdering.PROFIT_AND_LOSS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[HomeStateOrdering.FEATURE_DISCOVER_BELOW_CARDS.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[HomeStateOrdering.LISTS.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[HomeStateOrdering.DISCLOSURE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[HomeStateOrdering.MANAGED_ACCOUNT_OVERVIEW.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[HomeStateOrdering.DEPOSITS_SUMMARY.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[HomeStateOrdering.HOLDINGS_BREAKDOWN.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[HomeStateOrdering.MANAGED_ACCOUNT_INSIGHTS.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[HomeStateOrdering.INVESTING_HIGHLIGHTS.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[HomeStateOrdering.MULTI_CURRENCY_BALANCES.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[HomeStateOrdering.ACCOUNT_EMBEDDED_SECTION.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[HomeStateOrdering.ACCOUNT_SETTINGS.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[HomeStateOrdering.FEATURE_DISCOVER_ABOVE_CARDS.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[HomeStateOrdering.DEFAULT_EVENT_CONTRACTS.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[HomeStateOrdering.UNKNOWN.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BrokerageAccountType.values().length];
            try {
                iArr2[BrokerageAccountType.IRA_ROTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 3;
            } catch (NoSuchFieldError unused35) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Direction.values().length];
            try {
                iArr3[Direction.f5855UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr3[Direction.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused37) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    private DashboardStateProvider() {
    }

    private final PositionInstrumentType getPositionInstrumentType(HomeStateOrdering homeStateOrdering) {
        switch (WhenMappings.$EnumSwitchMapping$0[homeStateOrdering.ordinal()]) {
            case 1:
                return PositionInstrumentType.EQUITY_LEGACY;
            case 2:
                return PositionInstrumentType.EVENT_CONTRACT;
            case 3:
                return PositionInstrumentType.EVENT_CONTRACT_PENDING;
            case 4:
                return PositionInstrumentType.FUTURES_PENDING;
            case 5:
                return PositionInstrumentType.FUTURES;
            case 6:
                return PositionInstrumentType.OPTIONS_PENDING;
            case 7:
                return PositionInstrumentType.OPTIONS;
            case 8:
                return PositionInstrumentType.CRYPTO;
            default:
                throw new IllegalStateException(("No PositionInstrumentType found for: " + homeStateOrdering).toString());
        }
    }

    private final ImmutableList<DashboardComponent> buildAccountDashboardComponents(HomeDashboardType.Account dashboardType, Account account, Set<? extends AccountFeature> accessibleFeatures, List<? extends HomeStateOrdering> sections) {
        Object positions;
        DashboardComponentsBuilder.BannerLocation bannerLocation;
        FeatureDiscoveryLocation featureDiscoveryLocation;
        String accountNumber = dashboardType.getAccountNumber();
        BrokerageAccountType brokerageAccountType = account.getBrokerageAccountType();
        List<HomeStateOrdering> listFilterSupportedSections = DashboardComponentsBuilder.INSTANCE.filterSupportedSections(sections, accessibleFeatures);
        ArrayList arrayList = new ArrayList();
        for (HomeStateOrdering homeStateOrdering : listFilterSupportedSections) {
            switch (WhenMappings.$EnumSwitchMapping$0[homeStateOrdering.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    positions = new DashboardComponent.Positions(accountNumber, INSTANCE.getPositionInstrumentType(homeStateOrdering), HomeDashboardUtils.getPositionsLocation(brokerageAccountType));
                    break;
                case 9:
                case 10:
                    DashboardComponentsBuilder dashboardComponentsBuilder = DashboardComponentsBuilder.INSTANCE;
                    if (homeStateOrdering == HomeStateOrdering.TOP_LEVEL_BANNER) {
                        bannerLocation = DashboardComponentsBuilder.BannerLocation.TOP;
                    } else {
                        bannerLocation = DashboardComponentsBuilder.BannerLocation.BELOW_CHART;
                    }
                    positions = dashboardComponentsBuilder.getInfoBanner(accountNumber, brokerageAccountType, bannerLocation);
                    break;
                case 11:
                    positions = new DashboardComponent.FirstTradeUpsellSection(accountNumber);
                    break;
                case 12:
                    positions = new DashboardComponent.Chart(dashboardType);
                    break;
                case 13:
                    positions = new DashboardComponent.BuyingPower(accountNumber);
                    break;
                case 14:
                    positions = DashboardComponent.CardStack.INSTANCE;
                    break;
                case 15:
                    positions = new DashboardComponent.SweepSection(accountNumber);
                    break;
                case 16:
                    positions = new DashboardComponent.Contributions(accountNumber);
                    break;
                case 17:
                    positions = new DashboardComponent.RecurringInvestments(accountNumber);
                    break;
                case 18:
                    positions = new DashboardComponent.RealizedProfitAndLoss(accountNumber);
                    break;
                case 19:
                    int i = WhenMappings.$EnumSwitchMapping$1[brokerageAccountType.ordinal()];
                    if (i == 1 || i == 2) {
                        featureDiscoveryLocation = FeatureDiscoveryLocation.RETIREMENT_DASHBOARD;
                    } else if (i == 3) {
                        featureDiscoveryLocation = FeatureDiscoveryLocation.ISA_DASHBOARD;
                    } else {
                        featureDiscoveryLocation = FeatureDiscoveryLocation.INVESTING_BELOW_CARD;
                    }
                    positions = new DashboardComponent.FeatureDiscovery(accountNumber, featureDiscoveryLocation);
                    break;
                case 20:
                    positions = new DashboardComponent.CuratedList(accountNumber);
                    break;
                case 21:
                    positions = new DashboardComponent.Disclosure(accountNumber);
                    break;
                case 22:
                    positions = new DashboardComponent.ManagedAccountOverview(accountNumber);
                    break;
                case 23:
                    positions = new DashboardComponent.Deposits(accountNumber);
                    break;
                case 24:
                    positions = new DashboardComponent.ManagedHoldings(accountNumber);
                    break;
                case 25:
                    positions = new DashboardComponent.ManagedAccountInsights(accountNumber);
                    break;
                case 26:
                    positions = new DashboardComponent.InvestingHighlights(accountNumber);
                    break;
                case 27:
                    positions = new DashboardComponent.MultiCurrencyBalances(accountNumber);
                    break;
                case 28:
                    positions = new DashboardComponent.PostChartSection(accountNumber, brokerageAccountType);
                    break;
                case 29:
                    positions = new DashboardComponent.AccountSettings(accountNumber, brokerageAccountType);
                    break;
                case 30:
                case 31:
                case 32:
                    positions = null;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            if (positions != null) {
                arrayList.add(positions);
            }
        }
        return extensions2.toPersistentList(arrayList);
    }

    @Override // com.robinhood.android.udf.StateProvider
    public DashboardViewState reduce(DashboardDataState dataState) {
        BentoTheme4 bentoTheme4;
        List<HomeStateOrdering> fallbackSectionsForAccount;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Direction pageDirection = dataState.getPageDirection();
        int i = pageDirection == null ? -1 : WhenMappings.$EnumSwitchMapping$2[pageDirection.ordinal()];
        if (i == -1) {
            bentoTheme4 = null;
        } else if (i == 1) {
            bentoTheme4 = BentoTheme4.POSITIVE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bentoTheme4 = BentoTheme4.NEGATIVE;
        }
        BentoTheme4 bentoTheme42 = bentoTheme4;
        HomeDashboardType dashboardType = dataState.getDashboardType();
        if (dashboardType == null) {
            return DashboardViewState.Loading.INSTANCE;
        }
        if (!(dashboardType instanceof HomeDashboardType.Account)) {
            if (dashboardType instanceof HomeDashboardType.PendingApplication) {
                HomeDashboardType.PendingApplication pendingApplication = (HomeDashboardType.PendingApplication) dashboardType;
                return new DashboardViewState.Loaded(pendingApplication, extensions2.toPersistentList(DashboardComponentsBuilder.INSTANCE.getPendingApplicationDashboardComponents(pendingApplication)), new Screen(DashboardTypeExtensions.getScreenName(pendingApplication.getBrokerageAccountType()), null, null, null, 14, null), null, bentoTheme42, false, dataState.isEmbedded(), dataState.isDashboardFundingCtaEnabled(), 40, null);
            }
            if (!(dashboardType instanceof HomeDashboardType.Nux)) {
                throw new NoWhenBranchMatchedException();
            }
            HomeDashboardType.Nux nux = (HomeDashboardType.Nux) dashboardType;
            return new DashboardViewState.Loaded(nux, extensions2.toPersistentList(DashboardComponentsBuilder.INSTANCE.getNuxDashboardComponents(nux, dataState.isInEcRegionGate())), new Screen(Screen.Name.HOME, null, null, null, 14, null), null, bentoTheme42, false, dataState.isEmbedded(), dataState.isDashboardFundingCtaEnabled(), 40, null);
        }
        if (dataState.getAccessibleFeatures() != null && dataState.getAccount() != null) {
            HomeState homeState = dataState.getHomeState();
            if (homeState == null || (fallbackSectionsForAccount = homeState.getOrdering()) == null) {
                fallbackSectionsForAccount = DashboardComponentsBuilder.INSTANCE.getFallbackSectionsForAccount(dataState.getAccount());
            }
            HomeDashboardType.Account account = (HomeDashboardType.Account) dashboardType;
            return new DashboardViewState.Loaded(account, buildAccountDashboardComponents(account, dataState.getAccount(), dataState.getAccessibleFeatures(), fallbackSectionsForAccount), DashboardTypeExtensions.getScreen(dataState.getAccount()), DashboardTypeExtensions.getBrokerageAccountContext(dataState.getAccount()), bentoTheme42, false, dataState.isEmbedded(), dataState.isDashboardFundingCtaEnabled(), 32, null);
        }
        return DashboardViewState.Loading.INSTANCE;
    }
}
