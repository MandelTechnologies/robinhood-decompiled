package com.robinhood.shared.crypto.utils;

import com.robinhood.crypto.models.perpetuals.p288db.PerpetualCurrencyInput;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.g11n.Locales2;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.formats.crypto.CryptoFormattedAmount;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: NumpadDelimiters.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\n"}, m3636d2 = {"isNumpadDelimiterShown", "", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "formattedAmount", "Lcom/robinhood/shared/formats/crypto/CryptoFormattedAmount;", "inputMode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "currencyInput", "Lcom/robinhood/crypto/models/perpetuals/db/PerpetualCurrencyInput;", "lib-utils_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.utils.NumpadDelimitersKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class NumpadDelimiters {
    public static /* synthetic */ boolean isNumpadDelimiterShown$default(UiCurrencyPair uiCurrencyPair, CryptoFormattedAmount cryptoFormattedAmount, CryptoInputMode cryptoInputMode, int i, Object obj) {
        if ((i & 4) != 0) {
            cryptoInputMode = CryptoInputMode.ASSET_CURRENCY;
        }
        return isNumpadDelimiterShown(uiCurrencyPair, cryptoFormattedAmount, cryptoInputMode);
    }

    public static final boolean isNumpadDelimiterShown(UiCurrencyPair uiCurrencyPair, CryptoFormattedAmount formattedAmount, CryptoInputMode inputMode) {
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        Intrinsics.checkNotNullParameter(formattedAmount, "formattedAmount");
        Intrinsics.checkNotNullParameter(inputMode, "inputMode");
        return UiCurrencyPairs2.allowDecimalInput(uiCurrencyPair, inputMode) && !StringsKt.contains$default((CharSequence) formattedAmount.getQuantityString(), Locales2.getMonetaryDecimalSeparator(CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale()), false, 2, (Object) null);
    }

    public static final boolean isNumpadDelimiterShown(PerpetualCurrencyInput currencyInput, CryptoFormattedAmount formattedAmount) {
        Intrinsics.checkNotNullParameter(currencyInput, "currencyInput");
        Intrinsics.checkNotNullParameter(formattedAmount, "formattedAmount");
        return PerpetualCurrencyInputs.getAllowDecimalInput(currencyInput) && !StringsKt.contains$default((CharSequence) formattedAmount.getQuantityString(), Locales2.getMonetaryDecimalSeparator(CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale()), false, 2, (Object) null);
    }
}
