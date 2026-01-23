package com.robinhood.android.dashboard.store;

import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.librobinhood.data.store.AccountFeature;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.home.api.HomeStateOrdering;
import com.robinhood.models.home.component.DashboardComponent;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DashboardComponentsBuilder.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t*\b\u0012\u0004\u0012\u00020\u00060\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\r\u001a\u00020\u000eJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\u0006\u0010\u0011\u001a\u00020\u0016J \u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/dashboard/store/DashboardComponentsBuilder;", "", "<init>", "()V", "sectionToFeatureMap", "", "Lcom/robinhood/models/home/api/HomeStateOrdering;", "Lcom/robinhood/librobinhood/data/store/AccountFeature;", "filterSupportedSections", "", "accessibleFeatures", "", "getFallbackSectionsForAccount", "account", "Lcom/robinhood/models/db/Account;", "getNuxDashboardComponents", "Lcom/robinhood/models/home/component/DashboardComponent;", "dashboardType", "Lcom/robinhood/android/home/contracts/HomeDashboardType$Nux;", "isInEcRegionGate", "", "getPendingApplicationDashboardComponents", "Lcom/robinhood/android/home/contracts/HomeDashboardType$PendingApplication;", "getInfoBanner", "Lcom/robinhood/models/home/component/DashboardComponent$InfoBanner;", "accountNumber", "", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "location", "Lcom/robinhood/android/dashboard/store/DashboardComponentsBuilder$BannerLocation;", "BannerLocation", "lib-store-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DashboardComponentsBuilder {
    public static final DashboardComponentsBuilder INSTANCE = new DashboardComponentsBuilder();
    private static final Map<HomeStateOrdering, AccountFeature> sectionToFeatureMap;

    /* compiled from: DashboardComponentsBuilder.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ManagementType.values().length];
            try {
                iArr[ManagementType.SELF_DIRECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ManagementType.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ManagementType.MANAGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BannerLocation.values().length];
            try {
                iArr2[BannerLocation.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BannerLocation.BELOW_CHART.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[BrokerageAccountType.values().length];
            try {
                iArr3[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[BrokerageAccountType.INDIVIDUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[BrokerageAccountType.IRA_ROTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[BrokerageAccountType.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    private DashboardComponentsBuilder() {
    }

    static {
        HomeStateOrdering homeStateOrdering = HomeStateOrdering.HOLDINGS_FUTURES_PENDING;
        AccountFeature accountFeature = AccountFeature.FUTURES;
        Tuples2 tuples2M3642to = Tuples4.m3642to(homeStateOrdering, accountFeature);
        Tuples2 tuples2M3642to2 = Tuples4.m3642to(HomeStateOrdering.HOLDINGS_FUTURES, accountFeature);
        HomeStateOrdering homeStateOrdering2 = HomeStateOrdering.HOLDINGS_OPTIONS_PENDING;
        AccountFeature accountFeature2 = AccountFeature.OPTIONS_SUPPORTED;
        Tuples2 tuples2M3642to3 = Tuples4.m3642to(homeStateOrdering2, accountFeature2);
        Tuples2 tuples2M3642to4 = Tuples4.m3642to(HomeStateOrdering.HOLDINGS_OPTIONS, accountFeature2);
        Tuples2 tuples2M3642to5 = Tuples4.m3642to(HomeStateOrdering.HOLDINGS_CRYPTO, AccountFeature.CRYPTO);
        HomeStateOrdering homeStateOrdering3 = HomeStateOrdering.HOLDINGS_EVENT_CONTRACTS_PENDING;
        AccountFeature accountFeature3 = AccountFeature.EVENT_CONTRACTS;
        sectionToFeatureMap = MapsKt.mapOf(tuples2M3642to, tuples2M3642to2, tuples2M3642to3, tuples2M3642to4, tuples2M3642to5, Tuples4.m3642to(homeStateOrdering3, accountFeature3), Tuples4.m3642to(HomeStateOrdering.HOLDINGS_EVENT_CONTRACTS, accountFeature3), Tuples4.m3642to(HomeStateOrdering.CASH_SWEEP, AccountFeature.SWEEP), Tuples4.m3642to(HomeStateOrdering.RECURRING_INVESTMENTS, AccountFeature.RECURRING), Tuples4.m3642to(HomeStateOrdering.PROFIT_AND_LOSS, AccountFeature.PNL_HUB), Tuples4.m3642to(HomeStateOrdering.LISTS, AccountFeature.DASHBOARD_CURATED_LIST), Tuples4.m3642to(HomeStateOrdering.NOTIFICATION_CARDS, AccountFeature.NOTIFICATION_CARD_STACK), Tuples4.m3642to(HomeStateOrdering.CONTRIBUTIONS, AccountFeature.CONTRIBUTIONS));
    }

    public final List<HomeStateOrdering> filterSupportedSections(List<? extends HomeStateOrdering> list, Set<? extends AccountFeature> accessibleFeatures) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(accessibleFeatures, "accessibleFeatures");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            AccountFeature accountFeature = sectionToFeatureMap.get((HomeStateOrdering) obj);
            if (accountFeature == null || accessibleFeatures.contains(accountFeature)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<HomeStateOrdering> getFallbackSectionsForAccount(Account account) {
        HomeStateOrdering homeStateOrdering;
        Intrinsics.checkNotNullParameter(account, "account");
        int i = WhenMappings.$EnumSwitchMapping$0[account.getManagementType().ordinal()];
        if (i == 1 || i == 2) {
            return CollectionsKt.listOf((Object[]) new HomeStateOrdering[]{HomeStateOrdering.TOP_LEVEL_BANNER, HomeStateOrdering.CHART, HomeStateOrdering.BUYING_POWER, HomeStateOrdering.NOTIFICATION_CARDS, HomeStateOrdering.CONTRIBUTIONS, HomeStateOrdering.HOLDINGS_FUTURES_PENDING, HomeStateOrdering.HOLDINGS_FUTURES, HomeStateOrdering.HOLDINGS_OPTIONS_PENDING, HomeStateOrdering.HOLDINGS_OPTIONS, HomeStateOrdering.HOLDINGS_CRYPTO, HomeStateOrdering.HOLDINGS_EQUITIES, HomeStateOrdering.HOLDINGS_EVENT_CONTRACTS_PENDING, HomeStateOrdering.HOLDINGS_EVENT_CONTRACTS, HomeStateOrdering.FEATURE_DISCOVER_BELOW_CARDS, HomeStateOrdering.LISTS, HomeStateOrdering.DISCLOSURE});
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        HomeStateOrdering homeStateOrdering2 = HomeStateOrdering.TOP_LEVEL_BANNER;
        HomeStateOrdering homeStateOrdering3 = HomeStateOrdering.MANAGED_ACCOUNT_OVERVIEW;
        HomeStateOrdering homeStateOrdering4 = HomeStateOrdering.MANAGED_ACCOUNT_INSIGHTS;
        if (account.getBrokerageAccountType().isRetirement()) {
            homeStateOrdering = HomeStateOrdering.CONTRIBUTIONS;
        } else {
            homeStateOrdering = HomeStateOrdering.DEPOSITS_SUMMARY;
        }
        return CollectionsKt.listOf((Object[]) new HomeStateOrdering[]{homeStateOrdering2, homeStateOrdering3, homeStateOrdering4, homeStateOrdering, HomeStateOrdering.HOLDINGS_BREAKDOWN, HomeStateOrdering.DISCLOSURE});
    }

    public final List<DashboardComponent> getNuxDashboardComponents(HomeDashboardType.Nux dashboardType, boolean isInEcRegionGate) {
        Intrinsics.checkNotNullParameter(dashboardType, "dashboardType");
        DashboardComponent.InfoBanner infoBanner = new DashboardComponent.InfoBanner(null, IacInfoBannerLocation.INFO_BANNER_HOME_PAGE_TOP_LEVEL);
        DashboardComponent.Chart chart = new DashboardComponent.Chart(dashboardType);
        DashboardComponent.InfoBanner infoBanner2 = new DashboardComponent.InfoBanner(null, IacInfoBannerLocation.INFO_BANNER_HOME_PAGE_MOBILE_BELOW_CHART);
        DashboardComponent.PredictionMarketSection predictionMarketSection = DashboardComponent.PredictionMarketSection.INSTANCE;
        if (!isInEcRegionGate) {
            predictionMarketSection = null;
        }
        return CollectionsKt.listOfNotNull((Object[]) new DashboardComponent[]{infoBanner, chart, infoBanner2, DashboardComponent.CardStack.INSTANCE, predictionMarketSection, new DashboardComponent.CuratedList(null), new DashboardComponent.Disclosure(null)});
    }

    public final List<DashboardComponent> getPendingApplicationDashboardComponents(HomeDashboardType.PendingApplication dashboardType) {
        Intrinsics.checkNotNullParameter(dashboardType, "dashboardType");
        return CollectionsKt.listOf(new DashboardComponent.Chart(dashboardType));
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DashboardComponentsBuilder.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/dashboard/store/DashboardComponentsBuilder$BannerLocation;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "BELOW_CHART", "lib-store-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class BannerLocation {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BannerLocation[] $VALUES;
        public static final BannerLocation TOP = new BannerLocation("TOP", 0);
        public static final BannerLocation BELOW_CHART = new BannerLocation("BELOW_CHART", 1);

        private static final /* synthetic */ BannerLocation[] $values() {
            return new BannerLocation[]{TOP, BELOW_CHART};
        }

        public static EnumEntries<BannerLocation> getEntries() {
            return $ENTRIES;
        }

        private BannerLocation(String str, int i) {
        }

        static {
            BannerLocation[] bannerLocationArr$values = $values();
            $VALUES = bannerLocationArr$values;
            $ENTRIES = EnumEntries2.enumEntries(bannerLocationArr$values);
        }

        public static BannerLocation valueOf(String str) {
            return (BannerLocation) Enum.valueOf(BannerLocation.class, str);
        }

        public static BannerLocation[] values() {
            return (BannerLocation[]) $VALUES.clone();
        }
    }

    public final DashboardComponent.InfoBanner getInfoBanner(String accountNumber, BrokerageAccountType accountType, BannerLocation location) {
        IacInfoBannerLocation iacInfoBannerLocation;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(location, "location");
        switch (WhenMappings.$EnumSwitchMapping$2[accountType.ordinal()]) {
            case 1:
            case 2:
            case 3:
                int i = WhenMappings.$EnumSwitchMapping$1[location.ordinal()];
                if (i == 1) {
                    iacInfoBannerLocation = IacInfoBannerLocation.INFO_BANNER_HOME_PAGE_TOP_LEVEL;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iacInfoBannerLocation = IacInfoBannerLocation.INFO_BANNER_HOME_PAGE_MOBILE_BELOW_CHART;
                }
                return new DashboardComponent.InfoBanner(accountNumber, iacInfoBannerLocation);
            case 4:
            case 5:
                int i2 = WhenMappings.$EnumSwitchMapping$1[location.ordinal()];
                if (i2 == 1) {
                    return new DashboardComponent.InfoBanner(accountNumber, IacInfoBannerLocation.INFO_BANNER_RETIREMENT_TAB_TOP_LEVEL);
                }
                if (i2 == 2) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            case 6:
                int i3 = WhenMappings.$EnumSwitchMapping$1[location.ordinal()];
                if (i3 == 1) {
                    return new DashboardComponent.InfoBanner(accountNumber, IacInfoBannerLocation.INFO_BANNER_HOME_PAGE_TOP_LEVEL);
                }
                if (i3 == 2) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            case 7:
                int i4 = WhenMappings.$EnumSwitchMapping$1[location.ordinal()];
                if (i4 == 1) {
                    return new DashboardComponent.InfoBanner(accountNumber, IacInfoBannerLocation.INFO_BANNER_ISA_TAB_TOP_LEVEL);
                }
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return new DashboardComponent.InfoBanner(accountNumber, IacInfoBannerLocation.INFO_BANNER_ISA_TAB_MOBILE_BELOW_CHART);
            case 8:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
