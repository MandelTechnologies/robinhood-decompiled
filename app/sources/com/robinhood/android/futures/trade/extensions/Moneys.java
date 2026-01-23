package com.robinhood.android.futures.trade.extensions;

import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Moneys.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\u0016\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0001\u001a\u0016\u0010\u0006\u001a\u00020\u0001*\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0001\u001a\u0016\u0010\u0007\u001a\u00020\u0001*\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0001¨\u0006\b"}, m3636d2 = {"formatCurrency", "", "Lcom/robinhood/rosetta/common/MoneyDto;", "formatDeltaCurrency", "Ljava/math/BigDecimal;", "defaultValue", "formatNoSignAmount", "formatNoSignPercent", "feature-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.trade.extensions.MoneysKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class Moneys {
    public static final String formatCurrency(MoneyDto moneyDto) {
        Intrinsics.checkNotNullParameter(moneyDto, "<this>");
        return Formats.getCurrencyFormat().format(new BigDecimal(moneyDto.getAmount().getStringValue()));
    }

    public static final String formatDeltaCurrency(MoneyDto moneyDto) {
        Intrinsics.checkNotNullParameter(moneyDto, "<this>");
        return formatDeltaCurrency$default(new BigDecimal(moneyDto.getAmount().getStringValue()), null, 1, null);
    }

    public static /* synthetic */ String formatDeltaCurrency$default(BigDecimal bigDecimal, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "-";
        }
        return formatDeltaCurrency(bigDecimal, str);
    }

    public static final String formatDeltaCurrency(BigDecimal bigDecimal, String defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (bigDecimal == null) {
            return defaultValue;
        }
        if (BigDecimals7.isZero(bigDecimal)) {
            return Formats.getCurrencyFormat().format(bigDecimal);
        }
        NumberFormatter currencyDeltaFormat = Formats.getCurrencyDeltaFormat();
        BigDecimal scale = bigDecimal.setScale(2, RoundingMode.DOWN);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return currencyDeltaFormat.format(scale);
    }

    public static /* synthetic */ String formatNoSignAmount$default(BigDecimal bigDecimal, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "-";
        }
        return formatNoSignAmount(bigDecimal, str);
    }

    public static final String formatNoSignAmount(BigDecimal bigDecimal, String defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (bigDecimal == null) {
            return defaultValue;
        }
        NumberFormatter noSymbolWithHundredthDecimalPercentFormat = Formats.getNoSymbolWithHundredthDecimalPercentFormat();
        BigDecimal scale = bigDecimal.setScale(2, RoundingMode.DOWN);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return noSymbolWithHundredthDecimalPercentFormat.format(scale);
    }

    public static /* synthetic */ String formatNoSignPercent$default(BigDecimal bigDecimal, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "-%";
        }
        return formatNoSignPercent(bigDecimal, str);
    }

    public static final String formatNoSignPercent(BigDecimal bigDecimal, String defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return bigDecimal == null ? defaultValue : Formats.getNoSignPercentFormat().format(bigDecimal);
    }
}
