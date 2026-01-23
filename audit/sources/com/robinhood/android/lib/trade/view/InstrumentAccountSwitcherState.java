package com.robinhood.android.lib.trade.view;

import com.robinhood.android.lib.trade.view.TradeAccountSwitcherState;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.instrument.InstrumentAccountSwitcherType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentAccountSwitcher;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InstrumentAccountSwitcherState.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u000eHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003Ja\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u00100\u001a\u00020\u00052\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0016R\u0016\u0010#\u001a\u0004\u0018\u00010$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;", "Lcom/robinhood/android/lib/trade/view/TradeAccountSwitcherState;", "screenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "loading", "", "activeAccountNumber", "", "allAccounts", "", "Lcom/robinhood/models/db/Account;", "enableAccountSwitching", "useSduiAccountSwitcher", "type", "Lcom/robinhood/models/api/bonfire/instrument/InstrumentAccountSwitcherType;", "viewModel", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher$ViewModel;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Screen$Name;ZLjava/lang/String;Ljava/util/List;ZZLcom/robinhood/models/api/bonfire/instrument/InstrumentAccountSwitcherType;Lcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher$ViewModel;)V", "getScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getLoading", "()Z", "getActiveAccountNumber", "()Ljava/lang/String;", "getAllAccounts", "()Ljava/util/List;", "getEnableAccountSwitching", "getUseSduiAccountSwitcher", "getType", "()Lcom/robinhood/models/api/bonfire/instrument/InstrumentAccountSwitcherType;", "getViewModel", "()Lcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher$ViewModel;", "fallbackAccountSelectable", "getFallbackAccountSelectable", "loadedState", "Lcom/robinhood/android/lib/trade/view/TradeAccountSwitcherState$LoadedState;", "getLoadedState", "()Lcom/robinhood/android/lib/trade/view/TradeAccountSwitcherState$LoadedState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class InstrumentAccountSwitcherState implements TradeAccountSwitcherState {
    public static final int $stable = 8;
    private final String activeAccountNumber;
    private final List<Account> allAccounts;
    private final boolean enableAccountSwitching;
    private final boolean loading;
    private final Screen.Name screenName;
    private final InstrumentAccountSwitcherType type;
    private final boolean useSduiAccountSwitcher;
    private final InstrumentAccountSwitcher.ViewModel viewModel;

    /* compiled from: InstrumentAccountSwitcherState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InstrumentAccountSwitcherType.values().length];
            try {
                iArr[InstrumentAccountSwitcherType.TRADE_BAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InstrumentAccountSwitcherType.BUY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InstrumentAccountSwitcherType.SELL_DOLLARS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InstrumentAccountSwitcherType.SELL_UNITS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InstrumentAccountSwitcherType.ACCOUNTS_ONLY_SELL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InstrumentAccountSwitcherType.BUY_TO_CLOSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InstrumentAccountSwitcherType.SELL_TO_OPEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ InstrumentAccountSwitcherState copy$default(InstrumentAccountSwitcherState instrumentAccountSwitcherState, Screen.Name name, boolean z, String str, List list, boolean z2, boolean z3, InstrumentAccountSwitcherType instrumentAccountSwitcherType, InstrumentAccountSwitcher.ViewModel viewModel, int i, Object obj) {
        if ((i & 1) != 0) {
            name = instrumentAccountSwitcherState.screenName;
        }
        if ((i & 2) != 0) {
            z = instrumentAccountSwitcherState.loading;
        }
        if ((i & 4) != 0) {
            str = instrumentAccountSwitcherState.activeAccountNumber;
        }
        if ((i & 8) != 0) {
            list = instrumentAccountSwitcherState.allAccounts;
        }
        if ((i & 16) != 0) {
            z2 = instrumentAccountSwitcherState.enableAccountSwitching;
        }
        if ((i & 32) != 0) {
            z3 = instrumentAccountSwitcherState.useSduiAccountSwitcher;
        }
        if ((i & 64) != 0) {
            instrumentAccountSwitcherType = instrumentAccountSwitcherState.type;
        }
        if ((i & 128) != 0) {
            viewModel = instrumentAccountSwitcherState.viewModel;
        }
        InstrumentAccountSwitcherType instrumentAccountSwitcherType2 = instrumentAccountSwitcherType;
        InstrumentAccountSwitcher.ViewModel viewModel2 = viewModel;
        boolean z4 = z2;
        boolean z5 = z3;
        return instrumentAccountSwitcherState.copy(name, z, str, list, z4, z5, instrumentAccountSwitcherType2, viewModel2);
    }

    /* renamed from: component1, reason: from getter */
    public final Screen.Name getScreenName() {
        return this.screenName;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component3, reason: from getter */
    public final String getActiveAccountNumber() {
        return this.activeAccountNumber;
    }

    public final List<Account> component4() {
        return this.allAccounts;
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
    public final InstrumentAccountSwitcherType getType() {
        return this.type;
    }

    /* renamed from: component8, reason: from getter */
    public final InstrumentAccountSwitcher.ViewModel getViewModel() {
        return this.viewModel;
    }

    public final InstrumentAccountSwitcherState copy(Screen.Name screenName, boolean loading, String activeAccountNumber, List<Account> allAccounts, boolean enableAccountSwitching, boolean useSduiAccountSwitcher, InstrumentAccountSwitcherType type2, InstrumentAccountSwitcher.ViewModel viewModel) {
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(activeAccountNumber, "activeAccountNumber");
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        Intrinsics.checkNotNullParameter(type2, "type");
        return new InstrumentAccountSwitcherState(screenName, loading, activeAccountNumber, allAccounts, enableAccountSwitching, useSduiAccountSwitcher, type2, viewModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstrumentAccountSwitcherState)) {
            return false;
        }
        InstrumentAccountSwitcherState instrumentAccountSwitcherState = (InstrumentAccountSwitcherState) other;
        return this.screenName == instrumentAccountSwitcherState.screenName && this.loading == instrumentAccountSwitcherState.loading && Intrinsics.areEqual(this.activeAccountNumber, instrumentAccountSwitcherState.activeAccountNumber) && Intrinsics.areEqual(this.allAccounts, instrumentAccountSwitcherState.allAccounts) && this.enableAccountSwitching == instrumentAccountSwitcherState.enableAccountSwitching && this.useSduiAccountSwitcher == instrumentAccountSwitcherState.useSduiAccountSwitcher && this.type == instrumentAccountSwitcherState.type && Intrinsics.areEqual(this.viewModel, instrumentAccountSwitcherState.viewModel);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.screenName.hashCode() * 31) + Boolean.hashCode(this.loading)) * 31) + this.activeAccountNumber.hashCode()) * 31) + this.allAccounts.hashCode()) * 31) + Boolean.hashCode(this.enableAccountSwitching)) * 31) + Boolean.hashCode(this.useSduiAccountSwitcher)) * 31) + this.type.hashCode()) * 31;
        InstrumentAccountSwitcher.ViewModel viewModel = this.viewModel;
        return iHashCode + (viewModel == null ? 0 : viewModel.hashCode());
    }

    public String toString() {
        return "InstrumentAccountSwitcherState(screenName=" + this.screenName + ", loading=" + this.loading + ", activeAccountNumber=" + this.activeAccountNumber + ", allAccounts=" + this.allAccounts + ", enableAccountSwitching=" + this.enableAccountSwitching + ", useSduiAccountSwitcher=" + this.useSduiAccountSwitcher + ", type=" + this.type + ", viewModel=" + this.viewModel + ")";
    }

    public InstrumentAccountSwitcherState(Screen.Name screenName, boolean z, String activeAccountNumber, List<Account> allAccounts, boolean z2, boolean z3, InstrumentAccountSwitcherType type2, InstrumentAccountSwitcher.ViewModel viewModel) {
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(activeAccountNumber, "activeAccountNumber");
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        Intrinsics.checkNotNullParameter(type2, "type");
        this.screenName = screenName;
        this.loading = z;
        this.activeAccountNumber = activeAccountNumber;
        this.allAccounts = allAccounts;
        this.enableAccountSwitching = z2;
        this.useSduiAccountSwitcher = z3;
        this.type = type2;
        this.viewModel = viewModel;
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
    public boolean getLoading() {
        return this.loading;
    }

    @Override // com.robinhood.android.lib.trade.view.TradeAccountSwitcherState
    public String getActiveAccountNumber() {
        return this.activeAccountNumber;
    }

    public /* synthetic */ InstrumentAccountSwitcherState(Screen.Name name, boolean z, String str, List list, boolean z2, boolean z3, InstrumentAccountSwitcherType instrumentAccountSwitcherType, InstrumentAccountSwitcher.ViewModel viewModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(name, (i & 2) != 0 ? false : z, str, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? false : z3, instrumentAccountSwitcherType, (i & 128) != 0 ? null : viewModel);
    }

    @Override // com.robinhood.android.lib.trade.view.TradeAccountSwitcherState
    public List<Account> getAllAccounts() {
        return this.allAccounts;
    }

    @Override // com.robinhood.android.lib.trade.view.TradeAccountSwitcherState
    public boolean getEnableAccountSwitching() {
        return this.enableAccountSwitching;
    }

    @Override // com.robinhood.android.lib.trade.view.TradeAccountSwitcherState
    public boolean getUseSduiAccountSwitcher() {
        return this.useSduiAccountSwitcher;
    }

    public final InstrumentAccountSwitcherType getType() {
        return this.type;
    }

    public final InstrumentAccountSwitcher.ViewModel getViewModel() {
        return this.viewModel;
    }

    @Override // com.robinhood.android.lib.trade.view.TradeAccountSwitcherState
    public boolean getFallbackAccountSelectable() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()]) {
            case 1:
            case 2:
                return true;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.robinhood.android.lib.trade.view.TradeAccountSwitcherState
    public TradeAccountSwitcherState.LoadedState getLoadedState() {
        Object next;
        InstrumentAccountSwitcher.ViewModel viewModel = this.viewModel;
        if (viewModel == null) {
            return null;
        }
        Iterator<T> it = viewModel.getAccounts().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((InstrumentAccountSwitcher.Account) next).getAccountNumber(), getActiveAccountNumber())) {
                break;
            }
        }
        InstrumentAccountSwitcher.Account account = (InstrumentAccountSwitcher.Account) next;
        if (account == null) {
            return null;
        }
        return new TradeAccountSwitcherState.LoadedState(account.getEntryTitle(), account.getIcon(), AccountSwitcherExtensions.toAccountSwitcherData(this.viewModel, getActiveAccountNumber(), new Screen(getScreenName(), null, null, null, 14, null)), AccountSwitcherExtensions.toAccountSwitcherSurface(this.viewModel, getActiveAccountNumber()));
    }
}
