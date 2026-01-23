package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.education.EducationApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.shared.models.api.bonfire.education.EducationUserProgressRequest;
import com.robinhood.shared.models.dao.EducationUserProgressDao;
import com.robinhood.shared.models.p387db.bonfire.education.EducationUserProgress;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.Completables;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EducationUserProgressStore.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J2\u0010\u0014\u001a\u00020\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ4\u0010\u001d\u001a\u00020\r2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u001f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001f0!2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/EducationUserProgressStore;", "Lcom/robinhood/store/Store;", "educationApi", "Lcom/robinhood/android/api/education/EducationApi;", "userProgressDao", "Lcom/robinhood/shared/models/dao/EducationUserProgressDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/education/EducationApi;Lcom/robinhood/shared/models/dao/EducationUserProgressDao;Lcom/robinhood/store/StoreBundle;)V", "postUserProgress", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/shared/models/api/bonfire/education/EducationUserProgressRequest;", "", "userProgressEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationUserProgressParams;", "Lio/reactivex/Completable;", "userProgress", "Lcom/robinhood/shared/models/db/bonfire/education/EducationUserProgress;", "refreshUserProgress", "trackingId", "", "statusType", "Lcom/robinhood/shared/models/db/bonfire/education/EducationUserProgress$StatusType;", "contentType", "Lcom/robinhood/shared/models/db/bonfire/education/EducationUserProgress$ContentType;", "force", "", "refreshUserProgressByTrackingIds", "trackingIds", "", "streamUserProgressByTrackingIds", "Lio/reactivex/Observable;", "lib-store-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class EducationUserProgressStore extends Store {
    private final EducationApi educationApi;
    private final PostEndpoint<EducationUserProgressRequest, Unit> postUserProgress;
    private final EducationUserProgressDao userProgressDao;
    private final Endpoint<EducationUserProgressParams, EducationUserProgressRequest> userProgressEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationUserProgressStore(EducationApi educationApi, EducationUserProgressDao userProgressDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(educationApi, "educationApi");
        Intrinsics.checkNotNullParameter(userProgressDao, "userProgressDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.educationApi = educationApi;
        this.userProgressDao = userProgressDao;
        this.postUserProgress = PostEndpoint.INSTANCE.create(new C345021(educationApi), new C345032(null));
        this.userProgressEndpoint = Endpoint.INSTANCE.create(new EducationUserProgressStore3(this, null), getLogoutKillswitch(), new EducationUserProgressStore4(this, null), storeBundle.getClock(), new DefaultStaleDecider(Durations.INSTANCE.getONE_DAY(), storeBundle.getClock()));
    }

    /* compiled from: EducationUserProgressStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.EducationUserProgressStore$postUserProgress$1 */
    /* synthetic */ class C345021 extends FunctionReferenceImpl implements Function2<EducationUserProgressRequest, Continuation<? super Unit>, Object>, ContinuationImpl6 {
        C345021(Object obj) {
            super(2, obj, EducationApi.class, "updateEducationUserProgress", "updateEducationUserProgress(Lcom/robinhood/shared/models/api/bonfire/education/EducationUserProgressRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EducationUserProgressRequest educationUserProgressRequest, Continuation<? super Unit> continuation) {
            return ((EducationApi) this.receiver).updateEducationUserProgress(educationUserProgressRequest, continuation);
        }
    }

    /* compiled from: EducationUserProgressStore.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.EducationUserProgressStore$postUserProgress$2", m3645f = "EducationUserProgressStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.EducationUserProgressStore$postUserProgress$2 */
    static final class C345032 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        C345032(Continuation<? super C345032> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C345032(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((C345032) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
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

    /* compiled from: EducationUserProgressStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.EducationUserProgressStore$postUserProgress$3", m3645f = "EducationUserProgressStore.kt", m3646l = {48}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.EducationUserProgressStore$postUserProgress$3 */
    static final class C345043 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ EducationUserProgress $userProgress;
        int label;
        final /* synthetic */ EducationUserProgressStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C345043(EducationUserProgress educationUserProgress, EducationUserProgressStore educationUserProgressStore, Continuation<? super C345043> continuation) {
            super(2, continuation);
            this.$userProgress = educationUserProgress;
            this.this$0 = educationUserProgressStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C345043(this.$userProgress, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C345043) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EducationUserProgressRequest educationUserProgressRequest = new EducationUserProgressRequest(CollectionsKt.listOf(this.$userProgress));
                PostEndpoint postEndpoint = this.this$0.postUserProgress;
                this.label = 1;
                if (PostEndpoint.DefaultImpls.post$default(postEndpoint, educationUserProgressRequest, null, this, 2, null) == coroutine_suspended) {
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

    public final Completable postUserProgress(final EducationUserProgress userProgress) {
        Intrinsics.checkNotNullParameter(userProgress, "userProgress");
        Completable completableDoOnComplete = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C345043(userProgress, this, null), 1, null).subscribeOn(Schedulers.m3346io()).onErrorComplete(new Predicate() { // from class: com.robinhood.librobinhood.data.store.bonfire.EducationUserProgressStore.postUserProgress.4
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Throwables.isNetworkRelated(it);
            }
        }).doOnComplete(new Action() { // from class: com.robinhood.librobinhood.data.store.bonfire.EducationUserProgressStore.postUserProgress.5
            @Override // io.reactivex.functions.Action
            public final void run() {
                EducationUserProgressStore.this.refreshUserProgress(userProgress.getTrackingId(), userProgress.getStatusType(), userProgress.getContentType(), true);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableDoOnComplete, "doOnComplete(...)");
        return completableDoOnComplete;
    }

    public static /* synthetic */ void refreshUserProgress$default(EducationUserProgressStore educationUserProgressStore, String str, EducationUserProgress.StatusType statusType, EducationUserProgress.ContentType contentType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            statusType = null;
        }
        if ((i & 4) != 0) {
            contentType = null;
        }
        educationUserProgressStore.refreshUserProgress(str, statusType, contentType, z);
    }

    public final void refreshUserProgress(String trackingId, EducationUserProgress.StatusType statusType, EducationUserProgress.ContentType contentType, boolean force) {
        Completable completableRxCompletable$default;
        EducationUserProgressParams educationUserProgressParams = new EducationUserProgressParams(trackingId, statusType != null ? Integer.valueOf(statusType.getServerValue()) : null, contentType != null ? Integer.valueOf(contentType.getServerValue()) : null);
        if (force) {
            completableRxCompletable$default = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C345071(educationUserProgressParams, null), 1, null);
        } else {
            completableRxCompletable$default = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C345082(educationUserProgressParams, null), 1, null);
        }
        ScopedSubscriptionKt.subscribeIn(Completables.ignoreNetworkExceptions(completableRxCompletable$default), getStoreScope());
    }

    /* compiled from: EducationUserProgressStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.EducationUserProgressStore$refreshUserProgress$1", m3645f = "EducationUserProgressStore.kt", m3646l = {73}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.EducationUserProgressStore$refreshUserProgress$1 */
    static final class C345071 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ EducationUserProgressParams $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C345071(EducationUserProgressParams educationUserProgressParams, Continuation<? super C345071> continuation) {
            super(2, continuation);
            this.$params = educationUserProgressParams;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EducationUserProgressStore.this.new C345071(this.$params, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C345071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = EducationUserProgressStore.this.userProgressEndpoint;
                EducationUserProgressParams educationUserProgressParams = this.$params;
                this.label = 1;
                if (Endpoint.DefaultImpls.forceFetch$default(endpoint, educationUserProgressParams, null, this, 2, null) == coroutine_suspended) {
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

    /* compiled from: EducationUserProgressStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.EducationUserProgressStore$refreshUserProgress$2", m3645f = "EducationUserProgressStore.kt", m3646l = {75}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.EducationUserProgressStore$refreshUserProgress$2 */
    static final class C345082 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ EducationUserProgressParams $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C345082(EducationUserProgressParams educationUserProgressParams, Continuation<? super C345082> continuation) {
            super(2, continuation);
            this.$params = educationUserProgressParams;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EducationUserProgressStore.this.new C345082(this.$params, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C345082) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = EducationUserProgressStore.this.userProgressEndpoint;
                EducationUserProgressParams educationUserProgressParams = this.$params;
                this.label = 1;
                if (Endpoint.DefaultImpls.fetch$default(endpoint, educationUserProgressParams, null, this, 2, null) == coroutine_suspended) {
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

    public static /* synthetic */ void refreshUserProgressByTrackingIds$default(EducationUserProgressStore educationUserProgressStore, List list, EducationUserProgress.StatusType statusType, EducationUserProgress.ContentType contentType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            statusType = null;
        }
        if ((i & 4) != 0) {
            contentType = null;
        }
        educationUserProgressStore.refreshUserProgressByTrackingIds(list, statusType, contentType, z);
    }

    public final void refreshUserProgressByTrackingIds(List<String> trackingIds, EducationUserProgress.StatusType statusType, EducationUserProgress.ContentType contentType, boolean force) {
        Intrinsics.checkNotNullParameter(trackingIds, "trackingIds");
        Iterator<T> it = trackingIds.iterator();
        while (it.hasNext()) {
            refreshUserProgress((String) it.next(), statusType, contentType, force);
        }
    }

    public final Observable<List<EducationUserProgress>> streamUserProgressByTrackingIds(List<String> trackingIds) {
        Intrinsics.checkNotNullParameter(trackingIds, "trackingIds");
        return asObservable(takeWhileLoggedIn(this.userProgressDao.getByTrackingIds(trackingIds)));
    }
}
