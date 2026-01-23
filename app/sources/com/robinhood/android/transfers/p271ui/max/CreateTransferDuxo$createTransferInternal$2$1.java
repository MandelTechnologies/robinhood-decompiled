package com.robinhood.android.transfers.p271ui.max;

import com.robinhood.models.api.bonfire.ApiCreateTransferResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;

/* compiled from: CreateTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.CreateTransferDuxo$createTransferInternal$2$1", m3645f = "CreateTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes9.dex */
final class CreateTransferDuxo$createTransferInternal$2$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Response<ApiCreateTransferResponse>>, Object> {
    final /* synthetic */ Response<ApiCreateTransferResponse> $response;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateTransferDuxo$createTransferInternal$2$1(Response<ApiCreateTransferResponse> response, Continuation<? super CreateTransferDuxo$createTransferInternal$2$1> continuation) {
        super(2, continuation);
        this.$response = response;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateTransferDuxo$createTransferInternal$2$1(this.$response, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<ApiCreateTransferResponse>> continuation) {
        return ((CreateTransferDuxo$createTransferInternal$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return this.$response;
    }
}
