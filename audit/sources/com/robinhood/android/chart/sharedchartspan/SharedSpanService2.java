package com.robinhood.android.chart.sharedchartspan;

import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SharedSpanService.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002H\u0002¨\u0006\u0005"}, m3636d2 = {"toDisplaySpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "Lcom/robinhood/android/chart/sharedchartspan/UnifiedSpan;", "toSpanString", "", "lib-shared-chart-span_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.sharedchartspan.SharedSpanServiceKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class SharedSpanService2 {

    /* compiled from: SharedSpanService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.chart.sharedchartspan.SharedSpanServiceKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UnifiedSpan.values().length];
            try {
                iArr[UnifiedSpan.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UnifiedSpan.LIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UnifiedSpan.FOUR_HOUR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UnifiedSpan.DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UnifiedSpan.WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UnifiedSpan.MONTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[UnifiedSpan.THREE_MONTH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[UnifiedSpan.YTD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[UnifiedSpan.YEAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[UnifiedSpan.FIVE_YEAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[UnifiedSpan.ALL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisplaySpan toDisplaySpan(UnifiedSpan unifiedSpan) {
        switch (WhenMappings.$EnumSwitchMapping$0[unifiedSpan.ordinal()]) {
            case 1:
                return DisplaySpan.UNKNOWN;
            case 2:
                return DisplaySpan.HOUR;
            case 3:
                return DisplaySpan.f93684HOUR;
            case 4:
                return DisplaySpan.DAY;
            case 5:
                return DisplaySpan.WEEK;
            case 6:
                return DisplaySpan.MONTH;
            case 7:
                return DisplaySpan.f93673MONTH;
            case 8:
                return DisplaySpan.YTD;
            case 9:
                return DisplaySpan.YEAR;
            case 10:
                return DisplaySpan.f93695YEAR;
            case 11:
                return DisplaySpan.ALL;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toSpanString(UnifiedSpan unifiedSpan) {
        switch (WhenMappings.$EnumSwitchMapping$0[unifiedSpan.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return null;
            case 4:
                return "1d";
            case 5:
                return "1w";
            case 6:
                return "1mo";
            case 7:
                return "3mo";
            case 8:
                return "ytd";
            case 9:
                return "1y";
            case 10:
                return "5y";
            case 11:
                return ApiRenderablePlatforms.VERSIONS_ALL;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
