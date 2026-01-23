package com.robinhood.android.futures.charts;

import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import microgram.p507ui.sdui.SduiDisplaySpan;

/* compiled from: DisplaySpans.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0000¨\u0006\u0004"}, m3636d2 = {"toMicrogramDisplaySpan", "Lmicrogram/ui/sdui/SduiDisplaySpan;", "", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "lib-futures-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.charts.DisplaySpansKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class DisplaySpans2 {

    /* compiled from: DisplaySpans.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.charts.DisplaySpansKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisplaySpan.values().length];
            try {
                iArr[DisplaySpan.CORTEX_INSIGHTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplaySpan.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisplaySpan.HOUR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DisplaySpan.f93684HOUR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DisplaySpan.DAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DisplaySpan.WEEK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DisplaySpan.MONTH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DisplaySpan.f93673MONTH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DisplaySpan.YTD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[DisplaySpan.YEAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[DisplaySpan.f93695YEAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[DisplaySpan.ALL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final SduiDisplaySpan toMicrogramDisplaySpan(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iHashCode = str.hashCode();
        if (iHashCode != 1596) {
            if (iHashCode != 1606) {
                if (iHashCode != 1608) {
                    if (iHashCode != 1658) {
                        if (iHashCode != 64897) {
                            if (iHashCode == 88201 && str.equals(DisplaySpans.YTD)) {
                                return SduiDisplaySpan.YTD;
                            }
                        } else if (str.equals(DisplaySpans.ALL)) {
                            return SduiDisplaySpan.ALL;
                        }
                    } else if (str.equals(DisplaySpans.THREE_MONTHS)) {
                        return SduiDisplaySpan.THE_3_MONTH;
                    }
                } else if (str.equals(DisplaySpans.YEAR)) {
                    return SduiDisplaySpan.YEAR;
                }
            } else if (str.equals(DisplaySpans.WEEK)) {
                return SduiDisplaySpan.WEEK;
            }
        } else if (str.equals(DisplaySpans.MONTH)) {
            return SduiDisplaySpan.MONTH;
        }
        throw new IllegalStateException((str + " is not a supported span for Futures Performance Chart").toString());
    }

    public static final SduiDisplaySpan toMicrogramDisplaySpan(DisplaySpan displaySpan) {
        Intrinsics.checkNotNullParameter(displaySpan, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[displaySpan.ordinal()]) {
            case 1:
            case 2:
                return SduiDisplaySpan.UNKNOWN;
            case 3:
                return SduiDisplaySpan.HOUR;
            case 4:
                return SduiDisplaySpan.THE_4_HOUR;
            case 5:
                return SduiDisplaySpan.DAY;
            case 6:
                return SduiDisplaySpan.WEEK;
            case 7:
                return SduiDisplaySpan.MONTH;
            case 8:
                return SduiDisplaySpan.THE_3_MONTH;
            case 9:
                return SduiDisplaySpan.YTD;
            case 10:
                return SduiDisplaySpan.YEAR;
            case 11:
                return SduiDisplaySpan.THE_5_YEAR;
            case 12:
                return SduiDisplaySpan.ALL;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
