package com.robinhood.android.store.matcha;

import com.robinhood.android.models.matcha.api.MatchaAdditionalPagesResponse;
import com.robinhood.api.matcha.MatchaApi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MatchaAdditionalPagesStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/matcha/api/MatchaAdditionalPagesResponse;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.store.matcha.MatchaAdditionalPagesStore$transferAdditionalPagesEndpoint$1", m3645f = "MatchaAdditionalPagesStore.kt", m3646l = {19}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.store.matcha.MatchaAdditionalPagesStore$transferAdditionalPagesEndpoint$1, reason: use source file name */
/* loaded from: classes5.dex */
final class MatchaAdditionalPagesStore4 extends ContinuationImpl7 implements Function2<String, Continuation<? super MatchaAdditionalPagesResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MatchaAdditionalPagesStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchaAdditionalPagesStore4(MatchaAdditionalPagesStore matchaAdditionalPagesStore, Continuation<? super MatchaAdditionalPagesStore4> continuation) {
        super(2, continuation);
        this.this$0 = matchaAdditionalPagesStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MatchaAdditionalPagesStore4 matchaAdditionalPagesStore4 = new MatchaAdditionalPagesStore4(this.this$0, continuation);
        matchaAdditionalPagesStore4.L$0 = obj;
        return matchaAdditionalPagesStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super MatchaAdditionalPagesResponse> continuation) {
        return ((MatchaAdditionalPagesStore4) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
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
        String str = (String) this.L$0;
        MatchaApi matchaApi = this.this$0.matchaApi;
        this.label = 1;
        Object additionalTransferPages = matchaApi.getAdditionalTransferPages(str, this);
        return additionalTransferPages == coroutine_suspended ? coroutine_suspended : additionalTransferPages;
    }
}
