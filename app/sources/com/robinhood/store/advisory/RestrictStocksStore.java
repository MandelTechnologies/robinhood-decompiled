package com.robinhood.store.advisory;

import advisory.proto.p008v1.AdvisoryService;
import advisory.proto.p008v1.SearchRestrictableStocksRequestDto;
import advisory.proto.p008v1.UpdateRestrictedStockRequestDto;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.models.advisory.dao.RestrictStocksDao;
import com.robinhood.models.advisory.p304db.portfolio.RestrictedAsset;
import com.robinhood.models.advisory.p304db.portfolio.RestrictedStocksResponse;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RestrictStocksStore.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00192\u0006\u0010\u001a\u001a\u00020\fJ&\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0086@¢\u0006\u0002\u0010\u001fJ\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010!\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/store/advisory/RestrictStocksStore;", "Lcom/robinhood/store/Store;", "advisoryService", "Ladvisory/proto/v1/AdvisoryService;", "restrictStocksDao", "Lcom/robinhood/models/advisory/dao/RestrictStocksDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ladvisory/proto/v1/AdvisoryService;Lcom/robinhood/models/advisory/dao/RestrictStocksDao;Lcom/robinhood/store/StoreBundle;)V", "getRestrictedStocksEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/advisory/db/portfolio/RestrictedStocksResponse;", "searchRestrictableStocksEndpoint", "Ladvisory/proto/v1/SearchRestrictableStocksRequestDto;", "", "Lcom/robinhood/models/advisory/db/portfolio/RestrictedAsset;", "updateRestrictedStocksEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Ladvisory/proto/v1/UpdateRestrictedStockRequestDto;", "", "getRestrictedStocksQuery", "Lcom/robinhood/android/moria/db/Query;", "streamRestrictedStocks", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "updateRestrictedStocks", "assetId", "isRestricted", "", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchRestrictableStocks", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class RestrictStocksStore extends Store {
    private final AdvisoryService advisoryService;
    private final Endpoint<String, RestrictedStocksResponse> getRestrictedStocksEndpoint;
    private final Query<String, RestrictedStocksResponse> getRestrictedStocksQuery;
    private final RestrictStocksDao restrictStocksDao;
    private final Endpoint<SearchRestrictableStocksRequestDto, List<RestrictedAsset>> searchRestrictableStocksEndpoint;
    private final PostEndpoint<UpdateRestrictedStockRequestDto, Unit> updateRestrictedStocksEndpoint;

    /* compiled from: RestrictStocksStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.advisory.RestrictStocksStore", m3645f = "RestrictStocksStore.kt", m3646l = {86}, m3647m = "searchRestrictableStocks")
    /* renamed from: com.robinhood.store.advisory.RestrictStocksStore$searchRestrictableStocks$1 */
    static final class C413241 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C413241(Continuation<? super C413241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestrictStocksStore.this.searchRestrictableStocks(null, this);
        }
    }

    /* compiled from: RestrictStocksStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.advisory.RestrictStocksStore", m3645f = "RestrictStocksStore.kt", m3646l = {75}, m3647m = "updateRestrictedStocks")
    /* renamed from: com.robinhood.store.advisory.RestrictStocksStore$updateRestrictedStocks$1 */
    static final class C413251 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C413251(Continuation<? super C413251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestrictStocksStore.this.updateRestrictedStocks(null, null, false, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestrictStocksStore(AdvisoryService advisoryService, RestrictStocksDao restrictStocksDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
        Intrinsics.checkNotNullParameter(restrictStocksDao, "restrictStocksDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.advisoryService = advisoryService;
        this.restrictStocksDao = restrictStocksDao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        RestrictStocksStore2 restrictStocksStore2 = new RestrictStocksStore2(restrictStocksDao);
        this.getRestrictedStocksEndpoint = Endpoint.Companion.create$default(companion, new RestrictStocksStore3(this, null), getLogoutKillswitch(), restrictStocksStore2, storeBundle.getClock(), null, 16, null);
        this.searchRestrictableStocksEndpoint = Endpoint.Companion.create$default(companion, new RestrictStocksStore4(this, null), getLogoutKillswitch(), new RestrictStocksStore5(null), storeBundle.getClock(), null, 16, null);
        this.updateRestrictedStocksEndpoint = PostEndpoint.INSTANCE.create(new RestrictStocksStore6(this, null), new RestrictStocksStore7(null));
        this.getRestrictedStocksQuery = Store.create$default(this, Query.INSTANCE, "getRestrictedStocksQuery", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.store.advisory.RestrictStocksStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RestrictStocksStore.getRestrictedStocksQuery$lambda$0(this.f$0, (String) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.advisory.RestrictStocksStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RestrictStocksStore.getRestrictedStocksQuery$lambda$1(this.f$0, (String) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getRestrictedStocksEndpoint$insert(RestrictStocksDao restrictStocksDao, RestrictedStocksResponse restrictedStocksResponse, Continuation continuation) {
        restrictStocksDao.insert((RestrictStocksDao) restrictedStocksResponse);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job getRestrictedStocksQuery$lambda$0(RestrictStocksStore restrictStocksStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return Endpoint.DefaultImpls.refresh$default(restrictStocksStore.getRestrictedStocksEndpoint, accountNumber, true, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getRestrictedStocksQuery$lambda$1(RestrictStocksStore restrictStocksStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return restrictStocksStore.restrictStocksDao.streamRestrictedStocks(accountNumber);
    }

    public final Flow<RestrictedStocksResponse> streamRestrictedStocks(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return this.getRestrictedStocksQuery.asFlow(accountNumber);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateRestrictedStocks(String str, String str2, boolean z, Continuation<? super Unit> continuation) {
        C413251 c413251;
        if (continuation instanceof C413251) {
            c413251 = (C413251) continuation;
            int i = c413251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c413251.label = i - Integer.MIN_VALUE;
            } else {
                c413251 = new C413251(continuation);
            }
        }
        C413251 c4132512 = c413251;
        Object obj = c4132512.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4132512.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            PostEndpoint<UpdateRestrictedStockRequestDto, Unit> postEndpoint = this.updateRestrictedStocksEndpoint;
            UpdateRestrictedStockRequestDto updateRestrictedStockRequestDto = new UpdateRestrictedStockRequestDto(str, str2, z);
            c4132512.L$0 = str;
            c4132512.label = 1;
            if (PostEndpoint.DefaultImpls.post$default(postEndpoint, updateRestrictedStockRequestDto, null, c4132512, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c4132512.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Endpoint.DefaultImpls.refresh$default(this.getRestrictedStocksEndpoint, str, true, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object searchRestrictableStocks(String str, Continuation<? super List<RestrictedAsset>> continuation) {
        C413241 c413241;
        if (continuation instanceof C413241) {
            c413241 = (C413241) continuation;
            int i = c413241.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c413241.label = i - Integer.MIN_VALUE;
            } else {
                c413241 = new C413241(continuation);
            }
        }
        C413241 c4132412 = c413241;
        Object objFetch$default = c4132412.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4132412.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFetch$default);
            Endpoint<SearchRestrictableStocksRequestDto, List<RestrictedAsset>> endpoint = this.searchRestrictableStocksEndpoint;
            SearchRestrictableStocksRequestDto searchRestrictableStocksRequestDto = new SearchRestrictableStocksRequestDto(str, null, 2, null);
            c4132412.label = 1;
            objFetch$default = Endpoint.DefaultImpls.fetch$default(endpoint, searchRestrictableStocksRequestDto, null, c4132412, 2, null);
            if (objFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFetch$default);
        }
        List list = (List) objFetch$default;
        return list == null ? CollectionsKt.emptyList() : list;
    }
}
