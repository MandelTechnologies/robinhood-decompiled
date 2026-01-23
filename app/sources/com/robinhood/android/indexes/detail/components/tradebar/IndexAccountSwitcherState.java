package com.robinhood.android.indexes.detail.components.tradebar;

import com.robinhood.android.lib.trade.view.TradeAccountSwitcherState;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDetailPageTradeBarStates.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003JW\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001J\u0013\u0010'\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000e\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/tradebar/IndexAccountSwitcherState;", "Lcom/robinhood/android/lib/trade/view/TradeAccountSwitcherState;", "screenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "activeAccountNumber", "", "allAccounts", "", "Lcom/robinhood/models/db/Account;", "loading", "", "enableAccountSwitching", "loadedState", "Lcom/robinhood/android/lib/trade/view/TradeAccountSwitcherState$LoadedState;", "useSduiAccountSwitcher", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Screen$Name;Ljava/lang/String;Ljava/util/List;ZZLcom/robinhood/android/lib/trade/view/TradeAccountSwitcherState$LoadedState;Z)V", "getScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getActiveAccountNumber", "()Ljava/lang/String;", "getAllAccounts", "()Ljava/util/List;", "getLoading", "()Z", "getEnableAccountSwitching", "getLoadedState", "()Lcom/robinhood/android/lib/trade/view/TradeAccountSwitcherState$LoadedState;", "getUseSduiAccountSwitcher", "fallbackAccountSelectable", "getFallbackAccountSelectable", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IndexAccountSwitcherState implements TradeAccountSwitcherState {
    public static final int $stable = 8;
    private final String activeAccountNumber;
    private final List<Account> allAccounts;
    private final boolean enableAccountSwitching;
    private final boolean fallbackAccountSelectable;
    private final TradeAccountSwitcherState.LoadedState loadedState;
    private final boolean loading;
    private final Screen.Name screenName;
    private final boolean useSduiAccountSwitcher;

    public static /* synthetic */ IndexAccountSwitcherState copy$default(IndexAccountSwitcherState indexAccountSwitcherState, Screen.Name name, String str, List list, boolean z, boolean z2, TradeAccountSwitcherState.LoadedState loadedState, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            name = indexAccountSwitcherState.screenName;
        }
        if ((i & 2) != 0) {
            str = indexAccountSwitcherState.activeAccountNumber;
        }
        if ((i & 4) != 0) {
            list = indexAccountSwitcherState.allAccounts;
        }
        if ((i & 8) != 0) {
            z = indexAccountSwitcherState.loading;
        }
        if ((i & 16) != 0) {
            z2 = indexAccountSwitcherState.enableAccountSwitching;
        }
        if ((i & 32) != 0) {
            loadedState = indexAccountSwitcherState.loadedState;
        }
        if ((i & 64) != 0) {
            z3 = indexAccountSwitcherState.useSduiAccountSwitcher;
        }
        TradeAccountSwitcherState.LoadedState loadedState2 = loadedState;
        boolean z4 = z3;
        boolean z5 = z2;
        List list2 = list;
        return indexAccountSwitcherState.copy(name, str, list2, z, z5, loadedState2, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final Screen.Name getScreenName() {
        return this.screenName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getActiveAccountNumber() {
        return this.activeAccountNumber;
    }

    public final List<Account> component3() {
        return this.allAccounts;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getEnableAccountSwitching() {
        return this.enableAccountSwitching;
    }

    /* renamed from: component6, reason: from getter */
    public final TradeAccountSwitcherState.LoadedState getLoadedState() {
        return this.loadedState;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getUseSduiAccountSwitcher() {
        return this.useSduiAccountSwitcher;
    }

    public final IndexAccountSwitcherState copy(Screen.Name screenName, String activeAccountNumber, List<Account> allAccounts, boolean loading, boolean enableAccountSwitching, TradeAccountSwitcherState.LoadedState loadedState, boolean useSduiAccountSwitcher) {
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(activeAccountNumber, "activeAccountNumber");
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        return new IndexAccountSwitcherState(screenName, activeAccountNumber, allAccounts, loading, enableAccountSwitching, loadedState, useSduiAccountSwitcher);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndexAccountSwitcherState)) {
            return false;
        }
        IndexAccountSwitcherState indexAccountSwitcherState = (IndexAccountSwitcherState) other;
        return this.screenName == indexAccountSwitcherState.screenName && Intrinsics.areEqual(this.activeAccountNumber, indexAccountSwitcherState.activeAccountNumber) && Intrinsics.areEqual(this.allAccounts, indexAccountSwitcherState.allAccounts) && this.loading == indexAccountSwitcherState.loading && this.enableAccountSwitching == indexAccountSwitcherState.enableAccountSwitching && Intrinsics.areEqual(this.loadedState, indexAccountSwitcherState.loadedState) && this.useSduiAccountSwitcher == indexAccountSwitcherState.useSduiAccountSwitcher;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.screenName.hashCode() * 31) + this.activeAccountNumber.hashCode()) * 31) + this.allAccounts.hashCode()) * 31) + Boolean.hashCode(this.loading)) * 31) + Boolean.hashCode(this.enableAccountSwitching)) * 31;
        TradeAccountSwitcherState.LoadedState loadedState = this.loadedState;
        return ((iHashCode + (loadedState == null ? 0 : loadedState.hashCode())) * 31) + Boolean.hashCode(this.useSduiAccountSwitcher);
    }

    public String toString() {
        return "IndexAccountSwitcherState(screenName=" + this.screenName + ", activeAccountNumber=" + this.activeAccountNumber + ", allAccounts=" + this.allAccounts + ", loading=" + this.loading + ", enableAccountSwitching=" + this.enableAccountSwitching + ", loadedState=" + this.loadedState + ", useSduiAccountSwitcher=" + this.useSduiAccountSwitcher + ")";
    }

    public IndexAccountSwitcherState(Screen.Name screenName, String activeAccountNumber, List<Account> allAccounts, boolean z, boolean z2, TradeAccountSwitcherState.LoadedState loadedState, boolean z3) {
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(activeAccountNumber, "activeAccountNumber");
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        this.screenName = screenName;
        this.activeAccountNumber = activeAccountNumber;
        this.allAccounts = allAccounts;
        this.loading = z;
        this.enableAccountSwitching = z2;
        this.loadedState = loadedState;
        this.useSduiAccountSwitcher = z3;
        this.fallbackAccountSelectable = true;
    }

    @Override // com.robinhood.android.lib.trade.view.TradeAccountSwitcherState
    public BrokerageAccountType getActiveAccountType() {
        return TradeAccountSwitcherState.DefaultImpls.getActiveAccountType(this);
    }

    @Override // com.robinhood.android.lib.trade.view.TradeAccountSwitcherState
    public Screen.Name getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.lib.trade.view.TradeAccountSwitcherState
    public String getActiveAccountNumber() {
        return this.activeAccountNumber;
    }

    @Override // com.robinhood.android.lib.trade.view.TradeAccountSwitcherState
    public List<Account> getAllAccounts() {
        return this.allAccounts;
    }

    @Override // com.robinhood.android.lib.trade.view.TradeAccountSwitcherState
    public boolean getLoading() {
        return this.loading;
    }

    @Override // com.robinhood.android.lib.trade.view.TradeAccountSwitcherState
    public boolean getEnableAccountSwitching() {
        return this.enableAccountSwitching;
    }

    @Override // com.robinhood.android.lib.trade.view.TradeAccountSwitcherState
    public TradeAccountSwitcherState.LoadedState getLoadedState() {
        return this.loadedState;
    }

    @Override // com.robinhood.android.lib.trade.view.TradeAccountSwitcherState
    public boolean getUseSduiAccountSwitcher() {
        return this.useSduiAccountSwitcher;
    }

    @Override // com.robinhood.android.lib.trade.view.TradeAccountSwitcherState
    public boolean getFallbackAccountSelectable() {
        return this.fallbackAccountSelectable;
    }
}
