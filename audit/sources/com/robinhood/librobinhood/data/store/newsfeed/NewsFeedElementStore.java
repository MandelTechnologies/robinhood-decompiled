package com.robinhood.librobinhood.data.store.newsfeed;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.retrofit.DoraApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.newsfeed.api.ApiNewsFeedElement;
import com.robinhood.models.newsfeed.p334db.NewsFeedLocation;
import com.robinhood.models.newsfeed.p334db.dao.NewsFeedElement;
import com.robinhood.models.newsfeed.p334db.dao.NewsFeedElementDao;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Completable;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NewsFeedElementStore.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00182\u0006\u0010\u001b\u001a\u00020\fJ\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00182\u0006\u0010\u001d\u001a\u00020\u001eJ\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u001b\u001a\u00020\fJ \u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R8\u0010\n\u001a*\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R \u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u0015\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedElementStore;", "Lcom/robinhood/store/Store;", "doraApi", "Lcom/robinhood/api/retrofit/DoraApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/newsfeed/db/dao/NewsFeedElementDao;", "<init>", "(Lcom/robinhood/api/retrofit/DoraApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/newsfeed/db/dao/NewsFeedElementDao;)V", "defaultSaveElementsAction", "Lkotlin/Function3;", "", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/newsfeed/api/ApiNewsFeedElement;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/jvm/functions/Function3;", "getFeedByLocationEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "getFeedByTypeAndLocationEndpoint", "Lkotlin/Pair;", "streamNewsFeedElements", "Lio/reactivex/Observable;", "", "Lcom/robinhood/models/newsfeed/db/dao/NewsFeedElement;", "location", "streamNewsFeedElementsByFeedType", "feedType", "Lcom/robinhood/models/newsfeed/db/NewsFeedLocation;", "refresh", "Lio/reactivex/Completable;", "force", "", "lib-store-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class NewsFeedElementStore extends Store {
    private final NewsFeedElementDao dao;
    private final Function3<String, PaginatedResult<ApiNewsFeedElement>, Continuation<? super Unit>, Object> defaultSaveElementsAction;
    private final DoraApi doraApi;
    private final Endpoint<String, PaginatedResult<ApiNewsFeedElement>> getFeedByLocationEndpoint;
    private final Endpoint<Tuples2<String, String>, PaginatedResult<ApiNewsFeedElement>> getFeedByTypeAndLocationEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsFeedElementStore(DoraApi doraApi, StoreBundle storeBundle, NewsFeedElementDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(doraApi, "doraApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.doraApi = doraApi;
        this.dao = dao;
        NewsFeedElementStore2 newsFeedElementStore2 = new NewsFeedElementStore2(this, null);
        this.defaultSaveElementsAction = newsFeedElementStore2;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.getFeedByLocationEndpoint = Endpoint.Companion.createWithParams$default(companion, new NewsFeedElementStore3(this, null), getLogoutKillswitch(), newsFeedElementStore2, storeBundle.getClock(), null, 16, null);
        this.getFeedByTypeAndLocationEndpoint = Endpoint.Companion.createWithParams$default(companion, new NewsFeedElementStore4(this, null), getLogoutKillswitch(), new NewsFeedElementStore5(this, null), storeBundle.getClock(), null, 16, null);
    }

    public final Observable<List<NewsFeedElement>> streamNewsFeedElements(String location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return asObservable(takeWhileLoggedIn(this.dao.getByLocation(location)));
    }

    public final Observable<List<NewsFeedElement>> streamNewsFeedElementsByFeedType(NewsFeedLocation feedType) {
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        return asObservable(takeWhileLoggedIn(this.dao.getByFeedType(feedType)));
    }

    /* compiled from: NewsFeedElementStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.newsfeed.NewsFeedElementStore$refresh$1", m3645f = "NewsFeedElementStore.kt", m3646l = {62, 64}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.newsfeed.NewsFeedElementStore$refresh$1 */
    static final class C348601 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $force;
        final /* synthetic */ String $location;
        int label;
        final /* synthetic */ NewsFeedElementStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C348601(boolean z, NewsFeedElementStore newsFeedElementStore, String str, Continuation<? super C348601> continuation) {
            super(2, continuation);
            this.$force = z;
            this.this$0 = newsFeedElementStore;
            this.$location = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C348601(this.$force, this.this$0, this.$location, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C348601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        
            if (r11 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        
            if (r11 == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$force) {
                    Endpoint endpoint = this.this$0.getFeedByLocationEndpoint;
                    String str = this.$location;
                    this.label = 1;
                    obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, str, null, this, 2, null);
                } else {
                    Endpoint endpoint2 = this.this$0.getFeedByLocationEndpoint;
                    String str2 = this.$location;
                    this.label = 2;
                    obj = Endpoint.DefaultImpls.fetch$default(endpoint2, str2, null, this, 2, null);
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Completable refresh$default(NewsFeedElementStore newsFeedElementStore, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return newsFeedElementStore.refresh(z, str);
    }

    public final Completable refresh(boolean force, String location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C348601(force, this, location, null), 1, null);
    }

    /* compiled from: NewsFeedElementStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.newsfeed.NewsFeedElementStore$refresh$2", m3645f = "NewsFeedElementStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE, 74}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.newsfeed.NewsFeedElementStore$refresh$2 */
    static final class C348612 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $feedType;
        final /* synthetic */ boolean $force;
        final /* synthetic */ String $location;
        int label;
        final /* synthetic */ NewsFeedElementStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C348612(boolean z, NewsFeedElementStore newsFeedElementStore, String str, String str2, Continuation<? super C348612> continuation) {
            super(2, continuation);
            this.$force = z;
            this.this$0 = newsFeedElementStore;
            this.$feedType = str;
            this.$location = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C348612(this.$force, this.this$0, this.$feedType, this.$location, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C348612) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        
            if (r11 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
        
            if (r11 == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$force) {
                    Endpoint endpoint = this.this$0.getFeedByTypeAndLocationEndpoint;
                    Tuples2 tuples2 = new Tuples2(this.$feedType, this.$location);
                    this.label = 1;
                    obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, tuples2, null, this, 2, null);
                } else {
                    Endpoint endpoint2 = this.this$0.getFeedByTypeAndLocationEndpoint;
                    Tuples2 tuples22 = new Tuples2(this.$feedType, this.$location);
                    this.label = 2;
                    obj = Endpoint.DefaultImpls.fetch$default(endpoint2, tuples22, null, this, 2, null);
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Completable refresh$default(NewsFeedElementStore newsFeedElementStore, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return newsFeedElementStore.refresh(z, str, str2);
    }

    public final Completable refresh(boolean force, String location, String feedType) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C348612(force, this, feedType, location, null), 1, null);
    }
}
