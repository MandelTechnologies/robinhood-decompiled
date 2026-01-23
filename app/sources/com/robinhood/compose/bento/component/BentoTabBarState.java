package com.robinhood.compose.bento.component;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.compose.C11917R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext3;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BentoTabBar.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoTabBarState;", "", "tabs", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/compose/bento/component/BentoTabBarState$Tab;", "selectedIndex", "", "badges", "Lkotlinx/collections/immutable/ImmutableMap;", "Lcom/robinhood/compose/bento/component/BentoTabBarState$BadgeState;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;ILkotlinx/collections/immutable/ImmutableMap;)V", "getTabs", "()Lkotlinx/collections/immutable/ImmutableList;", "getSelectedIndex", "()I", "getBadges", "()Lkotlinx/collections/immutable/ImmutableMap;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "BadgeState", "Tab", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BentoTabBarState {
    public static final int $stable = 0;
    private final ImmutableMap<Tab, BadgeState> badges;
    private final int selectedIndex;
    private final ImmutableList<Tab> tabs;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BentoTabBarState copy$default(BentoTabBarState bentoTabBarState, ImmutableList immutableList, int i, ImmutableMap immutableMap, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            immutableList = bentoTabBarState.tabs;
        }
        if ((i2 & 2) != 0) {
            i = bentoTabBarState.selectedIndex;
        }
        if ((i2 & 4) != 0) {
            immutableMap = bentoTabBarState.badges;
        }
        return bentoTabBarState.copy(immutableList, i, immutableMap);
    }

    public final ImmutableList<Tab> component1() {
        return this.tabs;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    public final ImmutableMap<Tab, BadgeState> component3() {
        return this.badges;
    }

    public final BentoTabBarState copy(ImmutableList<? extends Tab> tabs, int selectedIndex, ImmutableMap<Tab, ? extends BadgeState> badges) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(badges, "badges");
        return new BentoTabBarState(tabs, selectedIndex, badges);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BentoTabBarState)) {
            return false;
        }
        BentoTabBarState bentoTabBarState = (BentoTabBarState) other;
        return Intrinsics.areEqual(this.tabs, bentoTabBarState.tabs) && this.selectedIndex == bentoTabBarState.selectedIndex && Intrinsics.areEqual(this.badges, bentoTabBarState.badges);
    }

    public int hashCode() {
        return (((this.tabs.hashCode() * 31) + Integer.hashCode(this.selectedIndex)) * 31) + this.badges.hashCode();
    }

    public String toString() {
        return "BentoTabBarState(tabs=" + this.tabs + ", selectedIndex=" + this.selectedIndex + ", badges=" + this.badges + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BentoTabBarState(ImmutableList<? extends Tab> tabs, int i, ImmutableMap<Tab, ? extends BadgeState> badges) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(badges, "badges");
        this.tabs = tabs;
        this.selectedIndex = i;
        this.badges = badges;
    }

    public final ImmutableList<Tab> getTabs() {
        return this.tabs;
    }

    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    public /* synthetic */ BentoTabBarState(ImmutableList immutableList, int i, ImmutableMap immutableMap, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(immutableList, i, (i2 & 4) != 0 ? extensions2.persistentMapOf() : immutableMap);
    }

    public final ImmutableMap<Tab, BadgeState> getBadges() {
        return this.badges;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BentoTabBar.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoTabBarState$BadgeState;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", TransferContext3.NORMAL, "CRITICAL", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class BadgeState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BadgeState[] $VALUES;
        public static final BadgeState NONE = new BadgeState("NONE", 0);
        public static final BadgeState NORMAL = new BadgeState(TransferContext3.NORMAL, 1);
        public static final BadgeState CRITICAL = new BadgeState("CRITICAL", 2);

        private static final /* synthetic */ BadgeState[] $values() {
            return new BadgeState[]{NONE, NORMAL, CRITICAL};
        }

        public static EnumEntries<BadgeState> getEntries() {
            return $ENTRIES;
        }

        private BadgeState(String str, int i) {
        }

        static {
            BadgeState[] badgeStateArr$values = $values();
            $VALUES = badgeStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(badgeStateArr$values);
        }

        public static BadgeState valueOf(String str) {
            return (BadgeState) Enum.valueOf(BadgeState.class, str);
        }

        public static BadgeState[] values() {
            return (BadgeState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BentoTabBar.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoTabBarState$Tab;", "", "icon", "", "contentDescription", "analyticsTabName", "", "<init>", "(Ljava/lang/String;IIILjava/lang/String;)V", "getIcon", "()I", "getContentDescription", "getAnalyticsTabName", "()Ljava/lang/String;", "PORTFOLIO", "CRYPTO", "SPENDING", "GOLD", "RETIREMENT", "BROWSE", "SEARCH", "NOTIFICATIONS", "ACCOUNT", "PERPETUALS", "INVESTING_MONITOR", "ACCOUNT_SELECTOR", "WATCHLIST_REDESIGN", "ISA", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Tab {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Tab[] $VALUES;
        private final String analyticsTabName;
        private final int contentDescription;
        private final int icon;
        public static final Tab PORTFOLIO = new Tab("PORTFOLIO", 0, C20690R.drawable.ic_rds_tab_invest_32dp, C11917R.string.nav_item_portfolio, AnalyticsStrings.TAB_NAV_TAB_BAR_INVEST);
        public static final Tab CRYPTO = new Tab("CRYPTO", 1, C20690R.drawable.ic_rds_tab_crypto_c_32dp, C11917R.string.nav_item_crypto, AnalyticsStrings.TAB_NAV_TAB_BAR_CRYPTO);
        public static final Tab SPENDING = new Tab("SPENDING", 2, C20690R.drawable.ic_rds_tab_money_32dp, C11917R.string.nav_item_spending, AnalyticsStrings.TAB_NAV_TAB_BAR_MCDUCKLING);
        public static final Tab GOLD = new Tab("GOLD", 3, C20690R.drawable.ic_rds_gold_tab_32dp, C11917R.string.nav_item_gold, AnalyticsStrings.TAB_NAV_TAB_BAR_GOLD_UPGRADE);
        public static final Tab RETIREMENT = new Tab("RETIREMENT", 4, C20690R.drawable.ic_rds_tab_retirement_32dp, C11917R.string.nav_item_retirement, "retirement");
        public static final Tab BROWSE = new Tab("BROWSE", 5, C20690R.drawable.ic_rds_browse_32dp, C11917R.string.nav_item_browse, "browse");
        public static final Tab SEARCH = new Tab("SEARCH", 6, C20690R.drawable.ic_rds_tab_search_32dp, C11917R.string.nav_item_search, "search");
        public static final Tab NOTIFICATIONS = new Tab("NOTIFICATIONS", 7, C20690R.drawable.ic_rds_notification_32dp, C11917R.string.nav_item_notifications, AnalyticsStrings.TAB_NAV_TAB_BAR_INBOX);
        public static final Tab ACCOUNT = new Tab("ACCOUNT", 8, C20690R.drawable.ic_rds_tab_account_32dp, C11917R.string.nav_item_account, "account");
        public static final Tab PERPETUALS = new Tab("PERPETUALS", 9, C20690R.drawable.ic_rds_tab_perpetual_futures_32dp, C11917R.string.nav_item_perpetuals, AnalyticsStrings.TAB_NAV_TAB_BAR_PERPETUALS);
        public static final Tab INVESTING_MONITOR = new Tab("INVESTING_MONITOR", 10, C20690R.drawable.ic_rds_tab_monitor_32dp, C11917R.string.nav_item_monitor, AnalyticsStrings.TAB_NAV_TAB_BAR_MONITOR);
        public static final Tab ACCOUNT_SELECTOR = new Tab("ACCOUNT_SELECTOR", 11, C20690R.drawable.ic_rds_tab_invest_32dp, C11917R.string.nav_item_account_selector, AnalyticsStrings.TAB_NAV_TAB_BAR_ACCOUNT_SELECTOR);
        public static final Tab WATCHLIST_REDESIGN = new Tab("WATCHLIST_REDESIGN", 12, C20690R.drawable.ic_rds_tab_monitor_32dp, C11917R.string.nav_item_monitor, AnalyticsStrings.TAB_NAV_TAB_BAR_WATCHLIST_REDESIGN);
        public static final Tab ISA = new Tab("ISA", 13, C20690R.drawable.ic_rds_tab_isa_32dp, C11917R.string.nav_item_isa, AnalyticsStrings.TAB_NAV_TAB_BAR_ISA);

        private static final /* synthetic */ Tab[] $values() {
            return new Tab[]{PORTFOLIO, CRYPTO, SPENDING, GOLD, RETIREMENT, BROWSE, SEARCH, NOTIFICATIONS, ACCOUNT, PERPETUALS, INVESTING_MONITOR, ACCOUNT_SELECTOR, WATCHLIST_REDESIGN, ISA};
        }

        public static EnumEntries<Tab> getEntries() {
            return $ENTRIES;
        }

        private Tab(String str, int i, int i2, int i3, String str2) {
            this.icon = i2;
            this.contentDescription = i3;
            this.analyticsTabName = str2;
        }

        public final int getIcon() {
            return this.icon;
        }

        public final int getContentDescription() {
            return this.contentDescription;
        }

        public final String getAnalyticsTabName() {
            return this.analyticsTabName;
        }

        static {
            Tab[] tabArr$values = $values();
            $VALUES = tabArr$values;
            $ENTRIES = EnumEntries2.enumEntries(tabArr$values);
        }

        public static Tab valueOf(String str) {
            return (Tab) Enum.valueOf(Tab.class, str);
        }

        public static Tab[] values() {
            return (Tab[]) $VALUES.clone();
        }
    }
}
