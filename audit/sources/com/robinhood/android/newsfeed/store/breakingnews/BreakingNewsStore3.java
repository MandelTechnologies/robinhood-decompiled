package com.robinhood.android.newsfeed.store.breakingnews;

import com.robinhood.android.newsfeed.models.breakingnews.api.ApiBreakingNewsResponse;
import com.robinhood.android.newsfeed.store.breakingnews.BreakingNewsStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: BreakingNewsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "Lcom/robinhood/android/newsfeed/store/breakingnews/BreakingNewsStore$Params;", "Lcom/robinhood/android/newsfeed/models/breakingnews/api/ApiBreakingNewsResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.newsfeed.store.breakingnews.BreakingNewsStore$breakingNewsEndpoint$2", m3645f = "BreakingNewsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.newsfeed.store.breakingnews.BreakingNewsStore$breakingNewsEndpoint$2, reason: use source file name */
/* loaded from: classes8.dex */
final class BreakingNewsStore3 extends ContinuationImpl7 implements Function3<BreakingNewsStore.Params, ApiBreakingNewsResponse, Continuation<? super Unit>, Object> {
    int label;

    BreakingNewsStore3(Continuation<? super BreakingNewsStore3> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(BreakingNewsStore.Params params, ApiBreakingNewsResponse apiBreakingNewsResponse, Continuation<? super Unit> continuation) {
        return new BreakingNewsStore3(continuation).invokeSuspend(Unit.INSTANCE);
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
