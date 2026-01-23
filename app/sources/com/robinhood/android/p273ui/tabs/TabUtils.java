package com.robinhood.android.p273ui.tabs;

import com.robinhood.android.cash.contracts.SpendingTab;
import com.robinhood.android.common.p088ui.BaseTabFragment;
import com.robinhood.android.gold.contracts.GoldTabFragmentKey;
import com.robinhood.android.home.contracts.WatchListIntentKey2;
import com.robinhood.android.home.contracts.WatchlistTabFragmentKey;
import com.robinhood.android.isa.contracts.IsaTabFragmentKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.p273ui.AccountTabFragment;
import com.robinhood.android.p273ui.BrowseTabFragment;
import com.robinhood.android.p273ui.HomeTabFragment;
import com.robinhood.android.p273ui.InboxTabFragment;
import com.robinhood.android.p273ui.SearchTabFragment;
import com.robinhood.android.redesign.accounttab.AccountSelectorFragmentKey;
import com.robinhood.android.redesigninvesting.investingmonitor.InvestingMonitorFragmentKey;
import com.robinhood.android.retirement.contracts.RetirementTabFragmentKey;
import com.robinhood.compose.bento.component.BentoTabBarState;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.shared.crypto.contracts.CryptoTabFragmentKey;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TabUtils.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001\u001a\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\b\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m3636d2 = {"toBentoTab", "Lcom/robinhood/compose/bento/component/BentoTabBarState$Tab;", "Lcom/robinhood/shared/home/contracts/TabLinkIntentKey;", "toTabLinkIntentKey", "createFragment", "Lcom/robinhood/android/common/ui/BaseTabFragment;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "Lcom/robinhood/android/home/contracts/WatchlistScreen;", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "feature-tab-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.ui.tabs.TabUtilsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TabUtils {

    /* compiled from: TabUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.ui.tabs.TabUtilsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[BentoTabBarState.Tab.values().length];
            try {
                iArr[BentoTabBarState.Tab.PORTFOLIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BentoTabBarState.Tab.SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BentoTabBarState.Tab.CRYPTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BentoTabBarState.Tab.SPENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BentoTabBarState.Tab.GOLD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BentoTabBarState.Tab.RETIREMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BentoTabBarState.Tab.BROWSE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BentoTabBarState.Tab.NOTIFICATIONS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BentoTabBarState.Tab.ACCOUNT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BentoTabBarState.Tab.PERPETUALS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BentoTabBarState.Tab.INVESTING_MONITOR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BentoTabBarState.Tab.ACCOUNT_SELECTOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BentoTabBarState.Tab.WATCHLIST_REDESIGN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BentoTabBarState.Tab.ISA.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FragmentTab.values().length];
            try {
                iArr2[FragmentTab.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[FragmentTab.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[FragmentTab.SPENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[FragmentTab.GOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[FragmentTab.RETIREMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[FragmentTab.SEARCH.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[FragmentTab.BROWSE.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[FragmentTab.INBOX.ordinal()] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[FragmentTab.ACCOUNT.ordinal()] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[FragmentTab.PERPETUALS.ordinal()] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[FragmentTab.CURRENT_TAB.ordinal()] = 11;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[FragmentTab.SHOULD_NOT_BE_IN_TAB.ordinal()] = 12;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[FragmentTab.INVESTING_MONITOR.ordinal()] = 13;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[FragmentTab.ACCOUNT_SELECTOR.ordinal()] = 14;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[FragmentTab.WATCHLIST_REDESIGN.ordinal()] = 15;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[FragmentTab.ISA.ordinal()] = 16;
            } catch (NoSuchFieldError unused30) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[WatchListIntentKey2.values().length];
            try {
                iArr3[WatchListIntentKey2.HISTORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr3[WatchListIntentKey2.ORDERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr3[WatchListIntentKey2.OPTION_EVENTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr3[WatchListIntentKey2.DIVIDENDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr3[WatchListIntentKey2.ADR_FEES.ordinal()] = 5;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr3[WatchListIntentKey2.TRANSFERS.ordinal()] = 6;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr3[WatchListIntentKey2.BANKING.ordinal()] = 7;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr3[WatchListIntentKey2.TAX_DOCUMENTS.ordinal()] = 8;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr3[WatchListIntentKey2.AUTOMATIC_DEPOSITS.ordinal()] = 9;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr3[WatchListIntentKey2.HELP.ordinal()] = 10;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr3[WatchListIntentKey2.LICENSES.ordinal()] = 11;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr3[WatchListIntentKey2.GIFTS.ordinal()] = 12;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr3[WatchListIntentKey2.WATCHLIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr3[WatchListIntentKey2.SEARCH.ordinal()] = 14;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr3[WatchListIntentKey2.NOT_APPLICABLE.ordinal()] = 15;
            } catch (NoSuchFieldError unused45) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final BentoTabBarState.Tab toBentoTab(TabLinkIntentKey tabLinkIntentKey) {
        Intrinsics.checkNotNullParameter(tabLinkIntentKey, "<this>");
        if (tabLinkIntentKey instanceof TabLinkIntentKey.Home) {
            return BentoTabBarState.Tab.PORTFOLIO;
        }
        if (tabLinkIntentKey instanceof TabLinkIntentKey.Search) {
            return BentoTabBarState.Tab.SEARCH;
        }
        if (tabLinkIntentKey instanceof TabLinkIntentKey.Crypto) {
            return BentoTabBarState.Tab.CRYPTO;
        }
        if (tabLinkIntentKey instanceof TabLinkIntentKey.McDuckling) {
            return BentoTabBarState.Tab.SPENDING;
        }
        if (tabLinkIntentKey instanceof TabLinkIntentKey.Gold) {
            return BentoTabBarState.Tab.GOLD;
        }
        if (tabLinkIntentKey instanceof TabLinkIntentKey.Retirement) {
            return BentoTabBarState.Tab.RETIREMENT;
        }
        if (tabLinkIntentKey instanceof TabLinkIntentKey.Browse) {
            return BentoTabBarState.Tab.BROWSE;
        }
        if (tabLinkIntentKey instanceof TabLinkIntentKey.Inbox) {
            return BentoTabBarState.Tab.NOTIFICATIONS;
        }
        if (tabLinkIntentKey instanceof TabLinkIntentKey.Account) {
            return BentoTabBarState.Tab.ACCOUNT;
        }
        if (tabLinkIntentKey instanceof TabLinkIntentKey.Perpetuals) {
            return BentoTabBarState.Tab.PERPETUALS;
        }
        if (tabLinkIntentKey instanceof TabLinkIntentKey.InvestingMonitor) {
            return BentoTabBarState.Tab.INVESTING_MONITOR;
        }
        if (tabLinkIntentKey instanceof TabLinkIntentKey.AccountSelector) {
            return BentoTabBarState.Tab.ACCOUNT_SELECTOR;
        }
        if (tabLinkIntentKey instanceof TabLinkIntentKey.WatchlistRedesign) {
            return BentoTabBarState.Tab.WATCHLIST_REDESIGN;
        }
        if (tabLinkIntentKey instanceof TabLinkIntentKey.Isa) {
            return BentoTabBarState.Tab.ISA;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TabLinkIntentKey toTabLinkIntentKey(BentoTabBarState.Tab tab) {
        Intrinsics.checkNotNullParameter(tab, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[tab.ordinal()]) {
            case 1:
                return TabLinkIntentKey.Home.Legacy.INSTANCE;
            case 2:
                return new TabLinkIntentKey.Search(null, 1, null);
            case 3:
                return TabLinkIntentKey.Crypto.INSTANCE;
            case 4:
                return new TabLinkIntentKey.McDuckling(null, false, null, 7, null);
            case 5:
                return TabLinkIntentKey.Gold.INSTANCE;
            case 6:
                return new TabLinkIntentKey.Retirement(null, null, null, 7, null);
            case 7:
                return new TabLinkIntentKey.Browse(false, 1, null);
            case 8:
                return TabLinkIntentKey.Inbox.INSTANCE;
            case 9:
                return new TabLinkIntentKey.Account(false, 1, null);
            case 10:
                return TabLinkIntentKey.Perpetuals.INSTANCE;
            case 11:
                return TabLinkIntentKey.InvestingMonitor.INSTANCE;
            case 12:
                return TabLinkIntentKey.AccountSelector.INSTANCE;
            case 13:
                return TabLinkIntentKey.WatchlistRedesign.INSTANCE;
            case 14:
                return TabLinkIntentKey.Isa.INSTANCE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final BaseTabFragment createFragment(BentoTabBarState.Tab tab, Navigator navigator) {
        Object objNewInstance;
        Intrinsics.checkNotNullParameter(tab, "<this>");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        switch (WhenMappings.$EnumSwitchMapping$0[tab.ordinal()]) {
            case 1:
                objNewInstance = HomeTabFragment.INSTANCE.newInstance();
                break;
            case 2:
                objNewInstance = SearchTabFragment.INSTANCE.newInstance();
                break;
            case 3:
                objNewInstance = Navigator.DefaultImpls.createFragment$default(navigator, new CryptoTabFragmentKey(false, 1, null), null, 2, null);
                break;
            case 4:
                objNewInstance = Navigator.DefaultImpls.createFragment$default(navigator, new SpendingTab(null, 1, null), null, 2, null);
                break;
            case 5:
                objNewInstance = Navigator.DefaultImpls.createFragment$default(navigator, GoldTabFragmentKey.INSTANCE, null, 2, null);
                break;
            case 6:
                objNewInstance = Navigator.DefaultImpls.createFragment$default(navigator, new RetirementTabFragmentKey(null, null, null, 7, null), null, 2, null);
                break;
            case 7:
                objNewInstance = BrowseTabFragment.INSTANCE.newInstance();
                break;
            case 8:
                objNewInstance = InboxTabFragment.INSTANCE.newInstance();
                break;
            case 9:
                objNewInstance = AccountTabFragment.INSTANCE.newInstance();
                break;
            case 10:
                throw new IllegalStateException("perpetuals tab should only be used in RHC");
            case 11:
                objNewInstance = Navigator.DefaultImpls.createFragment$default(navigator, new InvestingMonitorFragmentKey(), null, 2, null);
                break;
            case 12:
                objNewInstance = Navigator.DefaultImpls.createFragment$default(navigator, AccountSelectorFragmentKey.INSTANCE, null, 2, null);
                break;
            case 13:
                objNewInstance = Navigator.DefaultImpls.createFragment$default(navigator, WatchlistTabFragmentKey.INSTANCE, null, 2, null);
                break;
            case 14:
                objNewInstance = Navigator.DefaultImpls.createFragment$default(navigator, IsaTabFragmentKey.INSTANCE, null, 2, null);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type com.robinhood.android.common.ui.BaseTabFragment");
        return (BaseTabFragment) objNewInstance;
    }

    public static final BentoTabBarState.Tab toBentoTab(FragmentTab fragmentTab) {
        Intrinsics.checkNotNullParameter(fragmentTab, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[fragmentTab.ordinal()]) {
            case 1:
                return BentoTabBarState.Tab.PORTFOLIO;
            case 2:
                return BentoTabBarState.Tab.CRYPTO;
            case 3:
                return BentoTabBarState.Tab.SPENDING;
            case 4:
                return BentoTabBarState.Tab.GOLD;
            case 5:
                return BentoTabBarState.Tab.RETIREMENT;
            case 6:
            case 7:
                return BentoTabBarState.Tab.BROWSE;
            case 8:
                return BentoTabBarState.Tab.NOTIFICATIONS;
            case 9:
                return BentoTabBarState.Tab.ACCOUNT;
            case 10:
                return BentoTabBarState.Tab.PERPETUALS;
            case 11:
                throw new IllegalStateException("Should not call toTab() on FragmentTab.CURRENT_TAB");
            case 12:
                return null;
            case 13:
                return BentoTabBarState.Tab.INVESTING_MONITOR;
            case 14:
                return BentoTabBarState.Tab.ACCOUNT_SELECTOR;
            case 15:
                return BentoTabBarState.Tab.WATCHLIST_REDESIGN;
            case 16:
                return BentoTabBarState.Tab.ISA;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final BentoTabBarState.Tab toBentoTab(WatchListIntentKey2 watchListIntentKey2, CountryCode.Supported locality) {
        Intrinsics.checkNotNullParameter(watchListIntentKey2, "<this>");
        Intrinsics.checkNotNullParameter(locality, "locality");
        switch (WhenMappings.$EnumSwitchMapping$2[watchListIntentKey2.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return BentoTabBarState.Tab.ACCOUNT;
            case 13:
                return BentoTabBarState.Tab.PORTFOLIO;
            case 14:
                return Intrinsics.areEqual(locality, CountryCode.Supported.UnitedStates.INSTANCE) ? BentoTabBarState.Tab.BROWSE : Intrinsics.areEqual(locality, CountryCode.Supported.UnitedKingdom.INSTANCE) ? BentoTabBarState.Tab.SEARCH : BentoTabBarState.Tab.SEARCH;
            case 15:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
