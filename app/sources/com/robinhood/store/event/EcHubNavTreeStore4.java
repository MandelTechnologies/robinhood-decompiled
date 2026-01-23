package com.robinhood.store.event;

import com.robinhood.store.event.EcHubNavTreeStore;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: EcHubNavTreeStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "", "params", "Lcom/robinhood/store/event/EcHubNavTreeStore$GetNavNodesParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EcHubNavTreeStore$getNavNodesEndpoint$3", m3645f = "EcHubNavTreeStore.kt", m3646l = {74}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.event.EcHubNavTreeStore$getNavNodesEndpoint$3, reason: use source file name */
/* loaded from: classes12.dex */
final class EcHubNavTreeStore4 extends ContinuationImpl7 implements Function3<Long, EcHubNavTreeStore.GetNavNodesParams, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EcHubNavTreeStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EcHubNavTreeStore4(EcHubNavTreeStore ecHubNavTreeStore, Continuation<? super EcHubNavTreeStore4> continuation) {
        super(3, continuation);
        this.this$0 = ecHubNavTreeStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Long l, EcHubNavTreeStore.GetNavNodesParams getNavNodesParams, Continuation<? super Boolean> continuation) {
        EcHubNavTreeStore4 ecHubNavTreeStore4 = new EcHubNavTreeStore4(this.this$0, continuation);
        ecHubNavTreeStore4.L$0 = getNavNodesParams;
        return ecHubNavTreeStore4.invokeSuspend(Unit.INSTANCE);
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
        EcHubNavTreeStore.GetNavNodesParams getNavNodesParams = (EcHubNavTreeStore.GetNavNodesParams) this.L$0;
        EcHubNavTreeStore ecHubNavTreeStore = this.this$0;
        UUID parentId = getNavNodesParams.getParentId();
        this.label = 1;
        Object objIsStale = ecHubNavTreeStore.isStale(parentId, this);
        return objIsStale == coroutine_suspended ? coroutine_suspended : objIsStale;
    }
}
