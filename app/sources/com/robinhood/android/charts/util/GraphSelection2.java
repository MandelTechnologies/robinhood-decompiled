package com.robinhood.android.charts.util;

import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GraphSelection.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0002*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"displaySpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "Lcom/robinhood/models/ui/GraphSelection;", "getDisplaySpan", "(Lcom/robinhood/models/ui/GraphSelection;)Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "equityGraphSelection", "getEquityGraphSelection", "(Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;)Lcom/robinhood/models/ui/GraphSelection;", "lib-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.charts.util.GraphSelectionKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class GraphSelection2 {

    /* compiled from: GraphSelection.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.charts.util.GraphSelectionKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[GraphSelection.values().length];
            try {
                iArr[GraphSelection.HOUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GraphSelection.DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GraphSelection.ALL_DAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GraphSelection.TWENTY_FOUR_HOURS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GraphSelection.WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GraphSelection.WEEK_CRYPTO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GraphSelection.MONTH_HOURLY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[GraphSelection.MONTH_CRYPTO_HOURLY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[GraphSelection.MONTH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[GraphSelection.MONTH_CRYPTO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[GraphSelection.THREE_MONTHS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[GraphSelection.THREE_MONTHS_CRYPTO.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[GraphSelection.YEAR_TO_DATE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[GraphSelection.YEAR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[GraphSelection.YEAR_CRYPTO.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[GraphSelection.FIVE_YEARS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[GraphSelection.FIVE_YEARS_CRYPTO.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[GraphSelection.MAX.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[GraphSelection.MAX_CRYPTO.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[GraphSelection.ALL.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[GraphSelection.ALL_CRYPTO.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DisplaySpan.values().length];
            try {
                iArr2[DisplaySpan.HOUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[DisplaySpan.DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[DisplaySpan.WEEK.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[DisplaySpan.MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[DisplaySpan.f93673MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[DisplaySpan.YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[DisplaySpan.YTD.ordinal()] = 7;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[DisplaySpan.f93695YEAR.ordinal()] = 8;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[DisplaySpan.ALL.ordinal()] = 9;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[DisplaySpan.f93684HOUR.ordinal()] = 10;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[DisplaySpan.CORTEX_INSIGHTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[DisplaySpan.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused33) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final DisplaySpan getDisplaySpan(GraphSelection graphSelection) {
        Intrinsics.checkNotNullParameter(graphSelection, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[graphSelection.ordinal()]) {
            case 1:
                return DisplaySpan.HOUR;
            case 2:
            case 3:
            case 4:
                return DisplaySpan.DAY;
            case 5:
            case 6:
                return DisplaySpan.WEEK;
            case 7:
            case 8:
            case 9:
            case 10:
                return DisplaySpan.MONTH;
            case 11:
            case 12:
                return DisplaySpan.f93673MONTH;
            case 13:
                return DisplaySpan.YTD;
            case 14:
            case 15:
                return DisplaySpan.YEAR;
            case 16:
            case 17:
                return DisplaySpan.f93695YEAR;
            case 18:
            case 19:
            case 20:
            case 21:
                return DisplaySpan.ALL;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final GraphSelection getEquityGraphSelection(DisplaySpan displaySpan) {
        Intrinsics.checkNotNullParameter(displaySpan, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[displaySpan.ordinal()]) {
            case 1:
                return GraphSelection.HOUR;
            case 2:
                return GraphSelection.DAY;
            case 3:
                return GraphSelection.WEEK;
            case 4:
                return GraphSelection.MONTH;
            case 5:
                return GraphSelection.THREE_MONTHS;
            case 6:
            case 7:
                return GraphSelection.YEAR;
            case 8:
                return GraphSelection.FIVE_YEARS;
            case 9:
                return GraphSelection.ALL;
            case 10:
            case 11:
            case 12:
                return GraphSelection.ALL;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
