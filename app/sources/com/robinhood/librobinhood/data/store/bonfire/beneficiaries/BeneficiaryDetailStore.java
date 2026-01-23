package com.robinhood.librobinhood.data.store.bonfire.beneficiaries;

import com.robinhood.android.beneficiaries.api.BeneficiariesApi;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryFlowResponse;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryRequest;
import com.robinhood.android.beneficiaries.models.api.ApiUpdateBeneficiaryRequest;
import com.robinhood.android.beneficiaries.models.dao.BeneficiaryDetailDao;
import com.robinhood.android.beneficiaries.models.p066db.BeneficiaryDetail;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.QueryKt;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* compiled from: BeneficiaryDetailStore.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00192\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u000eJ\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u001d2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0014J\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\u001d2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0017J\u0016\u0010 \u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0004\u0012\u00020\u000f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0010\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0012\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00140\f\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0016\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00170\f\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryDetailStore;", "Lcom/robinhood/store/Store;", "beneficiariesApi", "Lcom/robinhood/android/beneficiaries/api/BeneficiariesApi;", "dao", "Lcom/robinhood/android/beneficiaries/models/dao/BeneficiaryDetailDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/beneficiaries/api/BeneficiariesApi;Lcom/robinhood/android/beneficiaries/models/dao/BeneficiaryDetailDao;Lcom/robinhood/store/StoreBundle;)V", "beneficiaryDetailEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "", "Ljava/util/UUID;", "Lcom/robinhood/android/beneficiaries/models/db/BeneficiaryDetail;", "query", "Lcom/robinhood/android/moria/db/Query;", "createBeneficiaryEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryRequest;", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryFlowResponse;", "updateBeneficiaryEndpoint", "Lcom/robinhood/android/beneficiaries/models/api/ApiUpdateBeneficiaryRequest;", "stream", "Lio/reactivex/Observable;", "accountNumber", "beneficiaryId", "createBeneficiary", "Lio/reactivex/Single;", "request", "updateBeneficiary", "deleteBeneficiary", "Lio/reactivex/Completable;", "lib-store-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class BeneficiaryDetailStore extends Store {
    private final BeneficiariesApi beneficiariesApi;
    private final Endpoint<Tuples2<String, UUID>, BeneficiaryDetail> beneficiaryDetailEndpoint;
    private final PostEndpoint<Tuples2<String, ApiCreateBeneficiaryRequest>, ApiBeneficiaryFlowResponse> createBeneficiaryEndpoint;
    private final BeneficiaryDetailDao dao;
    private final Query<Tuples2<String, UUID>, BeneficiaryDetail> query;
    private final PostEndpoint<Tuples2<String, ApiUpdateBeneficiaryRequest>, ApiBeneficiaryFlowResponse> updateBeneficiaryEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeneficiaryDetailStore(BeneficiariesApi beneficiariesApi, BeneficiaryDetailDao dao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(beneficiariesApi, "beneficiariesApi");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.beneficiariesApi = beneficiariesApi;
        this.dao = dao;
        this.beneficiaryDetailEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new BeneficiaryDetailStore2(this, null), getLogoutKillswitch(), new BeneficiaryDetailStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.query = Store.create$default(this, Query.INSTANCE, "queryBeneficiaryDetail", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryDetailStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryDetailStore.query$lambda$0(this.f$0, (Tuples2) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryDetailStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryDetailStore.query$lambda$1(this.f$0, (Tuples2) obj);
            }
        }, false, 8, null);
        PostEndpoint.Companion companion = PostEndpoint.INSTANCE;
        this.createBeneficiaryEndpoint = companion.create(new BeneficiaryDetailStore4(this, null), new BeneficiaryDetailStore5(null));
        this.updateBeneficiaryEndpoint = companion.create(new BeneficiaryDetailStore7(this, null), new BeneficiaryDetailStore8(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(BeneficiaryDetailStore beneficiaryDetailStore, Tuples2 accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return Endpoint.DefaultImpls.poll$default(beneficiaryDetailStore.beneficiaryDetailEndpoint, accountNumber, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(BeneficiaryDetailStore beneficiaryDetailStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return beneficiaryDetailStore.dao.getBeneficiaryDetail((String) tuples2.component1(), (UUID) tuples2.component2());
    }

    public final Observable<BeneficiaryDetail> stream(String accountNumber, UUID beneficiaryId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        return QueryKt.asObservable(this.query, accountNumber, beneficiaryId);
    }

    /* compiled from: BeneficiaryDetailStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryFlowResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryDetailStore$createBeneficiary$1", m3645f = "BeneficiaryDetailStore.kt", m3646l = {78}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryDetailStore$createBeneficiary$1 */
    static final class C346251 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiBeneficiaryFlowResponse>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ ApiCreateBeneficiaryRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346251(String str, ApiCreateBeneficiaryRequest apiCreateBeneficiaryRequest, Continuation<? super C346251> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$request = apiCreateBeneficiaryRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BeneficiaryDetailStore.this.new C346251(this.$accountNumber, this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiBeneficiaryFlowResponse> continuation) {
            return ((C346251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            PostEndpoint postEndpoint = BeneficiaryDetailStore.this.createBeneficiaryEndpoint;
            Tuples2 tuples2M3642to = Tuples4.m3642to(this.$accountNumber, this.$request);
            this.label = 1;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, tuples2M3642to, null, this, 2, null);
            return objPost$default == coroutine_suspended ? coroutine_suspended : objPost$default;
        }
    }

    public final Single<ApiBeneficiaryFlowResponse> createBeneficiary(String accountNumber, ApiCreateBeneficiaryRequest request) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(request, "request");
        Single<ApiBeneficiaryFlowResponse> singleDoAfterSuccess = RxFactory.DefaultImpls.rxSingle$default(this, null, new C346251(accountNumber, request, null), 1, null).doAfterSuccess(new Consumer() { // from class: com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryDetailStore.createBeneficiary.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiBeneficiaryFlowResponse apiBeneficiaryFlowResponse) {
                Endpoint.DefaultImpls.refresh$default(BeneficiaryDetailStore.this.beneficiaryDetailEndpoint, Tuples4.m3642to(apiBeneficiaryFlowResponse.getAccount_number(), apiBeneficiaryFlowResponse.getBeneficiary_id()), true, null, 4, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoAfterSuccess, "doAfterSuccess(...)");
        return singleDoAfterSuccess;
    }

    /* compiled from: BeneficiaryDetailStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryFlowResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryDetailStore$updateBeneficiary$1", m3645f = "BeneficiaryDetailStore.kt", m3646l = {87}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryDetailStore$updateBeneficiary$1 */
    static final class C346271 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiBeneficiaryFlowResponse>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ ApiUpdateBeneficiaryRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346271(String str, ApiUpdateBeneficiaryRequest apiUpdateBeneficiaryRequest, Continuation<? super C346271> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$request = apiUpdateBeneficiaryRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BeneficiaryDetailStore.this.new C346271(this.$accountNumber, this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiBeneficiaryFlowResponse> continuation) {
            return ((C346271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            PostEndpoint postEndpoint = BeneficiaryDetailStore.this.updateBeneficiaryEndpoint;
            Tuples2 tuples2M3642to = Tuples4.m3642to(this.$accountNumber, this.$request);
            this.label = 1;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, tuples2M3642to, null, this, 2, null);
            return objPost$default == coroutine_suspended ? coroutine_suspended : objPost$default;
        }
    }

    public final Single<ApiBeneficiaryFlowResponse> updateBeneficiary(String accountNumber, ApiUpdateBeneficiaryRequest request) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(request, "request");
        Single<ApiBeneficiaryFlowResponse> singleDoAfterSuccess = RxFactory.DefaultImpls.rxSingle$default(this, null, new C346271(accountNumber, request, null), 1, null).doAfterSuccess(new Consumer() { // from class: com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryDetailStore.updateBeneficiary.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiBeneficiaryFlowResponse apiBeneficiaryFlowResponse) {
                Endpoint.DefaultImpls.refresh$default(BeneficiaryDetailStore.this.beneficiaryDetailEndpoint, Tuples4.m3642to(apiBeneficiaryFlowResponse.getAccount_number(), apiBeneficiaryFlowResponse.getBeneficiary_id()), true, null, 4, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoAfterSuccess, "doAfterSuccess(...)");
        return singleDoAfterSuccess;
    }

    public final Completable deleteBeneficiary(final String accountNumber, final UUID beneficiaryId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        Completable completableCache = RxFactory.DefaultImpls.rxCompletable$default(this, null, new BeneficiaryDetailStore6(this, accountNumber, beneficiaryId, null), 1, null).cache();
        Intrinsics.checkNotNull(completableCache);
        ScopedSubscriptionKt.subscribeIn(completableCache, getStoreScope(), (Function0<Unit>) new Function0() { // from class: com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryDetailStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BeneficiaryDetailStore.deleteBeneficiary$lambda$2(this.f$0, accountNumber, beneficiaryId);
            }
        }, (Function1<? super Throwable, Unit>) new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryDetailStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryDetailStore.deleteBeneficiary$lambda$3((Throwable) obj);
            }
        });
        return completableCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteBeneficiary$lambda$2(BeneficiaryDetailStore beneficiaryDetailStore, String str, UUID uuid) {
        beneficiaryDetailStore.dao.deleteBeneficiaryDetail(str, uuid);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteBeneficiary$lambda$3(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
