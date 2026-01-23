package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.api.ApiRetirement401kRolloverInterstitialResponse;
import com.robinhood.android.models.retirement.api.ApiRetirement401kRolloverSubmitUserInfoRequest;
import com.robinhood.android.models.retirement.api.ApiRetirement401kRolloverSubmitUserInfoResponse;
import com.robinhood.android.models.retirement.api.ApiRetirement401kRolloverUpdateTransactionRequest;
import com.robinhood.android.models.retirement.api.ApiRetirement401kRolloverUpdateTransactionRequest2;
import com.robinhood.android.models.retirement.api.ApiRetirement401kRolloverUserInfoResponse;
import com.robinhood.android.models.retirement.dao.Retirement401kFinderResultsDao;
import com.robinhood.android.models.retirement.dao.Retirement401kRolloverDao;
import com.robinhood.android.models.retirement.p194db.Retirement401kFinderResultsViewmodel;
import com.robinhood.android.models.retirement.p194db.Retirement401kRolloverViewModel;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.QueryKt;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: Retirement401kRolloverStore.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u0013J\u000e\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u0013J\u000e\u0010!\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\"J\"\u0010#\u001a\u0004\u0018\u00010\u001b2\u0006\u0010$\u001a\u00020\u001a2\b\u0010%\u001a\u0004\u0018\u00010\u001aH\u0086@¢\u0006\u0002\u0010&J\u000e\u0010'\u001a\u00020(H\u0086@¢\u0006\u0002\u0010\"J\u0016\u0010)\u001a\u00020*2\u0006\u0010%\u001a\u00020\u001aH\u0086@¢\u0006\u0002\u0010+R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00170\rX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0018\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019\u0012\u0004\u0012\u00020\u001b0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;", "Lcom/robinhood/store/Store;", "retirement401kFinderResultsDao", "Lcom/robinhood/android/models/retirement/dao/Retirement401kFinderResultsDao;", "retirement401kRolloverDao", "Lcom/robinhood/android/models/retirement/dao/Retirement401kRolloverDao;", "retirementApi", "Lcom/robinhood/android/api/retirement/RetirementApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/models/retirement/dao/Retirement401kFinderResultsDao;Lcom/robinhood/android/models/retirement/dao/Retirement401kRolloverDao;Lcom/robinhood/android/api/retirement/RetirementApi;Lcom/robinhood/store/StoreBundle;)V", "retirement401kFinderEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/android/models/retirement/db/Retirement401kFinderResultsViewmodel;", "internalRetirement401kFinderResultsQuery", "Lcom/robinhood/android/moria/db/Query;", "retirement401kRolloverEndpoint", "", "Lcom/robinhood/android/models/retirement/db/Retirement401kRolloverViewModel;", "internalRetirement401kRolloverQuery", "retirement401kRolloverUserInfoEndpoint", "Lcom/robinhood/android/models/retirement/api/ApiRetirement401kRolloverUserInfoResponse;", "retirement401kRolloverInterstitialEndpoint", "Lkotlin/Pair;", "", "Lcom/robinhood/android/models/retirement/api/ApiRetirement401kRolloverInterstitialResponse;", "streamRetirement401kFinderResults", "Lkotlinx/coroutines/flow/Flow;", "retirement401kRolloverQuery", "hidePromo", "forceRefreshRolloverInfo", "get401kRolloverUserInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get401kRolloverInterstitial", "type", "transactionId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submit401kRolloverUserInfo", "Lcom/robinhood/android/models/retirement/api/ApiRetirement401kRolloverSubmitUserInfoResponse;", "updateTransaction", "Lcom/robinhood/android/models/retirement/api/ApiRetirement401kRolloverUpdateTransactionResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class Retirement401kRolloverStore extends Store {
    private final Query<Unit, Retirement401kFinderResultsViewmodel> internalRetirement401kFinderResultsQuery;
    private final Query<Boolean, Retirement401kRolloverViewModel> internalRetirement401kRolloverQuery;
    private final Endpoint<Unit, Retirement401kFinderResultsViewmodel> retirement401kFinderEndpoint;
    private final Retirement401kFinderResultsDao retirement401kFinderResultsDao;
    private final Retirement401kRolloverDao retirement401kRolloverDao;
    private final Endpoint<Boolean, Retirement401kRolloverViewModel> retirement401kRolloverEndpoint;
    private final Endpoint<Tuples2<String, String>, ApiRetirement401kRolloverInterstitialResponse> retirement401kRolloverInterstitialEndpoint;
    private final Endpoint<Unit, ApiRetirement401kRolloverUserInfoResponse> retirement401kRolloverUserInfoEndpoint;
    private final RetirementApi retirementApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Retirement401kRolloverStore(Retirement401kFinderResultsDao retirement401kFinderResultsDao, Retirement401kRolloverDao retirement401kRolloverDao, RetirementApi retirementApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(retirement401kFinderResultsDao, "retirement401kFinderResultsDao");
        Intrinsics.checkNotNullParameter(retirement401kRolloverDao, "retirement401kRolloverDao");
        Intrinsics.checkNotNullParameter(retirementApi, "retirementApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.retirement401kFinderResultsDao = retirement401kFinderResultsDao;
        this.retirement401kRolloverDao = retirement401kRolloverDao;
        this.retirementApi = retirementApi;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        Endpoint<Unit, Retirement401kFinderResultsViewmodel> endpointCreate$default = Endpoint.Companion.create$default(companion, new Retirement401kRolloverStore$retirement401kFinderEndpoint$1(this, null), getLogoutKillswitch(), new Retirement401kRolloverStore$retirement401kFinderEndpoint$2(retirement401kFinderResultsDao), storeBundle.getClock(), null, 16, null);
        this.retirement401kFinderEndpoint = endpointCreate$default;
        Query.Companion companion2 = Query.INSTANCE;
        this.internalRetirement401kFinderResultsQuery = Store.create$default(this, companion2, "retirement401kFinderResultsQuery", CollectionsKt.listOf(new RefreshEach(new C34708x908ff0f4(endpointCreate$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.Retirement401kRolloverStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Retirement401kRolloverStore.internalRetirement401kFinderResultsQuery$lambda$0(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        Endpoint<Boolean, Retirement401kRolloverViewModel> endpointCreate$default2 = Endpoint.Companion.create$default(companion, new Retirement401kRolloverStore$retirement401kRolloverEndpoint$1(this, null), getLogoutKillswitch(), new Retirement401kRolloverStore$retirement401kRolloverEndpoint$2(retirement401kRolloverDao), storeBundle.getClock(), null, 16, null);
        this.retirement401kRolloverEndpoint = endpointCreate$default2;
        this.internalRetirement401kRolloverQuery = Store.create$default(this, companion2, "retirement401kRolloverQuery", CollectionsKt.listOf(new RefreshEach(new C34709xb0e09d35(endpointCreate$default2))), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.Retirement401kRolloverStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Retirement401kRolloverStore.internalRetirement401kRolloverQuery$lambda$3(this.f$0, ((Boolean) obj).booleanValue());
            }
        }, false, 8, null);
        this.retirement401kRolloverUserInfoEndpoint = Endpoint.Companion.create$default(companion, new C34713xb6f0341e(this, null), getLogoutKillswitch(), new C34714xb6f0341f(null), storeBundle.getClock(), null, 16, null);
        this.retirement401kRolloverInterstitialEndpoint = Endpoint.Companion.create$default(companion, new C34710x511e9ef1(this, null), getLogoutKillswitch(), new C34711x511e9ef2(null), storeBundle.getClock(), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object retirement401kFinderEndpoint$insert(Retirement401kFinderResultsDao retirement401kFinderResultsDao, Retirement401kFinderResultsViewmodel retirement401kFinderResultsViewmodel, Continuation continuation) {
        retirement401kFinderResultsDao.insert(retirement401kFinderResultsViewmodel);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow internalRetirement401kFinderResultsQuery$lambda$0(Retirement401kRolloverStore retirement401kRolloverStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return retirement401kRolloverStore.retirement401kFinderResultsDao.get401kFinderResultsViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object retirement401kRolloverEndpoint$insert$1(Retirement401kRolloverDao retirement401kRolloverDao, Retirement401kRolloverViewModel retirement401kRolloverViewModel, Continuation continuation) {
        retirement401kRolloverDao.insert(retirement401kRolloverViewModel);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow internalRetirement401kRolloverQuery$lambda$3(Retirement401kRolloverStore retirement401kRolloverStore, boolean z) {
        return retirement401kRolloverStore.retirement401kRolloverDao.get401kRolloverViewModel();
    }

    public final Flow<Retirement401kFinderResultsViewmodel> streamRetirement401kFinderResults() {
        return QueryKt.deleteAllOnRoomJsonExceptionFlow$default(this.internalRetirement401kFinderResultsQuery, Unit.INSTANCE, new C347151(this.retirement401kFinderResultsDao), false, 4, null);
    }

    /* compiled from: Retirement401kRolloverStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.Retirement401kRolloverStore$streamRetirement401kFinderResults$1 */
    /* synthetic */ class C347151 extends AdaptedFunctionReference implements Function1<Continuation<? super Unit>, Object>, ContinuationImpl6 {
        C347151(Object obj) {
            super(1, obj, Retirement401kFinderResultsDao.class, "deleteAll", "deleteAll()V", 4);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return Retirement401kRolloverStore.streamRetirement401kFinderResults$deleteAll((Retirement401kFinderResultsDao) this.receiver, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object streamRetirement401kFinderResults$deleteAll(Retirement401kFinderResultsDao retirement401kFinderResultsDao, Continuation continuation) {
        retirement401kFinderResultsDao.deleteAll();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Flow retirement401kRolloverQuery$default(Retirement401kRolloverStore retirement401kRolloverStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return retirement401kRolloverStore.retirement401kRolloverQuery(z);
    }

    public final Flow<Retirement401kRolloverViewModel> retirement401kRolloverQuery(boolean hidePromo) {
        return QueryKt.deleteAllOnRoomJsonExceptionFlow$default(this.internalRetirement401kRolloverQuery, Boolean.valueOf(hidePromo), new C347121(this.retirement401kRolloverDao), false, 4, null);
    }

    /* compiled from: Retirement401kRolloverStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.Retirement401kRolloverStore$retirement401kRolloverQuery$1 */
    /* synthetic */ class C347121 extends AdaptedFunctionReference implements Function1<Continuation<? super Unit>, Object>, ContinuationImpl6 {
        C347121(Object obj) {
            super(1, obj, Retirement401kRolloverDao.class, "deleteAll", "deleteAll()V", 4);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return Retirement401kRolloverStore.retirement401kRolloverQuery$deleteAll$4((Retirement401kRolloverDao) this.receiver, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object retirement401kRolloverQuery$deleteAll$4(Retirement401kRolloverDao retirement401kRolloverDao, Continuation continuation) {
        retirement401kRolloverDao.deleteAll();
        return Unit.INSTANCE;
    }

    public final void forceRefreshRolloverInfo(boolean hidePromo) {
        Endpoint.DefaultImpls.refresh$default(this.retirement401kRolloverEndpoint, Boolean.valueOf(hidePromo), true, null, 4, null);
    }

    public final Object get401kRolloverUserInfo(Continuation<? super ApiRetirement401kRolloverUserInfoResponse> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.retirement401kRolloverUserInfoEndpoint, Unit.INSTANCE, null, continuation, 2, null);
    }

    public final Object get401kRolloverInterstitial(String str, String str2, Continuation<? super ApiRetirement401kRolloverInterstitialResponse> continuation) {
        return Endpoint.DefaultImpls.fetch$default(this.retirement401kRolloverInterstitialEndpoint, Tuples4.m3642to(str, str2), null, continuation, 2, null);
    }

    public final Object submit401kRolloverUserInfo(Continuation<? super ApiRetirement401kRolloverSubmitUserInfoResponse> continuation) {
        return this.retirementApi.submit401kRolloverUserInfo(new ApiRetirement401kRolloverSubmitUserInfoRequest(), continuation);
    }

    public final Object updateTransaction(String str, Continuation<? super ApiRetirement401kRolloverUpdateTransactionRequest2> continuation) {
        return this.retirementApi.update401kRolloverTransaction(new ApiRetirement401kRolloverUpdateTransactionRequest(str), continuation);
    }
}
