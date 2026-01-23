package com.robinhood.android.advancedchart.config;

import com.robinhood.android.advancedchart.C8502R;
import com.robinhood.android.advancedchart.config.TechnicalIndicatorConfigAttribute;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TechnicalIndicatorConfigAttribute.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\u0007"}, m3636d2 = {"toConfigAttributeList", "", "Lcom/robinhood/android/advancedchart/config/TechnicalIndicatorConfigAttribute;", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator$Type;", "toApiTechnicalIndicator", "type", "feature-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advancedchart.config.TechnicalIndicatorConfigAttributeKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class TechnicalIndicatorConfigAttribute2 {

    /* compiled from: TechnicalIndicatorConfigAttribute.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advancedchart.config.TechnicalIndicatorConfigAttributeKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiTechnicalIndicator.Type.values().length];
            try {
                iArr[ApiTechnicalIndicator.Type.SMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiTechnicalIndicator.Type.EMA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiTechnicalIndicator.Type.RSI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiTechnicalIndicator.Type.VWAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiTechnicalIndicator.Type.MACD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiTechnicalIndicator.Type.DEPTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiTechnicalIndicator.Type.ORDER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ApiTechnicalIndicator.Type.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ApiTechnicalIndicator.Type.BOLL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<TechnicalIndicatorConfigAttribute> toConfigAttributeList(ApiTechnicalIndicator apiTechnicalIndicator) {
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        Intrinsics.checkNotNullParameter(apiTechnicalIndicator, "<this>");
        if (apiTechnicalIndicator instanceof ApiTechnicalIndicator.ApiExponentialMovingAverage) {
            int i = C8502R.string.advanced_chart_edit_indicator_period;
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(((ApiTechnicalIndicator.ApiExponentialMovingAverage) apiTechnicalIndicator).getPeriod());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            return CollectionsKt.listOf(new TechnicalIndicatorConfigAttribute(i, bigDecimalValueOf, TechnicalIndicatorConfigAttribute.Type.INTEGER));
        }
        if (apiTechnicalIndicator instanceof ApiTechnicalIndicator.ApiMovingAverageConvergenceDivergence) {
            int i2 = C8502R.string.advanced_chart_edit_indicator_fast_period;
            ApiTechnicalIndicator.ApiMovingAverageConvergenceDivergence apiMovingAverageConvergenceDivergence = (ApiTechnicalIndicator.ApiMovingAverageConvergenceDivergence) apiTechnicalIndicator;
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(apiMovingAverageConvergenceDivergence.getFast_period());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
            TechnicalIndicatorConfigAttribute.Type type2 = TechnicalIndicatorConfigAttribute.Type.INTEGER;
            TechnicalIndicatorConfigAttribute technicalIndicatorConfigAttribute = new TechnicalIndicatorConfigAttribute(i2, bigDecimalValueOf2, type2);
            int i3 = C8502R.string.advanced_chart_edit_indicator_slow_period;
            BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(apiMovingAverageConvergenceDivergence.getSlow_period());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf3, "valueOf(...)");
            TechnicalIndicatorConfigAttribute technicalIndicatorConfigAttribute2 = new TechnicalIndicatorConfigAttribute(i3, bigDecimalValueOf3, type2);
            int i4 = C8502R.string.advanced_chart_edit_indicator_signal_period;
            BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(apiMovingAverageConvergenceDivergence.getSignal_period());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf4, "valueOf(...)");
            return CollectionsKt.listOf((Object[]) new TechnicalIndicatorConfigAttribute[]{technicalIndicatorConfigAttribute, technicalIndicatorConfigAttribute2, new TechnicalIndicatorConfigAttribute(i4, bigDecimalValueOf4, type2)});
        }
        if (apiTechnicalIndicator instanceof ApiTechnicalIndicator.ApiRelativeStrengthIndex) {
            int i5 = C8502R.string.advanced_chart_edit_indicator_period;
            ApiTechnicalIndicator.ApiRelativeStrengthIndex apiRelativeStrengthIndex = (ApiTechnicalIndicator.ApiRelativeStrengthIndex) apiTechnicalIndicator;
            BigDecimal bigDecimalValueOf5 = BigDecimal.valueOf(apiRelativeStrengthIndex.getPeriod());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf5, "valueOf(...)");
            TechnicalIndicatorConfigAttribute.Type type3 = TechnicalIndicatorConfigAttribute.Type.INTEGER;
            TechnicalIndicatorConfigAttribute technicalIndicatorConfigAttribute3 = new TechnicalIndicatorConfigAttribute(i5, bigDecimalValueOf5, type3);
            int i6 = C8502R.string.advanced_chart_edit_indicator_overbought_level;
            if (apiRelativeStrengthIndex.getOverbought_level() != null) {
                bigDecimal = BigDecimal.valueOf(r5.intValue());
                Intrinsics.checkNotNullExpressionValue(bigDecimal, "valueOf(...)");
                if (bigDecimal == null) {
                    bigDecimal = new BigDecimal(70);
                }
            }
            TechnicalIndicatorConfigAttribute technicalIndicatorConfigAttribute4 = new TechnicalIndicatorConfigAttribute(i6, bigDecimal, type3);
            int i7 = C8502R.string.advanced_chart_edit_indicator_oversold_level;
            if (apiRelativeStrengthIndex.getOversold_level() != null) {
                bigDecimal2 = BigDecimal.valueOf(r8.intValue());
                Intrinsics.checkNotNullExpressionValue(bigDecimal2, "valueOf(...)");
                if (bigDecimal2 == null) {
                    bigDecimal2 = new BigDecimal(30);
                }
            }
            return CollectionsKt.listOf((Object[]) new TechnicalIndicatorConfigAttribute[]{technicalIndicatorConfigAttribute3, technicalIndicatorConfigAttribute4, new TechnicalIndicatorConfigAttribute(i7, bigDecimal2, type3)});
        }
        if (apiTechnicalIndicator instanceof ApiTechnicalIndicator.ApiSimpleMovingAverage) {
            int i8 = C8502R.string.advanced_chart_edit_indicator_period;
            BigDecimal bigDecimalValueOf6 = BigDecimal.valueOf(((ApiTechnicalIndicator.ApiSimpleMovingAverage) apiTechnicalIndicator).getPeriod());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf6, "valueOf(...)");
            return CollectionsKt.listOf(new TechnicalIndicatorConfigAttribute(i8, bigDecimalValueOf6, TechnicalIndicatorConfigAttribute.Type.INTEGER));
        }
        if (apiTechnicalIndicator instanceof ApiTechnicalIndicator.ApiVolumeWeightedAveragePrice) {
            return CollectionsKt.emptyList();
        }
        if (apiTechnicalIndicator instanceof ApiTechnicalIndicator.ApiBollingerBands) {
            int i9 = C8502R.string.advanced_chart_edit_indicator_length_period;
            ApiTechnicalIndicator.ApiBollingerBands apiBollingerBands = (ApiTechnicalIndicator.ApiBollingerBands) apiTechnicalIndicator;
            BigDecimal bigDecimalValueOf7 = BigDecimal.valueOf(apiBollingerBands.getPeriod());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf7, "valueOf(...)");
            return CollectionsKt.listOf((Object[]) new TechnicalIndicatorConfigAttribute[]{new TechnicalIndicatorConfigAttribute(i9, bigDecimalValueOf7, TechnicalIndicatorConfigAttribute.Type.INTEGER), new TechnicalIndicatorConfigAttribute(C8502R.string.advanced_chart_edit_indicator_std_deviation, apiBollingerBands.getStd_dev(), TechnicalIndicatorConfigAttribute.Type.DECIMAL)});
        }
        if (apiTechnicalIndicator instanceof ApiTechnicalIndicator.ApiUnknownTechnicalIndicator) {
            return CollectionsKt.emptyList();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final List<TechnicalIndicatorConfigAttribute> toConfigAttributeList(ApiTechnicalIndicator.Type type2) {
        Intrinsics.checkNotNullParameter(type2, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[type2.ordinal()]) {
            case 1:
                int i = C8502R.string.advanced_chart_edit_indicator_period;
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(10);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                return CollectionsKt.listOf(new TechnicalIndicatorConfigAttribute(i, bigDecimalValueOf, TechnicalIndicatorConfigAttribute.Type.INTEGER));
            case 2:
                int i2 = C8502R.string.advanced_chart_edit_indicator_period;
                BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(9);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
                return CollectionsKt.listOf(new TechnicalIndicatorConfigAttribute(i2, bigDecimalValueOf2, TechnicalIndicatorConfigAttribute.Type.INTEGER));
            case 3:
                int i3 = C8502R.string.advanced_chart_edit_indicator_period;
                BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(14);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf3, "valueOf(...)");
                TechnicalIndicatorConfigAttribute.Type type3 = TechnicalIndicatorConfigAttribute.Type.INTEGER;
                TechnicalIndicatorConfigAttribute technicalIndicatorConfigAttribute = new TechnicalIndicatorConfigAttribute(i3, bigDecimalValueOf3, type3);
                int i4 = C8502R.string.advanced_chart_edit_indicator_overbought_level;
                BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(70);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf4, "valueOf(...)");
                TechnicalIndicatorConfigAttribute technicalIndicatorConfigAttribute2 = new TechnicalIndicatorConfigAttribute(i4, bigDecimalValueOf4, type3);
                int i5 = C8502R.string.advanced_chart_edit_indicator_oversold_level;
                BigDecimal bigDecimalValueOf5 = BigDecimal.valueOf(30);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf5, "valueOf(...)");
                return CollectionsKt.listOf((Object[]) new TechnicalIndicatorConfigAttribute[]{technicalIndicatorConfigAttribute, technicalIndicatorConfigAttribute2, new TechnicalIndicatorConfigAttribute(i5, bigDecimalValueOf5, type3)});
            case 4:
                return CollectionsKt.emptyList();
            case 5:
                int i6 = C8502R.string.advanced_chart_edit_indicator_fast_period;
                BigDecimal bigDecimalValueOf6 = BigDecimal.valueOf(12);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf6, "valueOf(...)");
                TechnicalIndicatorConfigAttribute.Type type4 = TechnicalIndicatorConfigAttribute.Type.INTEGER;
                TechnicalIndicatorConfigAttribute technicalIndicatorConfigAttribute3 = new TechnicalIndicatorConfigAttribute(i6, bigDecimalValueOf6, type4);
                int i7 = C8502R.string.advanced_chart_edit_indicator_slow_period;
                BigDecimal bigDecimalValueOf7 = BigDecimal.valueOf(26);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf7, "valueOf(...)");
                TechnicalIndicatorConfigAttribute technicalIndicatorConfigAttribute4 = new TechnicalIndicatorConfigAttribute(i7, bigDecimalValueOf7, type4);
                int i8 = C8502R.string.advanced_chart_edit_indicator_signal_period;
                BigDecimal bigDecimalValueOf8 = BigDecimal.valueOf(9);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf8, "valueOf(...)");
                return CollectionsKt.listOf((Object[]) new TechnicalIndicatorConfigAttribute[]{technicalIndicatorConfigAttribute3, technicalIndicatorConfigAttribute4, new TechnicalIndicatorConfigAttribute(i8, bigDecimalValueOf8, type4)});
            case 6:
            case 7:
            case 8:
                return CollectionsKt.emptyList();
            case 9:
                int i9 = C8502R.string.advanced_chart_edit_indicator_length_period;
                BigDecimal bigDecimalValueOf9 = BigDecimal.valueOf(20);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf9, "valueOf(...)");
                TechnicalIndicatorConfigAttribute technicalIndicatorConfigAttribute5 = new TechnicalIndicatorConfigAttribute(i9, bigDecimalValueOf9, TechnicalIndicatorConfigAttribute.Type.INTEGER);
                int i10 = C8502R.string.advanced_chart_edit_indicator_std_deviation;
                BigDecimal bigDecimalValueOf10 = BigDecimal.valueOf(2);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf10, "valueOf(...)");
                return CollectionsKt.listOf((Object[]) new TechnicalIndicatorConfigAttribute[]{technicalIndicatorConfigAttribute5, new TechnicalIndicatorConfigAttribute(i10, bigDecimalValueOf10, TechnicalIndicatorConfigAttribute.Type.DECIMAL)});
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final ApiTechnicalIndicator toApiTechnicalIndicator(List<TechnicalIndicatorConfigAttribute> list, ApiTechnicalIndicator.Type type2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(type2, "type");
        switch (WhenMappings.$EnumSwitchMapping$0[type2.ordinal()]) {
            case 1:
                return new ApiTechnicalIndicator.ApiSimpleMovingAverage(Boolean.TRUE, list.get(0).getValue().intValue());
            case 2:
                return new ApiTechnicalIndicator.ApiExponentialMovingAverage(Boolean.TRUE, list.get(0).getValue().intValue());
            case 3:
                return new ApiTechnicalIndicator.ApiRelativeStrengthIndex(Boolean.TRUE, Integer.valueOf(list.get(1).getValue().intValue()), Integer.valueOf(list.get(2).getValue().intValue()), list.get(0).getValue().intValue());
            case 4:
                return new ApiTechnicalIndicator.ApiVolumeWeightedAveragePrice(Boolean.TRUE);
            case 5:
                int iIntValue = list.get(0).getValue().intValue();
                int iIntValue2 = list.get(1).getValue().intValue();
                return new ApiTechnicalIndicator.ApiMovingAverageConvergenceDivergence(Boolean.TRUE, list.get(2).getValue().intValue(), iIntValue, iIntValue2);
            case 6:
            case 7:
            case 8:
                throw new IllegalStateException("Unknown ApiTechnicalIndicator type.");
            case 9:
                return new ApiTechnicalIndicator.ApiBollingerBands(Boolean.TRUE, null, list.get(0).getValue().intValue(), list.get(1).getValue(), 2, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
