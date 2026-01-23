package com.robinhood.android.indexes.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.indexes.api.fundamentals.ApiIndexFundamentals;
import com.robinhood.android.indexes.api.fundamentals.ApiIndexFundamentalsDetailRequest;
import com.robinhood.android.indexes.api.fundamentals.ApiIndexFundamentalsListRequest;
import com.robinhood.android.indexes.dao.IndexFundamentalsDao;
import com.robinhood.android.indexes.models.api.ApiIndex;
import com.robinhood.android.indexes.models.api.ApiIndexCloseDetailRequest;
import com.robinhood.android.indexes.models.api.ApiIndexCloseListRequest;
import com.robinhood.android.indexes.models.api.ApiIndexCloseValue;
import com.robinhood.android.indexes.models.api.ApiIndexHistoricals;
import com.robinhood.android.indexes.models.api.ApiIndexHistoricalsDetailRequest;
import com.robinhood.android.indexes.models.api.ApiIndexListResponse;
import com.robinhood.android.indexes.models.api.ApiIndexRequest;
import com.robinhood.android.indexes.models.api.ApiIndexValue;
import com.robinhood.android.indexes.models.api.ApiIndexValueDetailRequest;
import com.robinhood.android.indexes.models.api.ApiIndexValueListRequest;
import com.robinhood.android.indexes.models.api.ApiMarketdataResponse;
import com.robinhood.android.indexes.models.api.IndexApi;
import com.robinhood.android.indexes.models.dao.IndexCloseValueDao;
import com.robinhood.android.indexes.models.dao.IndexDao;
import com.robinhood.android.indexes.models.dao.IndexValueDao;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.indexes.models.p159db.IndexCloseValue;
import com.robinhood.android.indexes.models.p159db.IndexFundamentals;
import com.robinhood.android.indexes.models.p159db.IndexHistoricals;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.CommaSeparatedList2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import p479j$.time.Clock;
import p479j$.time.Duration;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: IndexStore.kt */
@Metadata(m3635d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010;\u001a\b\u0012\u0004\u0012\u00020,0<2\u0006\u0010=\u001a\u00020&J\u001a\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00170<2\u0006\u0010=\u001a\u00020)J\u0014\u0010?\u001a\b\u0012\u0004\u0012\u00020/0<2\u0006\u0010=\u001a\u00020\u0012J\u001a\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00170<2\u0006\u0010=\u001a\u00020\u0016J\u0014\u0010A\u001a\b\u0012\u0004\u0012\u0002040<2\u0006\u0010B\u001a\u00020$J\u0016\u0010 \u001a\u0002042\u0006\u0010=\u001a\u00020!H\u0086@¢\u0006\u0002\u0010CJ\u0014\u0010D\u001a\b\u0012\u0004\u0012\u0002080<2\u0006\u0010=\u001a\u00020\u0019J\u001a\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u00170<2\u0006\u0010=\u001a\u00020\u001cJ\u0014\u0010F\u001a\b\u0012\u0004\u0012\u00020G0<2\u0006\u0010=\u001a\u00020\u001eJ \u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\u00170<2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020$0\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0012\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u0015\u001a \u0012\u0004\u0012\u00020\u0016\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00170\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00130\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u001b\u001a \u0012\u0004\u0012\u00020\u001c\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00130\u00170\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\u001e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00130\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010#\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00170\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010%\u001a\u001a\u0012\u0004\u0012\u00020&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00130\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010(\u001a \u0012\u0004\u0012\u00020)\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00130\u00170\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020,0+X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010-\u001a\u0014\u0012\u0004\u0012\u00020)\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00170+X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020/0+¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R \u00102\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00170+X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00103\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u0002040+X\u0082\u0004¢\u0006\u0002\n\u0000R)\u00105\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\u00170+¢\u0006\b\n\u0000\u001a\u0004\b6\u00101R\u001d\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u0002080+¢\u0006\b\n\u0000\u001a\u0004\b9\u00101R \u0010:\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u00170+X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/indexes/store/IndexStore;", "Lcom/robinhood/store/Store;", "indexApi", "Lcom/robinhood/android/indexes/models/api/IndexApi;", "indexCloseValueDao", "Lcom/robinhood/android/indexes/models/dao/IndexCloseValueDao;", "indexDao", "Lcom/robinhood/android/indexes/models/dao/IndexDao;", "indexValueDao", "Lcom/robinhood/android/indexes/models/dao/IndexValueDao;", "indexFundamentalsDao", "Lcom/robinhood/android/indexes/dao/IndexFundamentalsDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/indexes/models/api/IndexApi;Lcom/robinhood/android/indexes/models/dao/IndexCloseValueDao;Lcom/robinhood/android/indexes/models/dao/IndexDao;Lcom/robinhood/android/indexes/models/dao/IndexValueDao;Lcom/robinhood/android/indexes/dao/IndexFundamentalsDao;Lcom/robinhood/store/StoreBundle;)V", "getIndexValue", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/indexes/models/api/ApiIndexValueDetailRequest;", "Lcom/robinhood/android/indexes/models/api/ApiMarketdataResponse;", "Lcom/robinhood/android/indexes/models/api/ApiIndexValue;", "getIndexValues", "Lcom/robinhood/android/indexes/models/api/ApiIndexValueListRequest;", "", "getIndexCloseValue", "Lcom/robinhood/android/indexes/models/api/ApiIndexCloseDetailRequest;", "Lcom/robinhood/android/indexes/models/api/ApiIndexCloseValue;", "getIndexCloseValues", "Lcom/robinhood/android/indexes/models/api/ApiIndexCloseListRequest;", "getIndexHistoricals", "Lcom/robinhood/android/indexes/models/api/ApiIndexHistoricalsDetailRequest;", "Lcom/robinhood/android/indexes/models/api/ApiIndexHistoricals;", "getIndex", "Lcom/robinhood/android/indexes/models/api/ApiIndexRequest;", "Lcom/robinhood/android/indexes/models/api/ApiIndex;", "getIndexListByIds", "Ljava/util/UUID;", "getIndexFundamentalsDetail", "Lcom/robinhood/android/indexes/api/fundamentals/ApiIndexFundamentalsDetailRequest;", "Lcom/robinhood/android/indexes/api/fundamentals/ApiIndexFundamentals;", "getIndexFundamentalsList", "Lcom/robinhood/android/indexes/api/fundamentals/ApiIndexFundamentalsListRequest;", "indexFundamentalsDetailQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/android/indexes/models/db/IndexFundamentals;", "indexFundamentalsListQuery", "indexValueQuery", "Lcom/robinhood/android/indexes/models/db/IndexValue;", "getIndexValueQuery", "()Lcom/robinhood/android/moria/db/Query;", "indexValuesQuery", "indexQuery", "Lcom/robinhood/android/indexes/models/db/Index;", "indexListByIdsQuery", "getIndexListByIdsQuery", "indexCloseValueQuery", "Lcom/robinhood/android/indexes/models/db/IndexCloseValue;", "getIndexCloseValueQuery", "indexCloseValuesQuery", "streamIndexFundamentals", "Lkotlinx/coroutines/flow/Flow;", "request", "streamIndexFundamentalsList", "streamIndexValue", "streamIndexValues", "streamIndex", "id", "(Lcom/robinhood/android/indexes/models/api/ApiIndexRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamIndexCloseValue", "streamIndexCloseValues", "pollIndexHistoricals", "Lcom/robinhood/android/indexes/models/db/IndexHistoricals;", "streamIndexListByIds", "indexIds", "lib-store-indexes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class IndexStore extends Store {
    private final Endpoint<ApiIndexRequest, ApiIndex> getIndex;
    private final Endpoint<ApiIndexCloseDetailRequest, ApiMarketdataResponse<ApiMarketdataResponse<ApiIndexCloseValue>>> getIndexCloseValue;
    private final Endpoint<ApiIndexCloseListRequest, ApiMarketdataResponse<List<ApiMarketdataResponse<ApiIndexCloseValue>>>> getIndexCloseValues;
    private final Endpoint<ApiIndexFundamentalsDetailRequest, ApiMarketdataResponse<ApiMarketdataResponse<ApiIndexFundamentals>>> getIndexFundamentalsDetail;
    private final Endpoint<ApiIndexFundamentalsListRequest, ApiMarketdataResponse<List<ApiMarketdataResponse<ApiIndexFundamentals>>>> getIndexFundamentalsList;
    private final Endpoint<ApiIndexHistoricalsDetailRequest, ApiMarketdataResponse<ApiMarketdataResponse<ApiIndexHistoricals>>> getIndexHistoricals;
    private final Endpoint<List<UUID>, List<ApiIndex>> getIndexListByIds;
    private final Endpoint<ApiIndexValueDetailRequest, ApiMarketdataResponse<ApiMarketdataResponse<ApiIndexValue>>> getIndexValue;
    private final Endpoint<ApiIndexValueListRequest, ApiMarketdataResponse<List<ApiMarketdataResponse<ApiIndexValue>>>> getIndexValues;
    private final IndexApi indexApi;
    private final IndexCloseValueDao indexCloseValueDao;
    private final Query<ApiIndexCloseDetailRequest, IndexCloseValue> indexCloseValueQuery;
    private final Query<ApiIndexCloseListRequest, List<IndexCloseValue>> indexCloseValuesQuery;
    private final IndexDao indexDao;
    private final IndexFundamentalsDao indexFundamentalsDao;
    private final Query<ApiIndexFundamentalsDetailRequest, IndexFundamentals> indexFundamentalsDetailQuery;
    private final Query<ApiIndexFundamentalsListRequest, List<IndexFundamentals>> indexFundamentalsListQuery;
    private final Query<List<UUID>, List<Index>> indexListByIdsQuery;
    private final Query<ApiIndexRequest, Index> indexQuery;
    private final IndexValueDao indexValueDao;
    private final Query<ApiIndexValueDetailRequest, IndexValue> indexValueQuery;
    private final Query<ApiIndexValueListRequest, List<IndexValue>> indexValuesQuery;

    /* compiled from: IndexStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.store.IndexStore", m3645f = "IndexStore.kt", m3646l = {407, 407}, m3647m = "getIndex")
    /* renamed from: com.robinhood.android.indexes.store.IndexStore$getIndex$3 */
    static final class C188933 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C188933(Continuation<? super C188933> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IndexStore.this.getIndex(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexStore(IndexApi indexApi, IndexCloseValueDao indexCloseValueDao, IndexDao indexDao, IndexValueDao indexValueDao, IndexFundamentalsDao indexFundamentalsDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(indexApi, "indexApi");
        Intrinsics.checkNotNullParameter(indexCloseValueDao, "indexCloseValueDao");
        Intrinsics.checkNotNullParameter(indexDao, "indexDao");
        Intrinsics.checkNotNullParameter(indexValueDao, "indexValueDao");
        Intrinsics.checkNotNullParameter(indexFundamentalsDao, "indexFundamentalsDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.indexApi = indexApi;
        this.indexCloseValueDao = indexCloseValueDao;
        this.indexDao = indexDao;
        this.indexValueDao = indexValueDao;
        this.indexFundamentalsDao = indexFundamentalsDao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.getIndexValue = Endpoint.Companion.create$default(companion, new IndexStore$getIndexValue$1(this, null), getLogoutKillswitch(), new IndexStore$getIndexValue$2(this, null), storeBundle.getClock(), null, 16, null);
        this.getIndexValues = Endpoint.Companion.create$default(companion, new IndexStore$getIndexValues$1(this, null), getLogoutKillswitch(), new IndexStore$getIndexValues$2(this, null), storeBundle.getClock(), null, 16, null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        Clock clock = storeBundle.getClock();
        Duration durationOfMinutes = Duration.ofMinutes(15L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        this.getIndexCloseValue = companion.create(new IndexStore$getIndexCloseValue$1(this, null), logoutKillswitch, new IndexStore$getIndexCloseValue$2(this, null), clock, new DefaultStaleDecider(durationOfMinutes, storeBundle.getClock()));
        LogoutKillswitch logoutKillswitch2 = getLogoutKillswitch();
        Clock clock2 = storeBundle.getClock();
        Duration durationOfMinutes2 = Duration.ofMinutes(15L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes2, "ofMinutes(...)");
        this.getIndexCloseValues = companion.create(new IndexStore$getIndexCloseValues$1(this, null), logoutKillswitch2, new IndexStore$getIndexCloseValues$2(this, null), clock2, new DefaultStaleDecider(durationOfMinutes2, storeBundle.getClock()));
        LogoutKillswitch logoutKillswitch3 = getLogoutKillswitch();
        Clock clock3 = storeBundle.getClock();
        Duration durationOfMinutes3 = Duration.ofMinutes(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes3, "ofMinutes(...)");
        this.getIndexHistoricals = companion.create(new IndexStore$getIndexHistoricals$1(this, null), logoutKillswitch3, new IndexStore$getIndexHistoricals$2(null), clock3, new DefaultStaleDecider(durationOfMinutes3, storeBundle.getClock()));
        LogoutKillswitch logoutKillswitch4 = getLogoutKillswitch();
        Clock clock4 = storeBundle.getClock();
        Duration durationOfMinutes4 = Duration.ofMinutes(15L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes4, "ofMinutes(...)");
        this.getIndex = companion.create(new C188911(null), logoutKillswitch4, new C188922(null), clock4, new DefaultStaleDecider(durationOfMinutes4, storeBundle.getClock()));
        LogoutKillswitch logoutKillswitch5 = getLogoutKillswitch();
        Clock clock5 = storeBundle.getClock();
        Duration durationOfMinutes5 = Duration.ofMinutes(15L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes5, "ofMinutes(...)");
        this.getIndexListByIds = companion.create(new IndexStore$getIndexListByIds$1(this, null), logoutKillswitch5, new IndexStore$getIndexListByIds$2(this, null), clock5, new DefaultStaleDecider(durationOfMinutes5, storeBundle.getClock()));
        LogoutKillswitch logoutKillswitch6 = getLogoutKillswitch();
        Clock clock6 = storeBundle.getClock();
        Duration durationOfMinutes6 = Duration.ofMinutes(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes6, "ofMinutes(...)");
        this.getIndexFundamentalsDetail = companion.create(new IndexStore$getIndexFundamentalsDetail$1(this, null), logoutKillswitch6, new IndexStore$getIndexFundamentalsDetail$2(this, null), clock6, new DefaultStaleDecider(durationOfMinutes6, storeBundle.getClock()));
        LogoutKillswitch logoutKillswitch7 = getLogoutKillswitch();
        Clock clock7 = storeBundle.getClock();
        Duration durationOfMinutes7 = Duration.ofMinutes(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes7, "ofMinutes(...)");
        this.getIndexFundamentalsList = companion.create(new IndexStore$getIndexFundamentalsList$1(this, null), logoutKillswitch7, new IndexStore$getIndexFundamentalsList$2(this, null), clock7, new DefaultStaleDecider(durationOfMinutes7, storeBundle.getClock()));
        Query.Companion companion2 = Query.INSTANCE;
        this.indexFundamentalsDetailQuery = Store.create$default(this, companion2, "indexFundamentalsDetailQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.indexes.store.IndexStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexStore.indexFundamentalsDetailQuery$lambda$0(this.f$0, (ApiIndexFundamentalsDetailRequest) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.indexes.store.IndexStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexStore.indexFundamentalsDetailQuery$lambda$1(this.f$0, (ApiIndexFundamentalsDetailRequest) obj);
            }
        }, false, 8, null);
        this.indexFundamentalsListQuery = Store.create$default(this, companion2, "indexFundamentalsListQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.indexes.store.IndexStore$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexStore.indexFundamentalsListQuery$lambda$2(this.f$0, (ApiIndexFundamentalsListRequest) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.indexes.store.IndexStore$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexStore.indexFundamentalsListQuery$lambda$3(this.f$0, (ApiIndexFundamentalsListRequest) obj);
            }
        }, false, 8, null);
        this.indexValueQuery = Store.create$default(this, companion2, "indexValueQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.indexes.store.IndexStore$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexStore.indexValueQuery$lambda$4(this.f$0, (ApiIndexValueDetailRequest) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.indexes.store.IndexStore$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexStore.indexValueQuery$lambda$5(this.f$0, (ApiIndexValueDetailRequest) obj);
            }
        }, false, 8, null);
        this.indexValuesQuery = Store.create$default(this, companion2, "indexValuesQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.indexes.store.IndexStore$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexStore.indexValuesQuery$lambda$6(this.f$0, (ApiIndexValueListRequest) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.indexes.store.IndexStore$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexStore.indexValuesQuery$lambda$7(this.f$0, (ApiIndexValueListRequest) obj);
            }
        }, false, 8, null);
        this.indexQuery = Store.create$default(this, companion2, "indexQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.indexes.store.IndexStore$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexStore.indexQuery$lambda$8(this.f$0, (ApiIndexRequest) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.indexes.store.IndexStore$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexStore.indexQuery$lambda$9(this.f$0, (ApiIndexRequest) obj);
            }
        }, false, 8, null);
        this.indexListByIdsQuery = Store.create$default(this, companion2, "indexListByIdsQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.indexes.store.IndexStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexStore.indexListByIdsQuery$lambda$10(this.f$0, (List) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.indexes.store.IndexStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexStore.indexListByIdsQuery$lambda$11(this.f$0, (List) obj);
            }
        }, false, 8, null);
        this.indexCloseValueQuery = Store.create$default(this, companion2, "indexCloseValueQuery", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.android.indexes.store.IndexStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexStore.indexCloseValueQuery$lambda$12(this.f$0, (ApiIndexCloseDetailRequest) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.indexes.store.IndexStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexStore.indexCloseValueQuery$lambda$13(this.f$0, (ApiIndexCloseDetailRequest) obj);
            }
        }, false, 8, null);
        this.indexCloseValuesQuery = Store.create$default(this, companion2, "indexCloseValuesQuery", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.android.indexes.store.IndexStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexStore.indexCloseValuesQuery$lambda$14(this.f$0, (ApiIndexCloseListRequest) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.indexes.store.IndexStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexStore.indexCloseValuesQuery$lambda$15(this.f$0, (ApiIndexCloseListRequest) obj);
            }
        }, false, 8, null);
    }

    /* compiled from: IndexStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/models/api/ApiIndex;", "request", "Lcom/robinhood/android/indexes/models/api/ApiIndexRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.store.IndexStore$getIndex$1", m3645f = "IndexStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.indexes.store.IndexStore$getIndex$1 */
    static final class C188911 extends ContinuationImpl7 implements Function2<ApiIndexRequest, Continuation<? super ApiIndex>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C188911(Continuation<? super C188911> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C188911 c188911 = IndexStore.this.new C188911(continuation);
            c188911.L$0 = obj;
            return c188911;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ApiIndexRequest apiIndexRequest, Continuation<? super ApiIndex> continuation) {
            return ((C188911) create(apiIndexRequest, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        
            if (r6 == r0) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ApiIndexRequest apiIndexRequest;
            ApiIndex apiIndex;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return (ApiIndex) obj;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apiIndexRequest = (ApiIndexRequest) this.L$0;
                ResultKt.throwOnFailure(obj);
                apiIndex = (ApiIndex) CollectionsKt.firstOrNull((List) ((ApiIndexListResponse) obj).getResults());
                if (apiIndex == null) {
                    return apiIndex;
                }
                throw new HttpException(Response.error(400, ResponseBody.Companion.create$default(ResponseBody.INSTANCE, "Unknown symbol " + ((ApiIndexRequest.BySymbol) apiIndexRequest).getSymbol(), (MediaType) null, 1, (Object) null)));
            }
            ResultKt.throwOnFailure(obj);
            ApiIndexRequest apiIndexRequest2 = (ApiIndexRequest) this.L$0;
            if (apiIndexRequest2 instanceof ApiIndexRequest.ById) {
                IndexApi indexApi = IndexStore.this.indexApi;
                UUID id = ((ApiIndexRequest.ById) apiIndexRequest2).getId();
                this.label = 1;
                obj = indexApi.getIndexById(id, this);
            } else if (apiIndexRequest2 instanceof ApiIndexRequest.BySymbol) {
                IndexApi indexApi2 = IndexStore.this.indexApi;
                CommaSeparatedList<String> commaSeparatedList = CommaSeparatedList2.toCommaSeparatedList(CollectionsKt.listOf(((ApiIndexRequest.BySymbol) apiIndexRequest2).getSymbol()));
                this.L$0 = apiIndexRequest2;
                this.label = 2;
                Object indexListBySymbols = indexApi2.getIndexListBySymbols(commaSeparatedList, this);
                if (indexListBySymbols != coroutine_suspended) {
                    apiIndexRequest = apiIndexRequest2;
                    obj = indexListBySymbols;
                    apiIndex = (ApiIndex) CollectionsKt.firstOrNull((List) ((ApiIndexListResponse) obj).getResults());
                    if (apiIndex == null) {
                    }
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return coroutine_suspended;
        }
    }

    /* compiled from: IndexStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/indexes/models/api/ApiIndex;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.store.IndexStore$getIndex$2", m3645f = "IndexStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.indexes.store.IndexStore$getIndex$2 */
    static final class C188922 extends ContinuationImpl7 implements Function2<ApiIndex, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C188922(Continuation<? super C188922> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C188922 c188922 = IndexStore.this.new C188922(continuation);
            c188922.L$0 = obj;
            return c188922;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ApiIndex apiIndex, Continuation<? super Unit> continuation) {
            return ((C188922) create(apiIndex, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                IndexStore.this.indexDao.insert((IndexDao) ((ApiIndex) this.L$0).toDbModel());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow indexFundamentalsDetailQuery$lambda$0(IndexStore indexStore, ApiIndexFundamentalsDetailRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return Endpoint.DefaultImpls.poll$default(indexStore.getIndexFundamentalsDetail, request, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow indexFundamentalsDetailQuery$lambda$1(IndexStore indexStore, ApiIndexFundamentalsDetailRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (!(request instanceof ApiIndexFundamentalsDetailRequest.ApiIndexFundamentalsDetailRequestById)) {
            throw new NoWhenBranchMatchedException();
        }
        return indexStore.indexFundamentalsDao.getIndexFundamentalsById(((ApiIndexFundamentalsDetailRequest.ApiIndexFundamentalsDetailRequestById) request).getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow indexFundamentalsListQuery$lambda$2(IndexStore indexStore, ApiIndexFundamentalsListRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return Endpoint.DefaultImpls.poll$default(indexStore.getIndexFundamentalsList, request, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow indexFundamentalsListQuery$lambda$3(IndexStore indexStore, ApiIndexFundamentalsListRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof ApiIndexFundamentalsListRequest.ApiIndexFundamentalsRequestByIds) {
            return indexStore.indexFundamentalsDao.getIndexFundamentalsByIds(((ApiIndexFundamentalsListRequest.ApiIndexFundamentalsRequestByIds) request).getIds());
        }
        if (!(request instanceof ApiIndexFundamentalsListRequest.ApiIndexFundamentalsRequestBySymbols)) {
            throw new NoWhenBranchMatchedException();
        }
        return indexStore.indexFundamentalsDao.getIndexFundamentalsBySymbols(((ApiIndexFundamentalsListRequest.ApiIndexFundamentalsRequestBySymbols) request).getSymbols());
    }

    public final Query<ApiIndexValueDetailRequest, IndexValue> getIndexValueQuery() {
        return this.indexValueQuery;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow indexValueQuery$lambda$4(IndexStore indexStore, ApiIndexValueDetailRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return Endpoint.DefaultImpls.poll$default(indexStore.getIndexValue, request, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow indexValueQuery$lambda$5(IndexStore indexStore, ApiIndexValueDetailRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof ApiIndexValueDetailRequest.ApiIndexValueRequestById) {
            return indexStore.indexValueDao.getIndexValueById(((ApiIndexValueDetailRequest.ApiIndexValueRequestById) request).getId());
        }
        if (!(request instanceof ApiIndexValueDetailRequest.ApiIndexValueRequestBySymbol)) {
            throw new NoWhenBranchMatchedException();
        }
        return indexStore.indexValueDao.getIndexValueBySymbol(((ApiIndexValueDetailRequest.ApiIndexValueRequestBySymbol) request).getSymbol());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow indexValuesQuery$lambda$6(IndexStore indexStore, ApiIndexValueListRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return Endpoint.DefaultImpls.poll$default(indexStore.getIndexValues, request, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow indexValuesQuery$lambda$7(IndexStore indexStore, ApiIndexValueListRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof ApiIndexValueListRequest.ApiIndexValueRequestByIds) {
            return indexStore.indexValueDao.getIndexValuesByIds(((ApiIndexValueListRequest.ApiIndexValueRequestByIds) request).getIds());
        }
        if (!(request instanceof ApiIndexValueListRequest.ApiIndexValueRequestBySymbols)) {
            throw new NoWhenBranchMatchedException();
        }
        return indexStore.indexValueDao.getIndexValuesBySymbols(((ApiIndexValueListRequest.ApiIndexValueRequestBySymbols) request).getSymbols());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow indexQuery$lambda$8(IndexStore indexStore, ApiIndexRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Endpoint<ApiIndexRequest, ApiIndex> endpoint = indexStore.getIndex;
        Duration durationOfHours = Duration.ofHours(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfHours, "ofHours(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, request, durationOfHours, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow indexQuery$lambda$9(IndexStore indexStore, ApiIndexRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof ApiIndexRequest.ById) {
            return indexStore.indexDao.getIndexById(((ApiIndexRequest.ById) request).getId());
        }
        if (request instanceof ApiIndexRequest.BySymbol) {
            return indexStore.indexDao.getIndexBySymbol(((ApiIndexRequest.BySymbol) request).getSymbol());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Query<List<UUID>, List<Index>> getIndexListByIdsQuery() {
        return this.indexListByIdsQuery;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow indexListByIdsQuery$lambda$10(IndexStore indexStore, List ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Endpoint<List<UUID>, List<ApiIndex>> endpoint = indexStore.getIndexListByIds;
        Duration durationOfHours = Duration.ofHours(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfHours, "ofHours(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, ids, durationOfHours, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow indexListByIdsQuery$lambda$11(IndexStore indexStore, List ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return indexStore.indexDao.getIndexListByIds(ids);
    }

    public final Query<ApiIndexCloseDetailRequest, IndexCloseValue> getIndexCloseValueQuery() {
        return this.indexCloseValueQuery;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job indexCloseValueQuery$lambda$12(IndexStore indexStore, ApiIndexCloseDetailRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return Endpoint.DefaultImpls.refresh$default(indexStore.getIndexCloseValue, request, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow indexCloseValueQuery$lambda$13(IndexStore indexStore, ApiIndexCloseDetailRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof ApiIndexCloseDetailRequest.ApiIndexCloseRequestById) {
            return indexStore.indexCloseValueDao.getIndexCloseValueById(((ApiIndexCloseDetailRequest.ApiIndexCloseRequestById) request).getId());
        }
        if (!(request instanceof ApiIndexCloseDetailRequest.ApiIndexCloseRequestBySymbol)) {
            throw new NoWhenBranchMatchedException();
        }
        return indexStore.indexCloseValueDao.getIndexCloseValueBySymbol(((ApiIndexCloseDetailRequest.ApiIndexCloseRequestBySymbol) request).getSymbol());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job indexCloseValuesQuery$lambda$14(IndexStore indexStore, ApiIndexCloseListRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return Endpoint.DefaultImpls.refresh$default(indexStore.getIndexCloseValues, request, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow indexCloseValuesQuery$lambda$15(IndexStore indexStore, ApiIndexCloseListRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof ApiIndexCloseListRequest.ApiIndexCloseRequestByIds) {
            return indexStore.indexCloseValueDao.getIndexCloseValuesByIds(((ApiIndexCloseListRequest.ApiIndexCloseRequestByIds) request).getIds());
        }
        if (!(request instanceof ApiIndexCloseListRequest.ApiIndexCloseRequestBySymbols)) {
            throw new NoWhenBranchMatchedException();
        }
        return indexStore.indexCloseValueDao.getIndexCloseValuesBySymbols(((ApiIndexCloseListRequest.ApiIndexCloseRequestBySymbols) request).getSymbols());
    }

    public final Flow<IndexFundamentals> streamIndexFundamentals(ApiIndexFundamentalsDetailRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.indexFundamentalsDetailQuery.asFlow(request);
    }

    public final Flow<List<IndexFundamentals>> streamIndexFundamentalsList(ApiIndexFundamentalsListRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.indexFundamentalsListQuery.asFlow(request);
    }

    public final Flow<IndexValue> streamIndexValue(ApiIndexValueDetailRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.indexValueQuery.asFlow(request);
    }

    public final Flow<List<IndexValue>> streamIndexValues(ApiIndexValueListRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.indexValuesQuery.asFlow(request);
    }

    public final Flow<Index> streamIndex(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.indexQuery.asFlow(new ApiIndexRequest.ById(id));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r9 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getIndex(ApiIndexRequest apiIndexRequest, Continuation<? super Index> continuation) {
        C188933 c188933;
        if (continuation instanceof C188933) {
            c188933 = (C188933) continuation;
            int i = c188933.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c188933.label = i - Integer.MIN_VALUE;
            } else {
                c188933 = new C188933(continuation);
            }
        }
        C188933 c1889332 = c188933;
        Object objFirstOrNull = c1889332.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c1889332.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            Flow<Index> flowAsFlow = this.indexQuery.asFlow(apiIndexRequest);
            c1889332.L$0 = apiIndexRequest;
            c1889332.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowAsFlow, c1889332);
            if (objFirstOrNull != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirstOrNull);
            return ((ApiIndex) objFirstOrNull).toDbModel();
        }
        apiIndexRequest = (ApiIndexRequest) c1889332.L$0;
        ResultKt.throwOnFailure(objFirstOrNull);
        Index index = (Index) objFirstOrNull;
        if (index != null) {
            return index;
        }
        Endpoint<ApiIndexRequest, ApiIndex> endpoint = this.getIndex;
        c1889332.L$0 = null;
        c1889332.label = 2;
        objFirstOrNull = Endpoint.DefaultImpls.forceFetch$default(endpoint, apiIndexRequest, null, c1889332, 2, null);
    }

    public final Flow<IndexCloseValue> streamIndexCloseValue(ApiIndexCloseDetailRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.indexCloseValueQuery.asFlow(request);
    }

    public final Flow<List<IndexCloseValue>> streamIndexCloseValues(ApiIndexCloseListRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.indexCloseValuesQuery.asFlow(request);
    }

    public final Flow<IndexHistoricals> pollIndexHistoricals(ApiIndexHistoricalsDetailRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Endpoint<ApiIndexHistoricalsDetailRequest, ApiMarketdataResponse<ApiMarketdataResponse<ApiIndexHistoricals>>> endpoint = this.getIndexHistoricals;
        Duration durationOfMinutes = Duration.ofMinutes(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        final Flow flowPoll$default = Endpoint.DefaultImpls.poll$default(endpoint, request, durationOfMinutes, null, 4, null);
        return new Flow<IndexHistoricals>() { // from class: com.robinhood.android.indexes.store.IndexStore$pollIndexHistoricals$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super IndexHistoricals> flowCollector, Continuation continuation) {
                Object objCollect = flowPoll$default.collect(new C188902(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.indexes.store.IndexStore$pollIndexHistoricals$$inlined$mapNotNull$1$2 */
            public static final class C188902<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.indexes.store.IndexStore$pollIndexHistoricals$$inlined$mapNotNull$1$2", m3645f = "IndexStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.android.indexes.store.IndexStore$pollIndexHistoricals$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        return C188902.this.emit(null, this);
                    }
                }

                public C188902(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    ApiIndexHistoricals apiIndexHistoricals;
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
                        ApiMarketdataResponse apiMarketdataResponse = (ApiMarketdataResponse) ((ApiMarketdataResponse) obj).getData();
                        IndexHistoricals dbModel = (apiMarketdataResponse == null || (apiIndexHistoricals = (ApiIndexHistoricals) apiMarketdataResponse.getData()) == null) ? null : apiIndexHistoricals.toDbModel();
                        if (dbModel != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(dbModel, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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

    public final Flow<List<Index>> streamIndexListByIds(List<UUID> indexIds) {
        Intrinsics.checkNotNullParameter(indexIds, "indexIds");
        return this.indexListByIdsQuery.asFlow(indexIds);
    }
}
