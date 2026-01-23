package com.robinhood.android.equitydetail.p123ui.analytics;

import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.rosetta.eventlogging.GraphContext;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoggableViewContext.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toSpanContextInterval", "Lcom/robinhood/rosetta/eventlogging/GraphContext$Interval;", "Lcom/robinhood/models/ui/GraphSelection;", "feature-equity-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.analytics.LoggableViewContextKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class LoggableViewContext2 {

    /* compiled from: LoggableViewContext.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.analytics.LoggableViewContextKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }

    public static final GraphContext.Interval toSpanContextInterval(GraphSelection graphSelection) {
        Intrinsics.checkNotNullParameter(graphSelection, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[graphSelection.ordinal()]) {
            case 1:
                return GraphContext.Interval.HOUR;
            case 2:
            case 3:
            case 4:
                return GraphContext.Interval.DAY;
            case 5:
            case 6:
                return GraphContext.Interval.WEEK;
            case 7:
            case 8:
            case 9:
            case 10:
                return GraphContext.Interval.MONTH;
            case 11:
            case 12:
                return GraphContext.Interval.THREE_MONTHS;
            case 13:
            case 14:
            case 15:
                return GraphContext.Interval.YEAR;
            case 16:
            case 17:
                return GraphContext.Interval.FIVE_YEARS;
            case 18:
            case 19:
            case 20:
            case 21:
                return GraphContext.Interval.ALL;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
