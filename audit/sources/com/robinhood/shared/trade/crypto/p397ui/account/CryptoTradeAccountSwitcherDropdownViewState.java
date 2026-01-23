package com.robinhood.shared.trade.crypto.p397ui.account;

import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherAccount;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTradeAccountSwitcherDropdownViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownViewState;", "", "selectedAccount", "Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherAccount;", "accountSwitcherData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "location", "Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation$WithCurrencyPair;", "<init>", "(Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherAccount;Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation$WithCurrencyPair;)V", "getSelectedAccount", "()Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherAccount;", "getAccountSwitcherData", "()Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "getLocation", "()Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation$WithCurrencyPair;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoTradeAccountSwitcherDropdownViewState {
    public static final int $stable = 8;
    private final AccountSwitcherData accountSwitcherData;
    private final CryptoAccountSwitcherLocation.WithCurrencyPair location;
    private final CryptoAccountSwitcherAccount selectedAccount;

    public static /* synthetic */ CryptoTradeAccountSwitcherDropdownViewState copy$default(CryptoTradeAccountSwitcherDropdownViewState cryptoTradeAccountSwitcherDropdownViewState, CryptoAccountSwitcherAccount cryptoAccountSwitcherAccount, AccountSwitcherData accountSwitcherData, CryptoAccountSwitcherLocation.WithCurrencyPair withCurrencyPair, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoAccountSwitcherAccount = cryptoTradeAccountSwitcherDropdownViewState.selectedAccount;
        }
        if ((i & 2) != 0) {
            accountSwitcherData = cryptoTradeAccountSwitcherDropdownViewState.accountSwitcherData;
        }
        if ((i & 4) != 0) {
            withCurrencyPair = cryptoTradeAccountSwitcherDropdownViewState.location;
        }
        return cryptoTradeAccountSwitcherDropdownViewState.copy(cryptoAccountSwitcherAccount, accountSwitcherData, withCurrencyPair);
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoAccountSwitcherAccount getSelectedAccount() {
        return this.selectedAccount;
    }

    /* renamed from: component2, reason: from getter */
    public final AccountSwitcherData getAccountSwitcherData() {
        return this.accountSwitcherData;
    }

    /* renamed from: component3, reason: from getter */
    public final CryptoAccountSwitcherLocation.WithCurrencyPair getLocation() {
        return this.location;
    }

    public final CryptoTradeAccountSwitcherDropdownViewState copy(CryptoAccountSwitcherAccount selectedAccount, AccountSwitcherData accountSwitcherData, CryptoAccountSwitcherLocation.WithCurrencyPair location) {
        return new CryptoTradeAccountSwitcherDropdownViewState(selectedAccount, accountSwitcherData, location);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTradeAccountSwitcherDropdownViewState)) {
            return false;
        }
        CryptoTradeAccountSwitcherDropdownViewState cryptoTradeAccountSwitcherDropdownViewState = (CryptoTradeAccountSwitcherDropdownViewState) other;
        return Intrinsics.areEqual(this.selectedAccount, cryptoTradeAccountSwitcherDropdownViewState.selectedAccount) && Intrinsics.areEqual(this.accountSwitcherData, cryptoTradeAccountSwitcherDropdownViewState.accountSwitcherData) && Intrinsics.areEqual(this.location, cryptoTradeAccountSwitcherDropdownViewState.location);
    }

    public int hashCode() {
        CryptoAccountSwitcherAccount cryptoAccountSwitcherAccount = this.selectedAccount;
        int iHashCode = (cryptoAccountSwitcherAccount == null ? 0 : cryptoAccountSwitcherAccount.hashCode()) * 31;
        AccountSwitcherData accountSwitcherData = this.accountSwitcherData;
        int iHashCode2 = (iHashCode + (accountSwitcherData == null ? 0 : accountSwitcherData.hashCode())) * 31;
        CryptoAccountSwitcherLocation.WithCurrencyPair withCurrencyPair = this.location;
        return iHashCode2 + (withCurrencyPair != null ? withCurrencyPair.hashCode() : 0);
    }

    public String toString() {
        return "CryptoTradeAccountSwitcherDropdownViewState(selectedAccount=" + this.selectedAccount + ", accountSwitcherData=" + this.accountSwitcherData + ", location=" + this.location + ")";
    }

    public CryptoTradeAccountSwitcherDropdownViewState(CryptoAccountSwitcherAccount cryptoAccountSwitcherAccount, AccountSwitcherData accountSwitcherData, CryptoAccountSwitcherLocation.WithCurrencyPair withCurrencyPair) {
        this.selectedAccount = cryptoAccountSwitcherAccount;
        this.accountSwitcherData = accountSwitcherData;
        this.location = withCurrencyPair;
    }

    public /* synthetic */ CryptoTradeAccountSwitcherDropdownViewState(CryptoAccountSwitcherAccount cryptoAccountSwitcherAccount, AccountSwitcherData accountSwitcherData, CryptoAccountSwitcherLocation.WithCurrencyPair withCurrencyPair, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cryptoAccountSwitcherAccount, accountSwitcherData, (i & 4) != 0 ? null : withCurrencyPair);
    }

    public final CryptoAccountSwitcherAccount getSelectedAccount() {
        return this.selectedAccount;
    }

    public final AccountSwitcherData getAccountSwitcherData() {
        return this.accountSwitcherData;
    }

    public final CryptoAccountSwitcherLocation.WithCurrencyPair getLocation() {
        return this.location;
    }
}
