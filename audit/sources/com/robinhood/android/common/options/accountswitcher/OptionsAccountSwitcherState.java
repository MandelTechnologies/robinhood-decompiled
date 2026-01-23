package com.robinhood.android.common.options.accountswitcher;

import com.robinhood.android.lib.trade.view.TradeAccountSwitcherState;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.accountswitcher.ApiOptionsAccountSwitcherModel;
import com.robinhood.models.api.accountswitcher.OptionsAccountSwitcherType;
import com.robinhood.models.api.bonfire.instrument.ApiInstrumentAccountSwitcherV2;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.accountswitcher.OptionsAccountSwitcher;
import com.robinhood.models.p320db.accountswitcher.OptionsAccountSwitcher2;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsAccountSwitcherState.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\u000eHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003Ja\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u00100\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0014\u0010\f\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0016\u0010#\u001a\u0004\u0018\u00010$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/common/options/accountswitcher/OptionsAccountSwitcherState;", "Lcom/robinhood/android/lib/trade/view/TradeAccountSwitcherState;", "screenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "activeAccountNumber", "", "allAccounts", "", "Lcom/robinhood/models/db/Account;", "loading", "", "enableAccountSwitching", "useSduiAccountSwitcher", "type", "Lcom/robinhood/models/api/accountswitcher/OptionsAccountSwitcherType;", "switcher", "Lcom/robinhood/models/db/accountswitcher/OptionsAccountSwitcher;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Screen$Name;Ljava/lang/String;Ljava/util/List;ZZZLcom/robinhood/models/api/accountswitcher/OptionsAccountSwitcherType;Lcom/robinhood/models/db/accountswitcher/OptionsAccountSwitcher;)V", "getScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getActiveAccountNumber", "()Ljava/lang/String;", "getAllAccounts", "()Ljava/util/List;", "getLoading", "()Z", "getEnableAccountSwitching", "getUseSduiAccountSwitcher", "getType", "()Lcom/robinhood/models/api/accountswitcher/OptionsAccountSwitcherType;", "getSwitcher", "()Lcom/robinhood/models/db/accountswitcher/OptionsAccountSwitcher;", "fallbackAccountSelectable", "getFallbackAccountSelectable", "loadedState", "Lcom/robinhood/android/lib/trade/view/TradeAccountSwitcherState$LoadedState;", "getLoadedState", "()Lcom/robinhood/android/lib/trade/view/TradeAccountSwitcherState$LoadedState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class OptionsAccountSwitcherState implements TradeAccountSwitcherState {
    public static final int $stable = 8;
    private final String activeAccountNumber;
    private final List<Account> allAccounts;
    private final boolean enableAccountSwitching;
    private final boolean fallbackAccountSelectable;
    private final boolean loading;
    private final Screen.Name screenName;
    private final OptionsAccountSwitcher switcher;
    private final OptionsAccountSwitcherType type;
    private final boolean useSduiAccountSwitcher;

    public static /* synthetic */ OptionsAccountSwitcherState copy$default(OptionsAccountSwitcherState optionsAccountSwitcherState, Screen.Name name, String str, List list, boolean z, boolean z2, boolean z3, OptionsAccountSwitcherType optionsAccountSwitcherType, OptionsAccountSwitcher optionsAccountSwitcher, int i, Object obj) {
        if ((i & 1) != 0) {
            name = optionsAccountSwitcherState.screenName;
        }
        if ((i & 2) != 0) {
            str = optionsAccountSwitcherState.activeAccountNumber;
        }
        if ((i & 4) != 0) {
            list = optionsAccountSwitcherState.allAccounts;
        }
        if ((i & 8) != 0) {
            z = optionsAccountSwitcherState.loading;
        }
        if ((i & 16) != 0) {
            z2 = optionsAccountSwitcherState.enableAccountSwitching;
        }
        if ((i & 32) != 0) {
            z3 = optionsAccountSwitcherState.useSduiAccountSwitcher;
        }
        if ((i & 64) != 0) {
            optionsAccountSwitcherType = optionsAccountSwitcherState.type;
        }
        if ((i & 128) != 0) {
            optionsAccountSwitcher = optionsAccountSwitcherState.switcher;
        }
        OptionsAccountSwitcherType optionsAccountSwitcherType2 = optionsAccountSwitcherType;
        OptionsAccountSwitcher optionsAccountSwitcher2 = optionsAccountSwitcher;
        boolean z4 = z2;
        boolean z5 = z3;
        return optionsAccountSwitcherState.copy(name, str, list, z, z4, z5, optionsAccountSwitcherType2, optionsAccountSwitcher2);
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
    public final boolean getUseSduiAccountSwitcher() {
        return this.useSduiAccountSwitcher;
    }

    /* renamed from: component7, reason: from getter */
    public final OptionsAccountSwitcherType getType() {
        return this.type;
    }

    /* renamed from: component8, reason: from getter */
    public final OptionsAccountSwitcher getSwitcher() {
        return this.switcher;
    }

    public final OptionsAccountSwitcherState copy(Screen.Name screenName, String activeAccountNumber, List<Account> allAccounts, boolean loading, boolean enableAccountSwitching, boolean useSduiAccountSwitcher, OptionsAccountSwitcherType type2, OptionsAccountSwitcher switcher) {
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(activeAccountNumber, "activeAccountNumber");
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        Intrinsics.checkNotNullParameter(type2, "type");
        return new OptionsAccountSwitcherState(screenName, activeAccountNumber, allAccounts, loading, enableAccountSwitching, useSduiAccountSwitcher, type2, switcher);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsAccountSwitcherState)) {
            return false;
        }
        OptionsAccountSwitcherState optionsAccountSwitcherState = (OptionsAccountSwitcherState) other;
        return this.screenName == optionsAccountSwitcherState.screenName && Intrinsics.areEqual(this.activeAccountNumber, optionsAccountSwitcherState.activeAccountNumber) && Intrinsics.areEqual(this.allAccounts, optionsAccountSwitcherState.allAccounts) && this.loading == optionsAccountSwitcherState.loading && this.enableAccountSwitching == optionsAccountSwitcherState.enableAccountSwitching && this.useSduiAccountSwitcher == optionsAccountSwitcherState.useSduiAccountSwitcher && this.type == optionsAccountSwitcherState.type && Intrinsics.areEqual(this.switcher, optionsAccountSwitcherState.switcher);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.screenName.hashCode() * 31) + this.activeAccountNumber.hashCode()) * 31) + this.allAccounts.hashCode()) * 31) + Boolean.hashCode(this.loading)) * 31) + Boolean.hashCode(this.enableAccountSwitching)) * 31) + Boolean.hashCode(this.useSduiAccountSwitcher)) * 31) + this.type.hashCode()) * 31;
        OptionsAccountSwitcher optionsAccountSwitcher = this.switcher;
        return iHashCode + (optionsAccountSwitcher == null ? 0 : optionsAccountSwitcher.hashCode());
    }

    public String toString() {
        return "OptionsAccountSwitcherState(screenName=" + this.screenName + ", activeAccountNumber=" + this.activeAccountNumber + ", allAccounts=" + this.allAccounts + ", loading=" + this.loading + ", enableAccountSwitching=" + this.enableAccountSwitching + ", useSduiAccountSwitcher=" + this.useSduiAccountSwitcher + ", type=" + this.type + ", switcher=" + this.switcher + ")";
    }

    public OptionsAccountSwitcherState(Screen.Name screenName, String activeAccountNumber, List<Account> allAccounts, boolean z, boolean z2, boolean z3, OptionsAccountSwitcherType type2, OptionsAccountSwitcher optionsAccountSwitcher) {
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(activeAccountNumber, "activeAccountNumber");
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        Intrinsics.checkNotNullParameter(type2, "type");
        this.screenName = screenName;
        this.activeAccountNumber = activeAccountNumber;
        this.allAccounts = allAccounts;
        this.loading = z;
        this.enableAccountSwitching = z2;
        this.useSduiAccountSwitcher = z3;
        this.type = type2;
        this.switcher = optionsAccountSwitcher;
        this.fallbackAccountSelectable = true;
    }

    public /* synthetic */ OptionsAccountSwitcherState(Screen.Name name, String str, List list, boolean z, boolean z2, boolean z3, OptionsAccountSwitcherType optionsAccountSwitcherType, OptionsAccountSwitcher optionsAccountSwitcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(name, str, list, z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? false : z3, optionsAccountSwitcherType, optionsAccountSwitcher);
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
    public boolean getUseSduiAccountSwitcher() {
        return this.useSduiAccountSwitcher;
    }

    public final OptionsAccountSwitcherType getType() {
        return this.type;
    }

    public final OptionsAccountSwitcher getSwitcher() {
        return this.switcher;
    }

    @Override // com.robinhood.android.lib.trade.view.TradeAccountSwitcherState
    public boolean getFallbackAccountSelectable() {
        return this.fallbackAccountSelectable;
    }

    @Override // com.robinhood.android.lib.trade.view.TradeAccountSwitcherState
    public TradeAccountSwitcherState.LoadedState getLoadedState() {
        ApiOptionsAccountSwitcherModel viewModel;
        Object next;
        OptionsAccountSwitcher optionsAccountSwitcher = this.switcher;
        if (optionsAccountSwitcher == null || (viewModel = OptionsAccountSwitcher2.getViewModel(optionsAccountSwitcher, this.type)) == null) {
            return null;
        }
        Iterator<T> it = viewModel.getAccounts().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((ApiInstrumentAccountSwitcherV2.Account) next).getAccount_number(), getActiveAccountNumber())) {
                break;
            }
        }
        ApiInstrumentAccountSwitcherV2.Account account = (ApiInstrumentAccountSwitcherV2.Account) next;
        if (account == null) {
            return null;
        }
        return new TradeAccountSwitcherState.LoadedState(account.getEntry_title(), account.getIcon(), AccountSwitchers.toAccountSwitcherData(viewModel, getActiveAccountNumber(), new Screen(getScreenName(), null, null, null, 14, null)), AccountSwitchers.toAccountSwitcherSurface(viewModel, getActiveAccountNumber()));
    }
}
