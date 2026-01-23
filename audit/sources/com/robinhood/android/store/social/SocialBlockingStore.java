package com.robinhood.android.store.social;

import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.social.SocialBonfireApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.bonfire.ApiSocialBlockUserRequest;
import com.robinhood.models.api.bonfire.ApiSocialBlockedUser;
import com.robinhood.models.api.bonfire.ApiSocialBlockingResponse;
import com.robinhood.models.social.p351ui.SocialBlockedUser;
import com.robinhood.models.social.p351ui.SocialBlockedUser2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: SocialBlockingStore.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/store/social/SocialBlockingStore;", "Lcom/robinhood/store/Store;", "bonfire", "Lcom/robinhood/api/social/SocialBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/social/SocialBonfireApi;Lcom/robinhood/store/StoreBundle;)V", "getBlockedUsers", "Lcom/robinhood/api/PaginatedEndpoint;", "", "Lcom/robinhood/models/api/bonfire/ApiSocialBlockedUser;", "streamBlockedUsers", "Lio/reactivex/Observable;", "", "Lcom/robinhood/models/social/ui/SocialBlockedUser;", "unblockUser", "Lio/reactivex/Single;", "Lcom/robinhood/models/api/bonfire/ApiSocialBlockingResponse;", "relationshipId", "Ljava/util/UUID;", "block", "userId", "", "lib-store-social_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SocialBlockingStore extends Store {
    private final SocialBonfireApi bonfire;
    private final PaginatedEndpoint<Unit, ApiSocialBlockedUser> getBlockedUsers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialBlockingStore(SocialBonfireApi bonfire2, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(bonfire2, "bonfire");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.bonfire = bonfire2;
        this.getBlockedUsers = PaginatedEndpoint.Companion.create$default(PaginatedEndpoint.INSTANCE, new SocialBlockingStore2(this, null), getLogoutKillswitch(), new SocialBlockingStore3(null), storeBundle.getClock(), null, 16, null);
    }

    public final Observable<List<SocialBlockedUser>> streamBlockedUsers() {
        final Flow<PaginatedResult<ApiSocialBlockedUser>> flowForceFetchAllPages = this.getBlockedUsers.forceFetchAllPages(Unit.INSTANCE);
        return asObservable(new Flow<List<? extends SocialBlockedUser>>() { // from class: com.robinhood.android.store.social.SocialBlockingStore$streamBlockedUsers$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.store.social.SocialBlockingStore$streamBlockedUsers$$inlined$map$1$2 */
            public static final class C287732<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.store.social.SocialBlockingStore$streamBlockedUsers$$inlined$map$1$2", m3645f = "SocialBlockingStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.store.social.SocialBlockingStore$streamBlockedUsers$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C287732.this.emit(null, this);
                    }
                }

                public C287732(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

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
                        List<T> results = ((PaginatedResult) obj).getResults();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
                        Iterator<T> it = results.iterator();
                        while (it.hasNext()) {
                            arrayList.add(SocialBlockedUser2.toUiModel((ApiSocialBlockedUser) it.next()));
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super List<? extends SocialBlockedUser>> flowCollector, Continuation continuation) {
                Object objCollect = flowForceFetchAllPages.collect(new C287732(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    /* compiled from: SocialBlockingStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiSocialBlockingResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.store.social.SocialBlockingStore$unblockUser$1", m3645f = "SocialBlockingStore.kt", m3646l = {44}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.store.social.SocialBlockingStore$unblockUser$1 */
    static final class C287751 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiSocialBlockingResponse>, Object> {
        final /* synthetic */ UUID $relationshipId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C287751(UUID uuid, Continuation<? super C287751> continuation) {
            super(2, continuation);
            this.$relationshipId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SocialBlockingStore.this.new C287751(this.$relationshipId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiSocialBlockingResponse> continuation) {
            return ((C287751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            SocialBonfireApi socialBonfireApi = SocialBlockingStore.this.bonfire;
            UUID uuid = this.$relationshipId;
            this.label = 1;
            Object objUnblockUser = socialBonfireApi.unblockUser(uuid, this);
            return objUnblockUser == coroutine_suspended ? coroutine_suspended : objUnblockUser;
        }
    }

    public final Single<ApiSocialBlockingResponse> unblockUser(UUID relationshipId) {
        Intrinsics.checkNotNullParameter(relationshipId, "relationshipId");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C287751(relationshipId, null), 1, null);
    }

    /* compiled from: SocialBlockingStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiSocialBlockingResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.store.social.SocialBlockingStore$block$1", m3645f = "SocialBlockingStore.kt", m3646l = {48}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.store.social.SocialBlockingStore$block$1 */
    static final class C287741 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiSocialBlockingResponse>, Object> {
        final /* synthetic */ String $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C287741(String str, Continuation<? super C287741> continuation) {
            super(2, continuation);
            this.$userId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SocialBlockingStore.this.new C287741(this.$userId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiSocialBlockingResponse> continuation) {
            return ((C287741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            SocialBonfireApi socialBonfireApi = SocialBlockingStore.this.bonfire;
            ApiSocialBlockUserRequest apiSocialBlockUserRequest = new ApiSocialBlockUserRequest(new ApiSocialBlockUserRequest.TargetUser(this.$userId));
            this.label = 1;
            Object objBlockUser = socialBonfireApi.blockUser(apiSocialBlockUserRequest, this);
            return objBlockUser == coroutine_suspended ? coroutine_suspended : objBlockUser;
        }
    }

    public final Single<ApiSocialBlockingResponse> block(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C287741(userId, null), 1, null);
    }
}
