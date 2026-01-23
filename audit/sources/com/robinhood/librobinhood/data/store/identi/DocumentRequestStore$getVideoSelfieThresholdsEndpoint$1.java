package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.android.api.docupload.DocUploadApi;
import com.robinhood.models.api.identi.ApiVideoSelfieThresholds;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DocumentRequestStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/identi/ApiVideoSelfieThresholds;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.DocumentRequestStore$getVideoSelfieThresholdsEndpoint$1", m3645f = "DocumentRequestStore.kt", m3646l = {104}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DocumentRequestStore$getVideoSelfieThresholdsEndpoint$1 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super ApiVideoSelfieThresholds>, Object> {
    int label;
    final /* synthetic */ DocumentRequestStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentRequestStore$getVideoSelfieThresholdsEndpoint$1(DocumentRequestStore documentRequestStore, Continuation<? super DocumentRequestStore$getVideoSelfieThresholdsEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = documentRequestStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DocumentRequestStore$getVideoSelfieThresholdsEndpoint$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super ApiVideoSelfieThresholds> continuation) {
        return ((DocumentRequestStore$getVideoSelfieThresholdsEndpoint$1) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
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
        DocUploadApi docUploadApi = this.this$0.api;
        this.label = 1;
        Object videoSelfieThresholds$default = DocUploadApi.DefaultImpls.getVideoSelfieThresholds$default(docUploadApi, null, this, 1, null);
        return videoSelfieThresholds$default == coroutine_suspended ? coroutine_suspended : videoSelfieThresholds$default;
    }
}
