package com.robinhood.android.equities.taxlots.footer;

import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.robinhood.android.equities.taxlots.C14807R;
import com.robinhood.android.equities.taxlots.utils.TaxLotsStringsHelper;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.rosetta.common.Currency;
import com.robinhood.rosetta.common.Money;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FooterStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/footer/FooterStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/equities/taxlots/footer/FooterDataState;", "Lcom/robinhood/android/equities/taxlots/footer/FooterViewState;", "<init>", "()V", "reduce", "dataState", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FooterStateProvider implements StateProvider<FooterDataState, FooterViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public FooterViewState reduce(FooterDataState dataState) {
        Tuples2 tuples2M3642to;
        String amount;
        String amount2;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Money estimatedGainLoss = dataState.getEstimatedGainLoss();
        BigDecimal bigDecimalOrNull = null;
        BigDecimal bigDecimalOrZero = BigDecimals7.orZero((estimatedGainLoss == null || (amount2 = estimatedGainLoss.getAmount()) == null) ? null : BigDecimals7.toBigDecimalOrNull(amount2));
        if (BigDecimals7.isZero(bigDecimalOrZero)) {
            tuples2M3642to = Tuples4.m3642to(StringResource.INSTANCE.invoke(C14807R.string.tax_lots_table_empty_text, new Object[0]), null);
        } else {
            tuples2M3642to = Tuples4.m3642to(StringResource.INSTANCE.invoke(TaxLotsStringsHelper.INSTANCE.getFormattedGainLoss(dataState.getEstimatedGainLoss())), Boolean.valueOf(bigDecimalOrZero.signum() >= 0));
        }
        StringResource stringResource = (StringResource) tuples2M3642to.component1();
        Boolean bool = (Boolean) tuples2M3642to.component2();
        UUID orderId = dataState.getOrderId();
        BigDecimal invalidNumberOfShares = dataState.getInvalidNumberOfShares();
        boolean m1Enabled = dataState.getM1Enabled();
        BigDecimal bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(BigDecimals7.orZero(dataState.getNumShares()));
        Intrinsics.checkNotNullExpressionValue(bigDecimalM822m, "stripTrailingZeros(...)");
        StringResource.Companion companion = StringResource.INSTANCE;
        TaxLotsStringsHelper taxLotsStringsHelper = TaxLotsStringsHelper.INSTANCE;
        Money estimatedCredit = dataState.getEstimatedCredit();
        if (estimatedCredit != null && (amount = estimatedCredit.getAmount()) != null) {
            bigDecimalOrNull = BigDecimals7.toBigDecimalOrNull(amount);
        }
        String string2 = BigDecimals7.orZero(bigDecimalOrNull).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new FooterViewState(orderId, bigDecimalM822m, m1Enabled, stringResource, bool, companion.invoke(taxLotsStringsHelper.getFormattedMoney(new Money(string2, Currency.USD, null, 4, null))), invalidNumberOfShares);
    }
}
