package com.robinhood.android.store.matcha;

import com.robinhood.android.models.matcha.api.ApiMatchaTransfer;
import com.robinhood.models.p320db.matcha.MatchaTransfer2;
import com.robinhood.models.p320db.matcha.dao.MatchaTransferDao;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MatchaTransferStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/models/matcha/api/ApiMatchaTransfer;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.store.matcha.MatchaTransferStore$getTransfer$2", m3645f = "MatchaTransferStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.store.matcha.MatchaTransferStore$getTransfer$2, reason: use source file name */
/* loaded from: classes5.dex */
final class MatchaTransferStore4 extends ContinuationImpl7 implements Function2<ApiMatchaTransfer, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MatchaTransferStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchaTransferStore4(MatchaTransferStore matchaTransferStore, Continuation<? super MatchaTransferStore4> continuation) {
        super(2, continuation);
        this.this$0 = matchaTransferStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MatchaTransferStore4 matchaTransferStore4 = new MatchaTransferStore4(this.this$0, continuation);
        matchaTransferStore4.L$0 = obj;
        return matchaTransferStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiMatchaTransfer apiMatchaTransfer, Continuation<? super Unit> continuation) {
        return ((MatchaTransferStore4) create(apiMatchaTransfer, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.dao.insert((MatchaTransferDao) MatchaTransfer2.toDbModel((ApiMatchaTransfer) this.L$0));
        return Unit.INSTANCE;
    }
}
