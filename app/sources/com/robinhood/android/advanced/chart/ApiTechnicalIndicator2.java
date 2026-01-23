package com.robinhood.android.advanced.chart;

import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiTechnicalIndicator.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0004"}, m3636d2 = {"isTheSameIndicatorFromDeeplink", "", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "indicator", "feature-lib-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advanced.chart.ApiTechnicalIndicatorKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class ApiTechnicalIndicator2 {
    public static final boolean isTheSameIndicatorFromDeeplink(ApiTechnicalIndicator apiTechnicalIndicator, ApiTechnicalIndicator indicator) {
        Intrinsics.checkNotNullParameter(apiTechnicalIndicator, "<this>");
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        if (apiTechnicalIndicator.getType() != indicator.getType()) {
            return false;
        }
        if (apiTechnicalIndicator instanceof ApiTechnicalIndicator.ApiSimpleMovingAverage) {
            return (indicator instanceof ApiTechnicalIndicator.ApiSimpleMovingAverage) && ((ApiTechnicalIndicator.ApiSimpleMovingAverage) apiTechnicalIndicator).getPeriod() == ((ApiTechnicalIndicator.ApiSimpleMovingAverage) indicator).getPeriod();
        }
        if (apiTechnicalIndicator instanceof ApiTechnicalIndicator.ApiExponentialMovingAverage) {
            return (indicator instanceof ApiTechnicalIndicator.ApiExponentialMovingAverage) && ((ApiTechnicalIndicator.ApiExponentialMovingAverage) apiTechnicalIndicator).getPeriod() == ((ApiTechnicalIndicator.ApiExponentialMovingAverage) indicator).getPeriod();
        }
        if (apiTechnicalIndicator instanceof ApiTechnicalIndicator.ApiRelativeStrengthIndex) {
            return (indicator instanceof ApiTechnicalIndicator.ApiRelativeStrengthIndex) && ((ApiTechnicalIndicator.ApiRelativeStrengthIndex) apiTechnicalIndicator).getPeriod() == ((ApiTechnicalIndicator.ApiRelativeStrengthIndex) indicator).getPeriod();
        }
        if (apiTechnicalIndicator instanceof ApiTechnicalIndicator.ApiVolumeWeightedAveragePrice) {
            if (indicator instanceof ApiTechnicalIndicator.ApiVolumeWeightedAveragePrice) {
                return true;
            }
        } else if (apiTechnicalIndicator instanceof ApiTechnicalIndicator.ApiMovingAverageConvergenceDivergence) {
            if (indicator instanceof ApiTechnicalIndicator.ApiMovingAverageConvergenceDivergence) {
                ApiTechnicalIndicator.ApiMovingAverageConvergenceDivergence apiMovingAverageConvergenceDivergence = (ApiTechnicalIndicator.ApiMovingAverageConvergenceDivergence) apiTechnicalIndicator;
                ApiTechnicalIndicator.ApiMovingAverageConvergenceDivergence apiMovingAverageConvergenceDivergence2 = (ApiTechnicalIndicator.ApiMovingAverageConvergenceDivergence) indicator;
                return apiMovingAverageConvergenceDivergence.getFast_period() == apiMovingAverageConvergenceDivergence2.getFast_period() && apiMovingAverageConvergenceDivergence.getSlow_period() == apiMovingAverageConvergenceDivergence2.getSlow_period() && apiMovingAverageConvergenceDivergence.getSignal_period() == apiMovingAverageConvergenceDivergence2.getSignal_period();
            }
        } else if ((apiTechnicalIndicator instanceof ApiTechnicalIndicator.ApiBollingerBands) && (indicator instanceof ApiTechnicalIndicator.ApiBollingerBands)) {
            ApiTechnicalIndicator.ApiBollingerBands apiBollingerBands = (ApiTechnicalIndicator.ApiBollingerBands) apiTechnicalIndicator;
            ApiTechnicalIndicator.ApiBollingerBands apiBollingerBands2 = (ApiTechnicalIndicator.ApiBollingerBands) indicator;
            if (apiBollingerBands.getPeriod() == apiBollingerBands2.getPeriod() && apiBollingerBands.getMa_type() == apiBollingerBands2.getMa_type() && Intrinsics.areEqual(apiBollingerBands.getStd_dev(), apiBollingerBands2.getStd_dev())) {
                return true;
            }
        }
        return false;
    }
}
