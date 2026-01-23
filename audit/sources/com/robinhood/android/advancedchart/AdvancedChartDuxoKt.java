package com.robinhood.android.advancedchart;

import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.p355ui.Historical;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AdvancedChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m3636d2 = {"toGraphSelection", "Lcom/robinhood/models/ui/GraphSelection;", "Lcom/robinhood/models/ui/Historical$Span;", "feature-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AdvancedChartDuxoKt {

    /* compiled from: AdvancedChartDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Historical.Span.values().length];
            try {
                iArr[Historical.Span.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Historical.Span.HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Historical.Span.WEEK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Historical.Span.MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Historical.Span.THREE_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Historical.Span.YTD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Historical.Span.YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Historical.Span.FIVE_YEARS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Historical.Span.ALL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GraphSelection toGraphSelection(Historical.Span span) {
        switch (WhenMappings.$EnumSwitchMapping$0[span.ordinal()]) {
            case 1:
                return GraphSelection.DAY;
            case 2:
                return GraphSelection.HOUR;
            case 3:
                return GraphSelection.WEEK;
            case 4:
                return GraphSelection.MONTH;
            case 5:
                return GraphSelection.THREE_MONTHS;
            case 6:
                return GraphSelection.YEAR_TO_DATE;
            case 7:
                return GraphSelection.YEAR;
            case 8:
                return GraphSelection.FIVE_YEARS;
            case 9:
                return GraphSelection.MAX;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
