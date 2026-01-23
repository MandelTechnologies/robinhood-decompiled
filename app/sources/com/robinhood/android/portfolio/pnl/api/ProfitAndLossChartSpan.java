package com.robinhood.android.portfolio.pnl.api;

import com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.futures.charts.DisplaySpans;
import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProfitAndLossChartSpan.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossChartSpan;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "UNKNOWN", "WEEK", "MONTH", "THREE_MONTHS", DisplaySpans.YTD, "MAX", "Companion", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ProfitAndLossChartSpan implements RhEnum<ProfitAndLossChartSpan> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProfitAndLossChartSpan[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String serverValue;
    public static final ProfitAndLossChartSpan UNKNOWN = new ProfitAndLossChartSpan("UNKNOWN", 0, "unknown");
    public static final ProfitAndLossChartSpan WEEK = new ProfitAndLossChartSpan("WEEK", 1, "week");
    public static final ProfitAndLossChartSpan MONTH = new ProfitAndLossChartSpan("MONTH", 2, ManagedDashboardOverviewDuxo.DEFAULT_SPAN_RETURNS);
    public static final ProfitAndLossChartSpan THREE_MONTHS = new ProfitAndLossChartSpan("THREE_MONTHS", 3, "3month");
    public static final ProfitAndLossChartSpan YTD = new ProfitAndLossChartSpan(DisplaySpans.YTD, 4, "ytd");
    public static final ProfitAndLossChartSpan MAX = new ProfitAndLossChartSpan("MAX", 5, AnalyticsStrings.MAX_WELCOME_TAG);

    private static final /* synthetic */ ProfitAndLossChartSpan[] $values() {
        return new ProfitAndLossChartSpan[]{UNKNOWN, WEEK, MONTH, THREE_MONTHS, YTD, MAX};
    }

    @JvmStatic
    public static ProfitAndLossChartSpan fromServerValue(String str) {
        return INSTANCE.fromServerValue(str);
    }

    public static EnumEntries<ProfitAndLossChartSpan> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static String toServerValue(ProfitAndLossChartSpan profitAndLossChartSpan) {
        return INSTANCE.toServerValue(profitAndLossChartSpan);
    }

    private ProfitAndLossChartSpan(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        ProfitAndLossChartSpan[] profitAndLossChartSpanArr$values = $values();
        $VALUES = profitAndLossChartSpanArr$values;
        $ENTRIES = EnumEntries2.enumEntries(profitAndLossChartSpanArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: ProfitAndLossChartSpan.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0017¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossChartSpan$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossChartSpan;", "<init>", "()V", "toServerValue", "", "enumValue", "fromServerValue", "serverValue", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion extends RhEnum.Converter.Defaulted<ProfitAndLossChartSpan> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(ProfitAndLossChartSpan.values(), ProfitAndLossChartSpan.UNKNOWN, false, 4, null);
        }

        @Override // com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public String toServerValue(ProfitAndLossChartSpan enumValue) {
            return super.toServerValue((Enum) enumValue);
        }

        @Override // com.robinhood.enums.RhEnum.Converter.Defaulted, com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public ProfitAndLossChartSpan fromServerValue(String serverValue) {
            return (ProfitAndLossChartSpan) super.fromServerValue(serverValue);
        }
    }

    public static ProfitAndLossChartSpan valueOf(String str) {
        return (ProfitAndLossChartSpan) Enum.valueOf(ProfitAndLossChartSpan.class, str);
    }

    public static ProfitAndLossChartSpan[] values() {
        return (ProfitAndLossChartSpan[]) $VALUES.clone();
    }
}
