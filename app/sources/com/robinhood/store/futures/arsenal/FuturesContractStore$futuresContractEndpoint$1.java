package com.robinhood.store.futures.arsenal;

import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.arsenal.proto.p281v1.idl.InstrumentService;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesContractStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "contractId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.arsenal.FuturesContractStore$futuresContractEndpoint$1", m3645f = "FuturesContractStore.kt", m3646l = {48}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FuturesContractStore$futuresContractEndpoint$1 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super FuturesContract>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesContractStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesContractStore$futuresContractEndpoint$1(FuturesContractStore futuresContractStore, Continuation<? super FuturesContractStore$futuresContractEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresContractStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesContractStore$futuresContractEndpoint$1 futuresContractStore$futuresContractEndpoint$1 = new FuturesContractStore$futuresContractEndpoint$1(this.this$0, continuation);
        futuresContractStore$futuresContractEndpoint$1.L$0 = obj;
        return futuresContractStore$futuresContractEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super FuturesContract> continuation) {
        return ((FuturesContractStore$futuresContractEndpoint$1) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
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
        UUID uuid = (UUID) this.L$0;
        InstrumentService instrumentService = this.this$0.arsenalService;
        this.label = 1;
        Object futuresContract = ArsenalServiceExt.getFuturesContract(instrumentService, uuid, this);
        return futuresContract == coroutine_suspended ? coroutine_suspended : futuresContract;
    }
}
