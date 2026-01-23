package com.robinhood.android.marketdatadisclosure;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.nbbo.models.p359db.NbboSummary;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarketDataDisclosureStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureDataState;", "Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureViewState;", "<init>", "()V", "reduce", "dataState", "Companion", "lib-market-data-disclosure_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MarketDataDisclosureStateProvider implements StateProvider<MarketDataDisclosureDataState, MarketDataDisclosureViewState> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String LOADING = "-";

    @Override // com.robinhood.android.udf.StateProvider
    public MarketDataDisclosureViewState reduce(MarketDataDisclosureDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        StringResource dialogTitle = dataState.getDialogTitle();
        StringResource headerText = dataState.getHeaderText();
        if (headerText == null) {
            headerText = StringResource.INSTANCE.invoke("-");
        }
        StringResource stringResource = headerText;
        StringResource marketDataFooterText = dataState.getMarketDataFooterText();
        StringResource marketDataFooterLinkText = dataState.getMarketDataFooterLinkText();
        String marketDataFooterMarkdown = dataState.getMarketDataFooterMarkdown();
        String mic = dataState.getMic();
        String bidMic = dataState.getBidMic();
        String askMic = dataState.getAskMic();
        String priceOrLoading = MarketDataDisclosureStateProvider2.formatPriceOrLoading(dataState.getLastStalePrice());
        String intOrLoading = MarketDataDisclosureStateProvider2.formatIntOrLoading(dataState.getLastSaleSize());
        String priceOrLoading2 = MarketDataDisclosureStateProvider2.formatPriceOrLoading(dataState.getAskPrice());
        String intOrLoading2 = MarketDataDisclosureStateProvider2.formatIntOrLoading(dataState.getAskSize());
        String priceOrLoading3 = MarketDataDisclosureStateProvider2.formatPriceOrLoading(dataState.getBidPrice());
        String intOrLoading3 = MarketDataDisclosureStateProvider2.formatIntOrLoading(dataState.getBidSize());
        NbboSummary nbboSummary = dataState.getNbboSummary();
        return new MarketDataDisclosureViewState(dialogTitle, stringResource, marketDataFooterText, marketDataFooterLinkText, marketDataFooterMarkdown, mic, bidMic, askMic, priceOrLoading, intOrLoading, priceOrLoading2, intOrLoading2, priceOrLoading3, intOrLoading3, nbboSummary != null ? nbboSummary.getMarketDialog() : null);
    }

    /* compiled from: MarketDataDisclosureStateProvider.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureStateProvider$Companion;", "", "<init>", "()V", "LOADING", "", "getLOADING$annotations", "lib-market-data-disclosure_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getLOADING$annotations() {
        }

        private Companion() {
        }
    }
}
