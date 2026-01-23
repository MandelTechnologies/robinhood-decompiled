package com.robinhood.android.options.portfolioriskanalyzer.extensions;

import com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.util.Money;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Utils.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004*\u00020\u0005H\u0000\u001a\u000e\u0010\u0006\u001a\u00020\u0007*\u0004\u0018\u00010\u0001H\u0000\u001a\u000e\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\tH\u0000¨\u0006\n"}, m3636d2 = {"sumOrNull", "Ljava/math/BigDecimal;", "other", "getQuantityToAverageCost", "Lkotlin/Pair;", "Lcom/robinhood/models/db/Position;", "toPnlColorType", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/PnLColorType;", "toValidBigDecimal", "", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class UtilsKt {
    public static final BigDecimal sumOrNull(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        if (bigDecimal == null && bigDecimal2 == null) {
            return null;
        }
        return bigDecimal == null ? bigDecimal2 : bigDecimal2 == null ? bigDecimal : bigDecimal.add(bigDecimal2);
    }

    public static final Tuples2<BigDecimal, BigDecimal> getQuantityToAverageCost(Position position) {
        Intrinsics.checkNotNullParameter(position, "<this>");
        BigDecimal clearingRunningQuantity = position.getClearingRunningQuantity();
        Money averageCostBasis = position.getAverageCostBasis();
        if (clearingRunningQuantity != null && averageCostBasis != null) {
            return Tuples4.m3642to(clearingRunningQuantity, averageCostBasis.getDecimalValue());
        }
        return Tuples4.m3642to(position.getDisplayQuantity(), position.getDisplayAverageBuyPrice().getDecimalValue());
    }

    public static final OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2 toPnlColorType(BigDecimal bigDecimal) {
        Integer numValueOf = bigDecimal != null ? Integer.valueOf(bigDecimal.compareTo(BigDecimal.ZERO)) : null;
        return (numValueOf != null && numValueOf.intValue() == 1) ? OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2.POSITIVE : (numValueOf != null && numValueOf.intValue() == -1) ? OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2.NEGATIVE : OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2.NEUTRAL;
    }

    public static final BigDecimal toValidBigDecimal(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            return null;
        }
        return new BigDecimal(String.valueOf(d));
    }
}
