package com.robinhood.android.portfolio.pnl;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.portfolio.pnl.ProfitAndLossHubSectionStore;
import com.robinhood.android.portfolio.pnl.dao.InstrumentProfitAndLossRealizedDao;
import com.robinhood.android.portfolio.pnl.dao.ProfitAndLossRealizedDao;
import com.robinhood.android.portfolio.pnl.dao.ProfitAndLossSupportedAssetTypesDao;
import com.robinhood.android.portfolio.pnl.p214db.InstrumentProfitAndLossRealized;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossRealized;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossSupportedAssetTypes;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.rosetta.common.Currency;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Clock;
import rosetta.portfolio.p541v1.AssetClassDto;
import rosetta.portfolio.p541v1.Portfolio;
import wormhole.service.p554v1.GetRealizedPerformanceSummaryResponseDto;
import wormhole.service.p554v1.GetSupportedAssetClassesResponseDto;
import wormhole.service.p554v1.PNLService;

/* compiled from: ProfitAndLossHubSectionStore.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u00029:BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00142\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R2\u00100\u001a \u0012\u0004\u0012\u00020\u0018\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020-\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0,0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010+R \u00103\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u0002020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010+R \u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0015048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001a048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R \u00108\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u001f048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00106¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore;", "Lcom/robinhood/store/Store;", "Lwormhole/service/v1/PNLService;", "wormholePnlService", "Lrosetta/portfolio/v1/Portfolio;", "portfolioService", "Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossSupportedAssetTypesDao;", "supportedAssetTypesDao", "Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossRealizedDao;", "realizedPnlDao", "Lcom/robinhood/android/portfolio/pnl/dao/InstrumentProfitAndLossRealizedDao;", "instrumentRealizedPnlDao", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lwormhole/service/v1/PNLService;Lrosetta/portfolio/v1/Portfolio;Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossSupportedAssetTypesDao;Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossRealizedDao;Lcom/robinhood/android/portfolio/pnl/dao/InstrumentProfitAndLossRealizedDao;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)V", "", "accountNumber", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossSupportedAssetTypes;", "streamSupportedAssetTypes", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore$RealizedPnlParams;", "args", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossRealized;", "streamRealizedPnl", "(Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore$RealizedPnlParams;)Lkotlinx/coroutines/flow/Flow;", "Ljava/util/UUID;", "instrumentId", "Lcom/robinhood/android/portfolio/pnl/db/InstrumentProfitAndLossRealized;", "streamClosedPnlForInstrument", "(Ljava/lang/String;Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "Lwormhole/service/v1/PNLService;", "Lrosetta/portfolio/v1/Portfolio;", "Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossSupportedAssetTypesDao;", "Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossRealizedDao;", "Lcom/robinhood/android/portfolio/pnl/dao/InstrumentProfitAndLossRealizedDao;", "Lj$/time/Clock;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lwormhole/service/v1/GetSupportedAssetClassesResponseDto;", "supportedAssetTypesEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryResponseDto;", "", "Lrosetta/portfolio/v1/AssetClassDto;", "realizedPnlEndpoint", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore$ClosedPnlForInstrumentRequest;", "Lwormhole/service/v1/GetRealizedPerformanceSummaryResponseDto;", "closedPnlForInstrumentEndpoint", "Lcom/robinhood/android/moria/db/Query;", "supportedAssetTypesQuery", "Lcom/robinhood/android/moria/db/Query;", "realizedPnlQuery", "closedPnlForInstrumentQuery", "ClosedPnlForInstrumentRequest", "RealizedPnlParams", "lib-store-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ProfitAndLossHubSectionStore extends Store {
    public static final int $stable = 8;
    private final Clock clock;
    private final Endpoint<ClosedPnlForInstrumentRequest, GetRealizedPerformanceSummaryResponseDto> closedPnlForInstrumentEndpoint;
    private final Query<ClosedPnlForInstrumentRequest, InstrumentProfitAndLossRealized> closedPnlForInstrumentQuery;
    private final InstrumentProfitAndLossRealizedDao instrumentRealizedPnlDao;
    private final Portfolio portfolioService;
    private final ProfitAndLossRealizedDao realizedPnlDao;
    private final Endpoint<RealizedPnlParams, Tuples2<rosetta.portfolio.p541v1.GetRealizedPerformanceSummaryResponseDto, List<AssetClassDto>>> realizedPnlEndpoint;
    private final Query<RealizedPnlParams, ProfitAndLossRealized> realizedPnlQuery;
    private final ProfitAndLossSupportedAssetTypesDao supportedAssetTypesDao;
    private final Endpoint<String, GetSupportedAssetClassesResponseDto> supportedAssetTypesEndpoint;
    private final Query<String, ProfitAndLossSupportedAssetTypes> supportedAssetTypesQuery;
    private final PNLService wormholePnlService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfitAndLossHubSectionStore(PNLService wormholePnlService, Portfolio portfolioService, ProfitAndLossSupportedAssetTypesDao supportedAssetTypesDao, ProfitAndLossRealizedDao realizedPnlDao, InstrumentProfitAndLossRealizedDao instrumentRealizedPnlDao, Clock clock, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(wormholePnlService, "wormholePnlService");
        Intrinsics.checkNotNullParameter(portfolioService, "portfolioService");
        Intrinsics.checkNotNullParameter(supportedAssetTypesDao, "supportedAssetTypesDao");
        Intrinsics.checkNotNullParameter(realizedPnlDao, "realizedPnlDao");
        Intrinsics.checkNotNullParameter(instrumentRealizedPnlDao, "instrumentRealizedPnlDao");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.wormholePnlService = wormholePnlService;
        this.portfolioService = portfolioService;
        this.supportedAssetTypesDao = supportedAssetTypesDao;
        this.realizedPnlDao = realizedPnlDao;
        this.instrumentRealizedPnlDao = instrumentRealizedPnlDao;
        this.clock = clock;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.supportedAssetTypesEndpoint = companion.create(new ProfitAndLossHubSectionStore6(this, null), getLogoutKillswitch(), new ProfitAndLossHubSectionStore7(this, null), storeBundle.getClock(), new DefaultStaleDecider(ProfitAndLossSupportedAssetTypes.INSTANCE.getNormalStaleTimeout(), storeBundle.getClock()));
        ProfitAndLossHubSectionStore4 profitAndLossHubSectionStore4 = new ProfitAndLossHubSectionStore4(this, null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        ProfitAndLossHubSectionStore5 profitAndLossHubSectionStore5 = new ProfitAndLossHubSectionStore5(this, null);
        Clock clock2 = storeBundle.getClock();
        ProfitAndLossRealized.Companion companion2 = ProfitAndLossRealized.INSTANCE;
        this.realizedPnlEndpoint = companion.create(profitAndLossHubSectionStore4, logoutKillswitch, profitAndLossHubSectionStore5, clock2, new DefaultStaleDecider(companion2.getNormalStaleTimeout(), storeBundle.getClock()));
        this.closedPnlForInstrumentEndpoint = companion.create(new ProfitAndLossHubSectionStore2(this, null), getLogoutKillswitch(), new ProfitAndLossHubSectionStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(companion2.getNormalStaleTimeout(), storeBundle.getClock()));
        Query.Companion companion3 = Query.INSTANCE;
        this.supportedAssetTypesQuery = Store.create$default(this, companion3, "supportedAssetTypesQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.portfolio.pnl.ProfitAndLossHubSectionStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitAndLossHubSectionStore.supportedAssetTypesQuery$lambda$0(this.f$0, (String) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.portfolio.pnl.ProfitAndLossHubSectionStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitAndLossHubSectionStore.supportedAssetTypesQuery$lambda$1(this.f$0, (String) obj);
            }
        }, false, 8, null);
        this.realizedPnlQuery = Store.create$default(this, companion3, "RealizedPnlQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.portfolio.pnl.ProfitAndLossHubSectionStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitAndLossHubSectionStore.realizedPnlQuery$lambda$2(this.f$0, (ProfitAndLossHubSectionStore.RealizedPnlParams) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.portfolio.pnl.ProfitAndLossHubSectionStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitAndLossHubSectionStore.realizedPnlQuery$lambda$3(this.f$0, (ProfitAndLossHubSectionStore.RealizedPnlParams) obj);
            }
        }, false, 8, null);
        this.closedPnlForInstrumentQuery = Store.create$default(this, companion3, "RealizedPnlQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.portfolio.pnl.ProfitAndLossHubSectionStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitAndLossHubSectionStore.closedPnlForInstrumentQuery$lambda$4(this.f$0, (ProfitAndLossHubSectionStore.ClosedPnlForInstrumentRequest) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.portfolio.pnl.ProfitAndLossHubSectionStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitAndLossHubSectionStore.closedPnlForInstrumentQuery$lambda$5(this.f$0, (ProfitAndLossHubSectionStore.ClosedPnlForInstrumentRequest) obj);
            }
        }, false, 8, null);
    }

    /* compiled from: ProfitAndLossHubSectionStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore$ClosedPnlForInstrumentRequest;", "", "accountNumber", "", "instrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;)V", "getAccountNumber", "()Ljava/lang/String;", "getInstrumentId", "()Ljava/util/UUID;", "lib-store-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ClosedPnlForInstrumentRequest {
        public static final int $stable = 8;
        private final String accountNumber;
        private final UUID instrumentId;

        public ClosedPnlForInstrumentRequest(String accountNumber, UUID instrumentId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.accountNumber = accountNumber;
            this.instrumentId = instrumentId;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow supportedAssetTypesQuery$lambda$0(ProfitAndLossHubSectionStore profitAndLossHubSectionStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return Endpoint.DefaultImpls.poll$default(profitAndLossHubSectionStore.supportedAssetTypesEndpoint, accountNumber, ProfitAndLossSupportedAssetTypes.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow supportedAssetTypesQuery$lambda$1(ProfitAndLossHubSectionStore profitAndLossHubSectionStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return profitAndLossHubSectionStore.supportedAssetTypesDao.streamSupportedAssetTypes(accountNumber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow realizedPnlQuery$lambda$2(ProfitAndLossHubSectionStore profitAndLossHubSectionStore, RealizedPnlParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return Endpoint.DefaultImpls.poll$default(profitAndLossHubSectionStore.realizedPnlEndpoint, params, ProfitAndLossRealized.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow realizedPnlQuery$lambda$3(ProfitAndLossHubSectionStore profitAndLossHubSectionStore, RealizedPnlParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return profitAndLossHubSectionStore.realizedPnlDao.streamRealized(params.getAccountNumber(), params.getDisplayCurrency());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow closedPnlForInstrumentQuery$lambda$4(ProfitAndLossHubSectionStore profitAndLossHubSectionStore, ClosedPnlForInstrumentRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return Endpoint.DefaultImpls.poll$default(profitAndLossHubSectionStore.closedPnlForInstrumentEndpoint, request, ProfitAndLossRealized.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow closedPnlForInstrumentQuery$lambda$5(ProfitAndLossHubSectionStore profitAndLossHubSectionStore, ClosedPnlForInstrumentRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return profitAndLossHubSectionStore.instrumentRealizedPnlDao.streamRealized(request.getAccountNumber(), request.getInstrumentId());
    }

    public final Flow<ProfitAndLossSupportedAssetTypes> streamSupportedAssetTypes(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return this.supportedAssetTypesQuery.asFlow(accountNumber);
    }

    public final Flow<ProfitAndLossRealized> streamRealizedPnl(RealizedPnlParams args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return this.realizedPnlQuery.asFlow(args);
    }

    public final Flow<InstrumentProfitAndLossRealized> streamClosedPnlForInstrument(String accountNumber, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return this.closedPnlForInstrumentQuery.asFlow(new ClosedPnlForInstrumentRequest(accountNumber, instrumentId));
    }

    /* compiled from: ProfitAndLossHubSectionStore.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore$RealizedPnlParams;", "", "accountNumber", "", "displayCurrency", "Lcom/robinhood/rosetta/common/Currency;", "assetClasses", "", "Lrosetta/portfolio/v1/AssetClassDto;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/Currency;Ljava/util/List;)V", "getAccountNumber", "()Ljava/lang/String;", "getDisplayCurrency", "()Lcom/robinhood/rosetta/common/Currency;", "getAssetClasses", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RealizedPnlParams {
        public static final int $stable = 8;
        private final String accountNumber;
        private final List<AssetClassDto> assetClasses;
        private final Currency displayCurrency;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RealizedPnlParams copy$default(RealizedPnlParams realizedPnlParams, String str, Currency currency, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = realizedPnlParams.accountNumber;
            }
            if ((i & 2) != 0) {
                currency = realizedPnlParams.displayCurrency;
            }
            if ((i & 4) != 0) {
                list = realizedPnlParams.assetClasses;
            }
            return realizedPnlParams.copy(str, currency, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final Currency getDisplayCurrency() {
            return this.displayCurrency;
        }

        public final List<AssetClassDto> component3() {
            return this.assetClasses;
        }

        public final RealizedPnlParams copy(String accountNumber, Currency displayCurrency, List<? extends AssetClassDto> assetClasses) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
            Intrinsics.checkNotNullParameter(assetClasses, "assetClasses");
            return new RealizedPnlParams(accountNumber, displayCurrency, assetClasses);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RealizedPnlParams)) {
                return false;
            }
            RealizedPnlParams realizedPnlParams = (RealizedPnlParams) other;
            return Intrinsics.areEqual(this.accountNumber, realizedPnlParams.accountNumber) && this.displayCurrency == realizedPnlParams.displayCurrency && Intrinsics.areEqual(this.assetClasses, realizedPnlParams.assetClasses);
        }

        public int hashCode() {
            return (((this.accountNumber.hashCode() * 31) + this.displayCurrency.hashCode()) * 31) + this.assetClasses.hashCode();
        }

        public String toString() {
            return "RealizedPnlParams(accountNumber=" + this.accountNumber + ", displayCurrency=" + this.displayCurrency + ", assetClasses=" + this.assetClasses + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RealizedPnlParams(String accountNumber, Currency displayCurrency, List<? extends AssetClassDto> assetClasses) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
            Intrinsics.checkNotNullParameter(assetClasses, "assetClasses");
            this.accountNumber = accountNumber;
            this.displayCurrency = displayCurrency;
            this.assetClasses = assetClasses;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Currency getDisplayCurrency() {
            return this.displayCurrency;
        }

        public final List<AssetClassDto> getAssetClasses() {
            return this.assetClasses;
        }
    }
}
