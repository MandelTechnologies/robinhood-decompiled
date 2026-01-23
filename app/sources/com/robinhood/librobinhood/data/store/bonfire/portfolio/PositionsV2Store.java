package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import bonfire.proto.idl.portfolio.p037v1.BonfirePortfolioService;
import com.robinhood.android.api.portfolio.PortfolioApi;
import com.robinhood.android.models.portfolio.PositionListItemV2Dao;
import com.robinhood.android.models.portfolio.PositionsDisplayOptions;
import com.robinhood.android.models.portfolio.PositionsSortOptions;
import com.robinhood.android.models.portfolio.PositionsSortOptions2;
import com.robinhood.android.models.portfolio.PositionsSortOptionsDao;
import com.robinhood.android.models.portfolio.PositionsSortPreference;
import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.android.models.portfolio.PositionsV2Dao;
import com.robinhood.android.models.portfolio.api.ApiPositionSortOptions;
import com.robinhood.android.models.portfolio.api.AssetType;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.android.models.portfolio.api.PositionsSortDirection;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.QueryKt;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.models.PositionsOrderingUpdateRequest;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonDataException;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.Combine;
import kotlinx.coroutines.rx2.RxAwait3;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: PositionsV2Store.kt */
@Metadata(m3635d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002HIBI\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(J$\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J<\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001c0*2\u0006\u0010!\u001a\u00020\"2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020$0\u001c2\u0006\u0010%\u001a\u00020&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(J<\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001c0*2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\"0\u001c2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(JB\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001c0*2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\"0\u001c2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020$0\u001c2\u0006\u0010%\u001a\u00020&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(J&\u00101\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0086@¢\u0006\u0002\u00102J=\u00107\u001a\u0002082\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\f\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u001c2\b\b\u0002\u0010;\u001a\u00020<¢\u0006\u0004\b=\u0010>J\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020D0 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J(\u0010F\u001a\u0002082\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(J\u000e\u0010G\u001a\u0004\u0018\u00010A*\u00020$H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001c0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001c0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00103\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020604X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010?\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020A0@\u0012\u0004\u0012\u00020B0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010C\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020A0@\u0012\u0004\u0012\u00020D0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006J"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;", "Lcom/robinhood/store/Store;", "portfolioApi", "Lcom/robinhood/android/api/portfolio/PortfolioApi;", "positionsV2Dao", "Lcom/robinhood/android/models/portfolio/PositionsV2Dao;", "positionListItemV2Dao", "Lcom/robinhood/android/models/portfolio/PositionListItemV2Dao;", "sortOptionsDao", "Lcom/robinhood/android/models/portfolio/PositionsSortOptionsDao;", "positionsDisplayOptionsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsDisplayOptionsStore;", "bonfirePortfolioService", "Lbonfire/proto/idl/portfolio/v1/BonfirePortfolioService;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/portfolio/PortfolioApi;Lcom/robinhood/android/models/portfolio/PositionsV2Dao;Lcom/robinhood/android/models/portfolio/PositionListItemV2Dao;Lcom/robinhood/android/models/portfolio/PositionsSortOptionsDao;Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsDisplayOptionsStore;Lbonfire/proto/idl/portfolio/v1/BonfirePortfolioService;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/store/StoreBundle;)V", "positionsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store$PositionsRequest;", "Lcom/robinhood/android/models/portfolio/PositionsV2;", "positionsQuery", "Lcom/robinhood/android/moria/db/Query;", "positionsEndpointMultipleAccounts", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store$PositionsRequestMultipleAccounts;", "", "positionsQueryMultipleAccounts", "Lcom/robinhood/android/models/portfolio/PositionsV2$PositionListItemV2;", "streamPositions", "Lio/reactivex/Observable;", "accountNumber", "", "instrumentType", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "positionsLocation", "Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", "sortPreference", "Lcom/robinhood/android/models/portfolio/PositionsSortPreference;", "streamHasPositions", "Lkotlinx/coroutines/flow/Flow;", "", "streamPositionItemsForInstrumentTypes", "instrumentTypes", "streamPositionItemsForAccounts", "accountNumbers", "streamPositionItemsAccountsAndTypes", "refreshPositions", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;Lcom/robinhood/android/models/portfolio/api/PositionsLocation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postPositionsOrderingEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/models/PositionsOrderingUpdateRequest;", "", "reorderPositions", "Lkotlinx/coroutines/Job;", "instrumentIds", "Ljava/util/UUID;", "delay", "Lkotlin/time/Duration;", "reorderPositions-9VgGkz4", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;Lcom/robinhood/android/models/portfolio/api/PositionsLocation;Ljava/util/List;J)Lkotlinx/coroutines/Job;", "sortOptionsEndpoint", "Lkotlin/Pair;", "Lcom/robinhood/android/models/portfolio/api/AssetType;", "Lcom/robinhood/android/models/portfolio/api/ApiPositionSortOptions;", "sortOptionsQuery", "Lcom/robinhood/android/models/portfolio/PositionsSortOptions;", "streamSortOptions", "sortPositions", "toSortOptionsAssetType", "PositionsRequest", "PositionsRequestMultipleAccounts", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class PositionsV2Store extends Store {
    private final BonfirePortfolioService bonfirePortfolioService;
    private final LazyMoshi moshi;
    private final PortfolioApi portfolioApi;
    private final PositionListItemV2Dao positionListItemV2Dao;
    private final PositionsDisplayOptionsStore positionsDisplayOptionsStore;
    private final Endpoint<PositionsRequest, PositionsV2> positionsEndpoint;
    private final Endpoint<PositionsRequestMultipleAccounts, List<PositionsV2>> positionsEndpointMultipleAccounts;
    private final Query<PositionsRequest, PositionsV2> positionsQuery;
    private final Query<PositionsRequestMultipleAccounts, List<PositionsV2.PositionListItemV2>> positionsQueryMultipleAccounts;
    private final PositionsV2Dao positionsV2Dao;
    private final PostEndpoint<PositionsOrderingUpdateRequest, Unit> postPositionsOrderingEndpoint;
    private final PositionsSortOptionsDao sortOptionsDao;
    private final Endpoint<Tuples2<String, AssetType>, ApiPositionSortOptions> sortOptionsEndpoint;
    private final Query<Tuples2<String, ? extends AssetType>, PositionsSortOptions> sortOptionsQuery;

    /* compiled from: PositionsV2Store.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PositionInstrumentType.values().length];
            try {
                iArr[PositionInstrumentType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PositionInstrumentType.OPTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PositionInstrumentType.FUTURES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PositionInstrumentType.EQUITY_LEGACY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PositionInstrumentType.EQUITY_PENDING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PositionInstrumentType.CRYPTO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PositionInstrumentType.CRYPTO_TOKENIZED_STOCKS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PositionInstrumentType.CRYPTO_PERPETUALS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PositionInstrumentType.OPTIONS_PENDING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PositionInstrumentType.COMBO_ORDERS_PENDING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PositionInstrumentType.PSP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PositionInstrumentType.FUTURES_PENDING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PositionInstrumentType.EVENT_CONTRACT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[PositionInstrumentType.EVENT_CONTRACT_PENDING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[PositionInstrumentType.UNKNOWN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionsV2Store(PortfolioApi portfolioApi, PositionsV2Dao positionsV2Dao, PositionListItemV2Dao positionListItemV2Dao, PositionsSortOptionsDao sortOptionsDao, PositionsDisplayOptionsStore positionsDisplayOptionsStore, BonfirePortfolioService bonfirePortfolioService, LazyMoshi moshi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(portfolioApi, "portfolioApi");
        Intrinsics.checkNotNullParameter(positionsV2Dao, "positionsV2Dao");
        Intrinsics.checkNotNullParameter(positionListItemV2Dao, "positionListItemV2Dao");
        Intrinsics.checkNotNullParameter(sortOptionsDao, "sortOptionsDao");
        Intrinsics.checkNotNullParameter(positionsDisplayOptionsStore, "positionsDisplayOptionsStore");
        Intrinsics.checkNotNullParameter(bonfirePortfolioService, "bonfirePortfolioService");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.portfolioApi = portfolioApi;
        this.positionsV2Dao = positionsV2Dao;
        this.positionListItemV2Dao = positionListItemV2Dao;
        this.sortOptionsDao = sortOptionsDao;
        this.positionsDisplayOptionsStore = positionsDisplayOptionsStore;
        this.bonfirePortfolioService = bonfirePortfolioService;
        this.moshi = moshi;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        Endpoint<PositionsRequest, PositionsV2> endpointCreateWithParams$default = Endpoint.Companion.createWithParams$default(companion, new PositionsV2Store$positionsEndpoint$1(this, null), getLogoutKillswitch(), new PositionsV2Store$positionsEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.positionsEndpoint = endpointCreateWithParams$default;
        Query.Companion companion2 = Query.INSTANCE;
        this.positionsQuery = Store.create$default(this, companion2, "queryPositionsV2", CollectionsKt.listOf(new PollEach(getStoreScope(), new PositionsV2Store$positionsQuery$1(endpointCreateWithParams$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionsV2Store.positionsQuery$lambda$0(this.f$0, (PositionsV2Store.PositionsRequest) obj);
            }
        }, false, 8, null);
        Endpoint<PositionsRequestMultipleAccounts, List<PositionsV2>> endpointCreateWithParams$default2 = Endpoint.Companion.createWithParams$default(companion, new PositionsV2Store$positionsEndpointMultipleAccounts$1(this, null), getLogoutKillswitch(), new PositionsV2Store$positionsEndpointMultipleAccounts$2(this, null), storeBundle.getClock(), null, 16, null);
        this.positionsEndpointMultipleAccounts = endpointCreateWithParams$default2;
        this.positionsQueryMultipleAccounts = Store.create$default(this, companion2, "queryPositionsV2", CollectionsKt.listOf(new PollEach(getStoreScope(), new PositionsV2Store$positionsQueryMultipleAccounts$1(endpointCreateWithParams$default2))), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionsV2Store.positionsQueryMultipleAccounts$lambda$2(this.f$0, (PositionsV2Store.PositionsRequestMultipleAccounts) obj);
            }
        }, false, 8, null);
        this.postPositionsOrderingEndpoint = PostEndpoint.INSTANCE.createWithParams(new PositionsV2Store$postPositionsOrderingEndpoint$1(this, null), new PositionsV2Store$postPositionsOrderingEndpoint$2(this, null));
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        Clock clock = storeBundle.getClock();
        Duration durationOfMinutes = Duration.ofMinutes(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        this.sortOptionsEndpoint = companion.createWithParams(new PositionsV2Store$sortOptionsEndpoint$1(this, null), logoutKillswitch, new PositionsV2Store$sortOptionsEndpoint$2(this, null), clock, new DefaultStaleDecider(durationOfMinutes, storeBundle.getClock()));
        this.sortOptionsQuery = Store.create$default(this, companion2, "positionValueSortOptionsQuery", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionsV2Store.sortOptionsQuery$lambda$9(this.f$0, (Tuples2) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionsV2Store.sortOptionsQuery$lambda$10(this.f$0, (Tuples2) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow positionsQuery$lambda$0(PositionsV2Store positionsV2Store, PositionsRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return positionsV2Store.positionsV2Dao.getPositions(request.getAccountNumber(), request.getInstrumentType(), request.getPositionsLocation());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow positionsQueryMultipleAccounts$lambda$2(PositionsV2Store positionsV2Store, PositionsRequestMultipleAccounts request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return positionsV2Store.positionListItemV2Dao.getPositionListItemsFromAccountNumbers(request.getAccountNumbers(), request.getInstrumentTypes());
    }

    public static /* synthetic */ Observable streamPositions$default(PositionsV2Store positionsV2Store, String str, PositionInstrumentType positionInstrumentType, PositionsLocation positionsLocation, PositionsSortPreference positionsSortPreference, int i, Object obj) {
        if ((i & 8) != 0) {
            positionsSortPreference = null;
        }
        return positionsV2Store.streamPositions(str, positionInstrumentType, positionsLocation, positionsSortPreference);
    }

    public final Observable<PositionsV2> streamPositions(String accountNumber, PositionInstrumentType instrumentType, PositionsLocation positionsLocation, PositionsSortPreference sortPreference) {
        Observable<PositionsV2> observableAsObservable;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
        final PositionsRequest positionsRequest = new PositionsRequest(accountNumber, instrumentType, positionsLocation, sortPreference);
        if (sortPreference == null) {
            final Query<PositionsRequest, PositionsV2> query = this.positionsQuery;
            final C346891 c346891 = new C346891(this.positionsV2Dao);
            final boolean z = true;
            observableAsObservable = query.asObservable(positionsRequest).onErrorResumeNext(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$streamPositions$$inlined$deleteAllOnRoomJsonException$default$1
                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends T> apply(Throwable t) {
                    Intrinsics.checkNotNullParameter(t, "t");
                    if (t instanceof JsonDataException) {
                        final Function0 function0 = c346891;
                        Completable completableFromCallable = Completable.fromCallable(new Callable() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$streamPositions$$inlined$deleteAllOnRoomJsonException$default$1.1
                            @Override // java.util.concurrent.Callable
                            public /* bridge */ /* synthetic */ Object call() {
                                call();
                                return Unit.INSTANCE;
                            }

                            @Override // java.util.concurrent.Callable
                            public final void call() {
                                function0.invoke();
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(completableFromCallable, "fromCallable(...)");
                        if (z) {
                            return completableFromCallable.andThen(query.asObservable(positionsRequest));
                        }
                        return completableFromCallable.toObservable();
                    }
                    return Observable.error(t);
                }
            });
            Intrinsics.checkNotNullExpressionValue(observableAsObservable, "onErrorResumeNext(...)");
        } else {
            observableAsObservable = asObservable(Endpoint.DefaultImpls.poll$default(this.positionsEndpoint, positionsRequest, null, null, 6, null));
        }
        Observable<PositionsV2> observableDistinctUntilChanged = observableAsObservable.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    /* compiled from: PositionsV2Store.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$streamPositions$1 */
    /* synthetic */ class C346891 extends FunctionReferenceImpl implements Function0<Unit> {
        C346891(Object obj) {
            super(0, obj, PositionsV2Dao.class, "deleteAll", "deleteAll()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((PositionsV2Dao) this.receiver).deleteAll();
        }
    }

    public final Flow<Boolean> streamHasPositions(String accountNumber, PositionInstrumentType instrumentType, PositionsLocation positionsLocation) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(streamPositions$default(this, accountNumber, instrumentType, positionsLocation, null, 8, null)), Integer.MAX_VALUE, null, 2, null);
        return FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$streamHasPositions$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default.collect(new C346812(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$streamHasPositions$$inlined$map$1$2 */
            public static final class C346812<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$streamHasPositions$$inlined$map$1$2", m3645f = "PositionsV2Store.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$streamHasPositions$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C346812.this.emit(null, this);
                    }
                }

                public C346812(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                        Boolean boolBoxBoolean = boxing.boxBoolean(!((PositionsV2) obj).getResults().isEmpty());
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
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

    public static /* synthetic */ Flow streamPositionItemsForInstrumentTypes$default(PositionsV2Store positionsV2Store, String str, List list, PositionsLocation positionsLocation, PositionsSortPreference positionsSortPreference, int i, Object obj) {
        if ((i & 8) != 0) {
            positionsSortPreference = null;
        }
        return positionsV2Store.streamPositionItemsForInstrumentTypes(str, list, positionsLocation, positionsSortPreference);
    }

    public final Flow<List<PositionsV2>> streamPositionItemsForInstrumentTypes(String accountNumber, List<? extends PositionInstrumentType> instrumentTypes, PositionsLocation positionsLocation, PositionsSortPreference sortPreference) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentTypes, "instrumentTypes");
        Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
        List<? extends PositionInstrumentType> list = instrumentTypes;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new PositionsRequest(accountNumber, (PositionInstrumentType) it.next(), positionsLocation, sortPreference));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(QueryKt.deleteAllOnRoomJsonExceptionFlow$default(this.positionsQuery, (PositionsRequest) it2.next(), new PositionsV2Store$streamPositionItemsForInstrumentTypes$1$1(this.positionsV2Dao), false, 4, null));
        }
        final Flow[] flowArr = (Flow[]) CollectionsKt.toList(arrayList2).toArray(new Flow[0]);
        return new Flow<List<? extends PositionsV2>>() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$streamPositionItemsForInstrumentTypes$$inlined$combine$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends PositionsV2>> flowCollector, Continuation continuation) {
                final Flow[] flowArr2 = flowArr;
                Object objCombineInternal = Combine.combineInternal(flowCollector, flowArr2, new Function0<PositionsV2[]>() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$streamPositionItemsForInstrumentTypes$$inlined$combine$1.2
                    @Override // kotlin.jvm.functions.Function0
                    public final PositionsV2[] invoke() {
                        return new PositionsV2[flowArr2.length];
                    }
                }, new AnonymousClass3(null), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
            }

            /* compiled from: Zip.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$streamPositionItemsForInstrumentTypes$$inlined$combine$1$3", m3645f = "PositionsV2Store.kt", m3646l = {288}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$streamPositionItemsForInstrumentTypes$$inlined$combine$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends ContinuationImpl7 implements Function3<FlowCollector<? super List<? extends PositionsV2>>, PositionsV2[], Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public AnonymousClass3(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super List<? extends PositionsV2>> flowCollector, PositionsV2[] positionsV2Arr, Continuation<? super Unit> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                    anonymousClass3.L$0 = flowCollector;
                    anonymousClass3.L$1 = positionsV2Arr;
                    return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                        List list = ArraysKt.toList((PositionsV2[]) ((Object[]) this.L$1));
                        this.label = 1;
                        if (flowCollector.emit(list, this) == coroutine_suspended) {
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
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object streamPositionItemsForInstrumentTypes$lambda$5$deleteAll(PositionsV2Dao positionsV2Dao, Continuation continuation) {
        positionsV2Dao.deleteAll();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Flow streamPositionItemsForAccounts$default(PositionsV2Store positionsV2Store, List list, PositionInstrumentType positionInstrumentType, PositionsLocation positionsLocation, PositionsSortPreference positionsSortPreference, int i, Object obj) {
        if ((i & 8) != 0) {
            positionsSortPreference = null;
        }
        return positionsV2Store.streamPositionItemsForAccounts(list, positionInstrumentType, positionsLocation, positionsSortPreference);
    }

    public final Flow<List<PositionsV2.PositionListItemV2>> streamPositionItemsForAccounts(List<String> accountNumbers, PositionInstrumentType instrumentType, PositionsLocation positionsLocation, PositionsSortPreference sortPreference) {
        Intrinsics.checkNotNullParameter(accountNumbers, "accountNumbers");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
        return QueryKt.deleteAllOnRoomJsonExceptionFlow$default(this.positionsQueryMultipleAccounts, new PositionsRequestMultipleAccounts(accountNumbers, CollectionsKt.listOf(instrumentType), positionsLocation, sortPreference), new C346881(this.positionListItemV2Dao), false, 4, null);
    }

    /* compiled from: PositionsV2Store.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$streamPositionItemsForAccounts$1 */
    /* synthetic */ class C346881 extends AdaptedFunctionReference implements Function1<Continuation<? super Unit>, Object>, ContinuationImpl6 {
        C346881(Object obj) {
            super(1, obj, PositionListItemV2Dao.class, "deleteAll", "deleteAll()V", 4);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return PositionsV2Store.streamPositionItemsForAccounts$deleteAll$7((PositionListItemV2Dao) this.receiver, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object streamPositionItemsForAccounts$deleteAll$7(PositionListItemV2Dao positionListItemV2Dao, Continuation continuation) {
        positionListItemV2Dao.deleteAll();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Flow streamPositionItemsAccountsAndTypes$default(PositionsV2Store positionsV2Store, List list, List list2, PositionsLocation positionsLocation, PositionsSortPreference positionsSortPreference, int i, Object obj) {
        if ((i & 8) != 0) {
            positionsSortPreference = null;
        }
        return positionsV2Store.streamPositionItemsAccountsAndTypes(list, list2, positionsLocation, positionsSortPreference);
    }

    public final Flow<List<PositionsV2.PositionListItemV2>> streamPositionItemsAccountsAndTypes(List<String> accountNumbers, List<? extends PositionInstrumentType> instrumentTypes, PositionsLocation positionsLocation, PositionsSortPreference sortPreference) {
        Intrinsics.checkNotNullParameter(accountNumbers, "accountNumbers");
        Intrinsics.checkNotNullParameter(instrumentTypes, "instrumentTypes");
        Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
        return QueryKt.deleteAllOnRoomJsonExceptionFlow$default(this.positionsQueryMultipleAccounts, new PositionsRequestMultipleAccounts(accountNumbers, instrumentTypes, positionsLocation, sortPreference), new C346871(this.positionListItemV2Dao), false, 4, null);
    }

    /* compiled from: PositionsV2Store.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$streamPositionItemsAccountsAndTypes$1 */
    /* synthetic */ class C346871 extends AdaptedFunctionReference implements Function1<Continuation<? super Unit>, Object>, ContinuationImpl6 {
        C346871(Object obj) {
            super(1, obj, PositionListItemV2Dao.class, "deleteAll", "deleteAll()V", 4);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return PositionsV2Store.streamPositionItemsAccountsAndTypes$deleteAll$8((PositionListItemV2Dao) this.receiver, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object streamPositionItemsAccountsAndTypes$deleteAll$8(PositionListItemV2Dao positionListItemV2Dao, Continuation continuation) {
        positionListItemV2Dao.deleteAll();
        return Unit.INSTANCE;
    }

    public final Object refreshPositions(String str, PositionInstrumentType positionInstrumentType, PositionsLocation positionsLocation, Continuation<? super PositionsV2> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.positionsEndpoint, new PositionsRequest(str, positionInstrumentType, positionsLocation, null), null, continuation, 2, null);
    }

    /* renamed from: reorderPositions-9VgGkz4$default, reason: not valid java name */
    public static /* synthetic */ Job m22790reorderPositions9VgGkz4$default(PositionsV2Store positionsV2Store, String str, PositionInstrumentType positionInstrumentType, PositionsLocation positionsLocation, List list, long j, int i, Object obj) {
        if ((i & 16) != 0) {
            j = kotlin.time.Duration.INSTANCE.m28767getZEROUwyO8pc();
        }
        return positionsV2Store.m22791reorderPositions9VgGkz4(str, positionInstrumentType, positionsLocation, list, j);
    }

    /* renamed from: reorderPositions-9VgGkz4, reason: not valid java name */
    public final Job m22791reorderPositions9VgGkz4(String accountNumber, PositionInstrumentType instrumentType, PositionsLocation positionsLocation, List<UUID> instrumentIds, long delay) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
        Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
        return BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new PositionsV2Store$reorderPositions$1(delay, this, accountNumber, instrumentType, positionsLocation, instrumentIds, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job sortOptionsQuery$lambda$9(PositionsV2Store positionsV2Store, Tuples2 inputPair) {
        Intrinsics.checkNotNullParameter(inputPair, "inputPair");
        return Endpoint.DefaultImpls.refresh$default(positionsV2Store.sortOptionsEndpoint, inputPair, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow sortOptionsQuery$lambda$10(PositionsV2Store positionsV2Store, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return positionsV2Store.sortOptionsDao.getSortOptions((String) tuples2.component1(), (AssetType) tuples2.component2());
    }

    public final Observable<PositionsSortOptions> streamSortOptions(String accountNumber, PositionInstrumentType instrumentType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        AssetType sortAssetType = PositionsSortOptions2.toSortAssetType(instrumentType);
        if (sortAssetType == null) {
            throw new IllegalStateException("Invalid instrument type");
        }
        return this.sortOptionsQuery.asObservable(Tuples4.m3642to(accountNumber, sortAssetType));
    }

    /* compiled from: PositionsV2Store.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$sortPositions$1", m3645f = "PositionsV2Store.kt", m3646l = {465}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$sortPositions$1 */
    static final class C346851 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ PositionInstrumentType $instrumentType;
        final /* synthetic */ PositionsSortPreference $sortPreference;
        int label;
        final /* synthetic */ PositionsV2Store this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346851(PositionsSortPreference positionsSortPreference, PositionsV2Store positionsV2Store, String str, PositionInstrumentType positionInstrumentType, Continuation<? super C346851> continuation) {
            super(2, continuation);
            this.$sortPreference = positionsSortPreference;
            this.this$0 = positionsV2Store;
            this.$accountNumber = str;
            this.$instrumentType = positionInstrumentType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C346851(this.$sortPreference, this.this$0, this.$accountNumber, this.$instrumentType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C346851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$sortPreference != null) {
                    Observable observableStreamDisplayOptions$default = PositionsDisplayOptionsStore.streamDisplayOptions$default(this.this$0.positionsDisplayOptionsStore, this.$accountNumber, this.$instrumentType, null, 4, null);
                    final PositionsSortPreference positionsSortPreference = this.$sortPreference;
                    Single singleOnErrorReturnItem = observableStreamDisplayOptions$default.map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$sortPositions$1$isValidDisplayQuery$1
                        @Override // io.reactivex.functions.Function
                        public final Boolean apply(PositionsDisplayOptions it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            List<PositionsDisplayOptions.PositionsDisplayOption> options = it.getOptions();
                            PositionsSortPreference positionsSortPreference2 = positionsSortPreference;
                            boolean z = false;
                            if (!(options instanceof Collection) || !options.isEmpty()) {
                                Iterator<T> it2 = options.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    if (Intrinsics.areEqual(((PositionsDisplayOptions.PositionsDisplayOption) it2.next()).getQueryValue(), positionsSortPreference2.getSortQuery())) {
                                        z = true;
                                        break;
                                    }
                                }
                            }
                            return Boolean.valueOf(z);
                        }
                    }).first(boxing.boxBoolean(false)).onErrorReturnItem(boxing.boxBoolean(false));
                    Intrinsics.checkNotNullExpressionValue(singleOnErrorReturnItem, "onErrorReturnItem(...)");
                    this.label = 1;
                    obj = RxAwait3.await(singleOnErrorReturnItem, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Intrinsics.checkNotNullExpressionValue(obj, "await(...)");
            if (((Boolean) obj).booleanValue()) {
                this.this$0.positionsDisplayOptionsStore.updateSelectedPositionDisplayOption(this.$accountNumber, this.$instrumentType, this.$sortPreference.getSortQuery());
            }
            return Unit.INSTANCE;
        }
    }

    public final Job sortPositions(String accountNumber, PositionInstrumentType instrumentType, PositionsLocation positionsLocation, PositionsSortPreference sortPreference) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C346851(sortPreference, this, accountNumber, instrumentType, null), 3, null);
        return BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C346862(accountNumber, instrumentType, positionsLocation, sortPreference, null), 3, null);
    }

    /* compiled from: PositionsV2Store.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$sortPositions$2", m3645f = "PositionsV2Store.kt", m3646l = {397, 407, 418}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$sortPositions$2 */
    static final class C346862 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ PositionInstrumentType $instrumentType;
        final /* synthetic */ PositionsLocation $positionsLocation;
        final /* synthetic */ PositionsSortPreference $sortPreference;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346862(String str, PositionInstrumentType positionInstrumentType, PositionsLocation positionsLocation, PositionsSortPreference positionsSortPreference, Continuation<? super C346862> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$instrumentType = positionInstrumentType;
            this.$positionsLocation = positionsLocation;
            this.$sortPreference = positionsSortPreference;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PositionsV2Store.this.new C346862(this.$accountNumber, this.$instrumentType, this.$positionsLocation, this.$sortPreference, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C346862) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C346862 c346862;
            PositionsSortDirection sortDirection;
            Object objForceFetch$default;
            PositionsV2Dao positionsV2Dao;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = PositionsV2Store.this.postPositionsOrderingEndpoint;
                PositionsOrderingUpdateRequest.Sort sort = new PositionsOrderingUpdateRequest.Sort(this.$accountNumber, this.$instrumentType, this.$positionsLocation, this.$sortPreference);
                this.label = 1;
                c346862 = this;
                if (PostEndpoint.DefaultImpls.post$default(postEndpoint, sort, null, this, 2, null) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    positionsV2Dao = (PositionsV2Dao) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    positionsV2Dao.insert((PositionsV2Dao) obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                c346862 = this;
                PositionsV2Dao positionsV2Dao2 = PositionsV2Store.this.positionsV2Dao;
                Endpoint endpoint = PositionsV2Store.this.positionsEndpoint;
                PositionsRequest positionsRequest = new PositionsRequest(c346862.$accountNumber, c346862.$instrumentType, c346862.$positionsLocation, c346862.$sortPreference);
                c346862.L$0 = positionsV2Dao2;
                c346862.label = 3;
                objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, positionsRequest, null, c346862, 2, null);
                if (objForceFetch$default != coroutine_suspended) {
                    positionsV2Dao = positionsV2Dao2;
                    obj = objForceFetch$default;
                    positionsV2Dao.insert((PositionsV2Dao) obj);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            ResultKt.throwOnFailure(obj);
            c346862 = this;
            AssetType sortOptionsAssetType = PositionsV2Store.this.toSortOptionsAssetType(c346862.$instrumentType);
            if (sortOptionsAssetType != null) {
                PositionsV2Store positionsV2Store = PositionsV2Store.this;
                String str = c346862.$accountNumber;
                PositionsSortPreference positionsSortPreference = c346862.$sortPreference;
                PositionsSortOptionsDao positionsSortOptionsDao = positionsV2Store.sortOptionsDao;
                String serverValue = null;
                String sortQuery = positionsSortPreference != null ? positionsSortPreference.getSortQuery() : null;
                if (positionsSortPreference != null && (sortDirection = positionsSortPreference.getSortDirection()) != null) {
                    serverValue = sortDirection.getServerValue();
                }
                c346862.label = 2;
                C346862 c3468622 = c346862;
                c346862 = c3468622;
                if (positionsSortOptionsDao.updateSortOptions(str, sortOptionsAssetType, sortQuery, serverValue, c3468622) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            PositionsV2Dao positionsV2Dao22 = PositionsV2Store.this.positionsV2Dao;
            Endpoint endpoint2 = PositionsV2Store.this.positionsEndpoint;
            PositionsRequest positionsRequest2 = new PositionsRequest(c346862.$accountNumber, c346862.$instrumentType, c346862.$positionsLocation, c346862.$sortPreference);
            c346862.L$0 = positionsV2Dao22;
            c346862.label = 3;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint2, positionsRequest2, null, c346862, 2, null);
            if (objForceFetch$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PositionsV2Store.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store$PositionsRequest;", "", "accountNumber", "", "instrumentType", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "positionsLocation", "Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", "sortPreference", "Lcom/robinhood/android/models/portfolio/PositionsSortPreference;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;Lcom/robinhood/android/models/portfolio/api/PositionsLocation;Lcom/robinhood/android/models/portfolio/PositionsSortPreference;)V", "getAccountNumber", "()Ljava/lang/String;", "getInstrumentType", "()Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "getPositionsLocation", "()Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", "getSortPreference", "()Lcom/robinhood/android/models/portfolio/PositionsSortPreference;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class PositionsRequest {
        private final String accountNumber;
        private final PositionInstrumentType instrumentType;
        private final PositionsLocation positionsLocation;
        private final PositionsSortPreference sortPreference;

        public static /* synthetic */ PositionsRequest copy$default(PositionsRequest positionsRequest, String str, PositionInstrumentType positionInstrumentType, PositionsLocation positionsLocation, PositionsSortPreference positionsSortPreference, int i, Object obj) {
            if ((i & 1) != 0) {
                str = positionsRequest.accountNumber;
            }
            if ((i & 2) != 0) {
                positionInstrumentType = positionsRequest.instrumentType;
            }
            if ((i & 4) != 0) {
                positionsLocation = positionsRequest.positionsLocation;
            }
            if ((i & 8) != 0) {
                positionsSortPreference = positionsRequest.sortPreference;
            }
            return positionsRequest.copy(str, positionInstrumentType, positionsLocation, positionsSortPreference);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final PositionInstrumentType getInstrumentType() {
            return this.instrumentType;
        }

        /* renamed from: component3, reason: from getter */
        public final PositionsLocation getPositionsLocation() {
            return this.positionsLocation;
        }

        /* renamed from: component4, reason: from getter */
        public final PositionsSortPreference getSortPreference() {
            return this.sortPreference;
        }

        public final PositionsRequest copy(String accountNumber, PositionInstrumentType instrumentType, PositionsLocation positionsLocation, PositionsSortPreference sortPreference) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
            return new PositionsRequest(accountNumber, instrumentType, positionsLocation, sortPreference);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PositionsRequest)) {
                return false;
            }
            PositionsRequest positionsRequest = (PositionsRequest) other;
            return Intrinsics.areEqual(this.accountNumber, positionsRequest.accountNumber) && this.instrumentType == positionsRequest.instrumentType && this.positionsLocation == positionsRequest.positionsLocation && Intrinsics.areEqual(this.sortPreference, positionsRequest.sortPreference);
        }

        public int hashCode() {
            int iHashCode = ((((this.accountNumber.hashCode() * 31) + this.instrumentType.hashCode()) * 31) + this.positionsLocation.hashCode()) * 31;
            PositionsSortPreference positionsSortPreference = this.sortPreference;
            return iHashCode + (positionsSortPreference == null ? 0 : positionsSortPreference.hashCode());
        }

        public String toString() {
            return "PositionsRequest(accountNumber=" + this.accountNumber + ", instrumentType=" + this.instrumentType + ", positionsLocation=" + this.positionsLocation + ", sortPreference=" + this.sortPreference + ")";
        }

        public PositionsRequest(String accountNumber, PositionInstrumentType instrumentType, PositionsLocation positionsLocation, PositionsSortPreference positionsSortPreference) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
            this.accountNumber = accountNumber;
            this.instrumentType = instrumentType;
            this.positionsLocation = positionsLocation;
            this.sortPreference = positionsSortPreference;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final PositionInstrumentType getInstrumentType() {
            return this.instrumentType;
        }

        public final PositionsLocation getPositionsLocation() {
            return this.positionsLocation;
        }

        public final PositionsSortPreference getSortPreference() {
            return this.sortPreference;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PositionsV2Store.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store$PositionsRequestMultipleAccounts;", "", "accountNumbers", "", "", "instrumentTypes", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "positionsLocation", "Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", "sortPreference", "Lcom/robinhood/android/models/portfolio/PositionsSortPreference;", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/robinhood/android/models/portfolio/api/PositionsLocation;Lcom/robinhood/android/models/portfolio/PositionsSortPreference;)V", "getAccountNumbers", "()Ljava/util/List;", "getInstrumentTypes", "getPositionsLocation", "()Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", "getSortPreference", "()Lcom/robinhood/android/models/portfolio/PositionsSortPreference;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class PositionsRequestMultipleAccounts {
        private final List<String> accountNumbers;
        private final List<PositionInstrumentType> instrumentTypes;
        private final PositionsLocation positionsLocation;
        private final PositionsSortPreference sortPreference;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PositionsRequestMultipleAccounts copy$default(PositionsRequestMultipleAccounts positionsRequestMultipleAccounts, List list, List list2, PositionsLocation positionsLocation, PositionsSortPreference positionsSortPreference, int i, Object obj) {
            if ((i & 1) != 0) {
                list = positionsRequestMultipleAccounts.accountNumbers;
            }
            if ((i & 2) != 0) {
                list2 = positionsRequestMultipleAccounts.instrumentTypes;
            }
            if ((i & 4) != 0) {
                positionsLocation = positionsRequestMultipleAccounts.positionsLocation;
            }
            if ((i & 8) != 0) {
                positionsSortPreference = positionsRequestMultipleAccounts.sortPreference;
            }
            return positionsRequestMultipleAccounts.copy(list, list2, positionsLocation, positionsSortPreference);
        }

        public final List<String> component1() {
            return this.accountNumbers;
        }

        public final List<PositionInstrumentType> component2() {
            return this.instrumentTypes;
        }

        /* renamed from: component3, reason: from getter */
        public final PositionsLocation getPositionsLocation() {
            return this.positionsLocation;
        }

        /* renamed from: component4, reason: from getter */
        public final PositionsSortPreference getSortPreference() {
            return this.sortPreference;
        }

        public final PositionsRequestMultipleAccounts copy(List<String> accountNumbers, List<? extends PositionInstrumentType> instrumentTypes, PositionsLocation positionsLocation, PositionsSortPreference sortPreference) {
            Intrinsics.checkNotNullParameter(accountNumbers, "accountNumbers");
            Intrinsics.checkNotNullParameter(instrumentTypes, "instrumentTypes");
            Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
            return new PositionsRequestMultipleAccounts(accountNumbers, instrumentTypes, positionsLocation, sortPreference);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PositionsRequestMultipleAccounts)) {
                return false;
            }
            PositionsRequestMultipleAccounts positionsRequestMultipleAccounts = (PositionsRequestMultipleAccounts) other;
            return Intrinsics.areEqual(this.accountNumbers, positionsRequestMultipleAccounts.accountNumbers) && Intrinsics.areEqual(this.instrumentTypes, positionsRequestMultipleAccounts.instrumentTypes) && this.positionsLocation == positionsRequestMultipleAccounts.positionsLocation && Intrinsics.areEqual(this.sortPreference, positionsRequestMultipleAccounts.sortPreference);
        }

        public int hashCode() {
            int iHashCode = ((((this.accountNumbers.hashCode() * 31) + this.instrumentTypes.hashCode()) * 31) + this.positionsLocation.hashCode()) * 31;
            PositionsSortPreference positionsSortPreference = this.sortPreference;
            return iHashCode + (positionsSortPreference == null ? 0 : positionsSortPreference.hashCode());
        }

        public String toString() {
            return "PositionsRequestMultipleAccounts(accountNumbers=" + this.accountNumbers + ", instrumentTypes=" + this.instrumentTypes + ", positionsLocation=" + this.positionsLocation + ", sortPreference=" + this.sortPreference + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PositionsRequestMultipleAccounts(List<String> accountNumbers, List<? extends PositionInstrumentType> instrumentTypes, PositionsLocation positionsLocation, PositionsSortPreference positionsSortPreference) {
            Intrinsics.checkNotNullParameter(accountNumbers, "accountNumbers");
            Intrinsics.checkNotNullParameter(instrumentTypes, "instrumentTypes");
            Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
            this.accountNumbers = accountNumbers;
            this.instrumentTypes = instrumentTypes;
            this.positionsLocation = positionsLocation;
            this.sortPreference = positionsSortPreference;
        }

        public final List<String> getAccountNumbers() {
            return this.accountNumbers;
        }

        public final List<PositionInstrumentType> getInstrumentTypes() {
            return this.instrumentTypes;
        }

        public final PositionsLocation getPositionsLocation() {
            return this.positionsLocation;
        }

        public final PositionsSortPreference getSortPreference() {
            return this.sortPreference;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AssetType toSortOptionsAssetType(PositionInstrumentType positionInstrumentType) {
        switch (WhenMappings.$EnumSwitchMapping$0[positionInstrumentType.ordinal()]) {
            case 1:
                return AssetType.EQUITY;
            case 2:
                return AssetType.OPTIONS;
            case 3:
                return AssetType.FUTURES;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
