package com.robinhood.android.fund.breakdown;

import android.content.res.Resources;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.fund.breakdown.FundBreakdownViewState;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.bonfire.etp.EtpHolding;
import com.robinhood.shared.common.etpcomposition.C37462R;
import com.robinhood.utils.datetime.LocalDates4;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Clock;
import p479j$.time.LocalDate;

/* compiled from: FundBreakdownStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/fund/breakdown/FundBreakdownStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/fund/breakdown/FundBreakdownFragmentDataState;", "Lcom/robinhood/android/fund/breakdown/FundBreakdownViewState;", "Landroid/content/res/Resources;", "resources", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Landroid/content/res/Resources;Lj$/time/Clock;)V", "dataState", "reduce", "(Lcom/robinhood/android/fund/breakdown/FundBreakdownFragmentDataState;)Lcom/robinhood/android/fund/breakdown/FundBreakdownViewState;", "Landroid/content/res/Resources;", "Lj$/time/Clock;", "feature-fund-breakdown_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FundBreakdownStateProvider implements StateProvider<FundBreakdownFragmentDataState, FundBreakdownViewState> {
    public static final int $stable = 8;
    private final Clock clock;
    private final Resources resources;

    public FundBreakdownStateProvider(Resources resources, Clock clock) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.resources = resources;
        this.clock = clock;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f4  */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FundBreakdownViewState reduce(FundBreakdownFragmentDataState dataState) {
        Object next;
        BigDecimal bigDecimalM822m;
        List<EtpHolding.Vehicle> vehicles;
        BigDecimal bigDecimalMultiply;
        BigDecimal bigDecimalDivide;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getInstrument() == null || dataState.getEtpDetails() == null) {
            return FundBreakdownViewState.Loading.INSTANCE;
        }
        LocalDate holdingsPortfolioDate = dataState.getEtpDetails().getHoldingsPortfolioDate();
        StringResource stringResourceInvoke = holdingsPortfolioDate != null ? StringResource.INSTANCE.invoke(C37462R.string.etp_composition_portfolio_date_text, LocalDates4.formatRecent$default(holdingsPortfolioDate, this.resources, LocalDateFormatter.MEDIUM_WITH_OPTIONAL_YEAR, null, false, false, false, false, false, this.clock, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null)) : null;
        Iterator<T> it = dataState.getEtpDetails().getHoldings().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((EtpHolding) next).getName(), dataState.getSelectedHoldingName())) {
                break;
            }
        }
        EtpHolding etpHolding = (EtpHolding) next;
        if (etpHolding == null) {
            etpHolding = (EtpHolding) CollectionsKt.firstOrNull((List) dataState.getEtpDetails().getHoldings());
        }
        EtpHolding etpHolding2 = etpHolding;
        if (etpHolding2 == null) {
            bigDecimalM822m = null;
        } else {
            EtpHolding etpHolding3 = etpHolding2.isCash() ? etpHolding2 : null;
            if (etpHolding3 != null && (vehicles = etpHolding3.getVehicles()) != null) {
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                for (EtpHolding.Vehicle vehicle : vehicles) {
                    BigDecimal apyPercent = vehicle.getApyPercent();
                    if (apyPercent == null || (bigDecimalDivide = apyPercent.divide(new BigDecimal(100))) == null) {
                        bigDecimalMultiply = null;
                    } else {
                        bigDecimalMultiply = bigDecimalDivide.multiply(vehicle.getWeight());
                        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                    }
                    bigDecimalValueOf = bigDecimalValueOf.add(BigDecimals7.orZero(bigDecimalMultiply));
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
                }
                if (bigDecimalValueOf != null) {
                    bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimalValueOf);
                }
            }
        }
        return new FundBreakdownViewState.Loaded(dataState.getInstrument().getSymbol(), stringResourceInvoke, dataState.getEtpDetails().getHoldings(), etpHolding2, bigDecimalM822m != null ? StringResource.INSTANCE.invoke(C16940R.string.fund_breakdown_cash_yield, Formats.getPercentFormat().format(bigDecimalM822m)) : null);
    }
}
