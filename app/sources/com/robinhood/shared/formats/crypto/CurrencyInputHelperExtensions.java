package com.robinhood.shared.formats.crypto;

import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.models.crypto.CurrencyDefinition;
import com.robinhood.shared.common.lib.formats.currency.CurrencyInputHelper;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CurrencyInputHelperExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"currencyInputHelper", "Lcom/robinhood/shared/common/lib/formats/currency/CurrencyInputHelper;", "currencyDefinition", "Lcom/robinhood/models/crypto/CurrencyDefinition;", "locale", "Ljava/util/Locale;", "lib-formats-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.formats.crypto.CurrencyInputHelperExtensionsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CurrencyInputHelperExtensions {
    public static /* synthetic */ CurrencyInputHelper currencyInputHelper$default(CurrencyDefinition currencyDefinition, Locale locale, int i, Object obj) {
        if ((i & 2) != 0) {
            locale = CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale();
        }
        return currencyInputHelper(currencyDefinition, locale);
    }

    public static final CurrencyInputHelper currencyInputHelper(CurrencyDefinition currencyDefinition, Locale locale) {
        Intrinsics.checkNotNullParameter(currencyDefinition, "currencyDefinition");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return new CurrencyInputHelper(CurrencyInputInfoPair2.getToCurrencyInputInfo(currencyDefinition), locale);
    }
}
