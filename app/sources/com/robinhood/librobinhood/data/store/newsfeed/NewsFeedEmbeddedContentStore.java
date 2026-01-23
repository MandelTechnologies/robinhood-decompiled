package com.robinhood.librobinhood.data.store.newsfeed;

import com.robinhood.api.retrofit.DoraApi;
import com.robinhood.models.newsfeed.api.ApiNewsFeedEmbeddedContent;
import com.robinhood.models.newsfeed.p334db.NewsFeedEmbeddedContent;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsFeedEmbeddedContentStore.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedEmbeddedContentStore;", "Lcom/robinhood/store/Store;", "doraApi", "Lcom/robinhood/api/retrofit/DoraApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/DoraApi;Lcom/robinhood/store/StoreBundle;)V", "fetchNewsFeedEmbeddedContent", "Lcom/robinhood/models/newsfeed/db/NewsFeedEmbeddedContent;", "contentId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class NewsFeedEmbeddedContentStore extends Store {
    private final DoraApi doraApi;

    /* compiled from: NewsFeedEmbeddedContentStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.newsfeed.NewsFeedEmbeddedContentStore", m3645f = "NewsFeedEmbeddedContentStore.kt", m3646l = {18}, m3647m = "fetchNewsFeedEmbeddedContent")
    /* renamed from: com.robinhood.librobinhood.data.store.newsfeed.NewsFeedEmbeddedContentStore$fetchNewsFeedEmbeddedContent$1 */
    static final class C348621 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C348621(Continuation<? super C348621> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NewsFeedEmbeddedContentStore.this.fetchNewsFeedEmbeddedContent(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsFeedEmbeddedContentStore(DoraApi doraApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(doraApi, "doraApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.doraApi = doraApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchNewsFeedEmbeddedContent(UUID uuid, Continuation<? super NewsFeedEmbeddedContent> continuation) {
        C348621 c348621;
        if (continuation instanceof C348621) {
            c348621 = (C348621) continuation;
            int i = c348621.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c348621.label = i - Integer.MIN_VALUE;
            } else {
                c348621 = new C348621(continuation);
            }
        }
        Object embeddedContent = c348621.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c348621.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(embeddedContent);
            DoraApi doraApi = this.doraApi;
            c348621.label = 1;
            embeddedContent = doraApi.getEmbeddedContent(uuid, c348621);
            if (embeddedContent == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(embeddedContent);
        }
        return ((ApiNewsFeedEmbeddedContent) embeddedContent).toDbModel();
    }
}
