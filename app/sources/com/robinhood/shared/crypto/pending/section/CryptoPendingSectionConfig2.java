package com.robinhood.shared.crypto.pending.section;

import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.shared.crypto.pending.section.CryptoPendingSectionConfig;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoPendingSectionConfig.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\t\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, m3636d2 = {"location", "Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation;", "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionConfig;", "getLocation", "(Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionConfig;)Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation;", "currencyPairId", "Ljava/util/UUID;", "getCurrencyPairId", "(Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionConfig;)Ljava/util/UUID;", "perpetualContractId", "getPerpetualContractId", "lib-pending-section_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.pending.section.CryptoPendingSectionConfigKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoPendingSectionConfig2 {
    public static final CryptoAccountSwitcherLocation getLocation(CryptoPendingSectionConfig cryptoPendingSectionConfig) {
        Intrinsics.checkNotNullParameter(cryptoPendingSectionConfig, "<this>");
        if (!(cryptoPendingSectionConfig instanceof CryptoPendingSectionConfig.CurrencyPairId)) {
            if (cryptoPendingSectionConfig instanceof CryptoPendingSectionConfig.All) {
                return CryptoAccountSwitcherLocation.Home.INSTANCE;
            }
            return null;
        }
        UUID currencyPairId = getCurrencyPairId(cryptoPendingSectionConfig);
        if (currencyPairId != null) {
            return new CryptoAccountSwitcherLocation.Detail(currencyPairId);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final UUID getCurrencyPairId(CryptoPendingSectionConfig cryptoPendingSectionConfig) {
        Intrinsics.checkNotNullParameter(cryptoPendingSectionConfig, "<this>");
        if (cryptoPendingSectionConfig instanceof CryptoPendingSectionConfig.CurrencyPairId) {
            return ((CryptoPendingSectionConfig.CurrencyPairId) cryptoPendingSectionConfig).getId();
        }
        return null;
    }

    public static final UUID getPerpetualContractId(CryptoPendingSectionConfig cryptoPendingSectionConfig) {
        Intrinsics.checkNotNullParameter(cryptoPendingSectionConfig, "<this>");
        if (cryptoPendingSectionConfig instanceof CryptoPendingSectionConfig.PerpetualContractId) {
            return ((CryptoPendingSectionConfig.PerpetualContractId) cryptoPendingSectionConfig).getId();
        }
        return null;
    }
}
