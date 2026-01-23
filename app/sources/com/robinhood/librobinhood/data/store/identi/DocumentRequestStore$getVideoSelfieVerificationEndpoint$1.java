package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.android.api.docupload.DocUploadApi;
import com.robinhood.models.api.identi.ApiVideoSelfieVerificationResponse;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DocumentRequestStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/identi/ApiVideoSelfieVerificationResponse;", "id", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.DocumentRequestStore$getVideoSelfieVerificationEndpoint$1", m3645f = "DocumentRequestStore.kt", m3646l = {112}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DocumentRequestStore$getVideoSelfieVerificationEndpoint$1 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super ApiVideoSelfieVerificationResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DocumentRequestStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentRequestStore$getVideoSelfieVerificationEndpoint$1(DocumentRequestStore documentRequestStore, Continuation<? super DocumentRequestStore$getVideoSelfieVerificationEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = documentRequestStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DocumentRequestStore$getVideoSelfieVerificationEndpoint$1 documentRequestStore$getVideoSelfieVerificationEndpoint$1 = new DocumentRequestStore$getVideoSelfieVerificationEndpoint$1(this.this$0, continuation);
        documentRequestStore$getVideoSelfieVerificationEndpoint$1.L$0 = obj;
        return documentRequestStore$getVideoSelfieVerificationEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiVideoSelfieVerificationResponse> continuation) {
        return ((DocumentRequestStore$getVideoSelfieVerificationEndpoint$1) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
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
        UUID uuid = (UUID) this.L$0;
        DocUploadApi docUploadApi = this.this$0.api;
        this.label = 1;
        Object videoSelfieVerification = docUploadApi.getVideoSelfieVerification(uuid, this);
        return videoSelfieVerification == coroutine_suspended ? coroutine_suspended : videoSelfieVerification;
    }
}
