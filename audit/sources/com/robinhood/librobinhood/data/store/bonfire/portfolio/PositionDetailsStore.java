package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import bonfire.proto.idl.portfolio.p037v1.BonfirePortfolioService;
import bonfire.proto.idl.portfolio.p037v1.GetAccountPositionDetailsResponseDto;
import com.robinhood.android.api.portfolio.PortfolioApi;
import com.robinhood.android.idl.common.polling.IdlBackendPolling;
import com.robinhood.android.models.portfolio.InstrumentDetails3;
import com.robinhood.android.models.portfolio.PositionDetails;
import com.robinhood.android.models.portfolio.PositionDetailsDao;
import com.robinhood.android.models.portfolio.api.ApiPositionDetails;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.Batch;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.idl.Response;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.moshi.LazyMoshi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples3;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: PositionDetailsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001:BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011JG\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R&\u0010/\u001a\u0014\u0012\u0004\u0012\u00020,\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u00102\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u001e018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R&\u00107\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020,05\u0012\u0004\u0012\u000206048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u00109\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u001e018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00103¨\u0006;"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionDetailsStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/api/portfolio/PortfolioApi;", "portfolioApi", "Lcom/robinhood/android/models/portfolio/PositionDetailsDao;", "detailsDao", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lbonfire/proto/idl/portfolio/v1/BonfirePortfolioService;", "bonfirePortfolioService", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/android/api/portfolio/PortfolioApi;Lcom/robinhood/android/models/portfolio/PositionDetailsDao;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lbonfire/proto/idl/portfolio/v1/BonfirePortfolioService;Lcom/robinhood/utils/moshi/LazyMoshi;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)V", "", "accountNumber", "Ljava/util/UUID;", "instrumentId", "displayType", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "instrumentType", "j$/time/Duration", "pollingRate", "Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "displayCurrency", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/models/portfolio/PositionDetails;", "streamPositionDetails", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;Lj$/time/Duration;Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/api/portfolio/PortfolioApi;", "Lcom/robinhood/android/models/portfolio/PositionDetailsDao;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lbonfire/proto/idl/portfolio/v1/BonfirePortfolioService;", "Lcom/robinhood/utils/moshi/LazyMoshi;", "Lj$/time/Clock;", "", "Lcom/robinhood/android/models/portfolio/InstrumentListItemDetails$Chart;", "chartCache", "Ljava/util/Map;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionDetailsStore$DetailsRequest;", "Lcom/robinhood/idl/Response;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsResponseDto;", "positionDetailsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/moria/db/Query;", "positionDetailsQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/api/PaginatedEndpoint;", "", "Lcom/robinhood/android/models/portfolio/api/ApiPositionDetails;", "batchedPositionDetailsEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "batchedPositionDetailsQuery", "DetailsRequest", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class PositionDetailsStore extends Store {
    private final PaginatedEndpoint<Iterable<DetailsRequest>, ApiPositionDetails> batchedPositionDetailsEndpoint;
    private final Query<DetailsRequest, PositionDetails> batchedPositionDetailsQuery;
    private final BonfirePortfolioService bonfirePortfolioService;
    private final Map<String, InstrumentDetails3.Chart> chartCache;
    private final Clock clock;
    private final PositionDetailsDao detailsDao;
    private final ExperimentsStore experimentsStore;
    private final LazyMoshi moshi;
    private final PortfolioApi portfolioApi;
    private final Endpoint<DetailsRequest, Response<GetAccountPositionDetailsResponseDto>> positionDetailsEndpoint;
    private final Query<DetailsRequest, PositionDetails> positionDetailsQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionDetailsStore(PortfolioApi portfolioApi, PositionDetailsDao detailsDao, ExperimentsStore experimentsStore, BonfirePortfolioService bonfirePortfolioService, LazyMoshi moshi, Clock clock, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(portfolioApi, "portfolioApi");
        Intrinsics.checkNotNullParameter(detailsDao, "detailsDao");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(bonfirePortfolioService, "bonfirePortfolioService");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.portfolioApi = portfolioApi;
        this.detailsDao = detailsDao;
        this.experimentsStore = experimentsStore;
        this.bonfirePortfolioService = bonfirePortfolioService;
        this.moshi = moshi;
        this.clock = clock;
        this.chartCache = new LinkedHashMap();
        this.positionDetailsEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new PositionDetailsStore4(this, null), getLogoutKillswitch(), new PositionDetailsStore5(this, null), storeBundle.getClock(), null, 16, null);
        Query.Companion companion = Query.INSTANCE;
        this.positionDetailsQuery = Store.create$default(this, companion, "positionDetailsQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionDetailsStore.positionDetailsQuery$lambda$0(this.f$0, (PositionDetailsStore.DetailsRequest) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionDetailsStore.positionDetailsQuery$lambda$1(this.f$0, (PositionDetailsStore.DetailsRequest) obj);
            }
        }, false, 8, null);
        this.batchedPositionDetailsEndpoint = PaginatedEndpoint.Companion.createBatched$default(PaginatedEndpoint.INSTANCE, 20, new PositionDetailsStore2(this, null), getLogoutKillswitch(), new PositionDetailsStore3(this, null), storeBundle.getClock(), null, 32, null);
        this.batchedPositionDetailsQuery = Store.create$default(this, companion, "batchedPositionDetailsQuery", CollectionsKt.listOf(new Batch(getStoreScope(), 20, false, 300L, new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionDetailsStore.batchedPositionDetailsQuery$lambda$5(this.f$0, (Collection) obj);
            }
        }, 4, null)), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionDetailsStore.batchedPositionDetailsQuery$lambda$6(this.f$0, (PositionDetailsStore.DetailsRequest) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PositionDetailsStore.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJN\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u0010\u0010!\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010\u000f\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u001bR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u0010\u001d¨\u00062"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionDetailsStore$DetailsRequest;", "", "", "accountNumber", "Ljava/util/UUID;", "instrumentId", "displayType", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "instrumentType", "j$/time/Duration", "pollingRate", "Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "displayCurrency", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;Lj$/time/Duration;Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;)V", "other", "", "compareTo", "(Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionDetailsStore$DetailsRequest;)I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/UUID;", "component3", "component4", "()Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "component5", "()Lj$/time/Duration;", "component6", "()Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "copy", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;Lj$/time/Duration;Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;)Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionDetailsStore$DetailsRequest;", "toString", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccountNumber", "Ljava/util/UUID;", "getInstrumentId", "getDisplayType", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "getInstrumentType", "Lj$/time/Duration;", "getPollingRate", "Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "getDisplayCurrency", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class DetailsRequest implements Comparable<DetailsRequest> {
        private final String accountNumber;
        private final DisplayCurrency displayCurrency;
        private final String displayType;
        private final UUID instrumentId;
        private final PositionInstrumentType instrumentType;
        private final Duration pollingRate;

        public static /* synthetic */ DetailsRequest copy$default(DetailsRequest detailsRequest, String str, UUID uuid, String str2, PositionInstrumentType positionInstrumentType, Duration duration, DisplayCurrency displayCurrency, int i, Object obj) {
            if ((i & 1) != 0) {
                str = detailsRequest.accountNumber;
            }
            if ((i & 2) != 0) {
                uuid = detailsRequest.instrumentId;
            }
            if ((i & 4) != 0) {
                str2 = detailsRequest.displayType;
            }
            if ((i & 8) != 0) {
                positionInstrumentType = detailsRequest.instrumentType;
            }
            if ((i & 16) != 0) {
                duration = detailsRequest.pollingRate;
            }
            if ((i & 32) != 0) {
                displayCurrency = detailsRequest.displayCurrency;
            }
            Duration duration2 = duration;
            DisplayCurrency displayCurrency2 = displayCurrency;
            return detailsRequest.copy(str, uuid, str2, positionInstrumentType, duration2, displayCurrency2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDisplayType() {
            return this.displayType;
        }

        /* renamed from: component4, reason: from getter */
        public final PositionInstrumentType getInstrumentType() {
            return this.instrumentType;
        }

        /* renamed from: component5, reason: from getter */
        public final Duration getPollingRate() {
            return this.pollingRate;
        }

        /* renamed from: component6, reason: from getter */
        public final DisplayCurrency getDisplayCurrency() {
            return this.displayCurrency;
        }

        public final DetailsRequest copy(String accountNumber, UUID instrumentId, String displayType, PositionInstrumentType instrumentType, Duration pollingRate, DisplayCurrency displayCurrency) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(displayType, "displayType");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
            return new DetailsRequest(accountNumber, instrumentId, displayType, instrumentType, pollingRate, displayCurrency);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DetailsRequest)) {
                return false;
            }
            DetailsRequest detailsRequest = (DetailsRequest) other;
            return Intrinsics.areEqual(this.accountNumber, detailsRequest.accountNumber) && Intrinsics.areEqual(this.instrumentId, detailsRequest.instrumentId) && Intrinsics.areEqual(this.displayType, detailsRequest.displayType) && this.instrumentType == detailsRequest.instrumentType && Intrinsics.areEqual(this.pollingRate, detailsRequest.pollingRate) && this.displayCurrency == detailsRequest.displayCurrency;
        }

        public int hashCode() {
            int iHashCode = ((((((this.accountNumber.hashCode() * 31) + this.instrumentId.hashCode()) * 31) + this.displayType.hashCode()) * 31) + this.instrumentType.hashCode()) * 31;
            Duration duration = this.pollingRate;
            return ((iHashCode + (duration == null ? 0 : duration.hashCode())) * 31) + this.displayCurrency.hashCode();
        }

        public String toString() {
            return "DetailsRequest(accountNumber=" + this.accountNumber + ", instrumentId=" + this.instrumentId + ", displayType=" + this.displayType + ", instrumentType=" + this.instrumentType + ", pollingRate=" + this.pollingRate + ", displayCurrency=" + this.displayCurrency + ")";
        }

        public DetailsRequest(String accountNumber, UUID instrumentId, String displayType, PositionInstrumentType instrumentType, Duration duration, DisplayCurrency displayCurrency) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(displayType, "displayType");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
            this.accountNumber = accountNumber;
            this.instrumentId = instrumentId;
            this.displayType = displayType;
            this.instrumentType = instrumentType;
            this.pollingRate = duration;
            this.displayCurrency = displayCurrency;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final String getDisplayType() {
            return this.displayType;
        }

        public final PositionInstrumentType getInstrumentType() {
            return this.instrumentType;
        }

        public final Duration getPollingRate() {
            return this.pollingRate;
        }

        public final DisplayCurrency getDisplayCurrency() {
            return this.displayCurrency;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Comparable compareTo$lambda$0(DetailsRequest it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.instrumentId;
        }

        @Override // java.lang.Comparable
        public int compareTo(DetailsRequest other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return ComparisonsKt.compareValuesBy(this, other, new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore$DetailsRequest$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PositionDetailsStore.DetailsRequest.compareTo$lambda$0((PositionDetailsStore.DetailsRequest) obj);
                }
            }, new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore$DetailsRequest$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PositionDetailsStore.DetailsRequest.compareTo$lambda$1((PositionDetailsStore.DetailsRequest) obj);
                }
            }, new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore$DetailsRequest$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PositionDetailsStore.DetailsRequest.compareTo$lambda$2((PositionDetailsStore.DetailsRequest) obj);
                }
            }, new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore$DetailsRequest$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PositionDetailsStore.DetailsRequest.compareTo$lambda$3((PositionDetailsStore.DetailsRequest) obj);
                }
            }, new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore$DetailsRequest$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PositionDetailsStore.DetailsRequest.compareTo$lambda$4((PositionDetailsStore.DetailsRequest) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Comparable compareTo$lambda$1(DetailsRequest it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.instrumentType;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Comparable compareTo$lambda$2(DetailsRequest it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.displayType;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Comparable compareTo$lambda$3(DetailsRequest it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.accountNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Comparable compareTo$lambda$4(DetailsRequest it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.displayCurrency;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow positionDetailsQuery$lambda$0(PositionDetailsStore positionDetailsStore, DetailsRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request.getPollingRate() == null) {
            return IdlBackendPolling.backendPoll$default(positionDetailsStore.positionDetailsEndpoint, request, null, null, 6, null);
        }
        return Endpoint.DefaultImpls.poll$default(positionDetailsStore.positionDetailsEndpoint, request, request.getPollingRate(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow positionDetailsQuery$lambda$1(PositionDetailsStore positionDetailsStore, DetailsRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return FlowKt.onEach(positionDetailsStore.detailsDao.streamPositionDetails(request.getAccountNumber(), request.getInstrumentId(), request.getInstrumentType(), request.getDisplayType(), request.getDisplayCurrency()), new PositionDetailsStore6(positionDetailsStore, null));
    }

    public static /* synthetic */ Flow streamPositionDetails$default(PositionDetailsStore positionDetailsStore, String str, UUID uuid, String str2, PositionInstrumentType positionInstrumentType, Duration duration, DisplayCurrency displayCurrency, int i, Object obj) {
        if ((i & 32) != 0) {
            displayCurrency = DisplayCurrency.USD;
        }
        return positionDetailsStore.streamPositionDetails(str, uuid, str2, positionInstrumentType, duration, displayCurrency);
    }

    public final Flow<PositionDetails> streamPositionDetails(String accountNumber, UUID instrumentId, String displayType, PositionInstrumentType instrumentType, Duration pollingRate, DisplayCurrency displayCurrency) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
        return FlowKt.transformLatest(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{BatchedPositionDetailsExperiment.INSTANCE}, false, null, 6, null), new C34678x5eb51c1(null, instrumentType, this, accountNumber, instrumentId, displayType, pollingRate, displayCurrency));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow batchedPositionDetailsQuery$lambda$5(PositionDetailsStore positionDetailsStore, Collection requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        Collection collection = requests;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : collection) {
            DetailsRequest detailsRequest = (DetailsRequest) obj;
            Tuples3 tuples3 = new Tuples3(detailsRequest.getDisplayType(), detailsRequest.getInstrumentType(), detailsRequest.getAccountNumber());
            Object arrayList = linkedHashMap.get(tuples3);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(tuples3, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        Set setEntrySet = linkedHashMap.entrySet();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10));
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            List list = (List) ((Map.Entry) it.next()).getValue();
            PaginatedEndpoint<Iterable<DetailsRequest>, ApiPositionDetails> paginatedEndpoint = positionDetailsStore.batchedPositionDetailsEndpoint;
            Duration pollingRate = ((DetailsRequest) CollectionsKt.first(collection)).getPollingRate();
            if (pollingRate == null) {
                pollingRate = Duration.ofSeconds(5L);
            }
            Intrinsics.checkNotNull(pollingRate);
            arrayList2.add(paginatedEndpoint.pollAllPages(list, pollingRate));
        }
        return FlowKt.merge(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow batchedPositionDetailsQuery$lambda$6(PositionDetailsStore positionDetailsStore, DetailsRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return positionDetailsStore.detailsDao.streamPositionDetails(request.getAccountNumber(), request.getInstrumentId(), request.getInstrumentType(), request.getDisplayType(), request.getDisplayCurrency());
    }
}
