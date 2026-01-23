package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.api.dashboard.ApiRetirementDashboardState;
import com.robinhood.android.models.retirement.dao.RetirementDashboardStateDao;
import com.robinhood.android.models.retirement.p194db.RetirementDashboardState;
import com.robinhood.android.models.retirement.p194db.RetirementDashboardState2;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.QueryKt;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RetirementDashboardStateStore.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013J\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0015R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementDashboardStateStore;", "Lcom/robinhood/store/Store;", "retirementApi", "Lcom/robinhood/android/api/retirement/RetirementApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "retirementDashboardStateDao", "Lcom/robinhood/android/models/retirement/dao/RetirementDashboardStateDao;", "<init>", "(Lcom/robinhood/android/api/retirement/RetirementApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/android/models/retirement/dao/RetirementDashboardStateDao;)V", "retirementDashboardStateEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/android/models/retirement/api/dashboard/ApiRetirementDashboardState;", "retirementDashboardQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/models/retirement/db/RetirementDashboardState;", "forceFetchRetirementDashboardState", "Lio/reactivex/Single;", "streamRetirementDashboardState", "Lio/reactivex/Observable;", "lib-store-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RetirementDashboardStateStore extends Store {
    private final Query<Unit, Optional<RetirementDashboardState>> retirementDashboardQuery;
    private final Endpoint<Unit, ApiRetirementDashboardState> retirementDashboardStateEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetirementDashboardStateStore(RetirementApi retirementApi, StoreBundle storeBundle, final RetirementDashboardStateDao retirementDashboardStateDao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(retirementApi, "retirementApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(retirementDashboardStateDao, "retirementDashboardStateDao");
        this.retirementDashboardStateEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new RetirementDashboardStateStore2(retirementApi, null), getLogoutKillswitch(), new RetirementDashboardStateStore3(retirementDashboardStateDao, null), storeBundle.getClock(), null, 16, null);
        this.retirementDashboardQuery = Store.createOptional$default(this, Query.INSTANCE, "streamRetirementDashboardState", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementDashboardStateStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementDashboardStateStore.retirementDashboardQuery$lambda$0(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementDashboardStateStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementDashboardStateStore.retirementDashboardQuery$lambda$1(retirementDashboardStateDao, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow retirementDashboardQuery$lambda$0(RetirementDashboardStateStore retirementDashboardStateStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(retirementDashboardStateStore.retirementDashboardStateEndpoint, Unit.INSTANCE, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow retirementDashboardQuery$lambda$1(RetirementDashboardStateDao retirementDashboardStateDao, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return retirementDashboardStateDao.getRetirementDashboardState();
    }

    /* compiled from: RetirementDashboardStateStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/retirement/db/RetirementDashboardState;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementDashboardStateStore$forceFetchRetirementDashboardState$1", m3645f = "RetirementDashboardStateStore.kt", m3646l = {52}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementDashboardStateStore$forceFetchRetirementDashboardState$1 */
    static final class C347241 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super RetirementDashboardState>, Object> {
        int label;

        C347241(Continuation<? super C347241> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RetirementDashboardStateStore.this.new C347241(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RetirementDashboardState> continuation) {
            return ((C347241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = RetirementDashboardStateStore.this.retirementDashboardStateEndpoint;
                Unit unit = Unit.INSTANCE;
                this.label = 1;
                obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return RetirementDashboardState2.toDbModel((ApiRetirementDashboardState) obj);
        }
    }

    public final Single<RetirementDashboardState> forceFetchRetirementDashboardState() {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C347241(null), 1, null);
    }

    public final Observable<Optional<RetirementDashboardState>> streamRetirementDashboardState() {
        return QueryKt.asObservable(this.retirementDashboardQuery);
    }
}
