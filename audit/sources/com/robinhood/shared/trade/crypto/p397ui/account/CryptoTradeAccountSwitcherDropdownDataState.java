package com.robinhood.shared.trade.crypto.p397ui.account;

import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherAccount;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherViewModel;
import com.robinhood.models.crypto.p314db.CryptoCurrencyPairAccountSwitcher;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.crypto.utils.CryptoCurrencyPairAccountSwitchers;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoTradeAccountSwitcherDropdownDataState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J7\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006'"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownDataState;", "", "accountSwitcher", "Lcom/robinhood/models/crypto/db/CryptoCurrencyPairAccountSwitcher;", "location", "Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation$WithCurrencyPair;", "selectedRhsAccountNumber", "", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "<init>", "(Lcom/robinhood/models/crypto/db/CryptoCurrencyPairAccountSwitcher;Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation$WithCurrencyPair;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Screen;)V", "getAccountSwitcher", "()Lcom/robinhood/models/crypto/db/CryptoCurrencyPairAccountSwitcher;", "getLocation", "()Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation$WithCurrencyPair;", "getSelectedRhsAccountNumber", "()Ljava/lang/String;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "selectedAccount", "Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherAccount;", "getSelectedAccount", "()Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherAccount;", "accountSwitcherData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "getAccountSwitcherData", "()Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class CryptoTradeAccountSwitcherDropdownDataState {
    public static final int $stable = 8;
    private final CryptoCurrencyPairAccountSwitcher accountSwitcher;
    private final Screen eventScreen;
    private final CryptoAccountSwitcherLocation.WithCurrencyPair location;
    private final String selectedRhsAccountNumber;

    public static /* synthetic */ CryptoTradeAccountSwitcherDropdownDataState copy$default(CryptoTradeAccountSwitcherDropdownDataState cryptoTradeAccountSwitcherDropdownDataState, CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher, CryptoAccountSwitcherLocation.WithCurrencyPair withCurrencyPair, String str, Screen screen, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoCurrencyPairAccountSwitcher = cryptoTradeAccountSwitcherDropdownDataState.accountSwitcher;
        }
        if ((i & 2) != 0) {
            withCurrencyPair = cryptoTradeAccountSwitcherDropdownDataState.location;
        }
        if ((i & 4) != 0) {
            str = cryptoTradeAccountSwitcherDropdownDataState.selectedRhsAccountNumber;
        }
        if ((i & 8) != 0) {
            screen = cryptoTradeAccountSwitcherDropdownDataState.eventScreen;
        }
        return cryptoTradeAccountSwitcherDropdownDataState.copy(cryptoCurrencyPairAccountSwitcher, withCurrencyPair, str, screen);
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoCurrencyPairAccountSwitcher getAccountSwitcher() {
        return this.accountSwitcher;
    }

    /* renamed from: component2, reason: from getter */
    public final CryptoAccountSwitcherLocation.WithCurrencyPair getLocation() {
        return this.location;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSelectedRhsAccountNumber() {
        return this.selectedRhsAccountNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final Screen getEventScreen() {
        return this.eventScreen;
    }

    public final CryptoTradeAccountSwitcherDropdownDataState copy(CryptoCurrencyPairAccountSwitcher accountSwitcher, CryptoAccountSwitcherLocation.WithCurrencyPair location, String selectedRhsAccountNumber, Screen eventScreen) {
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        return new CryptoTradeAccountSwitcherDropdownDataState(accountSwitcher, location, selectedRhsAccountNumber, eventScreen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTradeAccountSwitcherDropdownDataState)) {
            return false;
        }
        CryptoTradeAccountSwitcherDropdownDataState cryptoTradeAccountSwitcherDropdownDataState = (CryptoTradeAccountSwitcherDropdownDataState) other;
        return Intrinsics.areEqual(this.accountSwitcher, cryptoTradeAccountSwitcherDropdownDataState.accountSwitcher) && Intrinsics.areEqual(this.location, cryptoTradeAccountSwitcherDropdownDataState.location) && Intrinsics.areEqual(this.selectedRhsAccountNumber, cryptoTradeAccountSwitcherDropdownDataState.selectedRhsAccountNumber) && Intrinsics.areEqual(this.eventScreen, cryptoTradeAccountSwitcherDropdownDataState.eventScreen);
    }

    public int hashCode() {
        CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher = this.accountSwitcher;
        int iHashCode = (cryptoCurrencyPairAccountSwitcher == null ? 0 : cryptoCurrencyPairAccountSwitcher.hashCode()) * 31;
        CryptoAccountSwitcherLocation.WithCurrencyPair withCurrencyPair = this.location;
        int iHashCode2 = (iHashCode + (withCurrencyPair == null ? 0 : withCurrencyPair.hashCode())) * 31;
        String str = this.selectedRhsAccountNumber;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.eventScreen.hashCode();
    }

    public String toString() {
        return "CryptoTradeAccountSwitcherDropdownDataState(accountSwitcher=" + this.accountSwitcher + ", location=" + this.location + ", selectedRhsAccountNumber=" + this.selectedRhsAccountNumber + ", eventScreen=" + this.eventScreen + ")";
    }

    public CryptoTradeAccountSwitcherDropdownDataState(CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher, CryptoAccountSwitcherLocation.WithCurrencyPair withCurrencyPair, String str, Screen eventScreen) {
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        this.accountSwitcher = cryptoCurrencyPairAccountSwitcher;
        this.location = withCurrencyPair;
        this.selectedRhsAccountNumber = str;
        this.eventScreen = eventScreen;
    }

    public /* synthetic */ CryptoTradeAccountSwitcherDropdownDataState(CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher, CryptoAccountSwitcherLocation.WithCurrencyPair withCurrencyPair, String str, Screen screen, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cryptoCurrencyPairAccountSwitcher, (i & 2) != 0 ? null : withCurrencyPair, (i & 4) != 0 ? null : str, screen);
    }

    public final CryptoCurrencyPairAccountSwitcher getAccountSwitcher() {
        return this.accountSwitcher;
    }

    public final CryptoAccountSwitcherLocation.WithCurrencyPair getLocation() {
        return this.location;
    }

    public final String getSelectedRhsAccountNumber() {
        return this.selectedRhsAccountNumber;
    }

    public final Screen getEventScreen() {
        return this.eventScreen;
    }

    public final CryptoAccountSwitcherAccount getSelectedAccount() {
        CryptoAccountSwitcherLocation.WithCurrencyPair withCurrencyPair;
        CryptoAccountSwitcherViewModel sellQuote;
        CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher = this.accountSwitcher;
        Object obj = null;
        if (cryptoCurrencyPairAccountSwitcher == null || (withCurrencyPair = this.location) == null || this.selectedRhsAccountNumber == null) {
            return null;
        }
        if (withCurrencyPair instanceof CryptoAccountSwitcherLocation.Buy) {
            sellQuote = cryptoCurrencyPairAccountSwitcher.getBuy();
        } else if (withCurrencyPair instanceof CryptoAccountSwitcherLocation.SellAsset) {
            sellQuote = cryptoCurrencyPairAccountSwitcher.getSellAsset();
        } else {
            if (!(withCurrencyPair instanceof CryptoAccountSwitcherLocation.SellQuote)) {
                if (withCurrencyPair instanceof CryptoAccountSwitcherLocation.Detail) {
                    throw new IllegalStateException("Unsupported location type Detail");
                }
                throw new NoWhenBranchMatchedException();
            }
            sellQuote = cryptoCurrencyPairAccountSwitcher.getSellQuote();
        }
        Iterator<T> it = sellQuote.getAccounts().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((CryptoAccountSwitcherAccount) next).getRhsAccountNumber(), this.selectedRhsAccountNumber)) {
                obj = next;
                break;
            }
        }
        return (CryptoAccountSwitcherAccount) obj;
    }

    public final AccountSwitcherData getAccountSwitcherData() {
        CryptoAccountSwitcherLocation.WithCurrencyPair withCurrencyPair;
        String str;
        CryptoCurrencyPairAccountSwitcher.Location location;
        CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher = this.accountSwitcher;
        if (cryptoCurrencyPairAccountSwitcher == null || (withCurrencyPair = this.location) == null || (str = this.selectedRhsAccountNumber) == null) {
            return null;
        }
        if (withCurrencyPair instanceof CryptoAccountSwitcherLocation.Buy) {
            location = CryptoCurrencyPairAccountSwitcher.Location.BUY;
        } else if (withCurrencyPair instanceof CryptoAccountSwitcherLocation.SellAsset) {
            location = CryptoCurrencyPairAccountSwitcher.Location.SELL_ASSET;
        } else {
            if (!(withCurrencyPair instanceof CryptoAccountSwitcherLocation.SellQuote)) {
                if (withCurrencyPair instanceof CryptoAccountSwitcherLocation.Detail) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            location = CryptoCurrencyPairAccountSwitcher.Location.SELL_QUOTE;
        }
        return CryptoCurrencyPairAccountSwitchers.toAccountSwitcherData(cryptoCurrencyPairAccountSwitcher, str, this.eventScreen, location);
    }
}
