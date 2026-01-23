package com.robinhood.android.equitydetail.p123ui.statistics;

import com.robinhood.android.common.util.extensions.NumberFormats;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.component.SdpDataRow3;
import com.robinhood.android.equitydetail.p123ui.component.SdpDataRowType;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.lib.utils.BigDecimals2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Position5;
import com.robinhood.models.p320db.Tradability;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.Fundamental;
import com.robinhood.shared.equities.subzero.ShortingInfo;
import com.robinhood.shared.equities.subzero.ShortingInventoryRange;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: StatisticsSectionData.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0018\u001a\u00020\u0017*\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0012\u0010\u001c\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0002J\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001f0@J\t\u0010E\u001a\u00020\u0003HÂ\u0003J\t\u0010F\u001a\u00020\u0003HÂ\u0003J\t\u0010G\u001a\u00020\u0006HÂ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\bHÂ\u0003J\t\u0010I\u001a\u00020\u0003HÂ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u000bHÂ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\rHÂ\u0003J\t\u0010L\u001a\u00020\u000fHÂ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0011HÂ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0013HÂ\u0003Jw\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u0010P\u001a\u00020\u00032\b\u0010Q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010R\u001a\u00020\u000fHÖ\u0001J\t\u0010S\u001a\u00020\u0017HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0014\u0010$\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010!R\u0016\u0010&\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010!R\u0014\u0010(\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010!R\u0014\u0010*\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010!R\u0014\u0010,\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010!R\u0014\u0010.\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010!R\u0014\u00100\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010!R\u0014\u00102\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u0010!R\u0016\u00104\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u0010!R\u0016\u00106\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u0010!R\u001c\u00108\u001a\u0004\u0018\u00010\u001f8@X\u0081\u0004¢\u0006\f\u0012\u0004\b9\u0010:\u001a\u0004\b;\u0010!R\u001c\u0010<\u001a\u0004\u0018\u00010\u001f8@X\u0081\u0004¢\u0006\f\u0012\u0004\b=\u0010:\u001a\u0004\b>\u0010!R\u0011\u0010A\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006T"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/statistics/StatisticsSectionData;", "", "showOvernightVolume", "", "isInBidAskSdpStatsExperiment", "fundamental", "Lcom/robinhood/shared/equities/models/instrumentdetails/db/Fundamental;", "etpDetails", "Lcom/robinhood/models/db/EtpDetails;", "isInEquitiesSubzeroExperiment", "position", "Lcom/robinhood/models/db/Position;", "shortingInfo", "Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "columnCount", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "account", "Lcom/robinhood/models/db/Account;", "<init>", "(ZZLcom/robinhood/shared/equities/models/instrumentdetails/db/Fundamental;Lcom/robinhood/models/db/EtpDetails;ZLcom/robinhood/models/db/Position;Lcom/robinhood/shared/equities/subzero/ShortingInfo;ILcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Account;)V", "emptyStateString", "", "truncate", "Ljava/math/BigDecimal;", "formatter", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "formatDecimal", "any", "statsOpen", "Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowState;", "getStatsOpen", "()Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowState;", "statsVolume", "getStatsVolume", "statsTodaysHigh", "getStatsTodaysHigh", "statsOvernightVolumeOrNull", "getStatsOvernightVolumeOrNull", "statsAverageVolume", "getStatsAverageVolume", "statsTodaysLow", "getStatsTodaysLow", "marketCapOrAum", "getMarketCapOrAum", "stats52WeekHigh", "getStats52WeekHigh", "statsPriceEarningsRatio", "getStatsPriceEarningsRatio", "stats52WeekLow", "getStats52WeekLow", "yieldOrNull", "getYieldOrNull", "expenseRatioOrNull", "getExpenseRatioOrNull", "statsSharesToShort", "getStatsSharesToShort$feature_equity_detail_externalDebug$annotations", "()V", "getStatsSharesToShort$feature_equity_detail_externalDebug", "statsBorrowFee", "getStatsBorrowFee$feature_equity_detail_externalDebug$annotations", "getStatsBorrowFee$feature_equity_detail_externalDebug", "buildDataRows", "Lkotlinx/collections/immutable/ImmutableList;", "instrumentId", "Ljava/util/UUID;", "getInstrumentId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StatisticsSectionData {
    public static final int $stable = 8;
    private final Account account;
    private final int columnCount;
    private final String emptyStateString;
    private final EtpDetails etpDetails;
    private final Fundamental fundamental;
    private final Instrument instrument;
    private final boolean isInBidAskSdpStatsExperiment;
    private final boolean isInEquitiesSubzeroExperiment;
    private final Position position;
    private final ShortingInfo shortingInfo;
    private final boolean showOvernightVolume;

    /* compiled from: StatisticsSectionData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShortingInventoryRange.values().length];
            try {
                iArr[ShortingInventoryRange.FIFTY_TO_250.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShortingInventoryRange.TWO_FIFTY_TO_500.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShortingInventoryRange.FIVE_HUNDRED_TO_1_MILLION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShortingInventoryRange.GREATER_THAN_1_MILLION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShortingInventoryRange.LESS_THAN_50.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ShortingInventoryRange.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final boolean getShowOvernightVolume() {
        return this.showOvernightVolume;
    }

    /* renamed from: component10, reason: from getter */
    private final Account getAccount() {
        return this.account;
    }

    /* renamed from: component2, reason: from getter */
    private final boolean getIsInBidAskSdpStatsExperiment() {
        return this.isInBidAskSdpStatsExperiment;
    }

    /* renamed from: component3, reason: from getter */
    private final Fundamental getFundamental() {
        return this.fundamental;
    }

    /* renamed from: component4, reason: from getter */
    private final EtpDetails getEtpDetails() {
        return this.etpDetails;
    }

    /* renamed from: component5, reason: from getter */
    private final boolean getIsInEquitiesSubzeroExperiment() {
        return this.isInEquitiesSubzeroExperiment;
    }

    /* renamed from: component6, reason: from getter */
    private final Position getPosition() {
        return this.position;
    }

    /* renamed from: component7, reason: from getter */
    private final ShortingInfo getShortingInfo() {
        return this.shortingInfo;
    }

    /* renamed from: component8, reason: from getter */
    private final int getColumnCount() {
        return this.columnCount;
    }

    /* renamed from: component9, reason: from getter */
    private final Instrument getInstrument() {
        return this.instrument;
    }

    public static /* synthetic */ StatisticsSectionData copy$default(StatisticsSectionData statisticsSectionData, boolean z, boolean z2, Fundamental fundamental, EtpDetails etpDetails, boolean z3, Position position, ShortingInfo shortingInfo, int i, Instrument instrument, Account account, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = statisticsSectionData.showOvernightVolume;
        }
        if ((i2 & 2) != 0) {
            z2 = statisticsSectionData.isInBidAskSdpStatsExperiment;
        }
        if ((i2 & 4) != 0) {
            fundamental = statisticsSectionData.fundamental;
        }
        if ((i2 & 8) != 0) {
            etpDetails = statisticsSectionData.etpDetails;
        }
        if ((i2 & 16) != 0) {
            z3 = statisticsSectionData.isInEquitiesSubzeroExperiment;
        }
        if ((i2 & 32) != 0) {
            position = statisticsSectionData.position;
        }
        if ((i2 & 64) != 0) {
            shortingInfo = statisticsSectionData.shortingInfo;
        }
        if ((i2 & 128) != 0) {
            i = statisticsSectionData.columnCount;
        }
        if ((i2 & 256) != 0) {
            instrument = statisticsSectionData.instrument;
        }
        if ((i2 & 512) != 0) {
            account = statisticsSectionData.account;
        }
        Instrument instrument2 = instrument;
        Account account2 = account;
        ShortingInfo shortingInfo2 = shortingInfo;
        int i3 = i;
        boolean z4 = z3;
        Position position2 = position;
        return statisticsSectionData.copy(z, z2, fundamental, etpDetails, z4, position2, shortingInfo2, i3, instrument2, account2);
    }

    /* renamed from: getStatsBorrowFee$feature_equity_detail_externalDebug$annotations */
    public static /* synthetic */ void m1985x897ea10f() {
    }

    /* renamed from: getStatsSharesToShort$feature_equity_detail_externalDebug$annotations */
    public static /* synthetic */ void m1986x210c87eb() {
    }

    public final StatisticsSectionData copy(boolean showOvernightVolume, boolean isInBidAskSdpStatsExperiment, Fundamental fundamental, EtpDetails etpDetails, boolean isInEquitiesSubzeroExperiment, Position position, ShortingInfo shortingInfo, int columnCount, Instrument instrument, Account account) {
        Intrinsics.checkNotNullParameter(fundamental, "fundamental");
        return new StatisticsSectionData(showOvernightVolume, isInBidAskSdpStatsExperiment, fundamental, etpDetails, isInEquitiesSubzeroExperiment, position, shortingInfo, columnCount, instrument, account);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatisticsSectionData)) {
            return false;
        }
        StatisticsSectionData statisticsSectionData = (StatisticsSectionData) other;
        return this.showOvernightVolume == statisticsSectionData.showOvernightVolume && this.isInBidAskSdpStatsExperiment == statisticsSectionData.isInBidAskSdpStatsExperiment && Intrinsics.areEqual(this.fundamental, statisticsSectionData.fundamental) && Intrinsics.areEqual(this.etpDetails, statisticsSectionData.etpDetails) && this.isInEquitiesSubzeroExperiment == statisticsSectionData.isInEquitiesSubzeroExperiment && Intrinsics.areEqual(this.position, statisticsSectionData.position) && Intrinsics.areEqual(this.shortingInfo, statisticsSectionData.shortingInfo) && this.columnCount == statisticsSectionData.columnCount && Intrinsics.areEqual(this.instrument, statisticsSectionData.instrument) && Intrinsics.areEqual(this.account, statisticsSectionData.account);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.showOvernightVolume) * 31) + Boolean.hashCode(this.isInBidAskSdpStatsExperiment)) * 31) + this.fundamental.hashCode()) * 31;
        EtpDetails etpDetails = this.etpDetails;
        int iHashCode2 = (((iHashCode + (etpDetails == null ? 0 : etpDetails.hashCode())) * 31) + Boolean.hashCode(this.isInEquitiesSubzeroExperiment)) * 31;
        Position position = this.position;
        int iHashCode3 = (iHashCode2 + (position == null ? 0 : position.hashCode())) * 31;
        ShortingInfo shortingInfo = this.shortingInfo;
        int iHashCode4 = (((iHashCode3 + (shortingInfo == null ? 0 : shortingInfo.hashCode())) * 31) + Integer.hashCode(this.columnCount)) * 31;
        Instrument instrument = this.instrument;
        int iHashCode5 = (iHashCode4 + (instrument == null ? 0 : instrument.hashCode())) * 31;
        Account account = this.account;
        return iHashCode5 + (account != null ? account.hashCode() : 0);
    }

    public String toString() {
        return "StatisticsSectionData(showOvernightVolume=" + this.showOvernightVolume + ", isInBidAskSdpStatsExperiment=" + this.isInBidAskSdpStatsExperiment + ", fundamental=" + this.fundamental + ", etpDetails=" + this.etpDetails + ", isInEquitiesSubzeroExperiment=" + this.isInEquitiesSubzeroExperiment + ", position=" + this.position + ", shortingInfo=" + this.shortingInfo + ", columnCount=" + this.columnCount + ", instrument=" + this.instrument + ", account=" + this.account + ")";
    }

    public StatisticsSectionData(boolean z, boolean z2, Fundamental fundamental, EtpDetails etpDetails, boolean z3, Position position, ShortingInfo shortingInfo, int i, Instrument instrument, Account account) {
        Intrinsics.checkNotNullParameter(fundamental, "fundamental");
        this.showOvernightVolume = z;
        this.isInBidAskSdpStatsExperiment = z2;
        this.fundamental = fundamental;
        this.etpDetails = etpDetails;
        this.isInEquitiesSubzeroExperiment = z3;
        this.position = position;
        this.shortingInfo = shortingInfo;
        this.columnCount = i;
        this.instrument = instrument;
        this.account = account;
        this.emptyStateString = "-";
    }

    private final String truncate(BigDecimal bigDecimal, NumberFormatter numberFormatter) {
        return BigDecimals2.truncateLargeOrNotAvailable(bigDecimal, numberFormatter, this.emptyStateString);
    }

    private final String formatDecimal(Object any) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.getDefault(Locale.Category.FORMAT));
        Intrinsics.checkNotNullExpressionValue(numberInstance, "getNumberInstance(...)");
        return NumberFormats.formatNullable$default(numberInstance, any, null, 2, null);
    }

    private final SdpDataRow3 getStatsOpen() {
        return new SdpDataRow3.Default(SdpDataRowType.StatsOpen, null, StringResource.INSTANCE.invoke(NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), this.fundamental.getOpen(), null, 2, null)), null, null, null, 58, null);
    }

    private final SdpDataRow3 getStatsVolume() {
        return new SdpDataRow3.Default(SdpDataRowType.StatsVolume, null, StringResource.INSTANCE.invoke(truncate(this.fundamental.getVolume(), Formats.getInterestRateFormatShort())), null, null, null, 58, null);
    }

    private final SdpDataRow3 getStatsTodaysHigh() {
        return new SdpDataRow3.Default(SdpDataRowType.StatsTodaysHigh, null, StringResource.INSTANCE.invoke(NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), this.fundamental.getHigh(), null, 2, null)), null, null, null, 58, null);
    }

    private final SdpDataRow3 getStatsOvernightVolumeOrNull() {
        SdpDataRowType sdpDataRowType;
        if (!this.showOvernightVolume) {
            return null;
        }
        if (this.isInBidAskSdpStatsExperiment) {
            sdpDataRowType = SdpDataRowType.StatsOvernightVolume2;
        } else {
            sdpDataRowType = SdpDataRowType.StatsOvernightVolume;
        }
        return new SdpDataRow3.Default(sdpDataRowType, null, StringResource.INSTANCE.invoke(truncate(this.fundamental.getOvernightVolume(), Formats.getIntegerFormat())), null, null, null, 58, null);
    }

    private final SdpDataRow3 getStatsAverageVolume() {
        SdpDataRowType sdpDataRowType;
        if (this.isInBidAskSdpStatsExperiment && getStatsOvernightVolumeOrNull() != null) {
            sdpDataRowType = SdpDataRowType.StatsAverageVolume2;
        } else {
            sdpDataRowType = SdpDataRowType.StatsAverageVolume;
        }
        return new SdpDataRow3.Default(sdpDataRowType, null, StringResource.INSTANCE.invoke(truncate(this.fundamental.getAverageVolume30Days(), Formats.getInterestRateFormatShort())), null, null, null, 58, null);
    }

    private final SdpDataRow3 getStatsTodaysLow() {
        return new SdpDataRow3.Default(SdpDataRowType.StatsTodaysLow, null, StringResource.INSTANCE.invoke(NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), this.fundamental.getLow(), null, 2, null)), null, null, null, 58, null);
    }

    private final SdpDataRow3 getMarketCapOrAum() {
        if (this.etpDetails == null) {
            return new SdpDataRow3.Default(SdpDataRowType.StatsMarketCap, null, StringResource.INSTANCE.invoke(truncate(this.fundamental.getMarketCap(), Formats.getPriceFormat())), null, null, null, 58, null);
        }
        return new SdpDataRow3.Default(SdpDataRowType.StatsAum, null, StringResource.INSTANCE.invoke(truncate(this.etpDetails.getAum(), Formats.getIntegerFormat())), null, null, null, 58, null);
    }

    private final SdpDataRow3 getStats52WeekHigh() {
        SdpDataRowType sdpDataRowType;
        if (this.isInBidAskSdpStatsExperiment) {
            sdpDataRowType = SdpDataRowType.Stats52WeekHigh2;
        } else {
            sdpDataRowType = SdpDataRowType.Stats52WeekHigh;
        }
        return new SdpDataRow3.Default(sdpDataRowType, null, StringResource.INSTANCE.invoke(NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), this.fundamental.getHigh52Weeks(), null, 2, null)), null, null, null, 58, null);
    }

    private final SdpDataRow3 getStatsPriceEarningsRatio() {
        SdpDataRowType sdpDataRowType;
        if (this.columnCount > 2) {
            sdpDataRowType = SdpDataRowType.StatsPriceEarningsRatio;
        } else {
            sdpDataRowType = SdpDataRowType.StatsPriceEarningsRatio2;
        }
        return new SdpDataRow3.Default(sdpDataRowType, null, StringResource.INSTANCE.invoke(formatDecimal(this.fundamental.getPeRatio())), null, null, null, 58, null);
    }

    private final SdpDataRow3 getStats52WeekLow() {
        SdpDataRowType sdpDataRowType;
        if (this.isInBidAskSdpStatsExperiment) {
            sdpDataRowType = SdpDataRowType.Stats52WeekLow2;
        } else {
            sdpDataRowType = SdpDataRowType.Stats52WeekLow;
        }
        return new SdpDataRow3.Default(sdpDataRowType, null, StringResource.INSTANCE.invoke(NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), this.fundamental.getLow52Weeks(), null, 2, null)), null, null, null, 58, null);
    }

    private final SdpDataRow3 getYieldOrNull() {
        SdpDataRowType sdpDataRowType;
        SdpDataRowType sdpDataRowType2;
        if (this.etpDetails == null) {
            if (this.isInBidAskSdpStatsExperiment) {
                sdpDataRowType2 = SdpDataRowType.StatsDividendYield2;
            } else {
                sdpDataRowType2 = SdpDataRowType.StatsDividendYield;
            }
            return new SdpDataRow3.Default(sdpDataRowType2, null, StringResource.INSTANCE.invoke(NumberFormatter.DefaultImpls.formatNullable$default(Formats.getInterestRateFormatShortWithPercentage(), this.fundamental.getDividendYield(), null, 2, null)), null, null, null, 58, null);
        }
        Instrument instrument = this.instrument;
        if (instrument != null && instrument.isRhvCef()) {
            return null;
        }
        if (this.isInBidAskSdpStatsExperiment) {
            sdpDataRowType = SdpDataRowType.Stats30DayYield2;
        } else {
            sdpDataRowType = SdpDataRowType.Stats30DayYield;
        }
        return new SdpDataRow3.Default(sdpDataRowType, null, StringResource.INSTANCE.invoke(NumberFormatter.DefaultImpls.formatNullable$default(Formats.getInterestRateFormatShortWithPercentage(), this.etpDetails.getSecYield(), null, 2, null)), null, null, null, 58, null);
    }

    private final SdpDataRow3 getExpenseRatioOrNull() {
        EtpDetails etpDetails = this.etpDetails;
        if (etpDetails == null) {
            return null;
        }
        SdpDataRowType sdpDataRowType = SdpDataRowType.StatsExpenseRatio;
        StringResource.Companion companion = StringResource.INSTANCE;
        NumberFormatter decimalPercentageWithoutTrailingZeroFormat$default = Formats.getDecimalPercentageWithoutTrailingZeroFormat$default(5, null, 2, null);
        Float grossExpenseRatio = etpDetails.getGrossExpenseRatio();
        return new SdpDataRow3.Default(sdpDataRowType, null, companion.invoke(NumberFormatter.DefaultImpls.formatNullable$default(decimalPercentageWithoutTrailingZeroFormat$default, grossExpenseRatio != null ? Float.valueOf(grossExpenseRatio.floatValue() / 100.0f) : null, null, 2, null)), null, null, null, 58, null);
    }

    public final SdpDataRow3 getStatsSharesToShort$feature_equity_detail_externalDebug() {
        int i;
        SdpDataRowType sdpDataRowType = SdpDataRowType.StatsSharesToShort;
        StringResource.Companion companion = StringResource.INSTANCE;
        ShortingInfo shortingInfo = this.shortingInfo;
        ShortingInventoryRange inventoryRange = shortingInfo != null ? shortingInfo.getInventoryRange() : null;
        switch (inventoryRange == null ? -1 : WhenMappings.$EnumSwitchMapping$0[inventoryRange.ordinal()]) {
            case -1:
            case 6:
                i = C15314R.string.shares_to_short_unavailable;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                i = C15314R.string.shares_to_short_available;
                break;
        }
        SdpDataRow3.Default r0 = new SdpDataRow3.Default(sdpDataRowType, StatisticsSection2.SHARES_TO_SHORT, companion.invoke(i, new Object[0]), null, null, null, 56, null);
        if (this.isInEquitiesSubzeroExperiment) {
            Instrument instrument = this.instrument;
            if ((instrument != null ? instrument.getShortSaleTradability() : null) == Tradability.TRADABLE) {
                return r0;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SdpDataRow3 getStatsBorrowFee$feature_equity_detail_externalDebug() {
        String nullable$default;
        BigDecimal fee;
        SdpDataRowType sdpDataRowType = SdpDataRowType.StatsBorrowFee;
        StringResource.Companion companion = StringResource.INSTANCE;
        ShortingInfo shortingInfo = this.shortingInfo;
        if (shortingInfo != null && (fee = shortingInfo.getFee()) != null) {
            NumberFormatter hundredthDecimalPercentFormat = Formats.getHundredthDecimalPercentFormat();
            BigDecimal scale = fee.setScale(4);
            Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
            BigDecimal scale2 = new BigDecimal("100").setScale(4);
            Intrinsics.checkNotNullExpressionValue(scale2, "setScale(...)");
            BigDecimal bigDecimalDivide = scale.divide(scale2, RoundingMode.HALF_EVEN);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
            nullable$default = NumberFormatter.DefaultImpls.formatNullable$default(hundredthDecimalPercentFormat, bigDecimalDivide, null, 2, null);
            if (nullable$default == null) {
            }
        } else {
            nullable$default = "-";
        }
        SdpDataRow3.Default r0 = new SdpDataRow3.Default(sdpDataRowType, StatisticsSection2.BORROW_FEE, companion.invoke(nullable$default), Position5.isShortPositionOrPending(this.position) ? new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16) : null, Position5.isShortPositionOrPending(this.position) ? new SdpDataRow3.Tooltip(C15314R.id.instrument_detail_positions_shorting_tooltip, companion.invoke(C15314R.string.short_position_borrow_fee_tooltip, new Object[0])) : null, null, 32, null);
        if (this.isInEquitiesSubzeroExperiment) {
            Instrument instrument = this.instrument;
            if ((instrument != null ? instrument.getShortSaleTradability() : null) == Tradability.TRADABLE) {
                return r0;
            }
        }
        return null;
    }

    public final ImmutableList<SdpDataRow3> buildDataRows() {
        List listListOfNotNull;
        if (this.isInBidAskSdpStatsExperiment) {
            listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new SdpDataRow3[]{getStatsVolume(), getStatsOvernightVolumeOrNull(), getStatsAverageVolume(), getStatsOpen(), getStatsTodaysHigh(), getStatsTodaysLow(), getMarketCapOrAum(), getStats52WeekHigh(), getStats52WeekLow(), getStatsPriceEarningsRatio(), getYieldOrNull(), getExpenseRatioOrNull(), getStatsSharesToShort$feature_equity_detail_externalDebug(), getStatsBorrowFee$feature_equity_detail_externalDebug()});
        } else if (getStatsOvernightVolumeOrNull() != null) {
            listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new SdpDataRow3[]{getStatsOpen(), getStatsVolume(), getStatsTodaysHigh(), getStatsOvernightVolumeOrNull(), getStatsTodaysLow(), getStatsAverageVolume(), getMarketCapOrAum(), getStats52WeekHigh(), getStatsPriceEarningsRatio(), getStats52WeekLow(), getYieldOrNull(), getExpenseRatioOrNull(), getStatsSharesToShort$feature_equity_detail_externalDebug(), getStatsBorrowFee$feature_equity_detail_externalDebug()});
        } else {
            listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new SdpDataRow3[]{getStatsOpen(), getStatsVolume(), getStatsTodaysHigh(), getStatsAverageVolume(), getStatsTodaysLow(), getMarketCapOrAum(), getStats52WeekHigh(), getStatsPriceEarningsRatio(), getStats52WeekLow(), getYieldOrNull(), getExpenseRatioOrNull(), getStatsSharesToShort$feature_equity_detail_externalDebug(), getStatsBorrowFee$feature_equity_detail_externalDebug()});
        }
        return extensions2.toImmutableList(listListOfNotNull);
    }

    public final UUID getInstrumentId() {
        return this.fundamental.getInstrumentId();
    }
}
