package com.robinhood.librobinhood.data.store;

import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.models.api.ApiPosition;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PositionStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiPosition;", "<destruct>", "Lcom/robinhood/librobinhood/data/store/PositionStore$RequestPosition;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PositionStore$positionEndpointForAccount$1", m3645f = "PositionStore.kt", m3646l = {69}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.PositionStore$positionEndpointForAccount$1, reason: use source file name */
/* loaded from: classes13.dex */
final class PositionStore3 extends ContinuationImpl7 implements Function2<PositionStore.RequestPosition, Continuation<? super ApiPosition>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PositionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionStore3(PositionStore positionStore, Continuation<? super PositionStore3> continuation) {
        super(2, continuation);
        this.this$0 = positionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PositionStore3 positionStore3 = new PositionStore3(this.this$0, continuation);
        positionStore3.L$0 = obj;
        return positionStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PositionStore.RequestPosition requestPosition, Continuation<? super ApiPosition> continuation) {
        return ((PositionStore3) create(requestPosition, continuation)).invokeSuspend(Unit.INSTANCE);
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
        PositionStore.RequestPosition requestPosition = (PositionStore.RequestPosition) this.L$0;
        UUID instrumentId = requestPosition.getInstrumentId();
        String accountNumber = requestPosition.getAccountNumber();
        Brokeback brokeback = this.this$0.brokeback;
        this.label = 1;
        Object position$default = Brokeback.DefaultImpls.getPosition$default(brokeback, accountNumber, instrumentId, false, this, 4, null);
        return position$default == coroutine_suspended ? coroutine_suspended : position$default;
    }
}
