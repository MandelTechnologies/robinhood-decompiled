package com.robinhood.android.optionschain.sbschain.appbar;

import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p355ui.UiOptionChain;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionSideBySideChainTopAppBarDataState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003JM\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/appbar/OptionSideBySideChainTopAppBarDataState;", "", "account", "Lcom/robinhood/models/db/Account;", "uiOptionChains", "", "Lcom/robinhood/models/ui/UiOptionChain;", "hasSeenOptionChainSettings", "", "hasSeenOptionChainBidAskPriceLabelSettings", "inOptionChainBidAskPriceLabelExp", "launchMode", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "<init>", "(Lcom/robinhood/models/db/Account;Ljava/util/List;ZZZLcom/robinhood/android/options/contracts/OptionChainLaunchMode;)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "getUiOptionChains", "()Ljava/util/List;", "getHasSeenOptionChainSettings", "()Z", "getHasSeenOptionChainBidAskPriceLabelSettings", "getInOptionChainBidAskPriceLabelExp", "getLaunchMode", "()Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionSideBySideChainTopAppBarDataState {
    public static final int $stable = 8;
    private final Account account;
    private final boolean hasSeenOptionChainBidAskPriceLabelSettings;
    private final boolean hasSeenOptionChainSettings;
    private final boolean inOptionChainBidAskPriceLabelExp;
    private final OptionChainLaunchMode launchMode;
    private final List<UiOptionChain> uiOptionChains;

    public static /* synthetic */ OptionSideBySideChainTopAppBarDataState copy$default(OptionSideBySideChainTopAppBarDataState optionSideBySideChainTopAppBarDataState, Account account, List list, boolean z, boolean z2, boolean z3, OptionChainLaunchMode optionChainLaunchMode, int i, Object obj) {
        if ((i & 1) != 0) {
            account = optionSideBySideChainTopAppBarDataState.account;
        }
        if ((i & 2) != 0) {
            list = optionSideBySideChainTopAppBarDataState.uiOptionChains;
        }
        if ((i & 4) != 0) {
            z = optionSideBySideChainTopAppBarDataState.hasSeenOptionChainSettings;
        }
        if ((i & 8) != 0) {
            z2 = optionSideBySideChainTopAppBarDataState.hasSeenOptionChainBidAskPriceLabelSettings;
        }
        if ((i & 16) != 0) {
            z3 = optionSideBySideChainTopAppBarDataState.inOptionChainBidAskPriceLabelExp;
        }
        if ((i & 32) != 0) {
            optionChainLaunchMode = optionSideBySideChainTopAppBarDataState.launchMode;
        }
        boolean z4 = z3;
        OptionChainLaunchMode optionChainLaunchMode2 = optionChainLaunchMode;
        return optionSideBySideChainTopAppBarDataState.copy(account, list, z, z2, z4, optionChainLaunchMode2);
    }

    /* renamed from: component1, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    public final List<UiOptionChain> component2() {
        return this.uiOptionChains;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasSeenOptionChainSettings() {
        return this.hasSeenOptionChainSettings;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHasSeenOptionChainBidAskPriceLabelSettings() {
        return this.hasSeenOptionChainBidAskPriceLabelSettings;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getInOptionChainBidAskPriceLabelExp() {
        return this.inOptionChainBidAskPriceLabelExp;
    }

    /* renamed from: component6, reason: from getter */
    public final OptionChainLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final OptionSideBySideChainTopAppBarDataState copy(Account account, List<UiOptionChain> uiOptionChains, boolean hasSeenOptionChainSettings, boolean hasSeenOptionChainBidAskPriceLabelSettings, boolean inOptionChainBidAskPriceLabelExp, OptionChainLaunchMode launchMode) {
        Intrinsics.checkNotNullParameter(uiOptionChains, "uiOptionChains");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        return new OptionSideBySideChainTopAppBarDataState(account, uiOptionChains, hasSeenOptionChainSettings, hasSeenOptionChainBidAskPriceLabelSettings, inOptionChainBidAskPriceLabelExp, launchMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionSideBySideChainTopAppBarDataState)) {
            return false;
        }
        OptionSideBySideChainTopAppBarDataState optionSideBySideChainTopAppBarDataState = (OptionSideBySideChainTopAppBarDataState) other;
        return Intrinsics.areEqual(this.account, optionSideBySideChainTopAppBarDataState.account) && Intrinsics.areEqual(this.uiOptionChains, optionSideBySideChainTopAppBarDataState.uiOptionChains) && this.hasSeenOptionChainSettings == optionSideBySideChainTopAppBarDataState.hasSeenOptionChainSettings && this.hasSeenOptionChainBidAskPriceLabelSettings == optionSideBySideChainTopAppBarDataState.hasSeenOptionChainBidAskPriceLabelSettings && this.inOptionChainBidAskPriceLabelExp == optionSideBySideChainTopAppBarDataState.inOptionChainBidAskPriceLabelExp && Intrinsics.areEqual(this.launchMode, optionSideBySideChainTopAppBarDataState.launchMode);
    }

    public int hashCode() {
        Account account = this.account;
        return ((((((((((account == null ? 0 : account.hashCode()) * 31) + this.uiOptionChains.hashCode()) * 31) + Boolean.hashCode(this.hasSeenOptionChainSettings)) * 31) + Boolean.hashCode(this.hasSeenOptionChainBidAskPriceLabelSettings)) * 31) + Boolean.hashCode(this.inOptionChainBidAskPriceLabelExp)) * 31) + this.launchMode.hashCode();
    }

    public String toString() {
        return "OptionSideBySideChainTopAppBarDataState(account=" + this.account + ", uiOptionChains=" + this.uiOptionChains + ", hasSeenOptionChainSettings=" + this.hasSeenOptionChainSettings + ", hasSeenOptionChainBidAskPriceLabelSettings=" + this.hasSeenOptionChainBidAskPriceLabelSettings + ", inOptionChainBidAskPriceLabelExp=" + this.inOptionChainBidAskPriceLabelExp + ", launchMode=" + this.launchMode + ")";
    }

    public OptionSideBySideChainTopAppBarDataState(Account account, List<UiOptionChain> uiOptionChains, boolean z, boolean z2, boolean z3, OptionChainLaunchMode launchMode) {
        Intrinsics.checkNotNullParameter(uiOptionChains, "uiOptionChains");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        this.account = account;
        this.uiOptionChains = uiOptionChains;
        this.hasSeenOptionChainSettings = z;
        this.hasSeenOptionChainBidAskPriceLabelSettings = z2;
        this.inOptionChainBidAskPriceLabelExp = z3;
        this.launchMode = launchMode;
    }

    public /* synthetic */ OptionSideBySideChainTopAppBarDataState(Account account, List list, boolean z, boolean z2, boolean z3, OptionChainLaunchMode optionChainLaunchMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : account, list, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? false : z3, optionChainLaunchMode);
    }

    public final Account getAccount() {
        return this.account;
    }

    public final List<UiOptionChain> getUiOptionChains() {
        return this.uiOptionChains;
    }

    public final boolean getHasSeenOptionChainSettings() {
        return this.hasSeenOptionChainSettings;
    }

    public final boolean getHasSeenOptionChainBidAskPriceLabelSettings() {
        return this.hasSeenOptionChainBidAskPriceLabelSettings;
    }

    public final boolean getInOptionChainBidAskPriceLabelExp() {
        return this.inOptionChainBidAskPriceLabelExp;
    }

    public final OptionChainLaunchMode getLaunchMode() {
        return this.launchMode;
    }
}
