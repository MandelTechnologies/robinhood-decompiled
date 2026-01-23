package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.rating.RatingsApi;
import com.robinhood.models.api.ApiAnalystOverview;
import com.robinhood.models.dao.AnalystOverviewDao;
import com.robinhood.models.p320db.AnalystOverview;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AnalystOverviewStore.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AnalystOverviewStore;", "Lcom/robinhood/store/Store;", "ratingsApi", "Lcom/robinhood/android/api/rating/RatingsApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/AnalystOverviewDao;", "<init>", "(Lcom/robinhood/android/api/rating/RatingsApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/AnalystOverviewDao;)V", "streamAnalystOverview", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/AnalystOverview;", "instrumentId", "Ljava/util/UUID;", "refresh", "", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class AnalystOverviewStore extends Store {
    private final AnalystOverviewDao dao;
    private final RatingsApi ratingsApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalystOverviewStore(RatingsApi ratingsApi, StoreBundle storeBundle, AnalystOverviewDao dao) {
        super(storeBundle, AnalystOverview.INSTANCE);
        Intrinsics.checkNotNullParameter(ratingsApi, "ratingsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.ratingsApi = ratingsApi;
        this.dao = dao;
    }

    public final Observable<AnalystOverview> streamAnalystOverview(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.getAnalystOverview(instrumentId))));
    }

    /* compiled from: AnalystOverviewStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AnalystOverviewStore$refresh$1", m3645f = "AnalystOverviewStore.kt", m3646l = {28}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.AnalystOverviewStore$refresh$1 */
    static final class C335991 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $instrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C335991(UUID uuid, Continuation<? super C335991> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AnalystOverviewStore.this.new C335991(this.$instrumentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C335991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RatingsApi ratingsApi = AnalystOverviewStore.this.ratingsApi;
                UUID uuid = this.$instrumentId;
                this.label = 1;
                obj = ratingsApi.getAnalystOverview(uuid, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AnalystOverviewStore.this.dao.insertApi((ApiAnalystOverview) obj);
            return Unit.INSTANCE;
        }
    }

    public final void refresh(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C335991(instrumentId, null), 3, null);
    }
}
