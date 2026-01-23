package com.robinhood.store.futures;

import com.robinhood.android.models.futures.p192ui.CreateFuturesAccountResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesAccountStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/android/models/futures/ui/CreateFuturesAccountResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore$createAccountEndpoint$2", m3645f = "FuturesAccountStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FuturesAccountStore$createAccountEndpoint$2 extends ContinuationImpl7 implements Function2<CreateFuturesAccountResult, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesAccountStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesAccountStore$createAccountEndpoint$2(FuturesAccountStore futuresAccountStore, Continuation<? super FuturesAccountStore$createAccountEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = futuresAccountStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesAccountStore$createAccountEndpoint$2 futuresAccountStore$createAccountEndpoint$2 = new FuturesAccountStore$createAccountEndpoint$2(this.this$0, continuation);
        futuresAccountStore$createAccountEndpoint$2.L$0 = obj;
        return futuresAccountStore$createAccountEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CreateFuturesAccountResult createFuturesAccountResult, Continuation<? super Unit> continuation) {
        return ((FuturesAccountStore$createAccountEndpoint$2) create(createFuturesAccountResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CreateFuturesAccountResult createFuturesAccountResult = (CreateFuturesAccountResult) this.L$0;
        if (createFuturesAccountResult instanceof CreateFuturesAccountResult.SuccessfulAccountCreation) {
            this.this$0.accountDao.insert((Iterable) ((CreateFuturesAccountResult.SuccessfulAccountCreation) createFuturesAccountResult).getSubAccounts());
        }
        return Unit.INSTANCE;
    }
}
