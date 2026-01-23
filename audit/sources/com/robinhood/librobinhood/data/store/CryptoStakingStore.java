package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.QueryKt;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.models.api.ApiAmountAvailableInfoScreen;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.retrofit.CryptoStakingBonfireApi;
import com.robinhood.models.api.staking.ApiCryptoStakingCancelOrder;
import com.robinhood.models.api.staking.ApiCryptoStakingHistoryDetailResponse;
import com.robinhood.models.api.staking.ApiCryptoStakingHistoryItem;
import com.robinhood.models.api.staking.ApiCryptoStakingOrder;
import com.robinhood.models.api.staking.ApiCryptoStakingOverview;
import com.robinhood.models.api.staking.ApiStakingConfig;
import com.robinhood.models.crypto.dao.CryptoStakingHistoryItemDao;
import com.robinhood.models.crypto.dao.CryptoStakingOverviewDao;
import com.robinhood.models.crypto.dao.CryptoStakingPositionDao;
import com.robinhood.models.crypto.dao.CryptoStakingSummaryModelDao;
import com.robinhood.models.crypto.p314db.staking.CryptoStakingHistoryItem;
import com.robinhood.models.crypto.p314db.staking.CryptoStakingHistoryItem2;
import com.robinhood.models.crypto.p314db.staking.CryptoStakingOverview;
import com.robinhood.models.crypto.p314db.staking.CryptoStakingPosition;
import com.robinhood.models.crypto.p314db.staking.CryptoStakingSettings;
import com.robinhood.models.crypto.p314db.staking.CryptoStakingSummaryModel;
import com.robinhood.models.crypto.p314db.staking.StakingConfig;
import com.robinhood.models.crypto.p315ui.staking.AmountAvailableInfoScreen;
import com.robinhood.models.crypto.p315ui.staking.CryptoStakingHubModel;
import com.robinhood.models.crypto.p315ui.staking.UiCryptoStakingOrderModel;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.CryptoStakingTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.extensions.StringsKt;
import java.math.BigDecimal;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Instant;
import retrofit2.Response;

