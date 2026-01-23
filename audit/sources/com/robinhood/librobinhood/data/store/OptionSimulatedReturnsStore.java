package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.optionsproduct.OptionsProduct;
import com.robinhood.android.markethours.data.store.MarketHoursStore;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.models.Decimals4;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnOptionParams;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV4Request;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.simulatedreturns.OptionShouldShowSimulatedReturnsResponse;
import com.robinhood.models.p320db.simulatedreturns.OptionSimulatedReturnsConfigurationResponse;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle5;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.Combine;
import kotlinx.coroutines.rx2.RxConvert;
import kotlinx.datetime.Converters4;
import kotlinx.datetime.Instant;
import options_product.service.SimulatedReturns;
import p479j$.time.Clock;
import p479j$.time.LocalDate;

/* compiled from: OptionSimulatedReturnsStore.kt */
@Metadata(m3635d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013Ju\u0010(\u001a\u0004\u0018\u00010'2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001f2\u0006\u0010$\u001a\u00020#2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020%0\u001fH\u0007¢\u0006\u0004\b(\u0010)J[\u0010+\u001a\u0004\u0018\u00010*2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001f2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020%0\u001fH\u0007¢\u0006\u0004\b+\u0010,J%\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0014¢\u0006\u0004\b1\u00102J%\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*002\u0006\u0010.\u001a\u0002032\u0006\u0010/\u001a\u00020\u0014¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010:R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010;R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010<R#\u0010?\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020>0=8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR#\u0010C\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020>0=8\u0006¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bD\u0010BR#\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020E0=8\u0006¢\u0006\f\n\u0004\bF\u0010@\u001a\u0004\bG\u0010B¨\u0006H"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnsStore;", "Lcom/robinhood/store/Store;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "marketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionUnderlyingQuoteStore;", "optionUnderlyingQuoteStore", "Lcom/robinhood/android/api/optionsproduct/OptionsProduct;", "optionsProductApi", "Loptions_product/service/SimulatedReturns;", "simulatedReturnsService", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lj$/time/Clock;Lcom/robinhood/android/markethours/data/store/MarketHoursStore;Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;Lcom/robinhood/librobinhood/data/store/OptionUnderlyingQuoteStore;Lcom/robinhood/android/api/optionsproduct/OptionsProduct;Loptions_product/service/SimulatedReturns;Lcom/robinhood/store/StoreBundle;)V", "", "isLateClosing", "Lcom/robinhood/models/ui/UnderlyingQuote;", "underlyingQuote", "Lcom/robinhood/models/ui/OptionSimulatedChartUnderlying;", "underlying", "", "Lcom/robinhood/models/db/OptionInstrument;", "optionInstruments", "", "strategyCode", "", "Ljava/util/UUID;", "Lkotlinx/datetime/Instant;", "expirationTimes", "Lcom/robinhood/models/db/MarketHours;", "previousOrCurrentMarketHours", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "optionQuotes", "Lcom/robinhood/models/api/simulatedreturns/ApiOptionSimulatedReturnsConfigurationV3Request;", "getMarketDataParamsV3", "(Ljava/lang/Boolean;Lcom/robinhood/models/ui/UnderlyingQuote;Lcom/robinhood/models/ui/OptionSimulatedChartUnderlying;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Lcom/robinhood/models/db/MarketHours;Ljava/util/Map;)Lcom/robinhood/models/api/simulatedreturns/ApiOptionSimulatedReturnsConfigurationV3Request;", "Lcom/robinhood/models/api/simulatedreturns/ApiOptionSimulatedReturnsConfigurationV4Request;", "getMarketDataParamsV4", "(Lcom/robinhood/models/ui/UnderlyingQuote;Lcom/robinhood/models/ui/OptionSimulatedChartUnderlying;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Lcom/robinhood/models/api/simulatedreturns/ApiOptionSimulatedReturnsConfigurationV4Request;", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnMarketDataParamsRequestV3;", "request", "pollOptionQuotes", "Lkotlinx/coroutines/flow/Flow;", "streamMarketDataParamsV3", "(Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnMarketDataParamsRequestV3;Z)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnMarketDataParamsRequestV4;", "streamMarketDataParamsV4", "(Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnMarketDataParamsRequestV4;Z)Lkotlinx/coroutines/flow/Flow;", "Lj$/time/Clock;", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "Lcom/robinhood/librobinhood/data/store/OptionUnderlyingQuoteStore;", "Lcom/robinhood/android/api/optionsproduct/OptionsProduct;", "Loptions_product/service/SimulatedReturns;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/db/simulatedreturns/OptionSimulatedReturnsConfigurationResponse;", "getOptionSimulatedReturnConfigurationV3Endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "getGetOptionSimulatedReturnConfigurationV3Endpoint", "()Lcom/robinhood/android/moria/network/Endpoint;", "getOptionSimulatedReturnConfigurationV4Endpoint", "getGetOptionSimulatedReturnConfigurationV4Endpoint", "Lcom/robinhood/models/db/simulatedreturns/OptionShouldShowSimulatedReturnsResponse;", "getOptionShouldShowSimulatedReturnsEndpoint", "getGetOptionShouldShowSimulatedReturnsEndpoint", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionSimulatedReturnsStore extends Store {
    private final Clock clock;
    private final Endpoint<String, OptionShouldShowSimulatedReturnsResponse> getOptionShouldShowSimulatedReturnsEndpoint;
    private final Endpoint<ApiOptionSimulatedReturnsConfigurationV3Request, OptionSimulatedReturnsConfigurationResponse> getOptionSimulatedReturnConfigurationV3Endpoint;
    private final Endpoint<ApiOptionSimulatedReturnsConfigurationV4Request, OptionSimulatedReturnsConfigurationResponse> getOptionSimulatedReturnConfigurationV4Endpoint;
    private final MarketHoursStore marketHoursStore;
    private final OptionMarketHoursStore optionMarketHoursStore;
    private final OptionQuoteStore optionQuoteStore;
    private final OptionUnderlyingQuoteStore optionUnderlyingQuoteStore;
    private final OptionsProduct optionsProductApi;
    private final SimulatedReturns simulatedReturnsService;

    /* compiled from: OptionSimulatedReturnsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionChain.UnderlyingType.values().length];
            try {
                iArr[OptionChain.UnderlyingType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChain.UnderlyingType.INDEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionSimulatedReturnsStore(Clock clock, MarketHoursStore marketHoursStore, OptionMarketHoursStore optionMarketHoursStore, OptionQuoteStore optionQuoteStore, OptionUnderlyingQuoteStore optionUnderlyingQuoteStore, OptionsProduct optionsProductApi, SimulatedReturns simulatedReturnsService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(optionUnderlyingQuoteStore, "optionUnderlyingQuoteStore");
        Intrinsics.checkNotNullParameter(optionsProductApi, "optionsProductApi");
        Intrinsics.checkNotNullParameter(simulatedReturnsService, "simulatedReturnsService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.clock = clock;
        this.marketHoursStore = marketHoursStore;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.optionQuoteStore = optionQuoteStore;
        this.optionUnderlyingQuoteStore = optionUnderlyingQuoteStore;
        this.optionsProductApi = optionsProductApi;
        this.simulatedReturnsService = simulatedReturnsService;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.getOptionSimulatedReturnConfigurationV3Endpoint = Endpoint.Companion.create$default(companion, new C34116x802dec75(this, null), getLogoutKillswitch(), new C34117x802dec76(null), storeBundle.getClock(), null, 16, null);
        this.getOptionSimulatedReturnConfigurationV4Endpoint = Endpoint.Companion.create$default(companion, new C34118x15129f36(this, null), getLogoutKillswitch(), new C34119x15129f37(null), storeBundle.getClock(), null, 16, null);
        this.getOptionShouldShowSimulatedReturnsEndpoint = Endpoint.Companion.create$default(companion, new C34114x62cab265(this, null), getLogoutKillswitch(), new C34115x62cab266(null), storeBundle.getClock(), null, 16, null);
    }

    public final Endpoint<ApiOptionSimulatedReturnsConfigurationV3Request, OptionSimulatedReturnsConfigurationResponse> getGetOptionSimulatedReturnConfigurationV3Endpoint() {
        return this.getOptionSimulatedReturnConfigurationV3Endpoint;
    }

    public final Endpoint<ApiOptionSimulatedReturnsConfigurationV4Request, OptionSimulatedReturnsConfigurationResponse> getGetOptionSimulatedReturnConfigurationV4Endpoint() {
        return this.getOptionSimulatedReturnConfigurationV4Endpoint;
    }

    public final Endpoint<String, OptionShouldShowSimulatedReturnsResponse> getGetOptionShouldShowSimulatedReturnsEndpoint() {
        return this.getOptionShouldShowSimulatedReturnsEndpoint;
    }

    public final ApiOptionSimulatedReturnsConfigurationV3Request getMarketDataParamsV3(Boolean isLateClosing, UnderlyingQuote underlyingQuote, OptionSimulatedChartBundle5 underlying, List<OptionInstrument> optionInstruments, String strategyCode, Map<UUID, Instant> expirationTimes, MarketHours previousOrCurrentMarketHours, Map<UUID, OptionInstrumentQuote> optionQuotes) {
        ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying apiEquityUnderlying;
        p479j$.time.Instant regularClosesAt;
        Decimals4 adjustedMarkPrice;
        BigDecimal rawValue;
        Intrinsics.checkNotNullParameter(underlying, "underlying");
        Intrinsics.checkNotNullParameter(optionInstruments, "optionInstruments");
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        Intrinsics.checkNotNullParameter(expirationTimes, "expirationTimes");
        Intrinsics.checkNotNullParameter(previousOrCurrentMarketHours, "previousOrCurrentMarketHours");
        Intrinsics.checkNotNullParameter(optionQuotes, "optionQuotes");
        ApiOptionSimulatedReturnsConfigurationV3Request apiOptionSimulatedReturnsConfigurationV3Request = null;
        if (underlyingQuote == null || expirationTimes.isEmpty() || optionQuotes.isEmpty() || isLateClosing == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[underlying.getType().ordinal()];
        if (i == 1) {
            apiEquityUnderlying = new ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.ApiEquityUnderlying(underlying.getUnderlyingId(), isLateClosing.booleanValue());
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            apiEquityUnderlying = new ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.ApiIndexUnderlying(underlying.getUnderlyingId());
        }
        ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying apiOptionUnderlying = apiEquityUnderlying;
        p479j$.time.Instant instant = this.clock.instant();
        Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
        Instant kotlinInstant = Converters4.toKotlinInstant(instant);
        if (!isLateClosing.booleanValue() || (regularClosesAt = previousOrCurrentMarketHours.getLateOptionClosesAt()) == null) {
            regularClosesAt = previousOrCurrentMarketHours.getRegularClosesAt();
        }
        Instant instant2 = (Instant) ComparisonsKt.minOf(kotlinInstant, Converters4.toKotlinInstant(regularClosesAt));
        boolean z = kotlinInstant.toEpochMilliseconds() < regularClosesAt.toEpochMilli();
        p479j$.time.Instant javaInstant = Converters4.toJavaInstant(instant2);
        List<OptionInstrument> list = optionInstruments;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (OptionInstrument optionInstrument : list) {
            Instant instant3 = expirationTimes.get(optionInstrument.getId());
            if (instant3 == null) {
                return apiOptionSimulatedReturnsConfigurationV3Request;
            }
            double dDoubleValue = optionInstrument.getStrikePrice().doubleValue();
            double dDoubleValue2 = underlyingQuote.getCurrentValue().doubleValue();
            ApiOptionSimulatedReturnsConfigurationV3Request apiOptionSimulatedReturnsConfigurationV3Request2 = apiOptionSimulatedReturnsConfigurationV3Request;
            double dM28758toDoubleimpl = Duration.m28758toDoubleimpl(instant3.m28850minus5sfh64U(instant2), DurationUnitJvm.DAYS) / 365.0d;
            OptionInstrumentQuote optionInstrumentQuote = optionQuotes.get(optionInstrument.getId());
            if (optionInstrumentQuote == null || (adjustedMarkPrice = optionInstrumentQuote.getAdjustedMarkPrice()) == null || (rawValue = adjustedMarkPrice.getRawValue()) == null) {
                return apiOptionSimulatedReturnsConfigurationV3Request2;
            }
            arrayList.add(new ApiOptionSimulatedReturnOptionParams(dDoubleValue, dDoubleValue2, dM28758toDoubleimpl, rawValue.doubleValue(), optionInstrument.getContractType() == OptionContractType.PUT, underlying.getType() == OptionChain.UnderlyingType.INDEX, optionInstrument.getId()));
            apiOptionSimulatedReturnsConfigurationV3Request = apiOptionSimulatedReturnsConfigurationV3Request2;
        }
        return new ApiOptionSimulatedReturnsConfigurationV3Request(z, javaInstant, arrayList, strategyCode, apiOptionUnderlying);
    }

    public final ApiOptionSimulatedReturnsConfigurationV4Request getMarketDataParamsV4(UnderlyingQuote underlyingQuote, OptionSimulatedChartBundle5 underlying, List<OptionInstrument> optionInstruments, Map<UUID, Instant> expirationTimes, Map<UUID, OptionInstrumentQuote> optionQuotes) {
        Decimals4 adjustedMarkPrice;
        BigDecimal rawValue;
        Intrinsics.checkNotNullParameter(underlying, "underlying");
        Intrinsics.checkNotNullParameter(optionInstruments, "optionInstruments");
        Intrinsics.checkNotNullParameter(expirationTimes, "expirationTimes");
        Intrinsics.checkNotNullParameter(optionQuotes, "optionQuotes");
        ApiOptionSimulatedReturnsConfigurationV4Request apiOptionSimulatedReturnsConfigurationV4Request = null;
        if (underlyingQuote == null || expirationTimes.isEmpty() || optionQuotes.isEmpty()) {
            return null;
        }
        p479j$.time.Instant instant = this.clock.instant();
        Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
        Instant kotlinInstant = Converters4.toKotlinInstant(instant);
        List<OptionInstrument> list = optionInstruments;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (OptionInstrument optionInstrument : list) {
            Instant instant2 = expirationTimes.get(optionInstrument.getId());
            if (instant2 == null) {
                return apiOptionSimulatedReturnsConfigurationV4Request;
            }
            double dDoubleValue = optionInstrument.getStrikePrice().doubleValue();
            double dDoubleValue2 = underlyingQuote.getCurrentValue().doubleValue();
            ApiOptionSimulatedReturnsConfigurationV4Request apiOptionSimulatedReturnsConfigurationV4Request2 = apiOptionSimulatedReturnsConfigurationV4Request;
            double dM28758toDoubleimpl = Duration.m28758toDoubleimpl(instant2.m28850minus5sfh64U(kotlinInstant), DurationUnitJvm.DAYS) / 365.0d;
            OptionInstrumentQuote optionInstrumentQuote = optionQuotes.get(optionInstrument.getId());
            if (optionInstrumentQuote == null || (adjustedMarkPrice = optionInstrumentQuote.getAdjustedMarkPrice()) == null || (rawValue = adjustedMarkPrice.getRawValue()) == null) {
                return apiOptionSimulatedReturnsConfigurationV4Request2;
            }
            double dDoubleValue3 = rawValue.doubleValue();
            boolean z = true;
            if (optionInstrument.getContractType() != OptionContractType.PUT) {
                z = false;
            }
            arrayList.add(new ApiOptionSimulatedReturnOptionParams(dDoubleValue, dDoubleValue2, dM28758toDoubleimpl, dDoubleValue3, z, underlying.getType() == OptionChain.UnderlyingType.INDEX, optionInstrument.getId()));
            apiOptionSimulatedReturnsConfigurationV4Request = apiOptionSimulatedReturnsConfigurationV4Request2;
        }
        return new ApiOptionSimulatedReturnsConfigurationV4Request(arrayList);
    }

    public final Flow<ApiOptionSimulatedReturnsConfigurationV3Request> streamMarketDataParamsV3(OptionSimulatedReturnMarketDataParamsRequestV3 request, boolean pollOptionQuotes) {
        Intrinsics.checkNotNullParameter(request, "request");
        List<OptionInstrument> optionInstruments = request.getOptionInstruments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(optionInstruments, 10));
        Iterator<T> it = optionInstruments.iterator();
        while (it.hasNext()) {
            arrayList.add(((OptionInstrument) it.next()).getId());
        }
        if (request.getUnderlying() == null) {
            return FlowKt.flowOf((Object) null);
        }
        Flow<UnderlyingQuote> flowStreamUnderlyingQuote = this.optionUnderlyingQuoteStore.streamUnderlyingQuote(request.getUnderlying().getUnderlyingId(), request.getUnderlying().getType());
        Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.optionQuoteStore.getAllOptionQuotes(arrayList)), Integer.MAX_VALUE, null, 2, null);
        Flow flowBuffer$default2 = Context7.buffer$default(RxConvert.asFlow(this.marketHoursStore.getMostRecentPastOrCurrentMarketHours(false)), Integer.MAX_VALUE, null, 2, null);
        List<Tuples2<OptionChain, Map<UUID, LocalDate>>> chainToLegExpirationDatesList = request.getChainToLegExpirationDatesList();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(chainToLegExpirationDatesList, 10));
        Iterator<T> it2 = chainToLegExpirationDatesList.iterator();
        while (it2.hasNext()) {
            Tuples2 tuples2 = (Tuples2) it2.next();
            OptionChain optionChain = (OptionChain) tuples2.component1();
            final Map map = (Map) tuples2.component2();
            final Flow<Map<LocalDate, p479j$.time.Instant>> flowStreamExpirationTimes = this.optionMarketHoursStore.streamExpirationTimes(optionChain, CollectionsKt.toList(map.values()));
            arrayList2.add(new Flow<Map<UUID, ? extends Instant>>() { // from class: com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$streamMarketDataParamsV3$lambda$5$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Map<UUID, ? extends Instant>> flowCollector, Continuation continuation) {
                    Object objCollect = flowStreamExpirationTimes.collect(new AnonymousClass2(flowCollector, map), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$streamMarketDataParamsV3$lambda$5$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ Map $expirationDates$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$streamMarketDataParamsV3$lambda$5$$inlined$map$1$2", m3645f = "OptionSimulatedReturnsStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$streamMarketDataParamsV3$lambda$5$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, Map map) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$expirationDates$inlined = map;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Map map = (Map) obj;
                            Map map2 = this.$expirationDates$inlined;
                            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map2.size()));
                            for (Map.Entry entry : map2.entrySet()) {
                                Object key = entry.getKey();
                                p479j$.time.Instant instant = (p479j$.time.Instant) map.get(entry.getValue());
                                Instant instant2 = null;
                                if (instant != null) {
                                    Instant.Companion companion = Instant.INSTANCE;
                                    String string2 = instant.toString();
                                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                    instant2 = Instant.Companion.parse$default(companion, string2, null, 2, null);
                                }
                                linkedHashMap.put(key, instant2);
                            }
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(linkedHashMap, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
            });
        }
        final Flow[] flowArr = (Flow[]) CollectionsKt.toList(arrayList2).toArray(new Flow[0]);
        Flow<ApiOptionSimulatedReturnsConfigurationV3Request> flowCombine = FlowKt.combine(flowStreamUnderlyingQuote, new Flow<Map<UUID, ? extends Instant>>() { // from class: com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$streamMarketDataParamsV3$$inlined$combine$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Map<UUID, ? extends Instant>> flowCollector, Continuation continuation) {
                final Flow[] flowArr2 = flowArr;
                Object objCombineInternal = Combine.combineInternal(flowCollector, flowArr2, new Function0<Map<UUID, ? extends Instant>[]>() { // from class: com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$streamMarketDataParamsV3$$inlined$combine$1.2
                    @Override // kotlin.jvm.functions.Function0
                    public final Map<UUID, ? extends Instant>[] invoke() {
                        return new Map[flowArr2.length];
                    }
                }, new AnonymousClass3(null), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
            }

            /* compiled from: Zip.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$streamMarketDataParamsV3$$inlined$combine$1$3", m3645f = "OptionSimulatedReturnsStore.kt", m3646l = {288}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$streamMarketDataParamsV3$$inlined$combine$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends ContinuationImpl7 implements Function3<FlowCollector<? super Map<UUID, ? extends Instant>>, Map<UUID, ? extends Instant>[], Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public AnonymousClass3(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super Map<UUID, ? extends Instant>> flowCollector, Map<UUID, ? extends Instant>[] mapArr, Continuation<? super Unit> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                    anonymousClass3.L$0 = flowCollector;
                    anonymousClass3.L$1 = mapArr;
                    return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                        Map[] mapArr = (Map[]) ((Object[]) this.L$1);
                        if (mapArr.length == 0) {
                            throw new UnsupportedOperationException("Empty array can't be reduced.");
                        }
                        Map mapPlus = mapArr[0];
                        int lastIndex = ArraysKt.getLastIndex(mapArr);
                        if (1 <= lastIndex) {
                            int i2 = 1;
                            while (true) {
                                mapPlus = MapsKt.plus(mapPlus, mapArr[i2]);
                                if (i2 == lastIndex) {
                                    break;
                                }
                                i2++;
                            }
                        }
                        this.label = 1;
                        if (flowCollector.emit(mapPlus, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
        }, flowBuffer$default2, flowBuffer$default, new C341201(request, this, null));
        return pollOptionQuotes ? FlowKt.flowCombine(flowCombine, FlowKt.onStart(Context7.buffer$default(RxConvert.asFlow(this.optionQuoteStore.pollQuotes(arrayList)), Integer.MAX_VALUE, null, 2, null), new C34121xb4ef2a91(null)), new OptionSimulatedReturnsStore$streamMarketDataParamsV3$2$1(null)) : flowCombine;
    }

    /* compiled from: OptionSimulatedReturnsStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\u0005H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/simulatedreturns/ApiOptionSimulatedReturnsConfigurationV3Request;", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;", "expirationTimes", "", "Ljava/util/UUID;", "Lkotlinx/datetime/Instant;", "previousOrCurrentMarketHours", "Lcom/robinhood/models/db/MarketHours;", "optionQuotes", "Lcom/robinhood/models/db/OptionInstrumentQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$streamMarketDataParamsV3$1", m3645f = "OptionSimulatedReturnsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$streamMarketDataParamsV3$1 */
    static final class C341201 extends ContinuationImpl7 implements Function5<UnderlyingQuote, Map<UUID, ? extends Instant>, MarketHours, Map<UUID, ? extends OptionInstrumentQuote>, Continuation<? super ApiOptionSimulatedReturnsConfigurationV3Request>, Object> {
        final /* synthetic */ OptionSimulatedReturnMarketDataParamsRequestV3 $request;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        /* synthetic */ Object L$3;
        int label;
        final /* synthetic */ OptionSimulatedReturnsStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C341201(OptionSimulatedReturnMarketDataParamsRequestV3 optionSimulatedReturnMarketDataParamsRequestV3, OptionSimulatedReturnsStore optionSimulatedReturnsStore, Continuation<? super C341201> continuation) {
            super(5, continuation);
            this.$request = optionSimulatedReturnMarketDataParamsRequestV3;
            this.this$0 = optionSimulatedReturnsStore;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(UnderlyingQuote underlyingQuote, Map<UUID, Instant> map, MarketHours marketHours, Map<UUID, OptionInstrumentQuote> map2, Continuation<? super ApiOptionSimulatedReturnsConfigurationV3Request> continuation) {
            C341201 c341201 = new C341201(this.$request, this.this$0, continuation);
            c341201.L$0 = underlyingQuote;
            c341201.L$1 = map;
            c341201.L$2 = marketHours;
            c341201.L$3 = map2;
            return c341201.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Object invoke(UnderlyingQuote underlyingQuote, Map<UUID, ? extends Instant> map, MarketHours marketHours, Map<UUID, ? extends OptionInstrumentQuote> map2, Continuation<? super ApiOptionSimulatedReturnsConfigurationV3Request> continuation) {
            return invoke2(underlyingQuote, (Map<UUID, Instant>) map, marketHours, (Map<UUID, OptionInstrumentQuote>) map2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UnderlyingQuote underlyingQuote = (UnderlyingQuote) this.L$0;
            Map<UUID, Instant> map = (Map) this.L$1;
            MarketHours marketHours = (MarketHours) this.L$2;
            Map<UUID, OptionInstrumentQuote> map2 = (Map) this.L$3;
            return this.this$0.getMarketDataParamsV3(this.$request.isLateClosing(), underlyingQuote, this.$request.getUnderlying(), this.$request.getOptionInstruments(), this.$request.getStrategyCode(), map, marketHours, map2);
        }
    }

    public final Flow<ApiOptionSimulatedReturnsConfigurationV4Request> streamMarketDataParamsV4(OptionSimulatedReturnMarketDataParamsRequestV4 request, boolean pollOptionQuotes) {
        Intrinsics.checkNotNullParameter(request, "request");
        List<OptionInstrument> optionInstruments = request.getOptionInstruments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(optionInstruments, 10));
        Iterator<T> it = optionInstruments.iterator();
        while (it.hasNext()) {
            arrayList.add(((OptionInstrument) it.next()).getId());
        }
        if (request.getUnderlying() == null) {
            return FlowKt.flowOf((Object) null);
        }
        Flow<UnderlyingQuote> flowStreamUnderlyingQuote = this.optionUnderlyingQuoteStore.streamUnderlyingQuote(request.getUnderlying().getUnderlyingId(), request.getUnderlying().getType());
        Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.optionQuoteStore.getAllOptionQuotes(arrayList)), Integer.MAX_VALUE, null, 2, null);
        List<Tuples2<OptionChain, Map<UUID, LocalDate>>> chainToLegExpirationDatesList = request.getChainToLegExpirationDatesList();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(chainToLegExpirationDatesList, 10));
        Iterator<T> it2 = chainToLegExpirationDatesList.iterator();
        while (it2.hasNext()) {
            Tuples2 tuples2 = (Tuples2) it2.next();
            OptionChain optionChain = (OptionChain) tuples2.component1();
            final Map map = (Map) tuples2.component2();
            final Flow<Map<LocalDate, p479j$.time.Instant>> flowStreamExpirationTimes = this.optionMarketHoursStore.streamExpirationTimes(optionChain, CollectionsKt.toList(map.values()));
            arrayList2.add(new Flow<Map<UUID, ? extends Instant>>() { // from class: com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$streamMarketDataParamsV4$lambda$12$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Map<UUID, ? extends Instant>> flowCollector, Continuation continuation) {
                    Object objCollect = flowStreamExpirationTimes.collect(new AnonymousClass2(flowCollector, map), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$streamMarketDataParamsV4$lambda$12$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ Map $expirationDates$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$streamMarketDataParamsV4$lambda$12$$inlined$map$1$2", m3645f = "OptionSimulatedReturnsStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$streamMarketDataParamsV4$lambda$12$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, Map map) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$expirationDates$inlined = map;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Map map = (Map) obj;
                            Map map2 = this.$expirationDates$inlined;
                            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map2.size()));
                            for (Map.Entry entry : map2.entrySet()) {
                                Object key = entry.getKey();
                                p479j$.time.Instant instant = (p479j$.time.Instant) map.get(entry.getValue());
                                Instant instant2 = null;
                                if (instant != null) {
                                    Instant.Companion companion = Instant.INSTANCE;
                                    String string2 = instant.toString();
                                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                    instant2 = Instant.Companion.parse$default(companion, string2, null, 2, null);
                                }
                                linkedHashMap.put(key, instant2);
                            }
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(linkedHashMap, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
            });
        }
        final Flow[] flowArr = (Flow[]) CollectionsKt.toList(arrayList2).toArray(new Flow[0]);
        Flow<ApiOptionSimulatedReturnsConfigurationV4Request> flowCombine = FlowKt.combine(flowStreamUnderlyingQuote, new Flow<Map<UUID, ? extends Instant>>() { // from class: com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$streamMarketDataParamsV4$$inlined$combine$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Map<UUID, ? extends Instant>> flowCollector, Continuation continuation) {
                final Flow[] flowArr2 = flowArr;
                Object objCombineInternal = Combine.combineInternal(flowCollector, flowArr2, new Function0<Map<UUID, ? extends Instant>[]>() { // from class: com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$streamMarketDataParamsV4$$inlined$combine$1.2
                    @Override // kotlin.jvm.functions.Function0
                    public final Map<UUID, ? extends Instant>[] invoke() {
                        return new Map[flowArr2.length];
                    }
                }, new AnonymousClass3(null), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
            }

            /* compiled from: Zip.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$streamMarketDataParamsV4$$inlined$combine$1$3", m3645f = "OptionSimulatedReturnsStore.kt", m3646l = {288}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$streamMarketDataParamsV4$$inlined$combine$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends ContinuationImpl7 implements Function3<FlowCollector<? super Map<UUID, ? extends Instant>>, Map<UUID, ? extends Instant>[], Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public AnonymousClass3(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super Map<UUID, ? extends Instant>> flowCollector, Map<UUID, ? extends Instant>[] mapArr, Continuation<? super Unit> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                    anonymousClass3.L$0 = flowCollector;
                    anonymousClass3.L$1 = mapArr;
                    return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                        Map[] mapArr = (Map[]) ((Object[]) this.L$1);
                        if (mapArr.length == 0) {
                            throw new UnsupportedOperationException("Empty array can't be reduced.");
                        }
                        Map mapPlus = mapArr[0];
                        int lastIndex = ArraysKt.getLastIndex(mapArr);
                        if (1 <= lastIndex) {
                            int i2 = 1;
                            while (true) {
                                mapPlus = MapsKt.plus(mapPlus, mapArr[i2]);
                                if (i2 == lastIndex) {
                                    break;
                                }
                                i2++;
                            }
                        }
                        this.label = 1;
                        if (flowCollector.emit(mapPlus, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
        }, flowBuffer$default, new C341221(request, this, null));
        return pollOptionQuotes ? FlowKt.flowCombine(flowCombine, FlowKt.onStart(Context7.buffer$default(RxConvert.asFlow(this.optionQuoteStore.pollQuotes(arrayList)), Integer.MAX_VALUE, null, 2, null), new C34123x391f7792(null)), new OptionSimulatedReturnsStore$streamMarketDataParamsV4$2$1(null)) : flowCombine;
    }

    /* compiled from: OptionSimulatedReturnsStore.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0005H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/simulatedreturns/ApiOptionSimulatedReturnsConfigurationV4Request;", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;", "expirationTimes", "", "Ljava/util/UUID;", "Lkotlinx/datetime/Instant;", "optionQuotes", "Lcom/robinhood/models/db/OptionInstrumentQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$streamMarketDataParamsV4$1", m3645f = "OptionSimulatedReturnsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$streamMarketDataParamsV4$1 */
    static final class C341221 extends ContinuationImpl7 implements Function4<UnderlyingQuote, Map<UUID, ? extends Instant>, Map<UUID, ? extends OptionInstrumentQuote>, Continuation<? super ApiOptionSimulatedReturnsConfigurationV4Request>, Object> {
        final /* synthetic */ OptionSimulatedReturnMarketDataParamsRequestV4 $request;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;
        final /* synthetic */ OptionSimulatedReturnsStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C341221(OptionSimulatedReturnMarketDataParamsRequestV4 optionSimulatedReturnMarketDataParamsRequestV4, OptionSimulatedReturnsStore optionSimulatedReturnsStore, Continuation<? super C341221> continuation) {
            super(4, continuation);
            this.$request = optionSimulatedReturnMarketDataParamsRequestV4;
            this.this$0 = optionSimulatedReturnsStore;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(UnderlyingQuote underlyingQuote, Map<UUID, Instant> map, Map<UUID, OptionInstrumentQuote> map2, Continuation<? super ApiOptionSimulatedReturnsConfigurationV4Request> continuation) {
            C341221 c341221 = new C341221(this.$request, this.this$0, continuation);
            c341221.L$0 = underlyingQuote;
            c341221.L$1 = map;
            c341221.L$2 = map2;
            return c341221.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(UnderlyingQuote underlyingQuote, Map<UUID, ? extends Instant> map, Map<UUID, ? extends OptionInstrumentQuote> map2, Continuation<? super ApiOptionSimulatedReturnsConfigurationV4Request> continuation) {
            return invoke2(underlyingQuote, (Map<UUID, Instant>) map, (Map<UUID, OptionInstrumentQuote>) map2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UnderlyingQuote underlyingQuote = (UnderlyingQuote) this.L$0;
            Map<UUID, Instant> map = (Map) this.L$1;
            Map<UUID, OptionInstrumentQuote> map2 = (Map) this.L$2;
            return this.this$0.getMarketDataParamsV4(underlyingQuote, this.$request.getUnderlying(), this.$request.getOptionInstruments(), map, map2);
        }
    }
}
