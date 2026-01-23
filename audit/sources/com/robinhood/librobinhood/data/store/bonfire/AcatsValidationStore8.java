package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.acats.api.AcatsApi;
import com.robinhood.models.api.bonfire.ApiAcatsOptionValidationRequest;
import com.robinhood.models.api.bonfire.ApiAcatsOptionValidationResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsValidationStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiAcatsOptionValidationResponse;", "request", "Lcom/robinhood/models/api/bonfire/ApiAcatsOptionValidationRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.AcatsValidationStore$optionValidationEndpoint$1", m3645f = "AcatsValidationStore.kt", m3646l = {52}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsValidationStore$optionValidationEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class AcatsValidationStore8 extends ContinuationImpl7 implements Function2<ApiAcatsOptionValidationRequest, Continuation<? super ApiAcatsOptionValidationResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AcatsValidationStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsValidationStore8(AcatsValidationStore acatsValidationStore, Continuation<? super AcatsValidationStore8> continuation) {
        super(2, continuation);
        this.this$0 = acatsValidationStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsValidationStore8 acatsValidationStore8 = new AcatsValidationStore8(this.this$0, continuation);
        acatsValidationStore8.L$0 = obj;
        return acatsValidationStore8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiAcatsOptionValidationRequest apiAcatsOptionValidationRequest, Continuation<? super ApiAcatsOptionValidationResponse> continuation) {
        return ((AcatsValidationStore8) create(apiAcatsOptionValidationRequest, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ApiAcatsOptionValidationRequest apiAcatsOptionValidationRequest = (ApiAcatsOptionValidationRequest) this.L$0;
        AcatsApi acatsApi = this.this$0.acatsApi;
        this.label = 1;
        Object objPostOptionValidationRequest = acatsApi.postOptionValidationRequest(apiAcatsOptionValidationRequest, this);
        return objPostOptionValidationRequest == coroutine_suspended ? coroutine_suspended : objPostOptionValidationRequest;
    }
}
