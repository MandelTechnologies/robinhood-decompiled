package com.robinhood.android.marketdatadisclosure;

import com.robinhood.nbbo.models.p359db.NbboSummary;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: MarketDataDisclosureViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0001?B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\bHÂ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\bHÂ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\bHÂ\u0003J\t\u00101\u001a\u00020\bHÂ\u0003J\t\u00102\u001a\u00020\bHÂ\u0003J\t\u00103\u001a\u00020\bHÂ\u0003J\t\u00104\u001a\u00020\bHÂ\u0003J\t\u00105\u001a\u00020\bHÂ\u0003J\t\u00106\u001a\u00020\bHÂ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0013HÂ\u0003J\u00ad\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u001f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b \u0010\u0017R\u0011\u0010!\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0017R\u0011\u0010#\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010\u0017R\u0011\u0010%\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\u0017R\u0011\u0010'\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010\u0017¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureViewState;", "", "dialogTitle", "Lcom/robinhood/utils/resource/StringResource;", "headerText", "marketDataFooterText", "marketDataFooterLinkText", "marketDataFooterMarkdown", "", "mic", "bidMic", "askMic", "lastSalePrice", "lastSaleSize", "askPrice", "askSize", "bidPrice", "bidSize", "marketDialog", "Lcom/robinhood/nbbo/models/db/NbboSummary$NbboSummaryMarketDialog;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/nbbo/models/db/NbboSummary$NbboSummaryMarketDialog;)V", "getDialogTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getHeaderText", "getMarketDataFooterText", "getMarketDataFooterLinkText", "getMarketDataFooterMarkdown", "()Ljava/lang/String;", "lastPriceLabelText", "getLastPriceLabelText", "lastPriceValueText", "getLastPriceValueText", "marketDataBidLabelText", "getMarketDataBidLabelText", "marketDataBidValueText", "getMarketDataBidValueText", "marketDataAskLabelText", "getMarketDataAskLabelText", "marketDataAskValueText", "getMarketDataAskValueText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "lib-market-data-disclosure_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MarketDataDisclosureViewState {
    public static final String FOOTER_URL = "https://robinhood.com/support/articles/using-market-data";
    private final String askMic;
    private final String askPrice;
    private final String askSize;
    private final String bidMic;
    private final String bidPrice;
    private final String bidSize;
    private final StringResource dialogTitle;
    private final StringResource headerText;
    private final String lastSalePrice;
    private final String lastSaleSize;
    private final StringResource marketDataFooterLinkText;
    private final String marketDataFooterMarkdown;
    private final StringResource marketDataFooterText;
    private final NbboSummary.NbboSummaryMarketDialog marketDialog;
    private final String mic;
    public static final int $stable = 8;

    /* renamed from: component10, reason: from getter */
    private final String getLastSaleSize() {
        return this.lastSaleSize;
    }

    /* renamed from: component11, reason: from getter */
    private final String getAskPrice() {
        return this.askPrice;
    }

    /* renamed from: component12, reason: from getter */
    private final String getAskSize() {
        return this.askSize;
    }

    /* renamed from: component13, reason: from getter */
    private final String getBidPrice() {
        return this.bidPrice;
    }

    /* renamed from: component14, reason: from getter */
    private final String getBidSize() {
        return this.bidSize;
    }

    /* renamed from: component15, reason: from getter */
    private final NbboSummary.NbboSummaryMarketDialog getMarketDialog() {
        return this.marketDialog;
    }

    /* renamed from: component6, reason: from getter */
    private final String getMic() {
        return this.mic;
    }

    /* renamed from: component7, reason: from getter */
    private final String getBidMic() {
        return this.bidMic;
    }

    /* renamed from: component8, reason: from getter */
    private final String getAskMic() {
        return this.askMic;
    }

    /* renamed from: component9, reason: from getter */
    private final String getLastSalePrice() {
        return this.lastSalePrice;
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getDialogTitle() {
        return this.dialogTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getHeaderText() {
        return this.headerText;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getMarketDataFooterText() {
        return this.marketDataFooterText;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getMarketDataFooterLinkText() {
        return this.marketDataFooterLinkText;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMarketDataFooterMarkdown() {
        return this.marketDataFooterMarkdown;
    }

    public final MarketDataDisclosureViewState copy(StringResource dialogTitle, StringResource headerText, StringResource marketDataFooterText, StringResource marketDataFooterLinkText, String marketDataFooterMarkdown, String mic, String bidMic, String askMic, String lastSalePrice, String lastSaleSize, String askPrice, String askSize, String bidPrice, String bidSize, NbboSummary.NbboSummaryMarketDialog marketDialog) {
        Intrinsics.checkNotNullParameter(dialogTitle, "dialogTitle");
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        Intrinsics.checkNotNullParameter(lastSalePrice, "lastSalePrice");
        Intrinsics.checkNotNullParameter(lastSaleSize, "lastSaleSize");
        Intrinsics.checkNotNullParameter(askPrice, "askPrice");
        Intrinsics.checkNotNullParameter(askSize, "askSize");
        Intrinsics.checkNotNullParameter(bidPrice, "bidPrice");
        Intrinsics.checkNotNullParameter(bidSize, "bidSize");
        return new MarketDataDisclosureViewState(dialogTitle, headerText, marketDataFooterText, marketDataFooterLinkText, marketDataFooterMarkdown, mic, bidMic, askMic, lastSalePrice, lastSaleSize, askPrice, askSize, bidPrice, bidSize, marketDialog);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketDataDisclosureViewState)) {
            return false;
        }
        MarketDataDisclosureViewState marketDataDisclosureViewState = (MarketDataDisclosureViewState) other;
        return Intrinsics.areEqual(this.dialogTitle, marketDataDisclosureViewState.dialogTitle) && Intrinsics.areEqual(this.headerText, marketDataDisclosureViewState.headerText) && Intrinsics.areEqual(this.marketDataFooterText, marketDataDisclosureViewState.marketDataFooterText) && Intrinsics.areEqual(this.marketDataFooterLinkText, marketDataDisclosureViewState.marketDataFooterLinkText) && Intrinsics.areEqual(this.marketDataFooterMarkdown, marketDataDisclosureViewState.marketDataFooterMarkdown) && Intrinsics.areEqual(this.mic, marketDataDisclosureViewState.mic) && Intrinsics.areEqual(this.bidMic, marketDataDisclosureViewState.bidMic) && Intrinsics.areEqual(this.askMic, marketDataDisclosureViewState.askMic) && Intrinsics.areEqual(this.lastSalePrice, marketDataDisclosureViewState.lastSalePrice) && Intrinsics.areEqual(this.lastSaleSize, marketDataDisclosureViewState.lastSaleSize) && Intrinsics.areEqual(this.askPrice, marketDataDisclosureViewState.askPrice) && Intrinsics.areEqual(this.askSize, marketDataDisclosureViewState.askSize) && Intrinsics.areEqual(this.bidPrice, marketDataDisclosureViewState.bidPrice) && Intrinsics.areEqual(this.bidSize, marketDataDisclosureViewState.bidSize) && Intrinsics.areEqual(this.marketDialog, marketDataDisclosureViewState.marketDialog);
    }

    public int hashCode() {
        int iHashCode = ((this.dialogTitle.hashCode() * 31) + this.headerText.hashCode()) * 31;
        StringResource stringResource = this.marketDataFooterText;
        int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        StringResource stringResource2 = this.marketDataFooterLinkText;
        int iHashCode3 = (iHashCode2 + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31;
        String str = this.marketDataFooterMarkdown;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mic;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bidMic;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.askMic;
        int iHashCode7 = (((((((((((((iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.lastSalePrice.hashCode()) * 31) + this.lastSaleSize.hashCode()) * 31) + this.askPrice.hashCode()) * 31) + this.askSize.hashCode()) * 31) + this.bidPrice.hashCode()) * 31) + this.bidSize.hashCode()) * 31;
        NbboSummary.NbboSummaryMarketDialog nbboSummaryMarketDialog = this.marketDialog;
        return iHashCode7 + (nbboSummaryMarketDialog != null ? nbboSummaryMarketDialog.hashCode() : 0);
    }

    public String toString() {
        return "MarketDataDisclosureViewState(dialogTitle=" + this.dialogTitle + ", headerText=" + this.headerText + ", marketDataFooterText=" + this.marketDataFooterText + ", marketDataFooterLinkText=" + this.marketDataFooterLinkText + ", marketDataFooterMarkdown=" + this.marketDataFooterMarkdown + ", mic=" + this.mic + ", bidMic=" + this.bidMic + ", askMic=" + this.askMic + ", lastSalePrice=" + this.lastSalePrice + ", lastSaleSize=" + this.lastSaleSize + ", askPrice=" + this.askPrice + ", askSize=" + this.askSize + ", bidPrice=" + this.bidPrice + ", bidSize=" + this.bidSize + ", marketDialog=" + this.marketDialog + ")";
    }

    public MarketDataDisclosureViewState(StringResource dialogTitle, StringResource headerText, StringResource stringResource, StringResource stringResource2, String str, String str2, String str3, String str4, String lastSalePrice, String lastSaleSize, String askPrice, String askSize, String bidPrice, String bidSize, NbboSummary.NbboSummaryMarketDialog nbboSummaryMarketDialog) {
        Intrinsics.checkNotNullParameter(dialogTitle, "dialogTitle");
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        Intrinsics.checkNotNullParameter(lastSalePrice, "lastSalePrice");
        Intrinsics.checkNotNullParameter(lastSaleSize, "lastSaleSize");
        Intrinsics.checkNotNullParameter(askPrice, "askPrice");
        Intrinsics.checkNotNullParameter(askSize, "askSize");
        Intrinsics.checkNotNullParameter(bidPrice, "bidPrice");
        Intrinsics.checkNotNullParameter(bidSize, "bidSize");
        this.dialogTitle = dialogTitle;
        this.headerText = headerText;
        this.marketDataFooterText = stringResource;
        this.marketDataFooterLinkText = stringResource2;
        this.marketDataFooterMarkdown = str;
        this.mic = str2;
        this.bidMic = str3;
        this.askMic = str4;
        this.lastSalePrice = lastSalePrice;
        this.lastSaleSize = lastSaleSize;
        this.askPrice = askPrice;
        this.askSize = askSize;
        this.bidPrice = bidPrice;
        this.bidSize = bidSize;
        this.marketDialog = nbboSummaryMarketDialog;
    }

    public final StringResource getDialogTitle() {
        return this.dialogTitle;
    }

    public final StringResource getHeaderText() {
        return this.headerText;
    }

    public final StringResource getMarketDataFooterText() {
        return this.marketDataFooterText;
    }

    public final StringResource getMarketDataFooterLinkText() {
        return this.marketDataFooterLinkText;
    }

    public final String getMarketDataFooterMarkdown() {
        return this.marketDataFooterMarkdown;
    }

    public final StringResource getLastPriceLabelText() {
        NbboSummary.NbboSummaryMarketDialog nbboSummaryMarketDialog = this.marketDialog;
        if (nbboSummaryMarketDialog != null) {
            return StringResource.INSTANCE.invoke(nbboSummaryMarketDialog.getLastSaleCopy());
        }
        String str = this.mic;
        if (str == null || StringsKt.isBlank(str)) {
            return StringResource.INSTANCE.invoke(C21270R.string.market_data_dialog_last_sale_label, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C21270R.string.market_data_dialog_last_sale_label_with_mic, this.mic);
    }

    public final StringResource getLastPriceValueText() {
        NbboSummary.NbboSummaryMarketDialog nbboSummaryMarketDialog = this.marketDialog;
        if (nbboSummaryMarketDialog != null) {
            return StringResource.INSTANCE.invoke(nbboSummaryMarketDialog.getLastSaleSizeCopy());
        }
        return StringResource.INSTANCE.invoke(C21270R.string.market_data_dialog_value, this.lastSalePrice, this.lastSaleSize);
    }

    public final StringResource getMarketDataBidLabelText() {
        NbboSummary.NbboSummaryMarketDialog nbboSummaryMarketDialog = this.marketDialog;
        if (nbboSummaryMarketDialog != null) {
            return StringResource.INSTANCE.invoke(nbboSummaryMarketDialog.getBestBidCopy());
        }
        String str = this.bidMic;
        if (str == null || StringsKt.isBlank(str)) {
            return StringResource.INSTANCE.invoke(C21270R.string.market_data_dialog_bid_price_label, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C21270R.string.market_data_dialog_bid_price_label_with_mic, this.bidMic);
    }

    public final StringResource getMarketDataBidValueText() {
        NbboSummary.NbboSummaryMarketDialog nbboSummaryMarketDialog = this.marketDialog;
        if (nbboSummaryMarketDialog != null) {
            return StringResource.INSTANCE.invoke(nbboSummaryMarketDialog.getBestBidSizeCopy());
        }
        return StringResource.INSTANCE.invoke(C21270R.string.market_data_dialog_value, this.bidPrice, this.bidSize);
    }

    public final StringResource getMarketDataAskLabelText() {
        NbboSummary.NbboSummaryMarketDialog nbboSummaryMarketDialog = this.marketDialog;
        if (nbboSummaryMarketDialog != null) {
            return StringResource.INSTANCE.invoke(nbboSummaryMarketDialog.getBestAskCopy());
        }
        String str = this.askMic;
        if (str == null || StringsKt.isBlank(str)) {
            return StringResource.INSTANCE.invoke(C21270R.string.market_data_dialog_ask_price_label, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C21270R.string.market_data_dialog_ask_price_label_with_mic, this.askMic);
    }

    public final StringResource getMarketDataAskValueText() {
        NbboSummary.NbboSummaryMarketDialog nbboSummaryMarketDialog = this.marketDialog;
        if (nbboSummaryMarketDialog != null) {
            return StringResource.INSTANCE.invoke(nbboSummaryMarketDialog.getBestAskSizeCopy());
        }
        return StringResource.INSTANCE.invoke(C21270R.string.market_data_dialog_value, this.askPrice, this.askSize);
    }
}
