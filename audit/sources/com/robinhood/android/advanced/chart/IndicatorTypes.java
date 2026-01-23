package com.robinhood.android.advanced.chart;

import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndicatorTypes.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0005"}, m3636d2 = {"getAbbreviationResId", "", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator$Type;", "getFullNameResId", "getInfoContentResId", "feature-lib-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advanced.chart.IndicatorTypesKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class IndicatorTypes {

    /* compiled from: IndicatorTypes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advanced.chart.IndicatorTypesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiTechnicalIndicator.Type.values().length];
            try {
                iArr[ApiTechnicalIndicator.Type.SMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiTechnicalIndicator.Type.RSI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiTechnicalIndicator.Type.MACD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiTechnicalIndicator.Type.EMA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiTechnicalIndicator.Type.VWAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiTechnicalIndicator.Type.BOLL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiTechnicalIndicator.Type.DEPTH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ApiTechnicalIndicator.Type.ORDER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ApiTechnicalIndicator.Type.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getAbbreviationResId(ApiTechnicalIndicator.Type type2) {
        Intrinsics.checkNotNullParameter(type2, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[type2.ordinal()]) {
            case 1:
                return C8457R.string.advanced_chart_indicator_type_ma;
            case 2:
                return C8457R.string.advanced_chart_indicator_type_rsi;
            case 3:
                return C8457R.string.advanced_chart_indicator_type_macd;
            case 4:
                return C8457R.string.advanced_chart_indicator_type_ema;
            case 5:
                return C8457R.string.advanced_chart_indicator_type_vwap;
            case 6:
                return C8457R.string.advanced_chart_indicator_type_boll;
            case 7:
            case 8:
            case 9:
                return C8457R.string.advanced_chart_empty_string;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int getFullNameResId(ApiTechnicalIndicator.Type type2) {
        Intrinsics.checkNotNullParameter(type2, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[type2.ordinal()]) {
            case 1:
                return C8457R.string.advanced_chart_info_bottom_sheet_title_ma;
            case 2:
                return C8457R.string.advanced_chart_info_bottom_sheet_title_rsi;
            case 3:
                return C8457R.string.advanced_chart_info_bottom_sheet_title_macd;
            case 4:
                return C8457R.string.advanced_chart_info_bottom_sheet_title_ema;
            case 5:
                return C8457R.string.advanced_chart_info_bottom_sheet_title_vwap;
            case 6:
                return C8457R.string.advanced_chart_info_bottom_sheet_title_boll;
            case 7:
            case 8:
            case 9:
                return C8457R.string.advanced_chart_empty_string;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int getInfoContentResId(ApiTechnicalIndicator.Type type2) {
        Intrinsics.checkNotNullParameter(type2, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[type2.ordinal()]) {
            case 1:
                return C8457R.string.advanced_chart_info_bottom_sheet_content_ma;
            case 2:
                return C8457R.string.advanced_chart_info_bottom_sheet_content_rsi;
            case 3:
                return C8457R.string.advanced_chart_info_bottom_sheet_content_macd;
            case 4:
                return C8457R.string.advanced_chart_info_bottom_sheet_content_ema;
            case 5:
                return C8457R.string.advanced_chart_info_bottom_sheet_content_vwap;
            case 6:
                return C8457R.string.advanced_chart_info_bottom_sheet_content_boll;
            case 7:
            case 8:
            case 9:
                return C8457R.string.advanced_chart_empty_string;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
