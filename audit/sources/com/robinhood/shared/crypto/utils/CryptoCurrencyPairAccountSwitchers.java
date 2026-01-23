package com.robinhood.shared.crypto.utils;

import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherViewModel;
import com.robinhood.models.crypto.p314db.CryptoCurrencyPairAccountSwitcher;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoCurrencyPairAccountSwitchers.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m3636d2 = {"toAccountSwitcherData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "Lcom/robinhood/models/crypto/db/CryptoCurrencyPairAccountSwitcher;", "activeAccountNumber", "", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "location", "Lcom/robinhood/models/crypto/db/CryptoCurrencyPairAccountSwitcher$Location;", "lib-utils_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.utils.CryptoCurrencyPairAccountSwitchersKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoCurrencyPairAccountSwitchers {

    /* compiled from: CryptoCurrencyPairAccountSwitchers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.utils.CryptoCurrencyPairAccountSwitchersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoCurrencyPairAccountSwitcher.Location.values().length];
            try {
                iArr[CryptoCurrencyPairAccountSwitcher.Location.TRADE_BAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoCurrencyPairAccountSwitcher.Location.BUY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoCurrencyPairAccountSwitcher.Location.SELL_QUOTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CryptoCurrencyPairAccountSwitcher.Location.SELL_ASSET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final AccountSwitcherData toAccountSwitcherData(CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher, String activeAccountNumber, Screen eventScreen, CryptoCurrencyPairAccountSwitcher.Location location) {
        CryptoAccountSwitcherViewModel tradeBar;
        Intrinsics.checkNotNullParameter(cryptoCurrencyPairAccountSwitcher, "<this>");
        Intrinsics.checkNotNullParameter(activeAccountNumber, "activeAccountNumber");
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        Intrinsics.checkNotNullParameter(location, "location");
        int i = WhenMappings.$EnumSwitchMapping$0[location.ordinal()];
        if (i == 1) {
            tradeBar = cryptoCurrencyPairAccountSwitcher.getTradeBar();
        } else if (i == 2) {
            tradeBar = cryptoCurrencyPairAccountSwitcher.getBuy();
        } else if (i == 3) {
            tradeBar = cryptoCurrencyPairAccountSwitcher.getSellQuote();
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            tradeBar = cryptoCurrencyPairAccountSwitcher.getSellAsset();
        }
        return CryptoAccountSwitcherViewModels.toAccountSwitcherData(tradeBar, activeAccountNumber, eventScreen);
    }
}
