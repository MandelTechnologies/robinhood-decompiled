package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.acats.api.AcatsApi;
import com.robinhood.models.api.bonfire.ApiAcatsDtcNumberValidationRequest;
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
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiAcatsValidationResponse;", "request", "Lcom/robinhood/models/api/bonfire/ApiAcatsDtcNumberValidationRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.AcatsValidationStore$dtcNumberValidationEndpoint$1", m3645f = "AcatsValidationStore.kt", m3646l = {36}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsValidationStore$dtcNumberValidationEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class AcatsValidationStore6 extends ContinuationImpl7 implements Function2<ApiAcatsDtcNumberValidationRequest, Continuation<? super ApiAcatsValidationResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AcatsValidationStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsValidationStore6(AcatsValidationStore acatsValidationStore, Continuation<? super AcatsValidationStore6> continuation) {
        super(2, continuation);
        this.this$0 = acatsValidationStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsValidationStore6 acatsValidationStore6 = new AcatsValidationStore6(this.this$0, continuation);
        acatsValidationStore6.L$0 = obj;
        return acatsValidationStore6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiAcatsDtcNumberValidationRequest apiAcatsDtcNumberValidationRequest, Continuation<? super ApiAcatsValidationResponse> continuation) {
        return ((AcatsValidationStore6) create(apiAcatsDtcNumberValidationRequest, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ApiAcatsDtcNumberValidationRequest apiAcatsDtcNumberValidationRequest = (ApiAcatsDtcNumberValidationRequest) this.L$0;
        AcatsApi acatsApi = this.this$0.acatsApi;
        this.label = 1;
        Object objPostDtcNumberValidationRequest = acatsApi.postDtcNumberValidationRequest(apiAcatsDtcNumberValidationRequest, this);
        return objPostDtcNumberValidationRequest == coroutine_suspended ? coroutine_suspended : objPostDtcNumberValidationRequest;
    }
}
