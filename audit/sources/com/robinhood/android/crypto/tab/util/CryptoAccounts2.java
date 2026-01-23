package com.robinhood.android.crypto.tab.util;

import com.robinhood.models.crypto.p314db.CryptoAccount;
import kotlin.Metadata;

/* compiled from: CryptoAccounts.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, m3636d2 = {"getAccountState", "Lcom/robinhood/android/crypto/tab/util/AccountState;", "Lcom/robinhood/models/crypto/db/CryptoAccount;", "feature-crypto-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.tab.util.CryptoAccountsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoAccounts2 {
    public static final CryptoAccounts getAccountState(CryptoAccount cryptoAccount) {
        if (cryptoAccount == null) {
            return CryptoAccounts.UNRESOLVED;
        }
        return cryptoAccount.getHasAccessToCrypto() ? CryptoAccounts.HAS_CRYPTO_ACCOUNT : CryptoAccounts.NO_CRYPTO_ACCOUNT;
    }
}
