package com.robinhood.shared.documents.prism.managers;

import com.robinhood.models.api.identi.ApiVideoSelfieVerificationResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: PrismPollManager.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/models/api/identi/ApiVideoSelfieVerificationResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.managers.PrismPollManager$pollForVerification$response$1", m3645f = "PrismPollManager.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.documents.prism.managers.PrismPollManager$pollForVerification$response$1, reason: use source file name */
/* loaded from: classes6.dex */
final class PrismPollManager2 extends ContinuationImpl7 implements Function2<ApiVideoSelfieVerificationResponse, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    PrismPollManager2(Continuation<? super PrismPollManager2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PrismPollManager2 prismPollManager2 = new PrismPollManager2(continuation);
        prismPollManager2.L$0 = obj;
        return prismPollManager2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiVideoSelfieVerificationResponse apiVideoSelfieVerificationResponse, Continuation<? super Boolean> continuation) {
        return ((PrismPollManager2) create(apiVideoSelfieVerificationResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return boxing.boxBoolean(((ApiVideoSelfieVerificationResponse) this.L$0).getState() == ApiVideoSelfieVerificationResponse.State.PENDING_SYSTEM_CHECKS);
    }
}
