package com.robinhood.librobinhood.data.store.costbasis;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.android.idl.common.pagination.IdlPaginationEndpoint;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore;
import com.robinhood.models.crypto.dao.CryptoCostBasisDetailsDao;
import com.robinhood.models.crypto.p314db.costbasis.CryptoCostBasisDetails;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.transfer.UiCostBasisDetails;
import com.robinhood.models.crypto.p315ui.transfer.UiCostBasisSummary;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import nummus.p512v1.CostBasisStatusDto;
import nummus.p512v1.CreateCostBasisLotRequestDto;
import nummus.p512v1.CreateCostBasisLotResponseDto;
import nummus.p512v1.GetCostBasisDetailsResponseDto;
import nummus.p512v1.GetCostBasisSummaryResponseDto;
import nummus.p512v1.RestNummusService;
import p479j$.time.Instant;

/* compiled from: CryptoCostBasisStore.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 <2\u00020\u0001:\u0003=><B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0016\u0010\u0017JH\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ@\u0010!\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001bH\u0086@¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010$\u001a\u00020#H\u0086@¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R \u00102\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u00105\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0012048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R \u0010:\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u000209078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006?"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/costbasis/CryptoCostBasisStore;", "Lcom/robinhood/store/Store;", "Lnummus/v1/RestNummusService;", "nummusService", "Lcom/robinhood/models/crypto/dao/CryptoCostBasisDetailsDao;", "costBasisDetailsDao", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "currencyPairStore", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lnummus/v1/RestNummusService;Lcom/robinhood/models/crypto/dao/CryptoCostBasisDetailsDao;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Lcom/robinhood/store/StoreBundle;)V", "Ljava/util/UUID;", "accountId", "sourceId", "", "sourceType", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/crypto/db/costbasis/CryptoCostBasisDetails;", "streamCostBasisDetails", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/crypto/ui/transfer/UiCostBasisDetails;", "fetchUiCostBasisDetails", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validationFieldName", "j$/time/Instant", "acquisitionDate", "Ljava/math/BigDecimal;", "coinQuantity", "", "validateLotInput", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/math/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "totalCost", "submitLotInput", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Lj$/time/Instant;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/librobinhood/data/store/costbasis/CryptoCostBasisStore$SummaryParams;", "params", "Lcom/robinhood/models/crypto/ui/transfer/UiCostBasisSummary;", "fetchCostBasisSummary", "(Lcom/robinhood/librobinhood/data/store/costbasis/CryptoCostBasisStore$SummaryParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnummus/v1/RestNummusService;", "Lcom/robinhood/models/crypto/dao/CryptoCostBasisDetailsDao;", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/costbasis/CryptoCostBasisStore$DetailsParams;", "Lnummus/v1/GetCostBasisDetailsResponseDto;", "getDetails", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedEndpoint;", "Lnummus/v1/GetCostBasisSummaryResponseDto;", "getSummary", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedEndpoint;", "Lcom/robinhood/android/moria/db/Query;", "detailsQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lnummus/v1/CreateCostBasisLotRequestDto;", "Lnummus/v1/CreateCostBasisLotResponseDto;", "saveLotEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Companion", "DetailsParams", "SummaryParams", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CryptoCostBasisStore extends Store {
    private static final int DEFAULT_PAGE_SIZE = 10;
    private final CryptoCostBasisDetailsDao costBasisDetailsDao;
    private final CurrencyPairV2Store currencyPairStore;
    private final Query<DetailsParams, CryptoCostBasisDetails> detailsQuery;
    private final Endpoint<DetailsParams, GetCostBasisDetailsResponseDto> getDetails;
    private final IdlPaginationEndpoint<SummaryParams, GetCostBasisSummaryResponseDto> getSummary;
    private final RestNummusService nummusService;
    private final PostEndpoint<CreateCostBasisLotRequestDto, CreateCostBasisLotResponseDto> saveLotEndpoint;

    /* compiled from: CryptoCostBasisStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore", m3645f = "CryptoCostBasisStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE}, m3647m = "fetchCostBasisSummary")
    /* renamed from: com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore$fetchCostBasisSummary$1 */
    static final class C347811 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C347811(Continuation<? super C347811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoCostBasisStore.this.fetchCostBasisSummary(null, this);
        }
    }

    /* compiled from: CryptoCostBasisStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore", m3645f = "CryptoCostBasisStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE}, m3647m = "fetchUiCostBasisDetails")
    /* renamed from: com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore$fetchUiCostBasisDetails$1 */
    static final class C347821 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C347821(Continuation<? super C347821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoCostBasisStore.this.fetchUiCostBasisDetails(null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoCostBasisStore(RestNummusService nummusService, CryptoCostBasisDetailsDao costBasisDetailsDao, CurrencyPairV2Store currencyPairStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(nummusService, "nummusService");
        Intrinsics.checkNotNullParameter(costBasisDetailsDao, "costBasisDetailsDao");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.nummusService = nummusService;
        this.costBasisDetailsDao = costBasisDetailsDao;
        this.currencyPairStore = currencyPairStore;
        Endpoint<DetailsParams, GetCostBasisDetailsResponseDto> endpointCreate$default = Endpoint.Companion.create$default(Endpoint.INSTANCE, new CryptoCostBasisStore3(this, null), getLogoutKillswitch(), new CryptoCostBasisStore4(this, null), storeBundle.getClock(), null, 16, null);
        this.getDetails = endpointCreate$default;
        this.getSummary = IdlPaginationEndpoint.Companion.createWithParams$default(IdlPaginationEndpoint.INSTANCE, new CryptoCostBasisStore5(this, null), new Function1() { // from class: com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoCostBasisStore.getSummary$lambda$2((GetCostBasisSummaryResponseDto) obj);
            }
        }, new Function1() { // from class: com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoCostBasisStore.getSummary$lambda$5((GetCostBasisSummaryResponseDto) obj);
            }
        }, getLogoutKillswitch(), new CryptoCostBasisStore6(this, null), storeBundle.getClock(), null, 64, null);
        this.detailsQuery = Store.create$default(this, Query.INSTANCE, "getCostBasisDetails", CollectionsKt.listOf(new RefreshEach(new CryptoCostBasisStore2(endpointCreate$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoCostBasisStore.detailsQuery$lambda$6(this.f$0, (CryptoCostBasisStore.DetailsParams) obj);
            }
        }, false, 8, null);
        this.saveLotEndpoint = PostEndpoint.INSTANCE.create(new CryptoCostBasisStore7(this, null), new CryptoCostBasisStore8(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor getSummary$lambda$2(GetCostBasisSummaryResponseDto response) {
        Intrinsics.checkNotNullParameter(response, "response");
        String previous = response.getPrevious();
        if (previous.length() <= 0) {
            previous = null;
        }
        if (previous != null) {
            return new IdlPaginationCursor(previous);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor getSummary$lambda$5(GetCostBasisSummaryResponseDto response) {
        Intrinsics.checkNotNullParameter(response, "response");
        String next = response.getNext();
        if (next.length() <= 0) {
            next = null;
        }
        if (next != null) {
            return new IdlPaginationCursor(next);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow detailsQuery$lambda$6(CryptoCostBasisStore cryptoCostBasisStore, DetailsParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return cryptoCostBasisStore.costBasisDetailsDao.getCostBasisDetailsFlow(params.getSourceId(), params.getAccountId(), params.getSourceType());
    }

    public final Flow<CryptoCostBasisDetails> streamCostBasisDetails(UUID accountId, UUID sourceId, String sourceType) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        return this.detailsQuery.asFlow(new DetailsParams(accountId, sourceId, sourceType));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (r12 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchUiCostBasisDetails(UUID uuid, UUID uuid2, String str, Continuation<? super UiCostBasisDetails> continuation) {
        C347821 c347821;
        GetCostBasisDetailsResponseDto getCostBasisDetailsResponseDto;
        if (continuation instanceof C347821) {
            c347821 = (C347821) continuation;
            int i = c347821.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c347821.label = i - Integer.MIN_VALUE;
            } else {
                c347821 = new C347821(continuation);
            }
        }
        C347821 c3478212 = c347821;
        Object objForceFetch$default = c3478212.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3478212.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<DetailsParams, GetCostBasisDetailsResponseDto> endpoint = this.getDetails;
            DetailsParams detailsParams = new DetailsParams(uuid, uuid2, str);
            c3478212.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, detailsParams, null, c3478212, 2, null);
            if (objForceFetch$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            getCostBasisDetailsResponseDto = (GetCostBasisDetailsResponseDto) c3478212.L$0;
            ResultKt.throwOnFailure(objForceFetch$default);
            return new UiCostBasisDetails(getCostBasisDetailsResponseDto, (UiCurrencyPair) objForceFetch$default);
        }
        ResultKt.throwOnFailure(objForceFetch$default);
        getCostBasisDetailsResponseDto = (GetCostBasisDetailsResponseDto) objForceFetch$default;
        UUID uuidFromString = UUID.fromString(getCostBasisDetailsResponseDto.getCurrency_pair_id());
        CurrencyPairV2Store currencyPairV2Store = this.currencyPairStore;
        Intrinsics.checkNotNull(uuidFromString);
        Flow<UiCurrencyPair> flowStreamCurrencyPairFlow = currencyPairV2Store.streamCurrencyPairFlow(uuidFromString);
        c3478212.L$0 = getCostBasisDetailsResponseDto;
        c3478212.label = 2;
        objForceFetch$default = FlowKt.first(flowStreamCurrencyPairFlow, c3478212);
    }

    public static /* synthetic */ Object validateLotInput$default(CryptoCostBasisStore cryptoCostBasisStore, UUID uuid, UUID uuid2, String str, String str2, Instant instant, BigDecimal bigDecimal, Continuation continuation, int i, Object obj) {
        if ((i & 16) != 0) {
            instant = null;
        }
        if ((i & 32) != 0) {
            bigDecimal = null;
        }
        return cryptoCostBasisStore.validateLotInput(uuid, uuid2, str, str2, instant, bigDecimal, continuation);
    }

    public final Object validateLotInput(UUID uuid, UUID uuid2, String str, String str2, Instant instant, BigDecimal bigDecimal, Continuation<? super Unit> continuation) {
        CreateCostBasisLotRequestDto createCostBasisLotRequestDtoCopy$default;
        CreateCostBasisLotRequestDto createCostBasisLotRequestDtoCopy$default2;
        String string2 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String string3 = uuid2.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        CreateCostBasisLotRequestDto createCostBasisLotRequestDto = new CreateCostBasisLotRequestDto(string2, string3, str, null, null, null, CollectionsKt.listOf(str2), 56, null);
        CreateCostBasisLotRequestDto createCostBasisLotRequestDto2 = (instant == null || (createCostBasisLotRequestDtoCopy$default2 = CreateCostBasisLotRequestDto.copy$default(createCostBasisLotRequestDto, null, null, null, instant, null, null, null, 119, null)) == null) ? createCostBasisLotRequestDto : createCostBasisLotRequestDtoCopy$default2;
        Object objPost$default = PostEndpoint.DefaultImpls.post$default(this.saveLotEndpoint, (bigDecimal == null || (createCostBasisLotRequestDtoCopy$default = CreateCostBasisLotRequestDto.copy$default(createCostBasisLotRequestDto2, null, null, null, null, IdlDecimal2.toIdlDecimal(bigDecimal), null, null, 111, null)) == null) ? createCostBasisLotRequestDto2 : createCostBasisLotRequestDtoCopy$default, null, continuation, 2, null);
        return objPost$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPost$default : Unit.INSTANCE;
    }

    public final Object submitLotInput(UUID uuid, UUID uuid2, String str, Instant instant, BigDecimal bigDecimal, BigDecimal bigDecimal2, Continuation<? super Unit> continuation) {
        String string2 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String string3 = uuid2.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        Object objPost$default = PostEndpoint.DefaultImpls.post$default(this.saveLotEndpoint, new CreateCostBasisLotRequestDto(string2, string3, str, instant, IdlDecimal2.toIdlDecimal(bigDecimal), IdlDecimal2.toIdlDecimal(bigDecimal2), null, 64, null), null, continuation, 2, null);
        return objPost$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPost$default : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (r10 == r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00c1 -> B:31:0x00c2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchCostBasisSummary(SummaryParams summaryParams, Continuation<? super UiCostBasisSummary> continuation) {
        C347811 c347811;
        Iterator it;
        GetCostBasisSummaryResponseDto getCostBasisSummaryResponseDto;
        Collection collection;
        if (continuation instanceof C347811) {
            c347811 = (C347811) continuation;
            int i = c347811.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c347811.label = i - Integer.MIN_VALUE;
            } else {
                c347811 = new C347811(continuation);
            }
        }
        C347811 c3478112 = c347811;
        Object objForceFetch$default = c3478112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3478112.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<Tuples2<SummaryParams, IdlPaginationCursor>, GetCostBasisSummaryResponseDto> endpoint = this.getSummary.getEndpoint();
            String cursor = summaryParams.getCursor();
            Tuples2 tuples2M3642to = Tuples4.m3642to(summaryParams, cursor != null ? new IdlPaginationCursor(cursor) : null);
            c3478112.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, tuples2M3642to, null, c3478112, 2, null);
        } else if (i2 == 1) {
            ResultKt.throwOnFailure(objForceFetch$default);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = (Collection) c3478112.L$4;
            GetCostBasisDetailsResponseDto getCostBasisDetailsResponseDto = (GetCostBasisDetailsResponseDto) c3478112.L$3;
            it = (Iterator) c3478112.L$2;
            Collection collection2 = (Collection) c3478112.L$1;
            getCostBasisSummaryResponseDto = (GetCostBasisSummaryResponseDto) c3478112.L$0;
            ResultKt.throwOnFailure(objForceFetch$default);
            collection.add(new UiCostBasisDetails(getCostBasisDetailsResponseDto, (UiCurrencyPair) objForceFetch$default));
            collection = collection2;
            if (it.hasNext()) {
                getCostBasisDetailsResponseDto = (GetCostBasisDetailsResponseDto) it.next();
                UUID uuidFromString = UUID.fromString(getCostBasisDetailsResponseDto.getCurrency_pair_id());
                CurrencyPairV2Store currencyPairV2Store = this.currencyPairStore;
                Intrinsics.checkNotNull(uuidFromString);
                Flow<UiCurrencyPair> flowStreamCurrencyPairFlow = currencyPairV2Store.streamCurrencyPairFlow(uuidFromString);
                c3478112.L$0 = getCostBasisSummaryResponseDto;
                c3478112.L$1 = collection;
                c3478112.L$2 = it;
                c3478112.L$3 = getCostBasisDetailsResponseDto;
                c3478112.L$4 = collection;
                c3478112.label = 2;
                objForceFetch$default = FlowKt.first(flowStreamCurrencyPairFlow, c3478112);
                if (objForceFetch$default != coroutine_suspended) {
                    collection2 = collection;
                    collection.add(new UiCostBasisDetails(getCostBasisDetailsResponseDto, (UiCurrencyPair) objForceFetch$default));
                    collection = collection2;
                    if (it.hasNext()) {
                        return new UiCostBasisSummary(getCostBasisSummaryResponseDto.getNext(), getCostBasisSummaryResponseDto.getPrevious(), extensions2.toImmutableList((List) collection));
                    }
                }
                return coroutine_suspended;
            }
        }
        GetCostBasisSummaryResponseDto getCostBasisSummaryResponseDto2 = (GetCostBasisSummaryResponseDto) objForceFetch$default;
        List<GetCostBasisDetailsResponseDto> results = getCostBasisSummaryResponseDto2.getResults();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        it = results.iterator();
        getCostBasisSummaryResponseDto = getCostBasisSummaryResponseDto2;
        collection = arrayList;
        if (it.hasNext()) {
        }
    }

    /* compiled from: CryptoCostBasisStore.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/costbasis/CryptoCostBasisStore$DetailsParams;", "", "accountId", "Ljava/util/UUID;", "sourceId", "sourceType", "", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;)V", "getAccountId", "()Ljava/util/UUID;", "getSourceId", "getSourceType", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DetailsParams {
        private final UUID accountId;
        private final UUID sourceId;
        private final String sourceType;

        public static /* synthetic */ DetailsParams copy$default(DetailsParams detailsParams, UUID uuid, UUID uuid2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = detailsParams.accountId;
            }
            if ((i & 2) != 0) {
                uuid2 = detailsParams.sourceId;
            }
            if ((i & 4) != 0) {
                str = detailsParams.sourceType;
            }
            return detailsParams.copy(uuid, uuid2, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getAccountId() {
            return this.accountId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getSourceId() {
            return this.sourceId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSourceType() {
            return this.sourceType;
        }

        public final DetailsParams copy(UUID accountId, UUID sourceId, String sourceType) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            Intrinsics.checkNotNullParameter(sourceType, "sourceType");
            return new DetailsParams(accountId, sourceId, sourceType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DetailsParams)) {
                return false;
            }
            DetailsParams detailsParams = (DetailsParams) other;
            return Intrinsics.areEqual(this.accountId, detailsParams.accountId) && Intrinsics.areEqual(this.sourceId, detailsParams.sourceId) && Intrinsics.areEqual(this.sourceType, detailsParams.sourceType);
        }

        public int hashCode() {
            return (((this.accountId.hashCode() * 31) + this.sourceId.hashCode()) * 31) + this.sourceType.hashCode();
        }

        public String toString() {
            return "DetailsParams(accountId=" + this.accountId + ", sourceId=" + this.sourceId + ", sourceType=" + this.sourceType + ")";
        }

        public DetailsParams(UUID accountId, UUID sourceId, String sourceType) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            Intrinsics.checkNotNullParameter(sourceType, "sourceType");
            this.accountId = accountId;
            this.sourceId = sourceId;
            this.sourceType = sourceType;
        }

        public final UUID getAccountId() {
            return this.accountId;
        }

        public final UUID getSourceId() {
            return this.sourceId;
        }

        public final String getSourceType() {
            return this.sourceType;
        }
    }

    /* compiled from: CryptoCostBasisStore.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jf\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\bHÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014¨\u0006."}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/costbasis/CryptoCostBasisStore$SummaryParams;", "", "accountId", "Ljava/util/UUID;", "sourceType", "", "currencyPairId", "limit", "", "year", "status", "Lnummus/v1/CostBasisStatusDto;", "allowCorrection", "", "cursor", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/util/UUID;ILjava/lang/Integer;Lnummus/v1/CostBasisStatusDto;ZLjava/lang/String;)V", "getAccountId", "()Ljava/util/UUID;", "getSourceType", "()Ljava/lang/String;", "getCurrencyPairId", "getLimit", "()I", "getYear", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatus", "()Lnummus/v1/CostBasisStatusDto;", "getAllowCorrection", "()Z", "getCursor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/util/UUID;Ljava/lang/String;Ljava/util/UUID;ILjava/lang/Integer;Lnummus/v1/CostBasisStatusDto;ZLjava/lang/String;)Lcom/robinhood/librobinhood/data/store/costbasis/CryptoCostBasisStore$SummaryParams;", "equals", "other", "hashCode", "toString", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SummaryParams {
        private final UUID accountId;
        private final boolean allowCorrection;
        private final UUID currencyPairId;
        private final String cursor;
        private final int limit;
        private final String sourceType;
        private final CostBasisStatusDto status;
        private final Integer year;

        public static /* synthetic */ SummaryParams copy$default(SummaryParams summaryParams, UUID uuid, String str, UUID uuid2, int i, Integer num, CostBasisStatusDto costBasisStatusDto, boolean z, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                uuid = summaryParams.accountId;
            }
            if ((i2 & 2) != 0) {
                str = summaryParams.sourceType;
            }
            if ((i2 & 4) != 0) {
                uuid2 = summaryParams.currencyPairId;
            }
            if ((i2 & 8) != 0) {
                i = summaryParams.limit;
            }
            if ((i2 & 16) != 0) {
                num = summaryParams.year;
            }
            if ((i2 & 32) != 0) {
                costBasisStatusDto = summaryParams.status;
            }
            if ((i2 & 64) != 0) {
                z = summaryParams.allowCorrection;
            }
            if ((i2 & 128) != 0) {
                str2 = summaryParams.cursor;
            }
            boolean z2 = z;
            String str3 = str2;
            Integer num2 = num;
            CostBasisStatusDto costBasisStatusDto2 = costBasisStatusDto;
            return summaryParams.copy(uuid, str, uuid2, i, num2, costBasisStatusDto2, z2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getAccountId() {
            return this.accountId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSourceType() {
            return this.sourceType;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* renamed from: component4, reason: from getter */
        public final int getLimit() {
            return this.limit;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getYear() {
            return this.year;
        }

        /* renamed from: component6, reason: from getter */
        public final CostBasisStatusDto getStatus() {
            return this.status;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getAllowCorrection() {
            return this.allowCorrection;
        }

        /* renamed from: component8, reason: from getter */
        public final String getCursor() {
            return this.cursor;
        }

        public final SummaryParams copy(UUID accountId, String sourceType, UUID currencyPairId, int limit, Integer year, CostBasisStatusDto status, boolean allowCorrection, String cursor) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(sourceType, "sourceType");
            return new SummaryParams(accountId, sourceType, currencyPairId, limit, year, status, allowCorrection, cursor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SummaryParams)) {
                return false;
            }
            SummaryParams summaryParams = (SummaryParams) other;
            return Intrinsics.areEqual(this.accountId, summaryParams.accountId) && Intrinsics.areEqual(this.sourceType, summaryParams.sourceType) && Intrinsics.areEqual(this.currencyPairId, summaryParams.currencyPairId) && this.limit == summaryParams.limit && Intrinsics.areEqual(this.year, summaryParams.year) && this.status == summaryParams.status && this.allowCorrection == summaryParams.allowCorrection && Intrinsics.areEqual(this.cursor, summaryParams.cursor);
        }

        public int hashCode() {
            int iHashCode = ((this.accountId.hashCode() * 31) + this.sourceType.hashCode()) * 31;
            UUID uuid = this.currencyPairId;
            int iHashCode2 = (((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + Integer.hashCode(this.limit)) * 31;
            Integer num = this.year;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            CostBasisStatusDto costBasisStatusDto = this.status;
            int iHashCode4 = (((iHashCode3 + (costBasisStatusDto == null ? 0 : costBasisStatusDto.hashCode())) * 31) + Boolean.hashCode(this.allowCorrection)) * 31;
            String str = this.cursor;
            return iHashCode4 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "SummaryParams(accountId=" + this.accountId + ", sourceType=" + this.sourceType + ", currencyPairId=" + this.currencyPairId + ", limit=" + this.limit + ", year=" + this.year + ", status=" + this.status + ", allowCorrection=" + this.allowCorrection + ", cursor=" + this.cursor + ")";
        }

        public SummaryParams(UUID accountId, String sourceType, UUID uuid, int i, Integer num, CostBasisStatusDto costBasisStatusDto, boolean z, String str) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(sourceType, "sourceType");
            this.accountId = accountId;
            this.sourceType = sourceType;
            this.currencyPairId = uuid;
            this.limit = i;
            this.year = num;
            this.status = costBasisStatusDto;
            this.allowCorrection = z;
            this.cursor = str;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ SummaryParams(java.util.UUID r10, java.lang.String r11, java.util.UUID r12, int r13, java.lang.Integer r14, nummus.p512v1.CostBasisStatusDto r15, boolean r16, java.lang.String r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
            /*
                r9 = this;
                r0 = r18
                r1 = r0 & 8
                if (r1 == 0) goto L8
                r13 = 10
            L8:
                r4 = r13
                r13 = r0 & 16
                r1 = 0
                if (r13 == 0) goto L10
                r5 = r1
                goto L11
            L10:
                r5 = r14
            L11:
                r13 = r0 & 32
                if (r13 == 0) goto L17
                r6 = r1
                goto L18
            L17:
                r6 = r15
            L18:
                r13 = r0 & 64
                if (r13 == 0) goto L1f
                r13 = 0
                r7 = r13
                goto L21
            L1f:
                r7 = r16
            L21:
                r13 = r0 & 128(0x80, float:1.794E-43)
                if (r13 == 0) goto L2b
                r8 = r1
                r0 = r9
                r2 = r11
                r3 = r12
                r1 = r10
                goto L31
            L2b:
                r8 = r17
                r0 = r9
                r1 = r10
                r2 = r11
                r3 = r12
            L31:
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore.SummaryParams.<init>(java.util.UUID, java.lang.String, java.util.UUID, int, java.lang.Integer, nummus.v1.CostBasisStatusDto, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final UUID getAccountId() {
            return this.accountId;
        }

        public final String getSourceType() {
            return this.sourceType;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final int getLimit() {
            return this.limit;
        }

        public final Integer getYear() {
            return this.year;
        }

        public final CostBasisStatusDto getStatus() {
            return this.status;
        }

        public final boolean getAllowCorrection() {
            return this.allowCorrection;
        }

        public final String getCursor() {
            return this.cursor;
        }
    }
}
