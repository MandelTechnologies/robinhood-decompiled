package com.robinhood.android.crypto.tab.util;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CryptoAccounts.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/util/AccountState;", "", "<init>", "(Ljava/lang/String;I)V", "UNRESOLVED", "NO_CRYPTO_ACCOUNT", "HAS_CRYPTO_ACCOUNT", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.tab.util.AccountState, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoAccounts {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CryptoAccounts[] $VALUES;
    public static final CryptoAccounts UNRESOLVED = new CryptoAccounts("UNRESOLVED", 0);
    public static final CryptoAccounts NO_CRYPTO_ACCOUNT = new CryptoAccounts("NO_CRYPTO_ACCOUNT", 1);
    public static final CryptoAccounts HAS_CRYPTO_ACCOUNT = new CryptoAccounts("HAS_CRYPTO_ACCOUNT", 2);

    private static final /* synthetic */ CryptoAccounts[] $values() {
        return new CryptoAccounts[]{UNRESOLVED, NO_CRYPTO_ACCOUNT, HAS_CRYPTO_ACCOUNT};
    }

    public static EnumEntries<CryptoAccounts> getEntries() {
        return $ENTRIES;
    }

    private CryptoAccounts(String str, int i) {
    }

    static {
        CryptoAccounts[] cryptoAccountsArr$values = $values();
        $VALUES = cryptoAccountsArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cryptoAccountsArr$values);
    }

    public static CryptoAccounts valueOf(String str) {
        return (CryptoAccounts) Enum.valueOf(CryptoAccounts.class, str);
    }

    public static CryptoAccounts[] values() {
        return (CryptoAccounts[]) $VALUES.clone();
    }
}
