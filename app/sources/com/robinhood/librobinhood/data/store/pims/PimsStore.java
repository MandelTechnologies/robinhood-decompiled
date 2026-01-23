package com.robinhood.librobinhood.data.store.pims;

import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.api.retrofit.Pims;
import com.robinhood.models.api.ApiDataSubjectRequest;
import com.robinhood.models.api.ApiDocument;
import com.robinhood.models.api.pims.ApiDataSubjectListItem;
import com.robinhood.models.api.pims.ApiDataSubjectListResponse;
import com.robinhood.models.api.pims.ApiDataSubjectRequestResponse;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PimsStore.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0086@¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0086@¢\u0006\u0002\u0010\fJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0086@¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0086@¢\u0006\u0002\u0010\u0011J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0086@¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/pims/PimsStore;", "Lcom/robinhood/store/Store;", "pims", "Lcom/robinhood/api/retrofit/Pims;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/Pims;Lcom/robinhood/store/StoreBundle;)V", "submitDataAccessRequest", "Lcom/robinhood/models/api/pims/ApiDataSubjectRequestResponse;", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitDataDeletionRequest", "getDataAccessRequestList", "", "Lcom/robinhood/models/api/pims/ApiDataSubjectListItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDataDeleteRequestList", "getDataAccessFiles", "Lcom/robinhood/models/api/ApiDocument$DownloadResponse;", "requestId", "(Ljava/util/UUID;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class PimsStore extends Store {
    private static final String ACCESS_ACTION_TYPE = "access";
    private static final String DELETE_ACTION_TYPE = "erasure";
    private final Pims pims;

    /* compiled from: PimsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.pims.PimsStore", m3645f = "PimsStore.kt", m3646l = {35}, m3647m = "getDataAccessRequestList")
    /* renamed from: com.robinhood.librobinhood.data.store.pims.PimsStore$getDataAccessRequestList$1 */
    static final class C348661 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C348661(Continuation<? super C348661> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PimsStore.this.getDataAccessRequestList(this);
        }
    }

    /* compiled from: PimsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.pims.PimsStore", m3645f = "PimsStore.kt", m3646l = {41}, m3647m = "getDataDeleteRequestList")
    /* renamed from: com.robinhood.librobinhood.data.store.pims.PimsStore$getDataDeleteRequestList$1 */
    static final class C348671 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C348671(Continuation<? super C348671> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PimsStore.this.getDataDeleteRequestList(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PimsStore(Pims pims, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(pims, "pims");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.pims = pims;
    }

    public final Object submitDataAccessRequest(UUID uuid, Continuation<? super ApiDataSubjectRequestResponse> continuation) {
        return this.pims.submitPersonalDataRequest(new ApiDataSubjectRequest(ACCESS_ACTION_TYPE), uuid, continuation);
    }

    public final Object submitDataDeletionRequest(UUID uuid, Continuation<? super ApiDataSubjectRequestResponse> continuation) {
        return this.pims.submitPersonalDataRequest(new ApiDataSubjectRequest(DELETE_ACTION_TYPE), uuid, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getDataAccessRequestList(Continuation<? super List<ApiDataSubjectListItem>> continuation) {
        C348661 c348661;
        if (continuation instanceof C348661) {
            c348661 = (C348661) continuation;
            int i = c348661.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c348661.label = i - Integer.MIN_VALUE;
            } else {
                c348661 = new C348661(continuation);
            }
        }
        Object objFetchPersonalDataRequests = c348661.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c348661.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFetchPersonalDataRequests);
            Pims pims = this.pims;
            c348661.label = 1;
            objFetchPersonalDataRequests = pims.fetchPersonalDataRequests(c348661);
            if (objFetchPersonalDataRequests == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFetchPersonalDataRequests);
        }
        List<ApiDataSubjectListItem> results = ((ApiDataSubjectListResponse) objFetchPersonalDataRequests).getResults();
        ArrayList arrayList = new ArrayList();
        for (Object obj : results) {
            if (Intrinsics.areEqual(((ApiDataSubjectListItem) obj).getAction_type(), ACCESS_ACTION_TYPE)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getDataDeleteRequestList(Continuation<? super List<ApiDataSubjectListItem>> continuation) {
        C348671 c348671;
        if (continuation instanceof C348671) {
            c348671 = (C348671) continuation;
            int i = c348671.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c348671.label = i - Integer.MIN_VALUE;
            } else {
                c348671 = new C348671(continuation);
            }
        }
        Object objFetchPersonalDataRequests = c348671.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c348671.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFetchPersonalDataRequests);
            Pims pims = this.pims;
            c348671.label = 1;
            objFetchPersonalDataRequests = pims.fetchPersonalDataRequests(c348671);
            if (objFetchPersonalDataRequests == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFetchPersonalDataRequests);
        }
        List<ApiDataSubjectListItem> results = ((ApiDataSubjectListResponse) objFetchPersonalDataRequests).getResults();
        ArrayList arrayList = new ArrayList();
        for (Object obj : results) {
            if (Intrinsics.areEqual(((ApiDataSubjectListItem) obj).getAction_type(), DELETE_ACTION_TYPE)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final Object getDataAccessFiles(UUID uuid, UUID uuid2, Continuation<? super ApiDocument.DownloadResponse> continuation) {
        return this.pims.getDataRequestFiles(uuid, uuid2, continuation);
    }
}
