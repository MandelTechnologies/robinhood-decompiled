package com.robinhood.android.event.gamedetail.builders.tradebottomsheet;

import com.robinhood.android.event.gamedetail.C16283R;
import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.utils.BigDecimals2;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BuildBottomSheetBuyButton.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a.\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a(\u0010\n\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002¨\u0006\r"}, m3636d2 = {"buildBuyButtonLabel", "Lcom/robinhood/utils/resource/StringResource;", "selectedQuote", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "contractSide", "Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "estimatedFeesPerQuantity", "Ljava/math/BigDecimal;", "showPricePayout", "", "buildTheoreticalTradeButtonLabel", "buildTheoreticalPayout", "askPrice", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.builders.tradebottomsheet.BuildBottomSheetBuyButtonKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildBottomSheetBuyButton {
    public static /* synthetic */ StringResource buildBuyButtonLabel$default(EventQuote eventQuote, ContractSide contractSide, BigDecimal bigDecimal, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            bigDecimal = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return buildBuyButtonLabel(eventQuote, contractSide, bigDecimal, z);
    }

    public static final StringResource buildBuyButtonLabel(EventQuote eventQuote, ContractSide contractSide, BigDecimal bigDecimal, boolean z) {
        StringResource stringResourceInvoke;
        BigDecimal askPriceWithContractSide;
        Intrinsics.checkNotNullParameter(contractSide, "contractSide");
        String strPriceInCents = (eventQuote == null || (askPriceWithContractSide = eventQuote.getAskPriceWithContractSide(contractSide)) == null) ? null : BigDecimals2.priceInCents(askPriceWithContractSide);
        StringResource stringResourceBuildTheoreticalTradeButtonLabel = buildTheoreticalTradeButtonLabel(eventQuote, bigDecimal, contractSide);
        if (stringResourceBuildTheoreticalTradeButtonLabel == null) {
            stringResourceBuildTheoreticalTradeButtonLabel = StringResource.INSTANCE.invoke(C16283R.string.trade_cta_default_label, new Object[0]);
        }
        if (strPriceInCents == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(C16283R.string.trade_cta_label, strPriceInCents)) == null) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C16283R.string.trade_cta_default_label, new Object[0]);
        }
        return z ? stringResourceBuildTheoreticalTradeButtonLabel : stringResourceInvoke;
    }

    static /* synthetic */ StringResource buildTheoreticalTradeButtonLabel$default(EventQuote eventQuote, BigDecimal bigDecimal, ContractSide contractSide, int i, Object obj) {
        if ((i & 2) != 0) {
            bigDecimal = null;
        }
        return buildTheoreticalTradeButtonLabel(eventQuote, bigDecimal, contractSide);
    }

    private static final StringResource buildTheoreticalTradeButtonLabel(EventQuote eventQuote, BigDecimal bigDecimal, ContractSide contractSide) {
        BigDecimal askPriceWithContractSide;
        if (eventQuote == null || (askPriceWithContractSide = eventQuote.getAskPriceWithContractSide(contractSide)) == null) {
            return null;
        }
        String strPriceInCents = BigDecimals2.priceInCents(askPriceWithContractSide);
        BigDecimal bigDecimalBuildTheoreticalPayout = buildTheoreticalPayout(askPriceWithContractSide, bigDecimal);
        if (bigDecimalBuildTheoreticalPayout == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C16283R.string.trade_cta_label_theoretical_payout, strPriceInCents, Formats.getCurrencyFormatNoDecimals().format(bigDecimalBuildTheoreticalPayout));
    }

    static /* synthetic */ BigDecimal buildTheoreticalPayout$default(BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
        if ((i & 2) != 0) {
            bigDecimal2 = null;
        }
        return buildTheoreticalPayout(bigDecimal, bigDecimal2);
    }

    private static final BigDecimal buildTheoreticalPayout(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        if (bigDecimal2 == null) {
            return null;
        }
        BigDecimal bigDecimalAdd = bigDecimal.add(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        if (bigDecimalAdd.compareTo(bigDecimal3) <= 0) {
            return null;
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(BigDecimals7.toIntRoundDown(BigDecimals7.safeDivide(BigDecimal.TEN, bigDecimalAdd)));
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        if (bigDecimalValueOf.compareTo(bigDecimal3) <= 0) {
            return null;
        }
        return bigDecimalValueOf;
    }
}
