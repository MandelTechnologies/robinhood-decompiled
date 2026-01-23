package com.robinhood.android.equitydetail.p123ui.statistics;

import com.robinhood.android.compose.bidask.BidAsk;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.models.p320db.EtpDocuments;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import okhttp3.HttpUrl;

/* compiled from: StatisticsSectionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/statistics/StatisticsSectionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/equitydetail/ui/statistics/StatisticsSectionDataState;", "Lcom/robinhood/android/equitydetail/ui/statistics/StatisticsSectionViewState;", "<init>", "()V", "reduce", "dataState", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class StatisticsSectionStateProvider implements StateProvider<StatisticsSectionDataState, StatisticsSectionViewState> {
    public static final int $stable = 0;

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d5  */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StatisticsSectionViewState reduce(StatisticsSectionDataState dataState) {
        HttpUrl httpUrl;
        EtpDocuments documents;
        HttpUrl prospectus;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        ImmutableList immutableList = (dataState.getFundamental() == null || dataState.getShowOvernightVolume() == null) ? null : extensions2.toImmutableList(new StatisticsSectionData(dataState.getShowOvernightVolume().booleanValue(), dataState.isInBidAskSdpStatsExperiment(), dataState.getFundamental(), dataState.getEtpDetails(), dataState.isInEquitiesSubzeroExperiment(), dataState.getPosition(), dataState.getShortingInfo(), dataState.getColumnCount(), dataState.getInstrument(), dataState.getAccount()).buildDataRows());
        Instrument instrument = dataState.getInstrument();
        if (instrument != null && instrument.isRhvCef()) {
            prospectus = dataState.getInstrument().getIpoS1Url();
        } else {
            EtpDetails etpDetails = dataState.getEtpDetails();
            if (etpDetails == null || (documents = etpDetails.getDocuments()) == null) {
                httpUrl = null;
                Quote quote = dataState.getQuote();
                BidAsk bidAsk = quote == null ? new BidAsk(Money.format$default(quote.getBidPrice(), null, false, null, false, 0, null, false, null, false, false, 1023, null), Money.format$default(quote.getAskPrice(), null, false, null, false, 0, null, false, null, false, false, 1023, null), quote.getBidSize(), quote.getAskSize()) : null;
                boolean zIsInBidAskSdpStatsExperiment = dataState.isInBidAskSdpStatsExperiment();
                boolean zIsInGoldRegionGate = dataState.isInGoldRegionGate();
                boolean showBidAskDetails = dataState.getShowBidAskDetails();
                boolean zHasGoldL2UpsellImprovements = dataState.getGoldL2DataUpsellImprovements().hasGoldL2UpsellImprovements();
                EtpDetails etpDetails2 = dataState.getEtpDetails();
                return new StatisticsSectionViewState(immutableList, httpUrl, bidAsk, zIsInBidAskSdpStatsExperiment, zIsInGoldRegionGate, showBidAskDetails, etpDetails2 != null ? etpDetails2.getGrossExpenseRatioBannerContent() : null, zHasGoldL2UpsellImprovements);
            }
            prospectus = documents.getProspectus();
        }
        httpUrl = prospectus;
        Quote quote2 = dataState.getQuote();
        if (quote2 == null) {
        }
        boolean zIsInBidAskSdpStatsExperiment2 = dataState.isInBidAskSdpStatsExperiment();
        boolean zIsInGoldRegionGate2 = dataState.isInGoldRegionGate();
        boolean showBidAskDetails2 = dataState.getShowBidAskDetails();
        boolean zHasGoldL2UpsellImprovements2 = dataState.getGoldL2DataUpsellImprovements().hasGoldL2UpsellImprovements();
        EtpDetails etpDetails22 = dataState.getEtpDetails();
        return new StatisticsSectionViewState(immutableList, httpUrl, bidAsk, zIsInBidAskSdpStatsExperiment2, zIsInGoldRegionGate2, showBidAskDetails2, etpDetails22 != null ? etpDetails22.getGrossExpenseRatioBannerContent() : null, zHasGoldL2UpsellImprovements2);
    }
}
