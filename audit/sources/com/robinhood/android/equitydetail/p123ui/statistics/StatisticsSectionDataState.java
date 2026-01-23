package com.robinhood.android.equitydetail.p123ui.statistics;

import com.robinhood.android.engagement.l2improvements.experiments.GoldL2DataUpsellImprovements;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.Tradability;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.Fundamental;
import com.robinhood.shared.equities.subzero.ShortingInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StatisticsSectionDataState.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\fHÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010>\u001a\u00020\u0016HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0018HÆ\u0003J \u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\u00032\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020\u0016HÖ\u0001J\t\u0010E\u001a\u00020FHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010$R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u00101\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b2\u0010$¨\u0006G"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/statistics/StatisticsSectionDataState;", "", "showOvernightVolume", "", "fundamental", "Lcom/robinhood/shared/equities/models/instrumentdetails/db/Fundamental;", "etpDetails", "Lcom/robinhood/models/db/EtpDetails;", "quote", "Lcom/robinhood/models/db/Quote;", "isInBidAskSdpStatsExperiment", "goldL2DataUpsellImprovements", "Lcom/robinhood/android/engagement/l2improvements/experiments/GoldL2DataUpsellImprovements$Variant;", "isInGoldRegionGate", "instrument", "Lcom/robinhood/models/db/Instrument;", "isInEquitiesSubzeroExperiment", "position", "Lcom/robinhood/models/db/Position;", "shortingInfo", "Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "columnCount", "", "account", "Lcom/robinhood/models/db/Account;", "<init>", "(Ljava/lang/Boolean;Lcom/robinhood/shared/equities/models/instrumentdetails/db/Fundamental;Lcom/robinhood/models/db/EtpDetails;Lcom/robinhood/models/db/Quote;ZLcom/robinhood/android/engagement/l2improvements/experiments/GoldL2DataUpsellImprovements$Variant;ZLcom/robinhood/models/db/Instrument;ZLcom/robinhood/models/db/Position;Lcom/robinhood/shared/equities/subzero/ShortingInfo;ILcom/robinhood/models/db/Account;)V", "getShowOvernightVolume", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFundamental", "()Lcom/robinhood/shared/equities/models/instrumentdetails/db/Fundamental;", "getEtpDetails", "()Lcom/robinhood/models/db/EtpDetails;", "getQuote", "()Lcom/robinhood/models/db/Quote;", "()Z", "getGoldL2DataUpsellImprovements", "()Lcom/robinhood/android/engagement/l2improvements/experiments/GoldL2DataUpsellImprovements$Variant;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getPosition", "()Lcom/robinhood/models/db/Position;", "getShortingInfo", "()Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "getColumnCount", "()I", "getAccount", "()Lcom/robinhood/models/db/Account;", "showBidAskDetails", "getShowBidAskDetails", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/Boolean;Lcom/robinhood/shared/equities/models/instrumentdetails/db/Fundamental;Lcom/robinhood/models/db/EtpDetails;Lcom/robinhood/models/db/Quote;ZLcom/robinhood/android/engagement/l2improvements/experiments/GoldL2DataUpsellImprovements$Variant;ZLcom/robinhood/models/db/Instrument;ZLcom/robinhood/models/db/Position;Lcom/robinhood/shared/equities/subzero/ShortingInfo;ILcom/robinhood/models/db/Account;)Lcom/robinhood/android/equitydetail/ui/statistics/StatisticsSectionDataState;", "equals", "other", "hashCode", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StatisticsSectionDataState {
    public static final int $stable = 8;
    private final Account account;
    private final int columnCount;
    private final EtpDetails etpDetails;
    private final Fundamental fundamental;
    private final GoldL2DataUpsellImprovements.Variant goldL2DataUpsellImprovements;
    private final Instrument instrument;
    private final boolean isInBidAskSdpStatsExperiment;
    private final boolean isInEquitiesSubzeroExperiment;
    private final boolean isInGoldRegionGate;
    private final Position position;
    private final Quote quote;
    private final ShortingInfo shortingInfo;
    private final Boolean showOvernightVolume;

    public StatisticsSectionDataState() {
        this(null, null, null, null, false, null, false, null, false, null, null, 0, null, 8191, null);
    }

    public static /* synthetic */ StatisticsSectionDataState copy$default(StatisticsSectionDataState statisticsSectionDataState, Boolean bool, Fundamental fundamental, EtpDetails etpDetails, Quote quote, boolean z, GoldL2DataUpsellImprovements.Variant variant, boolean z2, Instrument instrument, boolean z3, Position position, ShortingInfo shortingInfo, int i, Account account, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bool = statisticsSectionDataState.showOvernightVolume;
        }
        return statisticsSectionDataState.copy(bool, (i2 & 2) != 0 ? statisticsSectionDataState.fundamental : fundamental, (i2 & 4) != 0 ? statisticsSectionDataState.etpDetails : etpDetails, (i2 & 8) != 0 ? statisticsSectionDataState.quote : quote, (i2 & 16) != 0 ? statisticsSectionDataState.isInBidAskSdpStatsExperiment : z, (i2 & 32) != 0 ? statisticsSectionDataState.goldL2DataUpsellImprovements : variant, (i2 & 64) != 0 ? statisticsSectionDataState.isInGoldRegionGate : z2, (i2 & 128) != 0 ? statisticsSectionDataState.instrument : instrument, (i2 & 256) != 0 ? statisticsSectionDataState.isInEquitiesSubzeroExperiment : z3, (i2 & 512) != 0 ? statisticsSectionDataState.position : position, (i2 & 1024) != 0 ? statisticsSectionDataState.shortingInfo : shortingInfo, (i2 & 2048) != 0 ? statisticsSectionDataState.columnCount : i, (i2 & 4096) != 0 ? statisticsSectionDataState.account : account);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getShowOvernightVolume() {
        return this.showOvernightVolume;
    }

    /* renamed from: component10, reason: from getter */
    public final Position getPosition() {
        return this.position;
    }

    /* renamed from: component11, reason: from getter */
    public final ShortingInfo getShortingInfo() {
        return this.shortingInfo;
    }

    /* renamed from: component12, reason: from getter */
    public final int getColumnCount() {
        return this.columnCount;
    }

    /* renamed from: component13, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component2, reason: from getter */
    public final Fundamental getFundamental() {
        return this.fundamental;
    }

    /* renamed from: component3, reason: from getter */
    public final EtpDetails getEtpDetails() {
        return this.etpDetails;
    }

    /* renamed from: component4, reason: from getter */
    public final Quote getQuote() {
        return this.quote;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsInBidAskSdpStatsExperiment() {
        return this.isInBidAskSdpStatsExperiment;
    }

    /* renamed from: component6, reason: from getter */
    public final GoldL2DataUpsellImprovements.Variant getGoldL2DataUpsellImprovements() {
        return this.goldL2DataUpsellImprovements;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsInGoldRegionGate() {
        return this.isInGoldRegionGate;
    }

    /* renamed from: component8, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsInEquitiesSubzeroExperiment() {
        return this.isInEquitiesSubzeroExperiment;
    }

    public final StatisticsSectionDataState copy(Boolean showOvernightVolume, Fundamental fundamental, EtpDetails etpDetails, Quote quote, boolean isInBidAskSdpStatsExperiment, GoldL2DataUpsellImprovements.Variant goldL2DataUpsellImprovements, boolean isInGoldRegionGate, Instrument instrument, boolean isInEquitiesSubzeroExperiment, Position position, ShortingInfo shortingInfo, int columnCount, Account account) {
        Intrinsics.checkNotNullParameter(goldL2DataUpsellImprovements, "goldL2DataUpsellImprovements");
        return new StatisticsSectionDataState(showOvernightVolume, fundamental, etpDetails, quote, isInBidAskSdpStatsExperiment, goldL2DataUpsellImprovements, isInGoldRegionGate, instrument, isInEquitiesSubzeroExperiment, position, shortingInfo, columnCount, account);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatisticsSectionDataState)) {
            return false;
        }
        StatisticsSectionDataState statisticsSectionDataState = (StatisticsSectionDataState) other;
        return Intrinsics.areEqual(this.showOvernightVolume, statisticsSectionDataState.showOvernightVolume) && Intrinsics.areEqual(this.fundamental, statisticsSectionDataState.fundamental) && Intrinsics.areEqual(this.etpDetails, statisticsSectionDataState.etpDetails) && Intrinsics.areEqual(this.quote, statisticsSectionDataState.quote) && this.isInBidAskSdpStatsExperiment == statisticsSectionDataState.isInBidAskSdpStatsExperiment && this.goldL2DataUpsellImprovements == statisticsSectionDataState.goldL2DataUpsellImprovements && this.isInGoldRegionGate == statisticsSectionDataState.isInGoldRegionGate && Intrinsics.areEqual(this.instrument, statisticsSectionDataState.instrument) && this.isInEquitiesSubzeroExperiment == statisticsSectionDataState.isInEquitiesSubzeroExperiment && Intrinsics.areEqual(this.position, statisticsSectionDataState.position) && Intrinsics.areEqual(this.shortingInfo, statisticsSectionDataState.shortingInfo) && this.columnCount == statisticsSectionDataState.columnCount && Intrinsics.areEqual(this.account, statisticsSectionDataState.account);
    }

    public int hashCode() {
        Boolean bool = this.showOvernightVolume;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Fundamental fundamental = this.fundamental;
        int iHashCode2 = (iHashCode + (fundamental == null ? 0 : fundamental.hashCode())) * 31;
        EtpDetails etpDetails = this.etpDetails;
        int iHashCode3 = (iHashCode2 + (etpDetails == null ? 0 : etpDetails.hashCode())) * 31;
        Quote quote = this.quote;
        int iHashCode4 = (((((((iHashCode3 + (quote == null ? 0 : quote.hashCode())) * 31) + Boolean.hashCode(this.isInBidAskSdpStatsExperiment)) * 31) + this.goldL2DataUpsellImprovements.hashCode()) * 31) + Boolean.hashCode(this.isInGoldRegionGate)) * 31;
        Instrument instrument = this.instrument;
        int iHashCode5 = (((iHashCode4 + (instrument == null ? 0 : instrument.hashCode())) * 31) + Boolean.hashCode(this.isInEquitiesSubzeroExperiment)) * 31;
        Position position = this.position;
        int iHashCode6 = (iHashCode5 + (position == null ? 0 : position.hashCode())) * 31;
        ShortingInfo shortingInfo = this.shortingInfo;
        int iHashCode7 = (((iHashCode6 + (shortingInfo == null ? 0 : shortingInfo.hashCode())) * 31) + Integer.hashCode(this.columnCount)) * 31;
        Account account = this.account;
        return iHashCode7 + (account != null ? account.hashCode() : 0);
    }

    public String toString() {
        return "StatisticsSectionDataState(showOvernightVolume=" + this.showOvernightVolume + ", fundamental=" + this.fundamental + ", etpDetails=" + this.etpDetails + ", quote=" + this.quote + ", isInBidAskSdpStatsExperiment=" + this.isInBidAskSdpStatsExperiment + ", goldL2DataUpsellImprovements=" + this.goldL2DataUpsellImprovements + ", isInGoldRegionGate=" + this.isInGoldRegionGate + ", instrument=" + this.instrument + ", isInEquitiesSubzeroExperiment=" + this.isInEquitiesSubzeroExperiment + ", position=" + this.position + ", shortingInfo=" + this.shortingInfo + ", columnCount=" + this.columnCount + ", account=" + this.account + ")";
    }

    public StatisticsSectionDataState(Boolean bool, Fundamental fundamental, EtpDetails etpDetails, Quote quote, boolean z, GoldL2DataUpsellImprovements.Variant goldL2DataUpsellImprovements, boolean z2, Instrument instrument, boolean z3, Position position, ShortingInfo shortingInfo, int i, Account account) {
        Intrinsics.checkNotNullParameter(goldL2DataUpsellImprovements, "goldL2DataUpsellImprovements");
        this.showOvernightVolume = bool;
        this.fundamental = fundamental;
        this.etpDetails = etpDetails;
        this.quote = quote;
        this.isInBidAskSdpStatsExperiment = z;
        this.goldL2DataUpsellImprovements = goldL2DataUpsellImprovements;
        this.isInGoldRegionGate = z2;
        this.instrument = instrument;
        this.isInEquitiesSubzeroExperiment = z3;
        this.position = position;
        this.shortingInfo = shortingInfo;
        this.columnCount = i;
        this.account = account;
    }

    public final Boolean getShowOvernightVolume() {
        return this.showOvernightVolume;
    }

    public final Fundamental getFundamental() {
        return this.fundamental;
    }

    public final EtpDetails getEtpDetails() {
        return this.etpDetails;
    }

    public final Quote getQuote() {
        return this.quote;
    }

    public final boolean isInBidAskSdpStatsExperiment() {
        return this.isInBidAskSdpStatsExperiment;
    }

    public final GoldL2DataUpsellImprovements.Variant getGoldL2DataUpsellImprovements() {
        return this.goldL2DataUpsellImprovements;
    }

    public /* synthetic */ StatisticsSectionDataState(Boolean bool, Fundamental fundamental, EtpDetails etpDetails, Quote quote, boolean z, GoldL2DataUpsellImprovements.Variant variant, boolean z2, Instrument instrument, boolean z3, Position position, ShortingInfo shortingInfo, int i, Account account, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : bool, (i2 & 2) != 0 ? null : fundamental, (i2 & 4) != 0 ? null : etpDetails, (i2 & 8) != 0 ? null : quote, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? GoldL2DataUpsellImprovements.Variant.CONTROL : variant, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? null : instrument, (i2 & 256) == 0 ? z3 : false, (i2 & 512) != 0 ? null : position, (i2 & 1024) != 0 ? null : shortingInfo, (i2 & 2048) != 0 ? 3 : i, (i2 & 4096) != 0 ? null : account);
    }

    public final boolean isInGoldRegionGate() {
        return this.isInGoldRegionGate;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final boolean isInEquitiesSubzeroExperiment() {
        return this.isInEquitiesSubzeroExperiment;
    }

    public final Position getPosition() {
        return this.position;
    }

    public final ShortingInfo getShortingInfo() {
        return this.shortingInfo;
    }

    public final int getColumnCount() {
        return this.columnCount;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final boolean getShowBidAskDetails() {
        if (!this.isInBidAskSdpStatsExperiment) {
            return false;
        }
        Instrument instrument = this.instrument;
        return (instrument != null ? instrument.getAllDayTradability() : null) == Tradability.TRADABLE;
    }
}
