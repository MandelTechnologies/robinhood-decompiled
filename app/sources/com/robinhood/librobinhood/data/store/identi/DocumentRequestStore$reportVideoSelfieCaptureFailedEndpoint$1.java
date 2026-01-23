package com.robinhood.librobinhood.data.store.identi;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.docupload.DocUploadApi;
import com.robinhood.models.api.identi.ApiVideoSelfieCaptureFailedRequest;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DocumentRequestStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/models/api/identi/ApiVideoSelfieCaptureFailedRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.DocumentRequestStore$reportVideoSelfieCaptureFailedEndpoint$1", m3645f = "DocumentRequestStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DocumentRequestStore$reportVideoSelfieCaptureFailedEndpoint$1 extends ContinuationImpl7 implements Function2<Tuples2<? extends UUID, ? extends ApiVideoSelfieCaptureFailedRequest>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DocumentRequestStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentRequestStore$reportVideoSelfieCaptureFailedEndpoint$1(DocumentRequestStore documentRequestStore, Continuation<? super DocumentRequestStore$reportVideoSelfieCaptureFailedEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = documentRequestStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DocumentRequestStore$reportVideoSelfieCaptureFailedEndpoint$1 documentRequestStore$reportVideoSelfieCaptureFailedEndpoint$1 = new DocumentRequestStore$reportVideoSelfieCaptureFailedEndpoint$1(this.this$0, continuation);
        documentRequestStore$reportVideoSelfieCaptureFailedEndpoint$1.L$0 = obj;
        return documentRequestStore$reportVideoSelfieCaptureFailedEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends ApiVideoSelfieCaptureFailedRequest> tuples2, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<UUID, ApiVideoSelfieCaptureFailedRequest>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<UUID, ApiVideoSelfieCaptureFailedRequest> tuples2, Continuation<? super Unit> continuation) {
        return ((DocumentRequestStore$reportVideoSelfieCaptureFailedEndpoint$1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            UUID uuid = (UUID) tuples2.component1();
            ApiVideoSelfieCaptureFailedRequest apiVideoSelfieCaptureFailedRequest = (ApiVideoSelfieCaptureFailedRequest) tuples2.component2();
            DocUploadApi docUploadApi = this.this$0.api;
            this.label = 1;
            if (docUploadApi.reportVideoSelfieCaptureFailed(uuid, apiVideoSelfieCaptureFailedRequest, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
