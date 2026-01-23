package com.robinhood.librobinhood.data.store.newsfeed;

import com.robinhood.api.retrofit.DoraApi;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.newsfeed.api.ApiNewsFeedElement;
import com.robinhood.models.newsfeed.p334db.dao.NewsFeedElement;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NewsFeedVideoStore.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedVideoStore;", "Lcom/robinhood/store/Store;", "doraApi", "Lcom/robinhood/api/retrofit/DoraApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/DoraApi;Lcom/robinhood/store/StoreBundle;)V", "fetchNewsFeedVideoElements", "", "Lcom/robinhood/models/newsfeed/db/dao/NewsFeedElement;", "videoId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class NewsFeedVideoStore extends Store {
    private final DoraApi doraApi;

    /* compiled from: NewsFeedVideoStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.newsfeed.NewsFeedVideoStore", m3645f = "NewsFeedVideoStore.kt", m3646l = {18}, m3647m = "fetchNewsFeedVideoElements")
    /* renamed from: com.robinhood.librobinhood.data.store.newsfeed.NewsFeedVideoStore$fetchNewsFeedVideoElements$1 */
    static final class C348631 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C348631(Continuation<? super C348631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NewsFeedVideoStore.this.fetchNewsFeedVideoElements(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsFeedVideoStore(DoraApi doraApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(doraApi, "doraApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.doraApi = doraApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchNewsFeedVideoElements(UUID uuid, Continuation<? super List<NewsFeedElement>> continuation) {
        C348631 c348631;
        if (continuation instanceof C348631) {
            c348631 = (C348631) continuation;
            int i = c348631.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c348631.label = i - Integer.MIN_VALUE;
            } else {
                c348631 = new C348631(continuation);
            }
        }
        Object feedVideos = c348631.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c348631.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(feedVideos);
            DoraApi doraApi = this.doraApi;
            c348631.label = 1;
            feedVideos = doraApi.getFeedVideos(uuid, c348631);
            if (feedVideos == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(feedVideos);
        }
        List results = ((PaginatedResult) feedVideos).getResults();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        Iterator it = results.iterator();
        while (it.hasNext()) {
            arrayList.add(ApiNewsFeedElement.toDbModel$default((ApiNewsFeedElement) it.next(), null, 1, null));
        }
        return arrayList;
    }
}