/* compiled from: CryptoStakingStore.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u001f\u001a\u00020\u001eH\u0086@¢\u0006\u0002\u0010 J\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\"2\u0006\u0010#\u001a\u00020\u0012J\u000e\u0010$\u001a\u00020%2\u0006\u0010#\u001a\u00020\u0012J\u0016\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+H\u0086@¢\u0006\u0002\u0010,J6\u00101\u001a\u00020/2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u0010#\u001a\u00020\u00122\u0006\u00106\u001a\u00020\u00122\u0006\u00107\u001a\u000208H\u0086@¢\u0006\u0002\u00109J6\u0010:\u001a\u00020/2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u0010#\u001a\u00020\u00122\u0006\u00106\u001a\u00020\u00122\u0006\u00107\u001a\u000208H\u0086@¢\u0006\u0002\u00109J\u0016\u0010;\u001a\u00020>2\u0006\u0010?\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010@J\u000e\u0010D\u001a\u00020%2\u0006\u0010#\u001a\u00020\u0012J\u0014\u0010E\u001a\b\u0012\u0004\u0012\u00020B0\"2\u0006\u0010#\u001a\u00020\u0012J(\u0010I\u001a\u00020H2\u0006\u0010#\u001a\u00020\u00122\u0006\u00107\u001a\u0002082\b\b\u0002\u0010J\u001a\u00020KH\u0086@¢\u0006\u0002\u0010LJ\f\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0\"J\u0018\u0010\\\u001a\u00020%2\u0006\u0010#\u001a\u00020\u00122\b\b\u0002\u0010]\u001a\u00020+J\u0016\u0010_\u001a\b\u0012\u0004\u0012\u00020Y0\"2\u0006\u0010`\u001a\u00020\u0012H\u0002J\u0016\u0010e\u001a\u00020>2\u0006\u0010f\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010@J.\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0h0\"2\b\u0010#\u001a\u0004\u0018\u00010i2\u0006\u0010j\u001a\u00020k2\b\b\u0002\u0010l\u001a\u00020+R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0'X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0'X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00100\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0'X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010;\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=0'X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020B0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020B0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010F\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020H0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010M\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0N0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020Q0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010S\u001a\u00020T¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0017\u0010W\u001a\b\u0012\u0004\u0012\u00020Y0X¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u001a\u0010^\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020Y0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020c0bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020>0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006m"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "cryptoStakingOverviewDao", "Lcom/robinhood/models/crypto/dao/CryptoStakingOverviewDao;", "cryptoStakingSummaryModelDao", "Lcom/robinhood/models/crypto/dao/CryptoStakingSummaryModelDao;", "cryptoStakingBonfireApi", "Lcom/robinhood/models/api/retrofit/CryptoStakingBonfireApi;", "historyItemDao", "Lcom/robinhood/models/crypto/dao/CryptoStakingHistoryItemDao;", "positionDao", "Lcom/robinhood/models/crypto/dao/CryptoStakingPositionDao;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/crypto/dao/CryptoStakingOverviewDao;Lcom/robinhood/models/crypto/dao/CryptoStakingSummaryModelDao;Lcom/robinhood/models/api/retrofit/CryptoStakingBonfireApi;Lcom/robinhood/models/crypto/dao/CryptoStakingHistoryItemDao;Lcom/robinhood/models/crypto/dao/CryptoStakingPositionDao;)V", "getPositionEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/models/crypto/db/staking/CryptoStakingPosition;", "getPositionQuery", "Lcom/robinhood/android/moria/db/Query;", "getAmountAvailableInfoEndpoint", "Lcom/robinhood/models/api/ApiAmountAvailableInfoScreen$Request;", "Lcom/robinhood/models/crypto/ui/staking/AmountAvailableInfoScreen;", "getAmountAvailableInfoScreen", "request", "(Lcom/robinhood/models/api/ApiAmountAvailableInfoScreen$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStakingHubEndpoint", "", "Lcom/robinhood/models/crypto/ui/staking/CryptoStakingHubModel;", "getStakingHubModel", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamPosition", "Lkotlinx/coroutines/flow/Flow;", "currencyPairId", "refreshPosition", "Lkotlinx/coroutines/Job;", "updateSettingsEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/models/crypto/db/staking/CryptoStakingSettings;", "updateStakingAgreementSetting", "acceptedAgreement", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestOrderEndpoint", "Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$Request;", "Lcom/robinhood/models/crypto/ui/staking/UiCryptoStakingOrderModel;", "submitOrderEndpoint", "requestOrder", "amount", "Ljava/math/BigDecimal;", "amountType", "Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$AmountType;", "idempotencyId", "orderType", "Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$OrderType;", "(Ljava/math/BigDecimal;Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$AmountType;Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$OrderType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitOrder", "cancelOrder", "Lcom/robinhood/models/api/staking/ApiCryptoStakingCancelOrder$Request;", "Lcom/robinhood/models/api/staking/ApiCryptoStakingCancelOrder;", "Lcom/robinhood/models/api/staking/ApiCryptoStakingHistoryDetailResponse;", "orderId", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cryptoSummaryEndpoint", "Lcom/robinhood/models/crypto/db/staking/CryptoStakingSummaryModel;", "cryptoSummaryQuery", "refreshCryptoSummary", "streamCryptoSummary", "configEndpoint", "Lcom/robinhood/models/api/staking/ApiStakingConfig$Request;", "Lcom/robinhood/models/crypto/db/staking/StakingConfig;", "fetchConfig", "yieldType", "Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$YieldType;", "(Ljava/util/UUID;Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$OrderType;Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$YieldType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "overviewEndpoint", "Lretrofit2/Response;", "Lcom/robinhood/models/api/staking/ApiCryptoStakingOverview;", "overviewQuery", "Lcom/robinhood/models/crypto/db/staking/CryptoStakingOverview;", "streamOverview", "historyTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getHistoryTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "Lcom/robinhood/models/crypto/db/staking/CryptoStakingHistoryItem;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "refreshHistoryEndpoint", "force", "fetchHistoryItem", "getHistoryItem", "demeterId", "historyItemsEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "Lcom/robinhood/models/api/staking/ApiCryptoStakingHistoryItem;", "historyDetailEndpoint", "fetchHistoryDetail", "stakingOrderId", "streamLatestPendingHistoryItems", "", "", "count", "", "refresh", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoStakingStore extends Store {
    private final PostEndpoint<ApiCryptoStakingCancelOrder.Request, ApiCryptoStakingCancelOrder> cancelOrder;
    private final Endpoint<ApiStakingConfig.Request, StakingConfig> configEndpoint;
    private final CryptoStakingBonfireApi cryptoStakingBonfireApi;
    private final CryptoStakingOverviewDao cryptoStakingOverviewDao;
    private final CryptoStakingSummaryModelDao cryptoStakingSummaryModelDao;
    private final Endpoint<UUID, CryptoStakingSummaryModel> cryptoSummaryEndpoint;
    private final Query<UUID, CryptoStakingSummaryModel> cryptoSummaryQuery;
    private final Query<UUID, CryptoStakingHistoryItem> fetchHistoryItem;
    private final Endpoint<ApiAmountAvailableInfoScreen.Request, AmountAvailableInfoScreen> getAmountAvailableInfoEndpoint;
    private final Endpoint<UUID, CryptoStakingPosition> getPositionEndpoint;
    private final Query<UUID, CryptoStakingPosition> getPositionQuery;
    private final Endpoint<Unit, CryptoStakingHubModel> getStakingHubEndpoint;
    private final Endpoint<UUID, ApiCryptoStakingHistoryDetailResponse> historyDetailEndpoint;
    private final CryptoStakingHistoryItemDao historyItemDao;
    private final PaginatedEndpoint<UUID, ApiCryptoStakingHistoryItem> historyItemsEndpoint;
    private final HistoryLoader.Callbacks<CryptoStakingHistoryItem> historyLoaderCallbacks;
    private final HistoryTransactionLoader historyTransactionLoader;
    private final Endpoint<Unit, Response<ApiCryptoStakingOverview>> overviewEndpoint;
    private final Query<Unit, CryptoStakingOverview> overviewQuery;
    private final CryptoStakingPositionDao positionDao;
    private final PostEndpoint<ApiCryptoStakingOrder.Request, UiCryptoStakingOrderModel> requestOrderEndpoint;
    private final PostEndpoint<ApiCryptoStakingOrder.Request, UiCryptoStakingOrderModel> submitOrderEndpoint;
    private final PostEndpoint<CryptoStakingSettings, CryptoStakingSettings> updateSettingsEndpoint;

    /* compiled from: CryptoStakingStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoStakingStore", m3645f = "CryptoStakingStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE}, m3647m = "cancelOrder")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoStakingStore$cancelOrder$3 */
    static final class C337593 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C337593(Continuation<? super C337593> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoStakingStore.this.cancelOrder(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoStakingStore(StoreBundle storeBundle, CryptoStakingOverviewDao cryptoStakingOverviewDao, CryptoStakingSummaryModelDao cryptoStakingSummaryModelDao, CryptoStakingBonfireApi cryptoStakingBonfireApi, CryptoStakingHistoryItemDao historyItemDao, CryptoStakingPositionDao positionDao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(cryptoStakingOverviewDao, "cryptoStakingOverviewDao");
        Intrinsics.checkNotNullParameter(cryptoStakingSummaryModelDao, "cryptoStakingSummaryModelDao");
        Intrinsics.checkNotNullParameter(cryptoStakingBonfireApi, "cryptoStakingBonfireApi");
        Intrinsics.checkNotNullParameter(historyItemDao, "historyItemDao");
        Intrinsics.checkNotNullParameter(positionDao, "positionDao");
        this.cryptoStakingOverviewDao = cryptoStakingOverviewDao;
        this.cryptoStakingSummaryModelDao = cryptoStakingSummaryModelDao;
        this.cryptoStakingBonfireApi = cryptoStakingBonfireApi;
        this.historyItemDao = historyItemDao;
        this.positionDao = positionDao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        Clock clock = storeBundle.getClock();
        CryptoStakingPosition.Companion companion2 = CryptoStakingPosition.INSTANCE;
        Endpoint<UUID, CryptoStakingPosition> endpointCreate = companion.create(new CryptoStakingStore$getPositionEndpoint$1(this, null), logoutKillswitch, new CryptoStakingStore$getPositionEndpoint$2(this, null), clock, new DefaultStaleDecider(companion2.getNormalStaleTimeout(), storeBundle.getClock()));
        this.getPositionEndpoint = endpointCreate;
        Query.Companion companion3 = Query.INSTANCE;
        this.getPositionQuery = Store.create$default(this, companion3, "getPositionQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new CryptoStakingStore$getPositionQuery$1(endpointCreate))), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoStakingStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoStakingStore.getPositionQuery$lambda$0(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.getAmountAvailableInfoEndpoint = companion.create(new CryptoStakingStore$getAmountAvailableInfoEndpoint$1(this, null), getLogoutKillswitch(), new CryptoStakingStore$getAmountAvailableInfoEndpoint$2(null), storeBundle.getClock(), new DefaultStaleDecider(companion2.getNormalStaleTimeout(), storeBundle.getClock()));
        this.getStakingHubEndpoint = Endpoint.Companion.create$default(companion, new CryptoStakingStore$getStakingHubEndpoint$1(this, null), getLogoutKillswitch(), new CryptoStakingStore$getStakingHubEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        PostEndpoint.Companion companion4 = PostEndpoint.INSTANCE;
        this.updateSettingsEndpoint = companion4.create(new CryptoStakingStore$updateSettingsEndpoint$1(this, null), new CryptoStakingStore$updateSettingsEndpoint$2(null));
        this.requestOrderEndpoint = companion4.create(new CryptoStakingStore$requestOrderEndpoint$1(this, null), new CryptoStakingStore$requestOrderEndpoint$2(null));
        this.submitOrderEndpoint = companion4.create(new CryptoStakingStore$submitOrderEndpoint$1(this, null), new CryptoStakingStore$submitOrderEndpoint$2(null));
        this.cancelOrder = companion4.create(new C337571(null), new C337582(null));
        CryptoStakingStore$cryptoSummaryEndpoint$1 cryptoStakingStore$cryptoSummaryEndpoint$1 = new CryptoStakingStore$cryptoSummaryEndpoint$1(cryptoStakingSummaryModelDao);
        Endpoint<UUID, CryptoStakingSummaryModel> endpointCreate$default = Endpoint.Companion.create$default(companion, new CryptoStakingStore$cryptoSummaryEndpoint$2(this, null), getLogoutKillswitch(), cryptoStakingStore$cryptoSummaryEndpoint$1, storeBundle.getClock(), null, 16, null);
        this.cryptoSummaryEndpoint = endpointCreate$default;
        this.cryptoSummaryQuery = Store.create$default(this, companion3, "getSummaryQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new CryptoStakingStore$cryptoSummaryQuery$1(endpointCreate$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoStakingStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoStakingStore.cryptoSummaryQuery$lambda$2(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.configEndpoint = Endpoint.Companion.create$default(companion, new CryptoStakingStore$configEndpoint$1(this, null), getLogoutKillswitch(), new CryptoStakingStore$configEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        Endpoint<Unit, Response<ApiCryptoStakingOverview>> endpointCreate$default2 = Endpoint.Companion.create$default(companion, new CryptoStakingStore$overviewEndpoint$1(this, null), getLogoutKillswitch(), new CryptoStakingStore$overviewEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.overviewEndpoint = endpointCreate$default2;
        this.overviewQuery = Store.create$default(this, companion3, "StakingOverviewQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new CryptoStakingStore$overviewQuery$1(endpointCreate$default2))), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoStakingStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoStakingStore.overviewQuery$lambda$3(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.historyTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.CryptoStakingStore$historyTransactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.CRYPTO_STAKING);
                final Flow historyItem = this.this$0.getHistoryItem(reference.getSourceId());
                return new Flow<CryptoStakingTransaction>() { // from class: com.robinhood.librobinhood.data.store.CryptoStakingStore$historyTransactionLoader$1$load$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CryptoStakingTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = historyItem.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.CryptoStakingStore$historyTransactionLoader$1$load$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoStakingStore$historyTransactionLoader$1$load$$inlined$map$1$2", m3645f = "CryptoStakingStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.CryptoStakingStore$historyTransactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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

                        public AnonymousClass2(FlowCollector flowCollector) {
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
                                CryptoStakingTransaction cryptoStakingTransaction = new CryptoStakingTransaction((CryptoStakingHistoryItem) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(cryptoStakingTransaction, anonymousClass1) == coroutine_suspended) {
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
                };
            }
        };
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<CryptoStakingHistoryItem>() { // from class: com.robinhood.librobinhood.data.store.CryptoStakingStore$historyLoaderCallbacks$1
            private final EnumSet<HistoryTransactionType> supportedTransactionTypes = EnumSet.of(HistoryTransactionType.CRYPTO_STAKING);
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes = SetsKt.emptySet();

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            /* renamed from: isInstrumentHistoryLoader */
            public boolean getIsInstrumentHistoryLoader() {
                return HistoryLoader.Callbacks.DefaultImpls.isInstrumentHistoryLoader(this);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public EnumSet<HistoryTransactionType> getSupportedTransactionTypes() {
                return this.supportedTransactionTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<BrokerageAccountType> getSupportedBrokerageAccountTypes() {
                return this.supportedBrokerageAccountTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                refreshPaginated(filter.getStaticAssetId());
                return FlowKt.filterNotNull(this.this$0.historyItemDao.countTotal(CryptoStakingHistoryItem2.getCryptoStakingHistoryItemStates(filter.getState()), filter.getSince(), filter.getBefore(), filter.getStaticAssetId()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.historyItemDao.countLater(CryptoStakingHistoryItem2.getCryptoStakingHistoryItemStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, filter.getStaticAssetId()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<CryptoStakingHistoryItem>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                refreshPaginated(filter.getStaticAssetId());
                return this.this$0.historyItemDao.getLatest(CryptoStakingHistoryItem2.getCryptoStakingHistoryItemStates(filter.getState()), filter.getSince(), filter.getBefore(), limit, filter.getStaticAssetId());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<CryptoStakingHistoryItem>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.historyItemDao.getLater(CryptoStakingHistoryItem2.getCryptoStakingHistoryItemStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.getStaticAssetId());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<CryptoStakingHistoryItem>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.historyItemDao.get(CryptoStakingHistoryItem2.getCryptoStakingHistoryItemStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, filter.getStaticAssetId());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<CryptoStakingHistoryItem>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.historyItemDao.getEarlier(CryptoStakingHistoryItem2.getCryptoStakingHistoryItemStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.getStaticAssetId());
            }

            private final void refreshPaginated(UUID currencyPairId) {
                this.this$0.historyItemsEndpoint.refreshAllPages(currencyPairId, false);
            }
        };
        this.fetchHistoryItem = Store.create$default(this, companion3, "fetchHistoryItem", CollectionsKt.emptyList(), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoStakingStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoStakingStore.fetchHistoryItem$lambda$4(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.historyItemsEndpoint = PaginatedEndpoint.Companion.createWithParams$default(PaginatedEndpoint.INSTANCE, new CryptoStakingStore$historyItemsEndpoint$1(this, null), getLogoutKillswitch(), new CryptoStakingStore$historyItemsEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.historyDetailEndpoint = Endpoint.Companion.create$default(companion, new CryptoStakingStore$historyDetailEndpoint$1(this, null), getLogoutKillswitch(), new CryptoStakingStore$historyDetailEndpoint$2(null), storeBundle.getClock(), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getPositionQuery$lambda$0(CryptoStakingStore cryptoStakingStore, UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        return cryptoStakingStore.positionDao.getPosition(currencyPairId);
    }

    public final Object getAmountAvailableInfoScreen(ApiAmountAvailableInfoScreen.Request request, Continuation<? super AmountAvailableInfoScreen> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getAmountAvailableInfoEndpoint, request, null, continuation, 2, null);
    }

    public final Object getStakingHubModel(Continuation<? super CryptoStakingHubModel> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getStakingHubEndpoint, Unit.INSTANCE, null, continuation, 2, null);
    }

    public final Flow<CryptoStakingPosition> streamPosition(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        return this.getPositionQuery.asFlow(currencyPairId);
    }

    public final Job refreshPosition(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        return Endpoint.DefaultImpls.refresh$default(this.getPositionEndpoint, currencyPairId, true, null, 4, null);
    }

    public final Object updateStakingAgreementSetting(boolean z, Continuation<? super Unit> continuation) {
        Object objPost$default = PostEndpoint.DefaultImpls.post$default(this.updateSettingsEndpoint, new CryptoStakingSettings(null, boxing.boxBoolean(z), 1, null), null, continuation, 2, null);
        return objPost$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPost$default : Unit.INSTANCE;
    }

    public final Object requestOrder(BigDecimal bigDecimal, ApiCryptoStakingOrder.AmountType amountType, UUID uuid, UUID uuid2, ApiCryptoStakingOrder.OrderType orderType, Continuation<? super UiCryptoStakingOrderModel> continuation) {
        return PostEndpoint.DefaultImpls.post$default(this.requestOrderEndpoint, new ApiCryptoStakingOrder.Request(bigDecimal, amountType, uuid, uuid2, orderType, ApiCryptoStakingOrder.YieldType.STAKING), null, continuation, 2, null);
    }

    public final Object submitOrder(BigDecimal bigDecimal, ApiCryptoStakingOrder.AmountType amountType, UUID uuid, UUID uuid2, ApiCryptoStakingOrder.OrderType orderType, Continuation<? super UiCryptoStakingOrderModel> continuation) {
        return PostEndpoint.DefaultImpls.post$default(this.submitOrderEndpoint, new ApiCryptoStakingOrder.Request(bigDecimal, amountType, uuid, uuid2, orderType, ApiCryptoStakingOrder.YieldType.STAKING), null, continuation, 2, null);
    }

    /* compiled from: CryptoStakingStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/staking/ApiCryptoStakingCancelOrder;", "it", "Lcom/robinhood/models/api/staking/ApiCryptoStakingCancelOrder$Request;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoStakingStore$cancelOrder$1", m3645f = "CryptoStakingStore.kt", m3646l = {192}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoStakingStore$cancelOrder$1 */
    static final class C337571 extends ContinuationImpl7 implements Function2<ApiCryptoStakingCancelOrder.Request, Continuation<? super ApiCryptoStakingCancelOrder>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C337571(Continuation<? super C337571> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C337571 c337571 = CryptoStakingStore.this.new C337571(continuation);
            c337571.L$0 = obj;
            return c337571;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ApiCryptoStakingCancelOrder.Request request, Continuation<? super ApiCryptoStakingCancelOrder> continuation) {
            return ((C337571) create(request, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            ApiCryptoStakingCancelOrder.Request request = (ApiCryptoStakingCancelOrder.Request) this.L$0;
            CryptoStakingBonfireApi cryptoStakingBonfireApi = CryptoStakingStore.this.cryptoStakingBonfireApi;
            this.label = 1;
            Object objCancelOrder = cryptoStakingBonfireApi.cancelOrder(request, this);
            return objCancelOrder == coroutine_suspended ? coroutine_suspended : objCancelOrder;
        }
    }

    /* compiled from: CryptoStakingStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/api/staking/ApiCryptoStakingCancelOrder;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoStakingStore$cancelOrder$2", m3645f = "CryptoStakingStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoStakingStore$cancelOrder$2 */
    static final class C337582 extends ContinuationImpl7 implements Function2<ApiCryptoStakingCancelOrder, Continuation<? super Unit>, Object> {
        int label;

        C337582(Continuation<? super C337582> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C337582(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ApiCryptoStakingCancelOrder apiCryptoStakingCancelOrder, Continuation<? super Unit> continuation) {
            return ((C337582) create(apiCryptoStakingCancelOrder, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cancelOrder(UUID uuid, Continuation<? super ApiCryptoStakingHistoryDetailResponse> continuation) {
        C337593 c337593;
        if (continuation instanceof C337593) {
            c337593 = (C337593) continuation;
            int i = c337593.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c337593.label = i - Integer.MIN_VALUE;
            } else {
                c337593 = new C337593(continuation);
            }
        }
        C337593 c3375932 = c337593;
        Object obj = c3375932.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3375932.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            PostEndpoint<ApiCryptoStakingCancelOrder.Request, ApiCryptoStakingCancelOrder> postEndpoint = this.cancelOrder;
            ApiCryptoStakingCancelOrder.Request request = new ApiCryptoStakingCancelOrder.Request(uuid);
            c3375932.L$0 = uuid;
            c3375932.label = 1;
            if (PostEndpoint.DefaultImpls.post$default(postEndpoint, request, null, c3375932, 2, null) != coroutine_suspended) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        uuid = (UUID) c3375932.L$0;
        ResultKt.throwOnFailure(obj);
        UUID uuid2 = uuid;
        Endpoint<UUID, ApiCryptoStakingHistoryDetailResponse> endpoint = this.historyDetailEndpoint;
        c3375932.L$0 = null;
        c3375932.label = 2;
        Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, uuid2, null, c3375932, 2, null);
        return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object cryptoSummaryEndpoint$insert(CryptoStakingSummaryModelDao cryptoStakingSummaryModelDao, CryptoStakingSummaryModel cryptoStakingSummaryModel, Continuation continuation) {
        cryptoStakingSummaryModelDao.insert(cryptoStakingSummaryModel);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow cryptoSummaryQuery$lambda$2(CryptoStakingStore cryptoStakingStore, UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        return cryptoStakingStore.cryptoStakingSummaryModelDao.get(currencyPairId);
    }

    public final Job refreshCryptoSummary(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        return Endpoint.DefaultImpls.refresh$default(this.cryptoSummaryEndpoint, currencyPairId, true, null, 4, null);
    }

    public final Flow<CryptoStakingSummaryModel> streamCryptoSummary(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        return this.cryptoSummaryQuery.asFlow(currencyPairId);
    }

    public static /* synthetic */ Object fetchConfig$default(CryptoStakingStore cryptoStakingStore, UUID uuid, ApiCryptoStakingOrder.OrderType orderType, ApiCryptoStakingOrder.YieldType yieldType, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            yieldType = ApiCryptoStakingOrder.YieldType.STAKING;
        }
        return cryptoStakingStore.fetchConfig(uuid, orderType, yieldType, continuation);
    }

    public final Object fetchConfig(UUID uuid, ApiCryptoStakingOrder.OrderType orderType, ApiCryptoStakingOrder.YieldType yieldType, Continuation<? super StakingConfig> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.configEndpoint, new ApiStakingConfig.Request(uuid, orderType, yieldType), null, continuation, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow overviewQuery$lambda$3(CryptoStakingStore cryptoStakingStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return cryptoStakingStore.cryptoStakingOverviewDao.get();
    }

    public final Flow<CryptoStakingOverview> streamOverview() {
        return QueryKt.asFlow(this.overviewQuery);
    }

    public final HistoryTransactionLoader getHistoryTransactionLoader() {
        return this.historyTransactionLoader;
    }

    public final HistoryLoader.Callbacks<CryptoStakingHistoryItem> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }

    public static /* synthetic */ Job refreshHistoryEndpoint$default(CryptoStakingStore cryptoStakingStore, UUID uuid, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return cryptoStakingStore.refreshHistoryEndpoint(uuid, z);
    }

    public final Job refreshHistoryEndpoint(UUID currencyPairId, boolean force) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        return this.historyItemsEndpoint.refreshAllPages(currencyPairId, force);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow fetchHistoryItem$lambda$4(CryptoStakingStore cryptoStakingStore, UUID demeterId) {
        Intrinsics.checkNotNullParameter(demeterId, "demeterId");
        return cryptoStakingStore.historyItemDao.getItem(demeterId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<CryptoStakingHistoryItem> getHistoryItem(UUID demeterId) {
        return this.fetchHistoryItem.asFlow(demeterId);
    }

    public final Object fetchHistoryDetail(UUID uuid, Continuation<? super ApiCryptoStakingHistoryDetailResponse> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.historyDetailEndpoint, uuid, null, continuation, 2, null);
    }

    public static /* synthetic */ Flow streamLatestPendingHistoryItems$default(CryptoStakingStore cryptoStakingStore, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return cryptoStakingStore.streamLatestPendingHistoryItems(str, i, z);
    }

    public final Flow<List<CryptoStakingHistoryItem>> streamLatestPendingHistoryItems(String currencyPairId, int count, boolean refresh) {
        if (refresh) {
            this.historyItemsEndpoint.refreshAllPages(currencyPairId != null ? StringsKt.toUuid(currencyPairId) : null, true);
        }
        return takeWhileLoggedIn(this.historyItemDao.getLatestPendingItems(currencyPairId != null ? StringsKt.toUuid(currencyPairId) : null, count));
    }
}
