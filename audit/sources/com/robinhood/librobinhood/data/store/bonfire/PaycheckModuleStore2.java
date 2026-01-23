package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.models.api.bonfire.ApiPaycheckModuleResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PaycheckModuleStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiPaycheckModuleResponse;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PaycheckModuleStore$paycheckModuleEndpoint$1", m3645f = "PaycheckModuleStore.kt", m3646l = {25}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.PaycheckModuleStore$paycheckModuleEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class PaycheckModuleStore2 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super ApiPaycheckModuleResponse>, Object> {
    int label;
    final /* synthetic */ PaycheckModuleStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaycheckModuleStore2(PaycheckModuleStore paycheckModuleStore, Continuation<? super PaycheckModuleStore2> continuation) {
        super(2, continuation);
        this.this$0 = paycheckModuleStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaycheckModuleStore2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super ApiPaycheckModuleResponse> continuation) {
        return ((PaycheckModuleStore2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
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
        TransfersBonfireApi transfersBonfireApi = this.this$0.transfersBonfireApi;
        this.label = 1;
        Object paycheckModule = transfersBonfireApi.getPaycheckModule(this);
        return paycheckModule == coroutine_suspended ? coroutine_suspended : paycheckModule;
    }
}
