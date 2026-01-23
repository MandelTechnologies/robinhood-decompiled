package com.robinhood.shared.crypto.utils;

import com.robinhood.models.crypto.p314db.CryptoNonCurrencyPairAccountSwitcher;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoNonCurrencyPairAccountSwitchers.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m3636d2 = {"toAccountSwitcherData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "Lcom/robinhood/models/crypto/db/CryptoNonCurrencyPairAccountSwitcher;", "activeAccountNumber", "", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "location", "Lcom/robinhood/models/crypto/db/CryptoNonCurrencyPairAccountSwitcher$Location;", "lib-utils_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.utils.CryptoNonCurrencyPairAccountSwitchersKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoNonCurrencyPairAccountSwitchers {

    /* compiled from: CryptoNonCurrencyPairAccountSwitchers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.utils.CryptoNonCurrencyPairAccountSwitchersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoNonCurrencyPairAccountSwitcher.Location.values().length];
            try {
                iArr[CryptoNonCurrencyPairAccountSwitcher.Location.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final AccountSwitcherData toAccountSwitcherData(CryptoNonCurrencyPairAccountSwitcher cryptoNonCurrencyPairAccountSwitcher, String activeAccountNumber, Screen eventScreen, CryptoNonCurrencyPairAccountSwitcher.Location location) {
        Intrinsics.checkNotNullParameter(cryptoNonCurrencyPairAccountSwitcher, "<this>");
        Intrinsics.checkNotNullParameter(activeAccountNumber, "activeAccountNumber");
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        Intrinsics.checkNotNullParameter(location, "location");
        if (WhenMappings.$EnumSwitchMapping$0[location.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        return CryptoAccountSwitcherViewModels.toAccountSwitcherData(cryptoNonCurrencyPairAccountSwitcher.getHome(), activeAccountNumber, eventScreen);
    }
}
