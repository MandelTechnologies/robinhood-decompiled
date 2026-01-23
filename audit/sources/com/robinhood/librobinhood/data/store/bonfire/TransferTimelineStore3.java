package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.api.bonfire.ApiPostTransferPage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import retrofit2.Response;

/* compiled from: TransferTimelineStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lretrofit2/Response;", "Lcom/robinhood/models/api/bonfire/ApiPostTransferPage$DynamicPostTransferTimeline;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.TransferTimelineStore$endpoint$2", m3645f = "TransferTimelineStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.TransferTimelineStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class TransferTimelineStore3 extends ContinuationImpl7 implements Function2<Response<ApiPostTransferPage.DynamicPostTransferTimeline>, Continuation<? super Unit>, Object> {
    int label;

    TransferTimelineStore3(Continuation<? super TransferTimelineStore3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TransferTimelineStore3(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Response<ApiPostTransferPage.DynamicPostTransferTimeline> response, Continuation<? super Unit> continuation) {
        return ((TransferTimelineStore3) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
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
