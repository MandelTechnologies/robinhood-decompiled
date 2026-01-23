package com.robinhood.shared.formats.crypto;

import com.robinhood.models.crypto.CurrencyDefinition;
import com.robinhood.models.crypto.InstrumentDefinition;
import com.robinhood.shared.common.lib.formats.currency.CurrencyFormatCache;
import com.robinhood.shared.common.lib.formats.currency.CurrencyFormatModel;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: InstrumentDefinitions.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001ak\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0006¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"formatAmountWithQuoteCurrency", "", "Lcom/robinhood/models/crypto/InstrumentDefinition;", "amount", "Ljava/math/BigDecimal;", "isWithCurrencySymbol", "", "isDecimalSeparatorAlwaysShown", "roundingMode", "Ljava/math/RoundingMode;", "minimumFractionDigits", "", "maximumFractionDigitsOverride", "isSignedAlwaysShown", "showPlusSign", "showMinusSign", "(Lcom/robinhood/models/crypto/InstrumentDefinition;Ljava/math/BigDecimal;ZZLjava/math/RoundingMode;ILjava/lang/Integer;Ljava/lang/Boolean;ZZ)Ljava/lang/CharSequence;", "lib-formats-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.formats.crypto.InstrumentDefinitionsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class InstrumentDefinitions {
    public static /* synthetic */ CharSequence formatAmountWithQuoteCurrency$default(InstrumentDefinition instrumentDefinition, BigDecimal bigDecimal, boolean z, boolean z2, RoundingMode roundingMode, int i, Integer num, Boolean bool, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            roundingMode = RoundingMode.HALF_DOWN;
        }
        if ((i2 & 16) != 0) {
            i = 2;
        }
        if ((i2 & 32) != 0) {
            num = null;
        }
        if ((i2 & 64) != 0) {
            bool = null;
        }
        if ((i2 & 128) != 0) {
            z3 = false;
        }
        if ((i2 & 256) != 0) {
            z4 = false;
        }
        return formatAmountWithQuoteCurrency(instrumentDefinition, bigDecimal, z, z2, roundingMode, i, num, bool, z3, z4);
    }

    public static final CharSequence formatAmountWithQuoteCurrency(InstrumentDefinition instrumentDefinition, BigDecimal amount, boolean z, boolean z2, RoundingMode roundingMode, int i, Integer num, Boolean bool, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(instrumentDefinition, "<this>");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        CurrencyDefinition quoteCurrency = instrumentDefinition.getQuoteCurrency();
        return CurrencyFormatCache.getCurrencyFormat(CurrencyFormatModel.Companion.fromCurrencyAmount$default(CurrencyFormatModel.INSTANCE, quoteCurrency, amount, z, false, i, RangesKt.coerceAtLeast(num != null ? num.intValue() : quoteCurrency.getDecimalScale(), i), false, z2, roundingMode, null, false, bool, z3, z4, false, false, 50760, null)).format(amount);
    }
}
