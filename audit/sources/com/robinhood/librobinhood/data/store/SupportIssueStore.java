package com.robinhood.librobinhood.data.store;

import com.robinhood.api.retrofit.PathfinderApi;
import com.robinhood.models.api.ApiIssue;
import com.robinhood.models.api.ApiSimpleIssue;
import com.robinhood.models.api.CreateIssueRequest;
import com.robinhood.models.api.CreateLoggedOutIssueRequest;
import com.robinhood.models.p355ui.Issue;
import com.robinhood.models.p355ui.Issue2;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* compiled from: SupportIssueStore.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0086@¢\u0006\u0002\u0010\fJ&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0016J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\t2\u0006\u0010\u0019\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0016J\u0016\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0016J\u0016\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/SupportIssueStore;", "Lcom/robinhood/store/Store;", "pathfinderApi", "Lcom/robinhood/api/retrofit/PathfinderApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/PathfinderApi;Lcom/robinhood/store/StoreBundle;)V", "getActivePhoneIssues", "Lretrofit2/Response;", "", "Lcom/robinhood/models/api/ApiSimpleIssue;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createLoggedOutPhoneIssue", "Lcom/robinhood/models/ui/Issue;", "inquiryId", "Ljava/util/UUID;", "loggedOutPhoneNumber", "", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createLoggedInPhoneIssue", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPhoneIssue", "Lcom/robinhood/models/api/ApiIssue;", "issueId", "requeuePhoneIssue", "cancelPhoneIssue", "lib-store-cx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class SupportIssueStore extends Store {
    private final PathfinderApi pathfinderApi;

    /* compiled from: SupportIssueStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SupportIssueStore", m3645f = "SupportIssueStore.kt", m3646l = {62}, m3647m = "cancelPhoneIssue")
    /* renamed from: com.robinhood.librobinhood.data.store.SupportIssueStore$cancelPhoneIssue$1 */
    static final class C343351 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C343351(Continuation<? super C343351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SupportIssueStore.this.cancelPhoneIssue(null, this);
        }
    }

    /* compiled from: SupportIssueStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SupportIssueStore", m3645f = "SupportIssueStore.kt", m3646l = {45}, m3647m = "createLoggedInPhoneIssue")
    /* renamed from: com.robinhood.librobinhood.data.store.SupportIssueStore$createLoggedInPhoneIssue$1 */
    static final class C343361 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C343361(Continuation<? super C343361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SupportIssueStore.this.createLoggedInPhoneIssue(null, this);
        }
    }

    /* compiled from: SupportIssueStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SupportIssueStore", m3645f = "SupportIssueStore.kt", m3646l = {32}, m3647m = "createLoggedOutPhoneIssue")
    /* renamed from: com.robinhood.librobinhood.data.store.SupportIssueStore$createLoggedOutPhoneIssue$1 */
    static final class C343371 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C343371(Continuation<? super C343371> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SupportIssueStore.this.createLoggedOutPhoneIssue(null, null, null, this);
        }
    }

    /* compiled from: SupportIssueStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SupportIssueStore", m3645f = "SupportIssueStore.kt", m3646l = {58}, m3647m = "requeuePhoneIssue")
    /* renamed from: com.robinhood.librobinhood.data.store.SupportIssueStore$requeuePhoneIssue$1 */
    static final class C343381 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C343381(Continuation<? super C343381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SupportIssueStore.this.requeuePhoneIssue(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportIssueStore(PathfinderApi pathfinderApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(pathfinderApi, "pathfinderApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.pathfinderApi = pathfinderApi;
    }

    public final Object getActivePhoneIssues(Continuation<? super Response<List<ApiSimpleIssue>>> continuation) {
        return this.pathfinderApi.getActivePhoneIssues(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createLoggedOutPhoneIssue(UUID uuid, String str, String str2, Continuation<? super Issue> continuation) {
        C343371 c343371;
        if (continuation instanceof C343371) {
            c343371 = (C343371) continuation;
            int i = c343371.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c343371.label = i - Integer.MIN_VALUE;
            } else {
                c343371 = new C343371(continuation);
            }
        }
        Object objCreateNewIssue = c343371.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c343371.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateNewIssue);
            PathfinderApi pathfinderApi = this.pathfinderApi;
            CreateLoggedOutIssueRequest createLoggedOutIssueRequest = new CreateLoggedOutIssueRequest(uuid, str, str2);
            c343371.label = 1;
            objCreateNewIssue = pathfinderApi.createNewIssue(createLoggedOutIssueRequest, c343371);
            if (objCreateNewIssue == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateNewIssue);
        }
        return Issue2.toUiModel((ApiIssue) objCreateNewIssue);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createLoggedInPhoneIssue(UUID uuid, Continuation<? super Issue> continuation) {
        C343361 c343361;
        if (continuation instanceof C343361) {
            c343361 = (C343361) continuation;
            int i = c343361.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c343361.label = i - Integer.MIN_VALUE;
            } else {
                c343361 = new C343361(continuation);
            }
        }
        Object objCreateNewIssue = c343361.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c343361.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateNewIssue);
            PathfinderApi pathfinderApi = this.pathfinderApi;
            CreateIssueRequest createIssueRequest = new CreateIssueRequest(uuid);
            c343361.label = 1;
            objCreateNewIssue = pathfinderApi.createNewIssue(createIssueRequest, c343361);
            if (objCreateNewIssue == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateNewIssue);
        }
        return Issue2.toUiModel((ApiIssue) objCreateNewIssue);
    }

    public final Object getPhoneIssue(UUID uuid, Continuation<? super Response<ApiIssue>> continuation) {
        return this.pathfinderApi.getIssue(uuid, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requeuePhoneIssue(UUID uuid, Continuation<? super Issue> continuation) {
        C343381 c343381;
        if (continuation instanceof C343381) {
            c343381 = (C343381) continuation;
            int i = c343381.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c343381.label = i - Integer.MIN_VALUE;
            } else {
                c343381 = new C343381(continuation);
            }
        }
        Object objRequeueIssue = c343381.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c343381.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRequeueIssue);
            PathfinderApi pathfinderApi = this.pathfinderApi;
            c343381.label = 1;
            objRequeueIssue = pathfinderApi.requeueIssue(uuid, c343381);
            if (objRequeueIssue == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRequeueIssue);
        }
        return Issue2.toUiModel((ApiIssue) objRequeueIssue);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cancelPhoneIssue(UUID uuid, Continuation<? super Issue> continuation) {
        C343351 c343351;
        if (continuation instanceof C343351) {
            c343351 = (C343351) continuation;
            int i = c343351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c343351.label = i - Integer.MIN_VALUE;
            } else {
                c343351 = new C343351(continuation);
            }
        }
        Object objCancelIssue = c343351.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c343351.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCancelIssue);
            PathfinderApi pathfinderApi = this.pathfinderApi;
            c343351.label = 1;
            objCancelIssue = pathfinderApi.cancelIssue(uuid, c343351);
            if (objCancelIssue == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCancelIssue);
        }
        return Issue2.toUiModel((ApiIssue) objCancelIssue);
    }
}
