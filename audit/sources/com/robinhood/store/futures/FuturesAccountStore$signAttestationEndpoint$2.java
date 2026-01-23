package com.robinhood.store.futures;

import com.robinhood.android.models.futures.dao.FuturesAccountDao;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FuturesAccountStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "optionalAccount", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/models/futures/db/FuturesAccount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore$signAttestationEndpoint$2", m3645f = "FuturesAccountStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes12.dex */
final class FuturesAccountStore$signAttestationEndpoint$2 extends ContinuationImpl7 implements Function2<Optional<? extends FuturesAccount>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesAccountStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesAccountStore$signAttestationEndpoint$2(FuturesAccountStore futuresAccountStore, Continuation<? super FuturesAccountStore$signAttestationEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = futuresAccountStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesAccountStore$signAttestationEndpoint$2 futuresAccountStore$signAttestationEndpoint$2 = new FuturesAccountStore$signAttestationEndpoint$2(this.this$0, continuation);
        futuresAccountStore$signAttestationEndpoint$2.L$0 = obj;
        return futuresAccountStore$signAttestationEndpoint$2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Optional<FuturesAccount> optional, Continuation<? super Unit> continuation) {
        return ((FuturesAccountStore$signAttestationEndpoint$2) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Optional<? extends FuturesAccount> optional, Continuation<? super Unit> continuation) {
        return invoke2((Optional<FuturesAccount>) optional, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        FuturesAccount futuresAccount = (FuturesAccount) ((Optional) this.L$0).getOrNull();
        if (futuresAccount != null) {
            this.this$0.accountDao.insert((FuturesAccountDao) futuresAccount);
        }
        return Unit.INSTANCE;
    }
}
