package com.robinhood.android.equitydetail.p123ui.component;

import com.robinhood.android.educationtour.EducationTourElementIds;
import com.robinhood.android.equitydetail.C15314R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SdpDataRowType.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b.\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowType;", "", "labelRes", "", "educationTourId", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getLabelRes", "()I", "getEducationTourId", "()Ljava/lang/String;", "PositionShares", "PositionAverageCostWithAsterisk", "PositionAverageCost", "PositionAverageCostV2", "PositionAverageCredit", "PositionTodayReturn", "PositionTodayReturnVentures", "PositionTotalReturn", "PositionTotalReturnVentures", "PositionMarketValue", "PositionPortfolioDiversity", "StatsOpen", "StatsTodaysHigh", "StatsTodaysLow", "Stats52WeekHigh", "Stats52WeekHigh2", "Stats52WeekLow", "Stats52WeekLow2", "StatsVolume", "StatsOvernightVolume", "StatsOvernightVolume2", "StatsAverageVolume", "StatsAverageVolume2", "StatsMarketCap", "StatsPriceEarningsRatio", "StatsPriceEarningsRatio2", "StatsDividendYield", "StatsDividendYield2", "StatsAum", "Stats30DayYield", "Stats30DayYield2", "StatsExpenseRatio", "StatsSharesToShort", "StatsBorrowFee", "AnalystOverviewMorningstarRating", "AnalystOverviewEconomicMoat", "AnalystOverviewFairValue", "AnalystOverviewUncertainty", "AnalystOverviewStewardship", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class SdpDataRowType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SdpDataRowType[] $VALUES;
    public static final SdpDataRowType AnalystOverviewMorningstarRating;
    public static final SdpDataRowType PositionTotalReturn;
    private final String educationTourId;
    private final int labelRes;
    public static final SdpDataRowType PositionShares = new SdpDataRowType("PositionShares", 0, C15314R.string.instrument_detail_positions_shares_label, null, 2, null);
    public static final SdpDataRowType PositionAverageCostWithAsterisk = new SdpDataRowType("PositionAverageCostWithAsterisk", 1, C15314R.string.instrument_detail_positions_cost_with_asterisk_label, null, 2, null);
    public static final SdpDataRowType PositionAverageCost = new SdpDataRowType("PositionAverageCost", 2, C15314R.string.instrument_detail_positions_cost_label, null, 2, null);
    public static final SdpDataRowType PositionAverageCostV2 = new SdpDataRowType("PositionAverageCostV2", 3, C15314R.string.instrument_detail_positions_cost_label, null, 2, null);
    public static final SdpDataRowType PositionAverageCredit = new SdpDataRowType("PositionAverageCredit", 4, C15314R.string.instrument_detail_positions_credit_label, null, 2, null);
    public static final SdpDataRowType PositionTodayReturn = new SdpDataRowType("PositionTodayReturn", 5, C15314R.string.instrument_detail_positions_todays_return_label, null, 2, null);
    public static final SdpDataRowType PositionTodayReturnVentures = new SdpDataRowType("PositionTodayReturnVentures", 6, C15314R.string.instrument_detail_positions_todays_return_label, null, 2, null);
    public static final SdpDataRowType PositionTotalReturnVentures = new SdpDataRowType("PositionTotalReturnVentures", 8, C15314R.string.instrument_detail_positions_total_return_label, null, 2, null);
    public static final SdpDataRowType PositionMarketValue = new SdpDataRowType("PositionMarketValue", 9, C15314R.string.instrument_detail_positions_market_value_label, null, 2, null);
    public static final SdpDataRowType PositionPortfolioDiversity = new SdpDataRowType("PositionPortfolioDiversity", 10, C15314R.string.instrument_detail_positions_diversity_label, null, 2, null);
    public static final SdpDataRowType StatsOpen = new SdpDataRowType("StatsOpen", 11, C15314R.string.instrument_detail_statistics_open_label, EducationTourElementIds.STATS_OPEN_ELEMENT_ID);
    public static final SdpDataRowType StatsTodaysHigh = new SdpDataRowType("StatsTodaysHigh", 12, C15314R.string.instrument_detail_statistics_todays_high_label, EducationTourElementIds.STATS_HIGH_ELEMENT_ID);
    public static final SdpDataRowType StatsTodaysLow = new SdpDataRowType("StatsTodaysLow", 13, C15314R.string.instrument_detail_statistics_todays_low_label, EducationTourElementIds.STATS_LOW_ELEMENT_ID);
    public static final SdpDataRowType Stats52WeekHigh = new SdpDataRowType("Stats52WeekHigh", 14, C15314R.string.instrument_detail_statistics_high_52_week_label, EducationTourElementIds.STATS_52_WEEK_HIGH_ELEMENT_ID);
    public static final SdpDataRowType Stats52WeekHigh2 = new SdpDataRowType("Stats52WeekHigh2", 15, C15314R.string.instrument_detail_statistics_high_52_week_label_2, EducationTourElementIds.STATS_52_WEEK_HIGH_ELEMENT_ID);
    public static final SdpDataRowType Stats52WeekLow = new SdpDataRowType("Stats52WeekLow", 16, C15314R.string.instrument_detail_statistics_low_52_week_label, EducationTourElementIds.STATS_52_WEEK_LOW_ELEMENT_ID);
    public static final SdpDataRowType Stats52WeekLow2 = new SdpDataRowType("Stats52WeekLow2", 17, C15314R.string.instrument_detail_statistics_low_52_week_label_2, EducationTourElementIds.STATS_52_WEEK_LOW_ELEMENT_ID);
    public static final SdpDataRowType StatsVolume = new SdpDataRowType("StatsVolume", 18, C15314R.string.instrument_detail_statistics_volume_label, EducationTourElementIds.STATS_VOLUME_ELEMENT_ID);
    public static final SdpDataRowType StatsOvernightVolume = new SdpDataRowType("StatsOvernightVolume", 19, C15314R.string.instrument_detail_statistics_overnight_volume_label, EducationTourElementIds.STATS_OVERNIGHT_VOLUME_ELEMENT_ID);
    public static final SdpDataRowType StatsOvernightVolume2 = new SdpDataRowType("StatsOvernightVolume2", 20, C15314R.string.instrument_detail_statistics_overnight_volume_label_2, EducationTourElementIds.STATS_OVERNIGHT_VOLUME_ELEMENT_ID);
    public static final SdpDataRowType StatsAverageVolume = new SdpDataRowType("StatsAverageVolume", 21, C15314R.string.instrument_detail_statistics_average_volume_label, EducationTourElementIds.STATS_AVERAGE_VOLUME_ELEMENT_ID);
    public static final SdpDataRowType StatsAverageVolume2 = new SdpDataRowType("StatsAverageVolume2", 22, C15314R.string.instrument_detail_statistics_average_volume_label_2, EducationTourElementIds.STATS_AVERAGE_VOLUME_ELEMENT_ID);
    public static final SdpDataRowType StatsMarketCap = new SdpDataRowType("StatsMarketCap", 23, C15314R.string.instrument_detail_statistics_market_cap_label, EducationTourElementIds.STATS_MARKET_CAP_ELEMENT_ID);
    public static final SdpDataRowType StatsPriceEarningsRatio = new SdpDataRowType("StatsPriceEarningsRatio", 24, C15314R.string.instrument_detail_statistics_pe_ratio_label, EducationTourElementIds.STATS_PRICE_EARNINGS_RATIO_ELEMENT_ID);
    public static final SdpDataRowType StatsPriceEarningsRatio2 = new SdpDataRowType("StatsPriceEarningsRatio2", 25, C15314R.string.instrument_detail_statistics_pe_ratio_label_2, EducationTourElementIds.STATS_PRICE_EARNINGS_RATIO_ELEMENT_ID);
    public static final SdpDataRowType StatsDividendYield = new SdpDataRowType("StatsDividendYield", 26, C15314R.string.instrument_detail_statistics_dividend_yield_label, EducationTourElementIds.STATS_DIVIDEND_YIELD_ELEMENT_ID);
    public static final SdpDataRowType StatsDividendYield2 = new SdpDataRowType("StatsDividendYield2", 27, C15314R.string.instrument_detail_statistics_dividend_yield_label_2, EducationTourElementIds.STATS_DIVIDEND_YIELD_ELEMENT_ID);
    public static final SdpDataRowType StatsAum = new SdpDataRowType("StatsAum", 28, C15314R.string.instrument_detail_statistics_aum, EducationTourElementIds.STATS_AUM_ELEMENT_ID);
    public static final SdpDataRowType Stats30DayYield = new SdpDataRowType("Stats30DayYield", 29, C15314R.string.instrument_detail_statistics_30_day_yield, EducationTourElementIds.STATS_30_DAY_YIELD_ELEMENT_ID);
    public static final SdpDataRowType Stats30DayYield2 = new SdpDataRowType("Stats30DayYield2", 30, C15314R.string.instrument_detail_statistics_30_day_yield_2, EducationTourElementIds.STATS_30_DAY_YIELD_ELEMENT_ID);
    public static final SdpDataRowType StatsExpenseRatio = new SdpDataRowType("StatsExpenseRatio", 31, C15314R.string.instrument_detail_statistics_expense_ratio, EducationTourElementIds.STATS_EXPENSE_RATIO_ELEMENT_ID);
    public static final SdpDataRowType StatsSharesToShort = new SdpDataRowType("StatsSharesToShort", 32, C15314R.string.instrument_detail_statistics_shares_to_short_label, null, 2, 0 == true ? 1 : 0);
    public static final SdpDataRowType StatsBorrowFee = new SdpDataRowType("StatsBorrowFee", 33, C15314R.string.instrument_detail_statistics_borrow_fee_label, null, 2, null);
    public static final SdpDataRowType AnalystOverviewEconomicMoat = new SdpDataRowType("AnalystOverviewEconomicMoat", 35, C15314R.string.instrument_detail_analyst_report_moat, null, 2, null);
    public static final SdpDataRowType AnalystOverviewFairValue = new SdpDataRowType("AnalystOverviewFairValue", 36, C15314R.string.instrument_detail_analyst_report_fair_value, null, 2, null);
    public static final SdpDataRowType AnalystOverviewUncertainty = new SdpDataRowType("AnalystOverviewUncertainty", 37, C15314R.string.instrument_detail_analyst_report_uncertainty, null, 2, null);
    public static final SdpDataRowType AnalystOverviewStewardship = new SdpDataRowType("AnalystOverviewStewardship", 38, C15314R.string.instrument_detail_analyst_report_stewardship, null, 2, null);

    private static final /* synthetic */ SdpDataRowType[] $values() {
        return new SdpDataRowType[]{PositionShares, PositionAverageCostWithAsterisk, PositionAverageCost, PositionAverageCostV2, PositionAverageCredit, PositionTodayReturn, PositionTodayReturnVentures, PositionTotalReturn, PositionTotalReturnVentures, PositionMarketValue, PositionPortfolioDiversity, StatsOpen, StatsTodaysHigh, StatsTodaysLow, Stats52WeekHigh, Stats52WeekHigh2, Stats52WeekLow, Stats52WeekLow2, StatsVolume, StatsOvernightVolume, StatsOvernightVolume2, StatsAverageVolume, StatsAverageVolume2, StatsMarketCap, StatsPriceEarningsRatio, StatsPriceEarningsRatio2, StatsDividendYield, StatsDividendYield2, StatsAum, Stats30DayYield, Stats30DayYield2, StatsExpenseRatio, StatsSharesToShort, StatsBorrowFee, AnalystOverviewMorningstarRating, AnalystOverviewEconomicMoat, AnalystOverviewFairValue, AnalystOverviewUncertainty, AnalystOverviewStewardship};
    }

    public static EnumEntries<SdpDataRowType> getEntries() {
        return $ENTRIES;
    }

    private SdpDataRowType(String str, int i, int i2, String str2) {
        this.labelRes = i2;
        this.educationTourId = str2;
    }

    /* synthetic */ SdpDataRowType(String str, int i, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i3 & 2) != 0 ? null : str2);
    }

    public final int getLabelRes() {
        return this.labelRes;
    }

    public final String getEducationTourId() {
        return this.educationTourId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        PositionTotalReturn = new SdpDataRowType("PositionTotalReturn", 7, C15314R.string.instrument_detail_positions_total_return_label, null, 2, defaultConstructorMarker);
        AnalystOverviewMorningstarRating = new SdpDataRowType("AnalystOverviewMorningstarRating", 34, C15314R.string.instrument_detail_analyst_report_rating, null, 2, defaultConstructorMarker);
        SdpDataRowType[] sdpDataRowTypeArr$values = $values();
        $VALUES = sdpDataRowTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(sdpDataRowTypeArr$values);
    }

    public static SdpDataRowType valueOf(String str) {
        return (SdpDataRowType) Enum.valueOf(SdpDataRowType.class, str);
    }

    public static SdpDataRowType[] values() {
        return (SdpDataRowType[]) $VALUES.clone();
    }
}
