package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.acats.api.AcatsApi;
import com.robinhood.models.api.bonfire.ApiAcatsAccountNumberValidationRequest;
import com.robinhood.models.api.bonfire.ApiAcatsValidationResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsValidationStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiAcatsValidationResponse;", "request", "Lcom/robinhood/models/api/bonfire/ApiAcatsAccountNumberValidationRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.AcatsValidationStore$accountNumberValidationEndpoint$1", m3645f = "AcatsValidationStore.kt", m3646l = {44}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsValidationStore$accountNumberValidationEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class AcatsValidationStore4 extends ContinuationImpl7 implements Function2<ApiAcatsAccountNumberValidationRequest, Continuation<? super ApiAcatsValidationResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AcatsValidationStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsValidationStore4(AcatsValidationStore acatsValidationStore, Continuation<? super AcatsValidationStore4> continuation) {
        super(2, continuation);
        this.this$0 = acatsValidationStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsValidationStore4 acatsValidationStore4 = new AcatsValidationStore4(this.this$0, continuation);
        acatsValidationStore4.L$0 = obj;
        return acatsValidationStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiAcatsAccountNumberValidationRequest apiAcatsAccountNumberValidationRequest, Continuation<? super ApiAcatsValidationResponse> continuation) {
        return ((AcatsValidationStore4) create(apiAcatsAccountNumberValidationRequest, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ApiAcatsAccountNumberValidationRequest apiAcatsAccountNumberValidationRequest = (ApiAcatsAccountNumberValidationRequest) this.L$0;
        AcatsApi acatsApi = this.this$0.acatsApi;
        this.label = 1;
        Object objPostAccountNumberValidationRequest = acatsApi.postAccountNumberValidationRequest(apiAcatsAccountNumberValidationRequest, this);
        return objPostAccountNumberValidationRequest == coroutine_suspended ? coroutine_suspended : objPostAccountNumberValidationRequest;
    }
}
