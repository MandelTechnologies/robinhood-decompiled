package com.robinhood.android.store.matcha;

import com.robinhood.android.models.matcha.api.ApiSearchUsersResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MatchaSearchStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/models/matcha/api/ApiSearchUsersResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.store.matcha.MatchaSearchStore$searchEndpoint$2", m3645f = "MatchaSearchStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.store.matcha.MatchaSearchStore$searchEndpoint$2, reason: use source file name */
/* loaded from: classes5.dex */
final class MatchaSearchStore5 extends ContinuationImpl7 implements Function2<ApiSearchUsersResponse, Continuation<? super Unit>, Object> {
    int label;

    MatchaSearchStore5(Continuation<? super MatchaSearchStore5> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MatchaSearchStore5(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiSearchUsersResponse apiSearchUsersResponse, Continuation<? super Unit> continuation) {
        return ((MatchaSearchStore5) create(apiSearchUsersResponse, continuation)).invokeSuspend(Unit.INSTANCE);
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
