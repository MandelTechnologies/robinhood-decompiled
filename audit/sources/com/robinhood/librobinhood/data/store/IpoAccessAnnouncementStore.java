package com.robinhood.librobinhood.data.store;

import com.robinhood.android.lib.api.directipo.DirectIpoApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.dao.bonfire.IpoAccessAnnouncementDao;
import com.robinhood.models.p320db.bonfire.IpoAccessAnnouncement;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Completable;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: IpoAccessAnnouncementStore.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\fJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/IpoAccessAnnouncementStore;", "Lcom/robinhood/store/Store;", "api", "Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/bonfire/IpoAccessAnnouncementDao;", "<init>", "(Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/bonfire/IpoAccessAnnouncementDao;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/models/db/bonfire/IpoAccessAnnouncement;", "streamIpoAccessAnnouncement", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "instrumentId", "refreshIpoAnnouncement", "Lio/reactivex/Completable;", "force", "", "lib-store-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class IpoAccessAnnouncementStore extends Store {
    private final DirectIpoApi api;
    private final IpoAccessAnnouncementDao dao;
    private final Endpoint<UUID, IpoAccessAnnouncement> endpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IpoAccessAnnouncementStore(DirectIpoApi api, StoreBundle storeBundle, IpoAccessAnnouncementDao dao) {
        super(storeBundle, IpoAccessAnnouncement.INSTANCE);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.api = api;
        this.dao = dao;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new IpoAccessAnnouncementStore2(this, null), getLogoutKillswitch(), new IpoAccessAnnouncementStore3(this, null), storeBundle.getClock(), null, 16, null);
    }

    public final Observable<Optional<IpoAccessAnnouncement>> streamIpoAccessAnnouncement(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return ObservablesKt.mapFirstOptional(asObservable(takeWhileLoggedIn(this.dao.getIpoAnnouncement(instrumentId))));
    }

    /* compiled from: IpoAccessAnnouncementStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.IpoAccessAnnouncementStore$refreshIpoAnnouncement$1", m3645f = "IpoAccessAnnouncementStore.kt", m3646l = {42}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.IpoAccessAnnouncementStore$refreshIpoAnnouncement$1 */
    static final class C339141 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $instrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C339141(UUID uuid, Continuation<? super C339141> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IpoAccessAnnouncementStore.this.new C339141(this.$instrumentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C339141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = IpoAccessAnnouncementStore.this.endpoint;
                UUID uuid = this.$instrumentId;
                this.label = 1;
                if (Endpoint.DefaultImpls.forceFetch$default(endpoint, uuid, null, this, 2, null) == coroutine_suspended) {
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

    public final Completable refreshIpoAnnouncement(boolean force, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        if (force) {
            return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C339141(instrumentId, null), 1, null);
        }
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C339152(instrumentId, null), 1, null);
    }

    /* compiled from: IpoAccessAnnouncementStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.IpoAccessAnnouncementStore$refreshIpoAnnouncement$2", m3645f = "IpoAccessAnnouncementStore.kt", m3646l = {44}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.IpoAccessAnnouncementStore$refreshIpoAnnouncement$2 */
    static final class C339152 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $instrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C339152(UUID uuid, Continuation<? super C339152> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IpoAccessAnnouncementStore.this.new C339152(this.$instrumentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C339152) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = IpoAccessAnnouncementStore.this.endpoint;
                UUID uuid = this.$instrumentId;
                this.label = 1;
                if (Endpoint.DefaultImpls.fetch$default(endpoint, uuid, null, this, 2, null) == coroutine_suspended) {
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
}
