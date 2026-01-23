package com.robinhood.android.p273ui;

import com.robinhood.android.lib.creditcard.CreditCardTabStyle;
import com.robinhood.compose.bento.component.BentoTabBarState;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MainTabBarViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/ui/MainTabBarViewState;", "", "tabBarState", "Lcom/robinhood/compose/bento/component/BentoTabBarState;", "tabStack", "Ljava/util/Stack;", "Lcom/robinhood/compose/bento/component/BentoTabBarState$Tab;", "showWatchlistTabTooltip", "", "creditCardTabStyle", "Lcom/robinhood/android/lib/creditcard/CreditCardTabStyle;", "<init>", "(Lcom/robinhood/compose/bento/component/BentoTabBarState;Ljava/util/Stack;ZLcom/robinhood/android/lib/creditcard/CreditCardTabStyle;)V", "getTabBarState", "()Lcom/robinhood/compose/bento/component/BentoTabBarState;", "getTabStack", "()Ljava/util/Stack;", "getShowWatchlistTabTooltip", "()Z", "getCreditCardTabStyle", "()Lcom/robinhood/android/lib/creditcard/CreditCardTabStyle;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MainTabBarViewState {
    public static final int $stable = 8;
    private final CreditCardTabStyle creditCardTabStyle;
    private final boolean showWatchlistTabTooltip;
    private final BentoTabBarState tabBarState;
    private final Stack<BentoTabBarState.Tab> tabStack;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MainTabBarViewState copy$default(MainTabBarViewState mainTabBarViewState, BentoTabBarState bentoTabBarState, Stack stack, boolean z, CreditCardTabStyle creditCardTabStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            bentoTabBarState = mainTabBarViewState.tabBarState;
        }
        if ((i & 2) != 0) {
            stack = mainTabBarViewState.tabStack;
        }
        if ((i & 4) != 0) {
            z = mainTabBarViewState.showWatchlistTabTooltip;
        }
        if ((i & 8) != 0) {
            creditCardTabStyle = mainTabBarViewState.creditCardTabStyle;
        }
        return mainTabBarViewState.copy(bentoTabBarState, stack, z, creditCardTabStyle);
    }

    /* renamed from: component1, reason: from getter */
    public final BentoTabBarState getTabBarState() {
        return this.tabBarState;
    }

    public final Stack<BentoTabBarState.Tab> component2() {
        return this.tabStack;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowWatchlistTabTooltip() {
        return this.showWatchlistTabTooltip;
    }

    /* renamed from: component4, reason: from getter */
    public final CreditCardTabStyle getCreditCardTabStyle() {
        return this.creditCardTabStyle;
    }

    public final MainTabBarViewState copy(BentoTabBarState tabBarState, Stack<BentoTabBarState.Tab> tabStack, boolean showWatchlistTabTooltip, CreditCardTabStyle creditCardTabStyle) {
        Intrinsics.checkNotNullParameter(tabBarState, "tabBarState");
        Intrinsics.checkNotNullParameter(tabStack, "tabStack");
        return new MainTabBarViewState(tabBarState, tabStack, showWatchlistTabTooltip, creditCardTabStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MainTabBarViewState)) {
            return false;
        }
        MainTabBarViewState mainTabBarViewState = (MainTabBarViewState) other;
        return Intrinsics.areEqual(this.tabBarState, mainTabBarViewState.tabBarState) && Intrinsics.areEqual(this.tabStack, mainTabBarViewState.tabStack) && this.showWatchlistTabTooltip == mainTabBarViewState.showWatchlistTabTooltip && this.creditCardTabStyle == mainTabBarViewState.creditCardTabStyle;
    }

    public int hashCode() {
        int iHashCode = ((((this.tabBarState.hashCode() * 31) + this.tabStack.hashCode()) * 31) + Boolean.hashCode(this.showWatchlistTabTooltip)) * 31;
        CreditCardTabStyle creditCardTabStyle = this.creditCardTabStyle;
        return iHashCode + (creditCardTabStyle == null ? 0 : creditCardTabStyle.hashCode());
    }

    public String toString() {
        return "MainTabBarViewState(tabBarState=" + this.tabBarState + ", tabStack=" + this.tabStack + ", showWatchlistTabTooltip=" + this.showWatchlistTabTooltip + ", creditCardTabStyle=" + this.creditCardTabStyle + ")";
    }

    public MainTabBarViewState(BentoTabBarState tabBarState, Stack<BentoTabBarState.Tab> tabStack, boolean z, CreditCardTabStyle creditCardTabStyle) {
        Intrinsics.checkNotNullParameter(tabBarState, "tabBarState");
        Intrinsics.checkNotNullParameter(tabStack, "tabStack");
        this.tabBarState = tabBarState;
        this.tabStack = tabStack;
        this.showWatchlistTabTooltip = z;
        this.creditCardTabStyle = creditCardTabStyle;
    }

    public /* synthetic */ MainTabBarViewState(BentoTabBarState bentoTabBarState, Stack stack, boolean z, CreditCardTabStyle creditCardTabStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bentoTabBarState, stack, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : creditCardTabStyle);
    }

    public final BentoTabBarState getTabBarState() {
        return this.tabBarState;
    }

    public final Stack<BentoTabBarState.Tab> getTabStack() {
        return this.tabStack;
    }

    public final boolean getShowWatchlistTabTooltip() {
        return this.showWatchlistTabTooltip;
    }

    public final CreditCardTabStyle getCreditCardTabStyle() {
        return this.creditCardTabStyle;
    }
}
