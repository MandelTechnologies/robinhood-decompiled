package com.robinhood.android.equities.taxlots.utils;

import com.robinhood.android.equities.taxlots.C14807R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.rosetta.common.Money;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import equity_trading_tax_lots.proto.p460v1.TaxLotSelection;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: TaxLotsStringsHelper.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007J\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/utils/TaxLotsStringsHelper;", "", "<init>", "()V", "getFormattedGainLoss", "", "estimatedGainLoss", "Lcom/robinhood/rosetta/common/Money;", "getFormattedMoney", "money", "getFormattedMoneyOrDash", "isGain", "", "getGainLossAlert", "Lcom/robinhood/utils/resource/StringResource;", "Ljava/math/BigDecimal;", "getGainLossStringResource", "numSelectedShares", "getEstCreditStringResource", "estimatedCredit", "getTermStringResource", "selectedLots", "", "Lequity_trading_tax_lots/proto/v1/TaxLotSelection;", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TaxLotsStringsHelper {
    public static final int $stable = 0;
    public static final TaxLotsStringsHelper INSTANCE = new TaxLotsStringsHelper();

    private TaxLotsStringsHelper() {
    }

    public final String getFormattedGainLoss(Money estimatedGainLoss) {
        String amount;
        return Formats.getPriceDeltaWithHundredthDecimalFormat().format(BigDecimals7.orZero((estimatedGainLoss == null || (amount = estimatedGainLoss.getAmount()) == null) ? null : StringsKt.toBigDecimalOrNull(amount)));
    }

    public final String getFormattedMoney(Money money) {
        if (money == null || BigDecimals7.isZero(StringsKt.toBigDecimalOrNull(money.getAmount()))) {
            NumberFormatter amountFormat = Formats.getAmountFormat();
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return amountFormat.format(ZERO);
        }
        if (BigDecimals7.isNegative(StringsKt.toBigDecimalOrNull(money.getAmount()))) {
            return Formats.getAmountFormat().format((Number) ComparisonsKt.minOf(BigDecimals7.orZero(StringsKt.toBigDecimalOrNull(money.getAmount())), new BigDecimal("-0.01")));
        }
        return Formats.getAmountFormat().format((Number) ComparisonsKt.maxOf(BigDecimals7.orZero(StringsKt.toBigDecimalOrNull(money.getAmount())), new BigDecimal("0.01")));
    }

    public final String getFormattedMoneyOrDash(Money money) {
        String formattedMoney;
        return (money == null || (formattedMoney = INSTANCE.getFormattedMoney(money)) == null) ? "-" : formattedMoney;
    }

    public final boolean isGain(Money estimatedGainLoss) {
        BigDecimal bigDecimalOrNull;
        String amount;
        if (estimatedGainLoss == null || (amount = estimatedGainLoss.getAmount()) == null || (bigDecimalOrNull = StringsKt.toBigDecimalOrNull(amount)) == null) {
            bigDecimalOrNull = BigDecimal.ZERO;
        }
        return bigDecimalOrNull.compareTo(BigDecimal.ZERO) >= 0;
    }

    public final StringResource getGainLossAlert(BigDecimal estimatedGainLoss) {
        Intrinsics.checkNotNullParameter(estimatedGainLoss, "estimatedGainLoss");
        if (estimatedGainLoss.compareTo(BigDecimal.ZERO) >= 0) {
            return StringResource.INSTANCE.invoke(C14807R.string.tax_lots_max_lot_alert_gain, Formats.getPriceDeltaWithHundredthDecimalFormat().format(estimatedGainLoss));
        }
        return StringResource.INSTANCE.invoke(C14807R.string.tax_lots_max_lot_alert_loss, Formats.getPriceDeltaWithHundredthDecimalFormat().format(estimatedGainLoss));
    }

    public final StringResource getGainLossStringResource(BigDecimal numSelectedShares, Money estimatedGainLoss) {
        Intrinsics.checkNotNullParameter(numSelectedShares, "numSelectedShares");
        if (Intrinsics.areEqual(numSelectedShares, BigDecimal.ZERO) || estimatedGainLoss == null) {
            return null;
        }
        if (isGain(estimatedGainLoss)) {
            return StringResource.INSTANCE.invoke(C14807R.string.lot_selection_row_meta_subtitle_gain, Formats.getPriceDeltaWithHundredthDecimalFormat().format(new BigDecimal(estimatedGainLoss.getAmount())));
        }
        return StringResource.INSTANCE.invoke(C14807R.string.lot_selection_row_meta_subtitle_loss, Formats.getPriceDeltaWithHundredthDecimalFormat().format(new BigDecimal(estimatedGainLoss.getAmount())));
    }

    public final StringResource getEstCreditStringResource(Money estimatedCredit) {
        StringResource.Companion companion = StringResource.INSTANCE;
        if (estimatedCredit == null) {
            return null;
        }
        return companion.invoke(getFormattedMoney(estimatedCredit));
    }

    public final StringResource getTermStringResource(BigDecimal numSelectedShares, List<TaxLotSelection> selectedLots) {
        int size;
        Intrinsics.checkNotNullParameter(numSelectedShares, "numSelectedShares");
        Intrinsics.checkNotNullParameter(selectedLots, "selectedLots");
        if (Intrinsics.areEqual(numSelectedShares, BigDecimal.ZERO) || (size = selectedLots.size()) == 0) {
            return null;
        }
        return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C14807R.plurals.tax_lot_selected_lots, size), Integer.valueOf(size));
    }
}
