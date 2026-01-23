package com.robinhood.android.options.history.detail.order;

import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Document;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionOrderDetailScreen;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.bonfire.WithholdingAmount;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import com.robinhood.models.p355ui.UiOptionOrder;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderDetailDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u0010\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\b\b\u0002\u0010$\u001a\u00020\u0005\u0012\b\b\u0002\u0010%\u001a\u00020\u0005\u0012\b\b\u0002\u0010&\u001a\u00020\u0005\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(¢\u0006\u0004\b)\u0010*J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010P\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0017\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010HÆ\u0003J\u0015\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u0010HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\t\u0010X\u001a\u00020\u0005HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010!HÆ\u0003J\t\u0010\\\u001a\u00020#HÆ\u0003J\t\u0010]\u001a\u00020\u0005HÆ\u0003J\t\u0010^\u001a\u00020\u0005HÆ\u0003J\t\u0010_\u001a\u00020\u0005HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010(HÆ\u0003J\u0089\u0002\u0010a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020\u00052\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(HÆ\u0001J\u0013\u0010b\u001a\u00020\u00052\b\u0010c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010d\u001a\u00020eHÖ\u0001J\t\u0010f\u001a\u00020gHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u0010¢\u0006\b\n\u0000\u001a\u0004\b9\u00108R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u0010.R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010$\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010.R\u0011\u0010%\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bI\u0010.R\u0011\u0010&\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010.R\u0013\u0010'\u001a\u0004\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\bK\u0010L¨\u0006h"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailDataState;", "", "account", "Lcom/robinhood/models/db/Account;", "cancelButtonLoading", "", "currentOrNextMarketDates", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "documents", "", "Lcom/robinhood/models/db/Document;", "indexInstrument", "Lcom/robinhood/android/indexes/models/db/Index;", "instrument", "Lcom/robinhood/models/db/Instrument;", "legQuotesMap", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "optionInstrumentPositionMap", "Lcom/robinhood/models/ui/UiOptionInstrumentPosition;", "optionOrderDetailScreen", "Lcom/robinhood/models/db/OptionOrderDetailScreen;", "optionSettings", "Lcom/robinhood/models/db/OptionSettings;", "profitAndLossTradeItem", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "replaceButtonLoading", "uiOptionChain", "Lcom/robinhood/models/ui/UiOptionChain;", "uiOptionOrder", "Lcom/robinhood/models/ui/UiOptionOrder;", "withholdingAmountResponse", "Lcom/robinhood/models/db/bonfire/WithholdingAmount;", "optionsPlaceAgainVariant", "Lcom/robinhood/android/optionsexperiment/Experiments$OptionsPlaceAgain$Variant;", "isInCancelNewExperiment", "pnlUpdatesEnabled", "shouldShowCatFeeNewCopy", "userLocale", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "(Lcom/robinhood/models/db/Account;ZLcom/robinhood/models/db/OptionCurrentOrNextMarketDates;Ljava/util/List;Lcom/robinhood/android/indexes/models/db/Index;Lcom/robinhood/models/db/Instrument;Ljava/util/Map;Ljava/util/Map;Lcom/robinhood/models/db/OptionOrderDetailScreen;Lcom/robinhood/models/db/OptionSettings;Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;ZLcom/robinhood/models/ui/UiOptionChain;Lcom/robinhood/models/ui/UiOptionOrder;Lcom/robinhood/models/db/bonfire/WithholdingAmount;Lcom/robinhood/android/optionsexperiment/Experiments$OptionsPlaceAgain$Variant;ZZZLcom/robinhood/iso/countrycode/CountryCode$Supported;)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "getCancelButtonLoading", "()Z", "getCurrentOrNextMarketDates", "()Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "getDocuments", "()Ljava/util/List;", "getIndexInstrument", "()Lcom/robinhood/android/indexes/models/db/Index;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getLegQuotesMap", "()Ljava/util/Map;", "getOptionInstrumentPositionMap", "getOptionOrderDetailScreen", "()Lcom/robinhood/models/db/OptionOrderDetailScreen;", "getOptionSettings", "()Lcom/robinhood/models/db/OptionSettings;", "getProfitAndLossTradeItem", "()Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "getReplaceButtonLoading", "getUiOptionChain", "()Lcom/robinhood/models/ui/UiOptionChain;", "getUiOptionOrder", "()Lcom/robinhood/models/ui/UiOptionOrder;", "getWithholdingAmountResponse", "()Lcom/robinhood/models/db/bonfire/WithholdingAmount;", "getOptionsPlaceAgainVariant", "()Lcom/robinhood/android/optionsexperiment/Experiments$OptionsPlaceAgain$Variant;", "getPnlUpdatesEnabled", "getShouldShowCatFeeNewCopy", "getUserLocale", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionOrderDetailDataState {
    public static final int $stable = 8;
    private final Account account;
    private final boolean cancelButtonLoading;
    private final OptionCurrentOrNextMarketDates currentOrNextMarketDates;
    private final List<Document> documents;
    private final Index indexInstrument;
    private final Instrument instrument;
    private final boolean isInCancelNewExperiment;
    private final Map<UUID, OptionInstrumentQuote> legQuotesMap;
    private final Map<UUID, UiOptionInstrumentPosition> optionInstrumentPositionMap;
    private final OptionOrderDetailScreen optionOrderDetailScreen;
    private final OptionSettings optionSettings;
    private final Experiments.OptionsPlaceAgain.Variant optionsPlaceAgainVariant;
    private final boolean pnlUpdatesEnabled;
    private final ProfitAndLossTradeItem profitAndLossTradeItem;
    private final boolean replaceButtonLoading;
    private final boolean shouldShowCatFeeNewCopy;
    private final UiOptionChain uiOptionChain;
    private final UiOptionOrder uiOptionOrder;
    private final CountryCode.Supported userLocale;
    private final WithholdingAmount withholdingAmountResponse;

    public OptionOrderDetailDataState() {
        this(null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, false, null, 1048575, null);
    }

    public static /* synthetic */ OptionOrderDetailDataState copy$default(OptionOrderDetailDataState optionOrderDetailDataState, Account account, boolean z, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, List list, Index index, Instrument instrument, Map map, Map map2, OptionOrderDetailScreen optionOrderDetailScreen, OptionSettings optionSettings, ProfitAndLossTradeItem profitAndLossTradeItem, boolean z2, UiOptionChain uiOptionChain, UiOptionOrder uiOptionOrder, WithholdingAmount withholdingAmount, Experiments.OptionsPlaceAgain.Variant variant, boolean z3, boolean z4, boolean z5, CountryCode.Supported supported, int i, Object obj) {
        CountryCode.Supported supported2;
        boolean z6;
        Account account2 = (i & 1) != 0 ? optionOrderDetailDataState.account : account;
        boolean z7 = (i & 2) != 0 ? optionOrderDetailDataState.cancelButtonLoading : z;
        OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates2 = (i & 4) != 0 ? optionOrderDetailDataState.currentOrNextMarketDates : optionCurrentOrNextMarketDates;
        List list2 = (i & 8) != 0 ? optionOrderDetailDataState.documents : list;
        Index index2 = (i & 16) != 0 ? optionOrderDetailDataState.indexInstrument : index;
        Instrument instrument2 = (i & 32) != 0 ? optionOrderDetailDataState.instrument : instrument;
        Map map3 = (i & 64) != 0 ? optionOrderDetailDataState.legQuotesMap : map;
        Map map4 = (i & 128) != 0 ? optionOrderDetailDataState.optionInstrumentPositionMap : map2;
        OptionOrderDetailScreen optionOrderDetailScreen2 = (i & 256) != 0 ? optionOrderDetailDataState.optionOrderDetailScreen : optionOrderDetailScreen;
        OptionSettings optionSettings2 = (i & 512) != 0 ? optionOrderDetailDataState.optionSettings : optionSettings;
        ProfitAndLossTradeItem profitAndLossTradeItem2 = (i & 1024) != 0 ? optionOrderDetailDataState.profitAndLossTradeItem : profitAndLossTradeItem;
        boolean z8 = (i & 2048) != 0 ? optionOrderDetailDataState.replaceButtonLoading : z2;
        UiOptionChain uiOptionChain2 = (i & 4096) != 0 ? optionOrderDetailDataState.uiOptionChain : uiOptionChain;
        UiOptionOrder uiOptionOrder2 = (i & 8192) != 0 ? optionOrderDetailDataState.uiOptionOrder : uiOptionOrder;
        Account account3 = account2;
        WithholdingAmount withholdingAmount2 = (i & 16384) != 0 ? optionOrderDetailDataState.withholdingAmountResponse : withholdingAmount;
        Experiments.OptionsPlaceAgain.Variant variant2 = (i & 32768) != 0 ? optionOrderDetailDataState.optionsPlaceAgainVariant : variant;
        boolean z9 = (i & 65536) != 0 ? optionOrderDetailDataState.isInCancelNewExperiment : z3;
        boolean z10 = (i & 131072) != 0 ? optionOrderDetailDataState.pnlUpdatesEnabled : z4;
        boolean z11 = (i & 262144) != 0 ? optionOrderDetailDataState.shouldShowCatFeeNewCopy : z5;
        if ((i & 524288) != 0) {
            z6 = z11;
            supported2 = optionOrderDetailDataState.userLocale;
        } else {
            supported2 = supported;
            z6 = z11;
        }
        return optionOrderDetailDataState.copy(account3, z7, optionCurrentOrNextMarketDates2, list2, index2, instrument2, map3, map4, optionOrderDetailScreen2, optionSettings2, profitAndLossTradeItem2, z8, uiOptionChain2, uiOptionOrder2, withholdingAmount2, variant2, z9, z10, z6, supported2);
    }

    /* renamed from: component1, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component10, reason: from getter */
    public final OptionSettings getOptionSettings() {
        return this.optionSettings;
    }

    /* renamed from: component11, reason: from getter */
    public final ProfitAndLossTradeItem getProfitAndLossTradeItem() {
        return this.profitAndLossTradeItem;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getReplaceButtonLoading() {
        return this.replaceButtonLoading;
    }

    /* renamed from: component13, reason: from getter */
    public final UiOptionChain getUiOptionChain() {
        return this.uiOptionChain;
    }

    /* renamed from: component14, reason: from getter */
    public final UiOptionOrder getUiOptionOrder() {
        return this.uiOptionOrder;
    }

    /* renamed from: component15, reason: from getter */
    public final WithholdingAmount getWithholdingAmountResponse() {
        return this.withholdingAmountResponse;
    }

    /* renamed from: component16, reason: from getter */
    public final Experiments.OptionsPlaceAgain.Variant getOptionsPlaceAgainVariant() {
        return this.optionsPlaceAgainVariant;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getIsInCancelNewExperiment() {
        return this.isInCancelNewExperiment;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getPnlUpdatesEnabled() {
        return this.pnlUpdatesEnabled;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getShouldShowCatFeeNewCopy() {
        return this.shouldShowCatFeeNewCopy;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCancelButtonLoading() {
        return this.cancelButtonLoading;
    }

    /* renamed from: component20, reason: from getter */
    public final CountryCode.Supported getUserLocale() {
        return this.userLocale;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionCurrentOrNextMarketDates getCurrentOrNextMarketDates() {
        return this.currentOrNextMarketDates;
    }

    public final List<Document> component4() {
        return this.documents;
    }

    /* renamed from: component5, reason: from getter */
    public final Index getIndexInstrument() {
        return this.indexInstrument;
    }

    /* renamed from: component6, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final Map<UUID, OptionInstrumentQuote> component7() {
        return this.legQuotesMap;
    }

    public final Map<UUID, UiOptionInstrumentPosition> component8() {
        return this.optionInstrumentPositionMap;
    }

    /* renamed from: component9, reason: from getter */
    public final OptionOrderDetailScreen getOptionOrderDetailScreen() {
        return this.optionOrderDetailScreen;
    }

    public final OptionOrderDetailDataState copy(Account account, boolean cancelButtonLoading, OptionCurrentOrNextMarketDates currentOrNextMarketDates, List<Document> documents, Index indexInstrument, Instrument instrument, Map<UUID, OptionInstrumentQuote> legQuotesMap, Map<UUID, UiOptionInstrumentPosition> optionInstrumentPositionMap, OptionOrderDetailScreen optionOrderDetailScreen, OptionSettings optionSettings, ProfitAndLossTradeItem profitAndLossTradeItem, boolean replaceButtonLoading, UiOptionChain uiOptionChain, UiOptionOrder uiOptionOrder, WithholdingAmount withholdingAmountResponse, Experiments.OptionsPlaceAgain.Variant optionsPlaceAgainVariant, boolean isInCancelNewExperiment, boolean pnlUpdatesEnabled, boolean shouldShowCatFeeNewCopy, CountryCode.Supported userLocale) {
        Intrinsics.checkNotNullParameter(optionInstrumentPositionMap, "optionInstrumentPositionMap");
        Intrinsics.checkNotNullParameter(optionsPlaceAgainVariant, "optionsPlaceAgainVariant");
        return new OptionOrderDetailDataState(account, cancelButtonLoading, currentOrNextMarketDates, documents, indexInstrument, instrument, legQuotesMap, optionInstrumentPositionMap, optionOrderDetailScreen, optionSettings, profitAndLossTradeItem, replaceButtonLoading, uiOptionChain, uiOptionOrder, withholdingAmountResponse, optionsPlaceAgainVariant, isInCancelNewExperiment, pnlUpdatesEnabled, shouldShowCatFeeNewCopy, userLocale);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOrderDetailDataState)) {
            return false;
        }
        OptionOrderDetailDataState optionOrderDetailDataState = (OptionOrderDetailDataState) other;
        return Intrinsics.areEqual(this.account, optionOrderDetailDataState.account) && this.cancelButtonLoading == optionOrderDetailDataState.cancelButtonLoading && Intrinsics.areEqual(this.currentOrNextMarketDates, optionOrderDetailDataState.currentOrNextMarketDates) && Intrinsics.areEqual(this.documents, optionOrderDetailDataState.documents) && Intrinsics.areEqual(this.indexInstrument, optionOrderDetailDataState.indexInstrument) && Intrinsics.areEqual(this.instrument, optionOrderDetailDataState.instrument) && Intrinsics.areEqual(this.legQuotesMap, optionOrderDetailDataState.legQuotesMap) && Intrinsics.areEqual(this.optionInstrumentPositionMap, optionOrderDetailDataState.optionInstrumentPositionMap) && Intrinsics.areEqual(this.optionOrderDetailScreen, optionOrderDetailDataState.optionOrderDetailScreen) && Intrinsics.areEqual(this.optionSettings, optionOrderDetailDataState.optionSettings) && Intrinsics.areEqual(this.profitAndLossTradeItem, optionOrderDetailDataState.profitAndLossTradeItem) && this.replaceButtonLoading == optionOrderDetailDataState.replaceButtonLoading && Intrinsics.areEqual(this.uiOptionChain, optionOrderDetailDataState.uiOptionChain) && Intrinsics.areEqual(this.uiOptionOrder, optionOrderDetailDataState.uiOptionOrder) && Intrinsics.areEqual(this.withholdingAmountResponse, optionOrderDetailDataState.withholdingAmountResponse) && this.optionsPlaceAgainVariant == optionOrderDetailDataState.optionsPlaceAgainVariant && this.isInCancelNewExperiment == optionOrderDetailDataState.isInCancelNewExperiment && this.pnlUpdatesEnabled == optionOrderDetailDataState.pnlUpdatesEnabled && this.shouldShowCatFeeNewCopy == optionOrderDetailDataState.shouldShowCatFeeNewCopy && Intrinsics.areEqual(this.userLocale, optionOrderDetailDataState.userLocale);
    }

    public int hashCode() {
        Account account = this.account;
        int iHashCode = (((account == null ? 0 : account.hashCode()) * 31) + Boolean.hashCode(this.cancelButtonLoading)) * 31;
        OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates = this.currentOrNextMarketDates;
        int iHashCode2 = (iHashCode + (optionCurrentOrNextMarketDates == null ? 0 : optionCurrentOrNextMarketDates.hashCode())) * 31;
        List<Document> list = this.documents;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Index index = this.indexInstrument;
        int iHashCode4 = (iHashCode3 + (index == null ? 0 : index.hashCode())) * 31;
        Instrument instrument = this.instrument;
        int iHashCode5 = (iHashCode4 + (instrument == null ? 0 : instrument.hashCode())) * 31;
        Map<UUID, OptionInstrumentQuote> map = this.legQuotesMap;
        int iHashCode6 = (((iHashCode5 + (map == null ? 0 : map.hashCode())) * 31) + this.optionInstrumentPositionMap.hashCode()) * 31;
        OptionOrderDetailScreen optionOrderDetailScreen = this.optionOrderDetailScreen;
        int iHashCode7 = (iHashCode6 + (optionOrderDetailScreen == null ? 0 : optionOrderDetailScreen.hashCode())) * 31;
        OptionSettings optionSettings = this.optionSettings;
        int iHashCode8 = (iHashCode7 + (optionSettings == null ? 0 : optionSettings.hashCode())) * 31;
        ProfitAndLossTradeItem profitAndLossTradeItem = this.profitAndLossTradeItem;
        int iHashCode9 = (((iHashCode8 + (profitAndLossTradeItem == null ? 0 : profitAndLossTradeItem.hashCode())) * 31) + Boolean.hashCode(this.replaceButtonLoading)) * 31;
        UiOptionChain uiOptionChain = this.uiOptionChain;
        int iHashCode10 = (iHashCode9 + (uiOptionChain == null ? 0 : uiOptionChain.hashCode())) * 31;
        UiOptionOrder uiOptionOrder = this.uiOptionOrder;
        int iHashCode11 = (iHashCode10 + (uiOptionOrder == null ? 0 : uiOptionOrder.hashCode())) * 31;
        WithholdingAmount withholdingAmount = this.withholdingAmountResponse;
        int iHashCode12 = (((((((((iHashCode11 + (withholdingAmount == null ? 0 : withholdingAmount.hashCode())) * 31) + this.optionsPlaceAgainVariant.hashCode()) * 31) + Boolean.hashCode(this.isInCancelNewExperiment)) * 31) + Boolean.hashCode(this.pnlUpdatesEnabled)) * 31) + Boolean.hashCode(this.shouldShowCatFeeNewCopy)) * 31;
        CountryCode.Supported supported = this.userLocale;
        return iHashCode12 + (supported != null ? supported.hashCode() : 0);
    }

    public String toString() {
        return "OptionOrderDetailDataState(account=" + this.account + ", cancelButtonLoading=" + this.cancelButtonLoading + ", currentOrNextMarketDates=" + this.currentOrNextMarketDates + ", documents=" + this.documents + ", indexInstrument=" + this.indexInstrument + ", instrument=" + this.instrument + ", legQuotesMap=" + this.legQuotesMap + ", optionInstrumentPositionMap=" + this.optionInstrumentPositionMap + ", optionOrderDetailScreen=" + this.optionOrderDetailScreen + ", optionSettings=" + this.optionSettings + ", profitAndLossTradeItem=" + this.profitAndLossTradeItem + ", replaceButtonLoading=" + this.replaceButtonLoading + ", uiOptionChain=" + this.uiOptionChain + ", uiOptionOrder=" + this.uiOptionOrder + ", withholdingAmountResponse=" + this.withholdingAmountResponse + ", optionsPlaceAgainVariant=" + this.optionsPlaceAgainVariant + ", isInCancelNewExperiment=" + this.isInCancelNewExperiment + ", pnlUpdatesEnabled=" + this.pnlUpdatesEnabled + ", shouldShowCatFeeNewCopy=" + this.shouldShowCatFeeNewCopy + ", userLocale=" + this.userLocale + ")";
    }

    public OptionOrderDetailDataState(Account account, boolean z, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, List<Document> list, Index index, Instrument instrument, Map<UUID, OptionInstrumentQuote> map, Map<UUID, UiOptionInstrumentPosition> optionInstrumentPositionMap, OptionOrderDetailScreen optionOrderDetailScreen, OptionSettings optionSettings, ProfitAndLossTradeItem profitAndLossTradeItem, boolean z2, UiOptionChain uiOptionChain, UiOptionOrder uiOptionOrder, WithholdingAmount withholdingAmount, Experiments.OptionsPlaceAgain.Variant optionsPlaceAgainVariant, boolean z3, boolean z4, boolean z5, CountryCode.Supported supported) {
        Intrinsics.checkNotNullParameter(optionInstrumentPositionMap, "optionInstrumentPositionMap");
        Intrinsics.checkNotNullParameter(optionsPlaceAgainVariant, "optionsPlaceAgainVariant");
        this.account = account;
        this.cancelButtonLoading = z;
        this.currentOrNextMarketDates = optionCurrentOrNextMarketDates;
        this.documents = list;
        this.indexInstrument = index;
        this.instrument = instrument;
        this.legQuotesMap = map;
        this.optionInstrumentPositionMap = optionInstrumentPositionMap;
        this.optionOrderDetailScreen = optionOrderDetailScreen;
        this.optionSettings = optionSettings;
        this.profitAndLossTradeItem = profitAndLossTradeItem;
        this.replaceButtonLoading = z2;
        this.uiOptionChain = uiOptionChain;
        this.uiOptionOrder = uiOptionOrder;
        this.withholdingAmountResponse = withholdingAmount;
        this.optionsPlaceAgainVariant = optionsPlaceAgainVariant;
        this.isInCancelNewExperiment = z3;
        this.pnlUpdatesEnabled = z4;
        this.shouldShowCatFeeNewCopy = z5;
        this.userLocale = supported;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final boolean getCancelButtonLoading() {
        return this.cancelButtonLoading;
    }

    public final OptionCurrentOrNextMarketDates getCurrentOrNextMarketDates() {
        return this.currentOrNextMarketDates;
    }

    public final List<Document> getDocuments() {
        return this.documents;
    }

    public final Index getIndexInstrument() {
        return this.indexInstrument;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final Map<UUID, OptionInstrumentQuote> getLegQuotesMap() {
        return this.legQuotesMap;
    }

    public /* synthetic */ OptionOrderDetailDataState(Account account, boolean z, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, List list, Index index, Instrument instrument, Map map, Map map2, OptionOrderDetailScreen optionOrderDetailScreen, OptionSettings optionSettings, ProfitAndLossTradeItem profitAndLossTradeItem, boolean z2, UiOptionChain uiOptionChain, UiOptionOrder uiOptionOrder, WithholdingAmount withholdingAmount, Experiments.OptionsPlaceAgain.Variant variant, boolean z3, boolean z4, boolean z5, CountryCode.Supported supported, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : account, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : optionCurrentOrNextMarketDates, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : index, (i & 32) != 0 ? null : instrument, (i & 64) != 0 ? null : map, (i & 128) != 0 ? MapsKt.emptyMap() : map2, (i & 256) != 0 ? null : optionOrderDetailScreen, (i & 512) != 0 ? null : optionSettings, (i & 1024) != 0 ? null : profitAndLossTradeItem, (i & 2048) != 0 ? false : z2, (i & 4096) != 0 ? null : uiOptionChain, (i & 8192) != 0 ? null : uiOptionOrder, (i & 16384) != 0 ? null : withholdingAmount, (i & 32768) != 0 ? Experiments.OptionsPlaceAgain.Variant.CONTROL : variant, (i & 65536) != 0 ? false : z3, (i & 131072) != 0 ? false : z4, (i & 262144) != 0 ? true : z5, (i & 524288) != 0 ? null : supported);
    }

    public final Map<UUID, UiOptionInstrumentPosition> getOptionInstrumentPositionMap() {
        return this.optionInstrumentPositionMap;
    }

    public final OptionOrderDetailScreen getOptionOrderDetailScreen() {
        return this.optionOrderDetailScreen;
    }

    public final OptionSettings getOptionSettings() {
        return this.optionSettings;
    }

    public final ProfitAndLossTradeItem getProfitAndLossTradeItem() {
        return this.profitAndLossTradeItem;
    }

    public final boolean getReplaceButtonLoading() {
        return this.replaceButtonLoading;
    }

    public final UiOptionChain getUiOptionChain() {
        return this.uiOptionChain;
    }

    public final UiOptionOrder getUiOptionOrder() {
        return this.uiOptionOrder;
    }

    public final WithholdingAmount getWithholdingAmountResponse() {
        return this.withholdingAmountResponse;
    }

    public final Experiments.OptionsPlaceAgain.Variant getOptionsPlaceAgainVariant() {
        return this.optionsPlaceAgainVariant;
    }

    public final boolean isInCancelNewExperiment() {
        return this.isInCancelNewExperiment;
    }

    public final boolean getPnlUpdatesEnabled() {
        return this.pnlUpdatesEnabled;
    }

    public final boolean getShouldShowCatFeeNewCopy() {
        return this.shouldShowCatFeeNewCopy;
    }

    public final CountryCode.Supported getUserLocale() {
        return this.userLocale;
    }
}
