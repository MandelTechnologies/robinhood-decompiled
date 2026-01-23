package com.robinhood.android.newsfeed.store.breakingnews;

import com.robinhood.android.newsfeed.api.breakingnews.BreakingNewsApi;
import com.robinhood.android.newsfeed.models.breakingnews.api.ApiAssetType;
import com.robinhood.android.newsfeed.models.breakingnews.api.ApiBreakingNewsResponse;
import com.robinhood.android.newsfeed.store.breakingnews.BreakingNewsStore;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: BreakingNewsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/newsfeed/models/breakingnews/api/ApiBreakingNewsResponse;", "it", "Lcom/robinhood/android/newsfeed/store/breakingnews/BreakingNewsStore$Params;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.newsfeed.store.breakingnews.BreakingNewsStore$breakingNewsEndpoint$1", m3645f = "BreakingNewsStore.kt", m3646l = {26}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.newsfeed.store.breakingnews.BreakingNewsStore$breakingNewsEndpoint$1, reason: use source file name */
/* loaded from: classes8.dex */
final class BreakingNewsStore2 extends ContinuationImpl7 implements Function2<BreakingNewsStore.Params, Continuation<? super ApiBreakingNewsResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BreakingNewsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BreakingNewsStore2(BreakingNewsStore breakingNewsStore, Continuation<? super BreakingNewsStore2> continuation) {
        super(2, continuation);
        this.this$0 = breakingNewsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BreakingNewsStore2 breakingNewsStore2 = new BreakingNewsStore2(this.this$0, continuation);
        breakingNewsStore2.L$0 = obj;
        return breakingNewsStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BreakingNewsStore.Params params, Continuation<? super ApiBreakingNewsResponse> continuation) {
        return ((BreakingNewsStore2) create(params, continuation)).invokeSuspend(Unit.INSTANCE);
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
        BreakingNewsStore.Params params = (BreakingNewsStore.Params) this.L$0;
        BreakingNewsApi breakingNewsApi = this.this$0.breakingNewsApi;
        UUID assetId = params.getAssetId();
        ApiAssetType assetType = params.getAssetType();
        String accountNumber = params.getAccountNumber();
        this.label = 1;
        Object breakingNews = breakingNewsApi.getBreakingNews(assetId, assetType, accountNumber, this);
        return breakingNews == coroutine_suspended ? coroutine_suspended : breakingNews;
    }
}
