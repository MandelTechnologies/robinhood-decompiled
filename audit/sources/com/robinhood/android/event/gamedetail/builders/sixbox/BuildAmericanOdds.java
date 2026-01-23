package com.robinhood.android.event.gamedetail.builders.sixbox;

import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BuildAmericanOdds.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a>\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u001a\u001a\u0010\r\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u001a\u001c\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0007¨\u0006\u0010"}, m3636d2 = {"getAmericanOddsDisplayText", "", "contractIdToQuote", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "contractId", "contractSide", "Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "showAmericanOdds", "", "estimatedFeesPerQuantity", "Ljava/math/BigDecimal;", "getContractOptionDisplayTextWithAmericanOdds", "askPrice", "buildAmericanOddsAmount", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.builders.sixbox.BuildAmericanOddsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildAmericanOdds {
    public static final String getAmericanOddsDisplayText(Map<UUID, EventQuote> contractIdToQuote, UUID contractId, ContractSide contractSide, boolean z, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(contractIdToQuote, "contractIdToQuote");
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(contractSide, "contractSide");
        if (!z) {
            return null;
        }
        EventQuote eventQuote = contractIdToQuote.get(contractId);
        return getContractOptionDisplayTextWithAmericanOdds(eventQuote != null ? eventQuote.getAskPriceWithContractSide(contractSide) : null, bigDecimal);
    }

    public static final String getContractOptionDisplayTextWithAmericanOdds(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        BigDecimal bigDecimalBuildAmericanOddsAmount = buildAmericanOddsAmount(bigDecimal2, bigDecimal);
        if (!Intrinsics.areEqual(bigDecimalBuildAmericanOddsAmount, BigDecimal.ZERO)) {
            return Formats.getIntegerDeltaWithoutGroupingFormat().format(bigDecimalBuildAmericanOddsAmount);
        }
        return "—";
    }

    public static final BigDecimal buildAmericanOddsAmount(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        if (bigDecimal == null || bigDecimal2 == null) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        BigDecimal bigDecimalAdd = bigDecimal2.add(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        BigDecimal ONE = BigDecimal.ONE;
        if (bigDecimalAdd.compareTo(ONE) >= 0 || bigDecimalAdd.compareTo(BigDecimal.ZERO) <= 0) {
            BigDecimal ZERO2 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
            return ZERO2;
        }
        if (bigDecimalAdd.compareTo(new BigDecimal("0.50")) > 0) {
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            BigDecimal bigDecimalSubtract = ONE.subtract(bigDecimalAdd);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            BigDecimal bigDecimalNegate = BigDecimals7.safeDivide(bigDecimalAdd, bigDecimalSubtract).multiply(new BigDecimal("100")).negate();
            Intrinsics.checkNotNull(bigDecimalNegate);
            return bigDecimalNegate;
        }
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        BigDecimal bigDecimalSubtract2 = ONE.subtract(bigDecimalAdd);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
        BigDecimal bigDecimalMultiply = BigDecimals7.safeDivide(bigDecimalSubtract2, bigDecimalAdd).multiply(new BigDecimal("100"));
        Intrinsics.checkNotNull(bigDecimalMultiply);
        return bigDecimalMultiply;
    }
}
