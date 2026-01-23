package com.robinhood.store.event;

import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.store.event.EcHubLayoutStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: EcHubLayoutStore.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/store/event/EcHubLayoutStore$GetLayoutParams;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EcHubLayoutStore$getEcHubLayoutEndpoint$5", m3645f = "EcHubLayoutStore.kt", m3646l = {81}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.event.EcHubLayoutStore$getEcHubLayoutEndpoint$5, reason: use source file name */
/* loaded from: classes12.dex */
final class EcHubLayoutStore4 extends ContinuationImpl7 implements Function3<Long, Tuples2<? extends EcHubLayoutStore.GetLayoutParams, ? extends IdlPaginationCursor>, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EcHubLayoutStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EcHubLayoutStore4(EcHubLayoutStore ecHubLayoutStore, Continuation<? super EcHubLayoutStore4> continuation) {
        super(3, continuation);
        this.this$0 = ecHubLayoutStore;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Long l, Tuples2<EcHubLayoutStore.GetLayoutParams, IdlPaginationCursor> tuples2, Continuation<? super Boolean> continuation) {
        EcHubLayoutStore4 ecHubLayoutStore4 = new EcHubLayoutStore4(this.this$0, continuation);
        ecHubLayoutStore4.L$0 = tuples2;
        return ecHubLayoutStore4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Long l, Tuples2<? extends EcHubLayoutStore.GetLayoutParams, ? extends IdlPaginationCursor> tuples2, Continuation<? super Boolean> continuation) {
        return invoke2(l, (Tuples2<EcHubLayoutStore.GetLayoutParams, IdlPaginationCursor>) tuples2, continuation);
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
        Tuples2 tuples2 = (Tuples2) this.L$0;
        EcHubLayoutStore.GetLayoutParams getLayoutParams = (EcHubLayoutStore.GetLayoutParams) tuples2.component1();
        IdlPaginationCursor idlPaginationCursor = (IdlPaginationCursor) tuples2.component2();
        EcHubSessionTracker ecHubSessionTracker = this.this$0.ecHubSessionTracker;
        String strGenerateRefId = this.this$0.generateRefId(getLayoutParams.getNodeId(), idlPaginationCursor);
        this.label = 1;
        Object objIsRecordStale$lib_store_event_externalDebug = ecHubSessionTracker.isRecordStale$lib_store_event_externalDebug(strGenerateRefId, this);
        return objIsRecordStale$lib_store_event_externalDebug == coroutine_suspended ? coroutine_suspended : objIsRecordStale$lib_store_event_externalDebug;
    }
}
