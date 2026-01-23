package com.robinhood.android.rhyonboarding.postaccountopen;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.bonfire.ApiRhyAccount;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: RhyPostAccountOpenDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.rhyonboarding.postaccountopen.RhyPostAccountOpenDuxo$onStart$1$1", m3645f = "RhyPostAccountOpenDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.rhyonboarding.postaccountopen.RhyPostAccountOpenDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RhyPostAccountOpenDuxo2 extends ContinuationImpl7 implements Function2<RhyPostAccountOpenDataState, Continuation<? super RhyPostAccountOpenDataState>, Object> {
    final /* synthetic */ PaginatedResult<ApiRhyAccount> $accounts;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyPostAccountOpenDuxo2(PaginatedResult<ApiRhyAccount> paginatedResult, Continuation<? super RhyPostAccountOpenDuxo2> continuation) {
        super(2, continuation);
        this.$accounts = paginatedResult;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhyPostAccountOpenDuxo2 rhyPostAccountOpenDuxo2 = new RhyPostAccountOpenDuxo2(this.$accounts, continuation);
        rhyPostAccountOpenDuxo2.L$0 = obj;
        return rhyPostAccountOpenDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RhyPostAccountOpenDataState rhyPostAccountOpenDataState, Continuation<? super RhyPostAccountOpenDataState> continuation) {
        return ((RhyPostAccountOpenDuxo2) create(rhyPostAccountOpenDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((RhyPostAccountOpenDataState) this.L$0).copy(false, boxing.boxBoolean(!this.$accounts.getResults().isEmpty()), this.$accounts.getResults().isEmpty());
    }
}
