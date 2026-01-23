package com.robinhood.android.charts.span;

import com.robinhood.android.charts.C10974R;
import com.robinhood.android.educationtour.EducationTourElementIds;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChartDisplaySpanExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"stringRes", "", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "getStringRes", "(Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;)I", "educationTourId", "", "getEducationTourId", "(Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;)Ljava/lang/String;", "lib-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.charts.span.ChartDisplaySpanExtensionsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ChartDisplaySpanExtensions {

    /* compiled from: ChartDisplaySpanExtensions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.charts.span.ChartDisplaySpanExtensionsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisplaySpan.values().length];
            try {
                iArr[DisplaySpan.HOUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplaySpan.DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisplaySpan.WEEK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DisplaySpan.MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DisplaySpan.f93673MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DisplaySpan.YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DisplaySpan.f93695YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DisplaySpan.ALL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DisplaySpan.YTD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[DisplaySpan.f93684HOUR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[DisplaySpan.CORTEX_INSIGHTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[DisplaySpan.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getStringRes(DisplaySpan displaySpan) {
        Intrinsics.checkNotNullParameter(displaySpan, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[displaySpan.ordinal()]) {
            case 1:
                return C10974R.string.display_span_hour;
            case 2:
                return C10974R.string.display_span_day;
            case 3:
                return C10974R.string.display_span_week;
            case 4:
                return C10974R.string.display_span_month;
            case 5:
                return C10974R.string.display_span_three_months;
            case 6:
                return C10974R.string.display_span_year;
            case 7:
                return C10974R.string.display_span_five_year;
            case 8:
                return C10974R.string.display_span_all;
            case 9:
                return C10974R.string.display_span_ytd;
            case 10:
            case 11:
            case 12:
                return C10974R.string.display_span_unknown;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String getEducationTourId(DisplaySpan displaySpan) {
        Intrinsics.checkNotNullParameter(displaySpan, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[displaySpan.ordinal()]) {
            case 1:
                return EducationTourElementIds.PRICE_CHART_ONE_HOUR_ELEMENT_ID;
            case 2:
                return EducationTourElementIds.PRICE_CHART_ONE_DAY_ELEMENT_ID;
            case 3:
                return EducationTourElementIds.PRICE_CHART_ONE_WEEK_ELEMENT_ID;
            case 4:
                return EducationTourElementIds.PRICE_CHART_ONE_MONTH_ELEMENT_ID;
            case 5:
                return EducationTourElementIds.PRICE_CHART_THREE_MONTHS_ELEMENT_ID;
            case 6:
                return EducationTourElementIds.PRICE_CHART_ONE_YEAR_ELEMENT_ID;
            case 7:
                return EducationTourElementIds.PRICE_CHART_FIVE_YEARS_ELEMENT_ID;
            case 8:
                return EducationTourElementIds.PRICE_CHART_ALL_ELEMENT_ID;
            case 9:
                return EducationTourElementIds.PRICE_CHART_YEAR_TO_DATE;
            case 10:
            case 11:
            case 12:
                return "";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
