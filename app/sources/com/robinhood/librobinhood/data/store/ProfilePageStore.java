package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.coroutines.RetryOnError;
import com.robinhood.models.api.ApiProfilePage;
import com.robinhood.models.dao.ProfilePageDao;
import com.robinhood.models.p320db.ProfilePage;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.Throwables;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: ProfilePageStore.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fJ\u0016\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/ProfilePageStore;", "Lcom/robinhood/store/Store;", "brokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/ProfilePageDao;", "<init>", "(Lcom/robinhood/api/retrofit/Brokeback;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/ProfilePageDao;)V", "profilePageEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/ApiProfilePage;", "streamProfilePage", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/ProfilePage;", "refreshProfilePage", "force", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class ProfilePageStore extends Store {
    private final ProfilePageDao dao;
    private final Endpoint<Unit, ApiProfilePage> profilePageEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePageStore(Brokeback brokeback, StoreBundle storeBundle, ProfilePageDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.dao = dao;
        this.profilePageEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new ProfilePageStore2(brokeback, null), getLogoutKillswitch(), new ProfilePageStore3(this, null), storeBundle.getClock(), null, 16, null);
    }

    public final Flow<ProfilePage> streamProfilePage() {
        final Flow<List<ProfilePage>> flow = this.dao.get();
        return new Flow<ProfilePage>() { // from class: com.robinhood.librobinhood.data.store.ProfilePageStore$streamProfilePage$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.ProfilePageStore$streamProfilePage$$inlined$map$1$2 */
            public static final class C342602<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ProfilePageStore$streamProfilePage$$inlined$map$1$2", m3645f = "ProfilePageStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.ProfilePageStore$streamProfilePage$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C342602.this.emit(null, this);
                    }
                }

                public C342602(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
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
                        Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(objFirstOrNull, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
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

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super ProfilePage> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C342602(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Object refreshProfilePage(boolean z, Continuation<? super Unit> continuation) {
        Object objRetryExponential = RetryOnError.retryExponential(3, new Function1() { // from class: com.robinhood.librobinhood.data.store.ProfilePageStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ProfilePageStore.refreshProfilePage$lambda$1((Throwable) obj));
            }
        }, new C342613(z, this, null), continuation);
        return objRetryExponential == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRetryExponential : Unit.INSTANCE;
    }

    /* compiled from: ProfilePageStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiProfilePage;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ProfilePageStore$refreshProfilePage$3", m3645f = "ProfilePageStore.kt", m3646l = {41, 43}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.ProfilePageStore$refreshProfilePage$3 */
    static final class C342613 extends ContinuationImpl7 implements Function1<Continuation<? super ApiProfilePage>, Object> {
        final /* synthetic */ boolean $force;
        int label;
        final /* synthetic */ ProfilePageStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C342613(boolean z, ProfilePageStore profilePageStore, Continuation<? super C342613> continuation) {
            super(1, continuation);
            this.$force = z;
            this.this$0 = profilePageStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C342613(this.$force, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super ApiProfilePage> continuation) {
            return ((C342613) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        
            if (r5 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
        
            if (r5 == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return (ApiProfilePage) obj;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return (ApiProfilePage) obj;
            }
            ResultKt.throwOnFailure(obj);
            if (this.$force) {
                Endpoint endpoint = this.this$0.profilePageEndpoint;
                this.label = 1;
                obj = Endpoint8.forceFetch$default(endpoint, null, this, 1, null);
            } else {
                Endpoint endpoint2 = this.this$0.profilePageEndpoint;
                this.label = 2;
                obj = Endpoint8.fetch$default(endpoint2, null, this, 1, null);
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean refreshProfilePage$lambda$1(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Throwables.isNetworkRelated(it);
    }
}
