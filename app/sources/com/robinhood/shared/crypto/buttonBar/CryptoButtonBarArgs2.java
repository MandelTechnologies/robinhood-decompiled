package com.robinhood.shared.crypto.buttonBar;

import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.shared.crypto.buttonBar.CryptoButtonBarArgs;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoButtonBarArgs.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"location", "Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation;", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarArgs;", "getLocation", "(Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarArgs;)Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation;", "lib-crypto-button-bar_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarArgsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoButtonBarArgs2 {
    public static final CryptoAccountSwitcherLocation getLocation(CryptoButtonBarArgs cryptoButtonBarArgs) {
        Intrinsics.checkNotNullParameter(cryptoButtonBarArgs, "<this>");
        if (cryptoButtonBarArgs instanceof CryptoButtonBarArgs.Home) {
            return CryptoAccountSwitcherLocation.Home.INSTANCE;
        }
        if (cryptoButtonBarArgs instanceof CryptoButtonBarArgs.Crypto) {
            return new CryptoAccountSwitcherLocation.Detail(((CryptoButtonBarArgs.Crypto) cryptoButtonBarArgs).getCurrencyPairId());
        }
        if (cryptoButtonBarArgs instanceof CryptoButtonBarArgs.Perpetuals) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
