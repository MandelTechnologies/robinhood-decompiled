package com.robinhood.android.p273ui;

import com.robinhood.android.gold.tab.GoldTabState;
import com.robinhood.android.lib.creditcard.CreditCardTabStyle;
import com.robinhood.android.redesigninvesting.investingmonitor.InvestingMonitorTabState;
import com.robinhood.compose.bento.component.BentoTabBarState;
import com.robinhood.iso.countrycode.Affiliate;
import com.robinhood.iso.countrycode.CountryCode;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MainTabBarDataState.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u00108\u001a\b\u0012\u0004\u0012\u00020\u0003092\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000309H\u0002J\u001c\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0003092\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000309H\u0002J\u0018\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000309*\b\u0012\u0004\u0012\u00020\u000309H\u0002J\u0018\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000309*\b\u0012\u0004\u0012\u00020\u000309H\u0002J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u0015\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010B\u001a\u00020\fHÆ\u0003J\t\u0010C\u001a\u00020\u000eHÆ\u0003J\t\u0010D\u001a\u00020\u0010HÆ\u0003J\t\u0010E\u001a\u00020\u0010HÆ\u0003J\t\u0010F\u001a\u00020\u0010HÆ\u0003J\t\u0010G\u001a\u00020\u0010HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u008d\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001J\u0013\u0010J\u001a\u00020\u00102\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010L\u001a\u000202HÖ\u0001J\t\u0010M\u001a\u00020NHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0011\u0010\u0013\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030,X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030,X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u00101\u001a\u000202¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030,8F¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006O"}, m3636d2 = {"Lcom/robinhood/android/ui/MainTabBarDataState;", "", "selectedTab", "Lcom/robinhood/compose/bento/component/BentoTabBarState$Tab;", "badges", "", "Lcom/robinhood/compose/bento/component/BentoTabBarState$BadgeState;", "tabStack", "Ljava/util/Stack;", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "goldTabState", "Lcom/robinhood/android/gold/tab/GoldTabState;", "monitorTab", "Lcom/robinhood/android/redesigninvesting/investingmonitor/InvestingMonitorTabState;", "showIsaTab", "", "showWatchlistTab", "showAccountSelector", "showWatchlistTabTooltip", "creditCardTabStyle", "Lcom/robinhood/android/lib/creditcard/CreditCardTabStyle;", "<init>", "(Lcom/robinhood/compose/bento/component/BentoTabBarState$Tab;Ljava/util/Map;Ljava/util/Stack;Lcom/robinhood/iso/countrycode/CountryCode$Supported;Lcom/robinhood/android/gold/tab/GoldTabState;Lcom/robinhood/android/redesigninvesting/investingmonitor/InvestingMonitorTabState;ZZZZLcom/robinhood/android/lib/creditcard/CreditCardTabStyle;)V", "getSelectedTab", "()Lcom/robinhood/compose/bento/component/BentoTabBarState$Tab;", "getBadges", "()Ljava/util/Map;", "getTabStack", "()Ljava/util/Stack;", "getLocality", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getGoldTabState", "()Lcom/robinhood/android/gold/tab/GoldTabState;", "getMonitorTab", "()Lcom/robinhood/android/redesigninvesting/investingmonitor/InvestingMonitorTabState;", "getShowIsaTab", "()Z", "getShowWatchlistTab", "getShowAccountSelector", "getShowWatchlistTabTooltip", "getCreditCardTabStyle", "()Lcom/robinhood/android/lib/creditcard/CreditCardTabStyle;", "defaultTabsForUs", "", "defaultTabsForNonUs", "defaultTabsForAccuntSelector", "shouldShowGoldUpgrade", "shouldShowGoldHub", "selectedIndex", "", "getSelectedIndex", "()I", "tabsForLocality", "getTabsForLocality", "()Ljava/util/List;", "applyGoldExperiment", "", "tabs", "applyMonitorTabExperiment", "applyWatchlistTabExperiment", "applyIsaTabRegionGate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MainTabBarDataState {
    public static final int $stable = 8;
    private final Map<BentoTabBarState.Tab, BentoTabBarState.BadgeState> badges;
    private final CreditCardTabStyle creditCardTabStyle;
    private final List<BentoTabBarState.Tab> defaultTabsForAccuntSelector;
    private final List<BentoTabBarState.Tab> defaultTabsForNonUs;
    private final List<BentoTabBarState.Tab> defaultTabsForUs;
    private final GoldTabState goldTabState;
    private final CountryCode.Supported locality;
    private final InvestingMonitorTabState monitorTab;
    private final int selectedIndex;
    private final BentoTabBarState.Tab selectedTab;
    private final boolean shouldShowGoldHub;
    private final boolean shouldShowGoldUpgrade;
    private final boolean showAccountSelector;
    private final boolean showIsaTab;
    private final boolean showWatchlistTab;
    private final boolean showWatchlistTabTooltip;
    private final Stack<BentoTabBarState.Tab> tabStack;

    public MainTabBarDataState() {
        this(null, null, null, null, null, null, false, false, false, false, null, 2047, null);
    }

    public static /* synthetic */ MainTabBarDataState copy$default(MainTabBarDataState mainTabBarDataState, BentoTabBarState.Tab tab, Map map, Stack stack, CountryCode.Supported supported, GoldTabState goldTabState, InvestingMonitorTabState investingMonitorTabState, boolean z, boolean z2, boolean z3, boolean z4, CreditCardTabStyle creditCardTabStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            tab = mainTabBarDataState.selectedTab;
        }
        if ((i & 2) != 0) {
            map = mainTabBarDataState.badges;
        }
        if ((i & 4) != 0) {
            stack = mainTabBarDataState.tabStack;
        }
        if ((i & 8) != 0) {
            supported = mainTabBarDataState.locality;
        }
        if ((i & 16) != 0) {
            goldTabState = mainTabBarDataState.goldTabState;
        }
        if ((i & 32) != 0) {
            investingMonitorTabState = mainTabBarDataState.monitorTab;
        }
        if ((i & 64) != 0) {
            z = mainTabBarDataState.showIsaTab;
        }
        if ((i & 128) != 0) {
            z2 = mainTabBarDataState.showWatchlistTab;
        }
        if ((i & 256) != 0) {
            z3 = mainTabBarDataState.showAccountSelector;
        }
        if ((i & 512) != 0) {
            z4 = mainTabBarDataState.showWatchlistTabTooltip;
        }
        if ((i & 1024) != 0) {
            creditCardTabStyle = mainTabBarDataState.creditCardTabStyle;
        }
        boolean z5 = z4;
        CreditCardTabStyle creditCardTabStyle2 = creditCardTabStyle;
        boolean z6 = z2;
        boolean z7 = z3;
        InvestingMonitorTabState investingMonitorTabState2 = investingMonitorTabState;
        boolean z8 = z;
        GoldTabState goldTabState2 = goldTabState;
        Stack stack2 = stack;
        return mainTabBarDataState.copy(tab, map, stack2, supported, goldTabState2, investingMonitorTabState2, z8, z6, z7, z5, creditCardTabStyle2);
    }

    /* renamed from: component1, reason: from getter */
    public final BentoTabBarState.Tab getSelectedTab() {
        return this.selectedTab;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShowWatchlistTabTooltip() {
        return this.showWatchlistTabTooltip;
    }

    /* renamed from: component11, reason: from getter */
    public final CreditCardTabStyle getCreditCardTabStyle() {
        return this.creditCardTabStyle;
    }

    public final Map<BentoTabBarState.Tab, BentoTabBarState.BadgeState> component2() {
        return this.badges;
    }

    public final Stack<BentoTabBarState.Tab> component3() {
        return this.tabStack;
    }

    /* renamed from: component4, reason: from getter */
    public final CountryCode.Supported getLocality() {
        return this.locality;
    }

    /* renamed from: component5, reason: from getter */
    public final GoldTabState getGoldTabState() {
        return this.goldTabState;
    }

    /* renamed from: component6, reason: from getter */
    public final InvestingMonitorTabState getMonitorTab() {
        return this.monitorTab;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowIsaTab() {
        return this.showIsaTab;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowWatchlistTab() {
        return this.showWatchlistTab;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShowAccountSelector() {
        return this.showAccountSelector;
    }

    public final MainTabBarDataState copy(BentoTabBarState.Tab selectedTab, Map<BentoTabBarState.Tab, ? extends BentoTabBarState.BadgeState> badges, Stack<BentoTabBarState.Tab> tabStack, CountryCode.Supported locality, GoldTabState goldTabState, InvestingMonitorTabState monitorTab, boolean showIsaTab, boolean showWatchlistTab, boolean showAccountSelector, boolean showWatchlistTabTooltip, CreditCardTabStyle creditCardTabStyle) {
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(badges, "badges");
        Intrinsics.checkNotNullParameter(tabStack, "tabStack");
        Intrinsics.checkNotNullParameter(goldTabState, "goldTabState");
        Intrinsics.checkNotNullParameter(monitorTab, "monitorTab");
        return new MainTabBarDataState(selectedTab, badges, tabStack, locality, goldTabState, monitorTab, showIsaTab, showWatchlistTab, showAccountSelector, showWatchlistTabTooltip, creditCardTabStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MainTabBarDataState)) {
            return false;
        }
        MainTabBarDataState mainTabBarDataState = (MainTabBarDataState) other;
        return this.selectedTab == mainTabBarDataState.selectedTab && Intrinsics.areEqual(this.badges, mainTabBarDataState.badges) && Intrinsics.areEqual(this.tabStack, mainTabBarDataState.tabStack) && Intrinsics.areEqual(this.locality, mainTabBarDataState.locality) && this.goldTabState == mainTabBarDataState.goldTabState && this.monitorTab == mainTabBarDataState.monitorTab && this.showIsaTab == mainTabBarDataState.showIsaTab && this.showWatchlistTab == mainTabBarDataState.showWatchlistTab && this.showAccountSelector == mainTabBarDataState.showAccountSelector && this.showWatchlistTabTooltip == mainTabBarDataState.showWatchlistTabTooltip && this.creditCardTabStyle == mainTabBarDataState.creditCardTabStyle;
    }

    public int hashCode() {
        int iHashCode = ((((this.selectedTab.hashCode() * 31) + this.badges.hashCode()) * 31) + this.tabStack.hashCode()) * 31;
        CountryCode.Supported supported = this.locality;
        int iHashCode2 = (((((((((((((iHashCode + (supported == null ? 0 : supported.hashCode())) * 31) + this.goldTabState.hashCode()) * 31) + this.monitorTab.hashCode()) * 31) + Boolean.hashCode(this.showIsaTab)) * 31) + Boolean.hashCode(this.showWatchlistTab)) * 31) + Boolean.hashCode(this.showAccountSelector)) * 31) + Boolean.hashCode(this.showWatchlistTabTooltip)) * 31;
        CreditCardTabStyle creditCardTabStyle = this.creditCardTabStyle;
        return iHashCode2 + (creditCardTabStyle != null ? creditCardTabStyle.hashCode() : 0);
    }

    public String toString() {
        return "MainTabBarDataState(selectedTab=" + this.selectedTab + ", badges=" + this.badges + ", tabStack=" + this.tabStack + ", locality=" + this.locality + ", goldTabState=" + this.goldTabState + ", monitorTab=" + this.monitorTab + ", showIsaTab=" + this.showIsaTab + ", showWatchlistTab=" + this.showWatchlistTab + ", showAccountSelector=" + this.showAccountSelector + ", showWatchlistTabTooltip=" + this.showWatchlistTabTooltip + ", creditCardTabStyle=" + this.creditCardTabStyle + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MainTabBarDataState(BentoTabBarState.Tab selectedTab, Map<BentoTabBarState.Tab, ? extends BentoTabBarState.BadgeState> badges, Stack<BentoTabBarState.Tab> tabStack, CountryCode.Supported supported, GoldTabState goldTabState, InvestingMonitorTabState monitorTab, boolean z, boolean z2, boolean z3, boolean z4, CreditCardTabStyle creditCardTabStyle) {
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(badges, "badges");
        Intrinsics.checkNotNullParameter(tabStack, "tabStack");
        Intrinsics.checkNotNullParameter(goldTabState, "goldTabState");
        Intrinsics.checkNotNullParameter(monitorTab, "monitorTab");
        this.selectedTab = selectedTab;
        this.badges = badges;
        this.tabStack = tabStack;
        this.locality = supported;
        this.goldTabState = goldTabState;
        this.monitorTab = monitorTab;
        this.showIsaTab = z;
        this.showWatchlistTab = z2;
        this.showAccountSelector = z3;
        this.showWatchlistTabTooltip = z4;
        this.creditCardTabStyle = creditCardTabStyle;
        BentoTabBarState.Tab tab = BentoTabBarState.Tab.PORTFOLIO;
        BentoTabBarState.Tab tab2 = BentoTabBarState.Tab.CRYPTO;
        BentoTabBarState.Tab tab3 = BentoTabBarState.Tab.RETIREMENT;
        BentoTabBarState.Tab tab4 = BentoTabBarState.Tab.SPENDING;
        BentoTabBarState.Tab tab5 = BentoTabBarState.Tab.ACCOUNT;
        this.defaultTabsForUs = CollectionsKt.listOf((Object[]) new BentoTabBarState.Tab[]{tab, tab2, tab3, tab4, tab5});
        BentoTabBarState.Tab tab6 = BentoTabBarState.Tab.SEARCH;
        this.defaultTabsForNonUs = CollectionsKt.listOf((Object[]) new BentoTabBarState.Tab[]{tab, tab6, BentoTabBarState.Tab.BROWSE, tab5});
        this.defaultTabsForAccuntSelector = CollectionsKt.listOf((Object[]) new BentoTabBarState.Tab[]{tab, tab2, tab6, tab5});
        this.shouldShowGoldUpgrade = goldTabState == GoldTabState.SHOW_GOLD_UPGRADE;
        this.shouldShowGoldHub = goldTabState == GoldTabState.SHOW_GOLD_HUB;
        Integer numValueOf = Integer.valueOf(getTabsForLocality().indexOf(selectedTab));
        numValueOf = numValueOf.intValue() == -1 ? null : numValueOf;
        this.selectedIndex = numValueOf != null ? numValueOf.intValue() : 0;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ MainTabBarDataState(com.robinhood.compose.bento.component.BentoTabBarState.Tab r3, java.util.Map r4, java.util.Stack r5, com.robinhood.iso.countrycode.CountryCode.Supported r6, com.robinhood.android.gold.tab.GoldTabState r7, com.robinhood.android.redesigninvesting.investingmonitor.InvestingMonitorTabState r8, boolean r9, boolean r10, boolean r11, boolean r12, com.robinhood.android.lib.creditcard.CreditCardTabStyle r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r2 = this;
            r15 = r14 & 1
            if (r15 == 0) goto L6
            com.robinhood.compose.bento.component.BentoTabBarState$Tab r3 = com.robinhood.compose.bento.component.BentoTabBarState.Tab.PORTFOLIO
        L6:
            r15 = r14 & 2
            if (r15 == 0) goto Le
            java.util.Map r4 = kotlin.collections.MapsKt.emptyMap()
        Le:
            r15 = r14 & 4
            if (r15 == 0) goto L17
            java.util.Stack r5 = new java.util.Stack
            r5.<init>()
        L17:
            r15 = r14 & 8
            r0 = 0
            if (r15 == 0) goto L1d
            r6 = r0
        L1d:
            r15 = r14 & 16
            if (r15 == 0) goto L23
            com.robinhood.android.gold.tab.GoldTabState r7 = com.robinhood.android.gold.tab.GoldTabState.NONE
        L23:
            r15 = r14 & 32
            if (r15 == 0) goto L29
            com.robinhood.android.redesigninvesting.investingmonitor.InvestingMonitorTabState r8 = com.robinhood.android.redesigninvesting.investingmonitor.InvestingMonitorTabState.HIDE_TAB
        L29:
            r15 = r14 & 64
            r1 = 0
            if (r15 == 0) goto L2f
            r9 = r1
        L2f:
            r15 = r14 & 128(0x80, float:1.794E-43)
            if (r15 == 0) goto L34
            r10 = r1
        L34:
            r15 = r14 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L39
            r11 = r1
        L39:
            r15 = r14 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L3e
            r12 = r1
        L3e:
            r14 = r14 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L4f
            r15 = r0
            r13 = r11
            r14 = r12
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
            goto L5b
        L4f:
            r15 = r13
            r14 = r12
            r12 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
        L5b:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.p273ui.MainTabBarDataState.<init>(com.robinhood.compose.bento.component.BentoTabBarState$Tab, java.util.Map, java.util.Stack, com.robinhood.iso.countrycode.CountryCode$Supported, com.robinhood.android.gold.tab.GoldTabState, com.robinhood.android.redesigninvesting.investingmonitor.InvestingMonitorTabState, boolean, boolean, boolean, boolean, com.robinhood.android.lib.creditcard.CreditCardTabStyle, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final BentoTabBarState.Tab getSelectedTab() {
        return this.selectedTab;
    }

    public final Map<BentoTabBarState.Tab, BentoTabBarState.BadgeState> getBadges() {
        return this.badges;
    }

    public final Stack<BentoTabBarState.Tab> getTabStack() {
        return this.tabStack;
    }

    public final CountryCode.Supported getLocality() {
        return this.locality;
    }

    public final GoldTabState getGoldTabState() {
        return this.goldTabState;
    }

    public final InvestingMonitorTabState getMonitorTab() {
        return this.monitorTab;
    }

    public final boolean getShowIsaTab() {
        return this.showIsaTab;
    }

    public final boolean getShowWatchlistTab() {
        return this.showWatchlistTab;
    }

    public final boolean getShowAccountSelector() {
        return this.showAccountSelector;
    }

    public final boolean getShowWatchlistTabTooltip() {
        return this.showWatchlistTabTooltip;
    }

    public final CreditCardTabStyle getCreditCardTabStyle() {
        return this.creditCardTabStyle;
    }

    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    public final List<BentoTabBarState.Tab> getTabsForLocality() {
        List<BentoTabBarState.Tab> mutableList;
        CountryCode.Supported supported = this.locality;
        if (Intrinsics.areEqual(supported, CountryCode.Supported.UnitedStates.INSTANCE)) {
            if (this.showAccountSelector) {
                mutableList = CollectionsKt.toMutableList((Collection) this.defaultTabsForAccuntSelector);
            } else {
                mutableList = CollectionsKt.toMutableList((Collection) this.defaultTabsForUs);
            }
            if (this.monitorTab == InvestingMonitorTabState.SHOW_TAB) {
                return applyMonitorTabExperiment(mutableList);
            }
            return applyGoldExperiment(mutableList);
        }
        if (Intrinsics.areEqual(supported, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
            return applyIsaTabRegionGate(applyWatchlistTabExperiment(CollectionsKt.toMutableList((Collection) this.defaultTabsForNonUs)));
        }
        if (Affiliate.RHSG.INSTANCE.contains(supported)) {
            return applyWatchlistTabExperiment(CollectionsKt.toMutableList((Collection) this.defaultTabsForNonUs));
        }
        return CollectionsKt.emptyList();
    }

    private final List<BentoTabBarState.Tab> applyGoldExperiment(List<BentoTabBarState.Tab> tabs) {
        int iIndexOf = tabs.indexOf(BentoTabBarState.Tab.SPENDING);
        if (iIndexOf != -1 && this.shouldShowGoldHub) {
            tabs.set(iIndexOf, BentoTabBarState.Tab.GOLD);
            return tabs;
        }
        if (iIndexOf != -1 && this.shouldShowGoldUpgrade) {
            tabs.set(iIndexOf, BentoTabBarState.Tab.GOLD);
        }
        return tabs;
    }

    private final List<BentoTabBarState.Tab> applyMonitorTabExperiment(List<BentoTabBarState.Tab> tabs) {
        if (this.showAccountSelector) {
            tabs.add(2, BentoTabBarState.Tab.INVESTING_MONITOR);
            return tabs;
        }
        int iIndexOf = tabs.indexOf(BentoTabBarState.Tab.SPENDING);
        if (iIndexOf != -1) {
            tabs.set(iIndexOf, BentoTabBarState.Tab.INVESTING_MONITOR);
        }
        return tabs;
    }

    private final List<BentoTabBarState.Tab> applyWatchlistTabExperiment(List<BentoTabBarState.Tab> list) {
        int iIndexOf;
        if (this.showWatchlistTab && (iIndexOf = list.indexOf(BentoTabBarState.Tab.PORTFOLIO)) != -1) {
            list.add(iIndexOf + 1, BentoTabBarState.Tab.WATCHLIST_REDESIGN);
        }
        return list;
    }

    private final List<BentoTabBarState.Tab> applyIsaTabRegionGate(List<BentoTabBarState.Tab> list) {
        int iIndexOf;
        if (this.showIsaTab && (iIndexOf = list.indexOf(BentoTabBarState.Tab.PORTFOLIO)) != -1) {
            list.add(iIndexOf + 1, BentoTabBarState.Tab.ISA);
        }
        return list;
    }
}
