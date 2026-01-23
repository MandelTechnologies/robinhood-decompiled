package com.withpersona.sdk2.inquiry.document.network;

import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.MultipartBody;
import retrofit2.Response;

/* compiled from: DocumentFileUploadWorker.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$result$1", m3645f = "DocumentFileUploadWorker.kt", m3646l = {54}, m3647m = "invokeSuspend")
/* renamed from: com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$result$1, reason: use source file name */
/* loaded from: classes18.dex */
final class DocumentFileUploadWorker4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super NetworkCallResult<DocumentFileUploadResponse>>, Object> {
    final /* synthetic */ ProgressRequestBody $fileReqBody;
    int label;
    final /* synthetic */ DocumentFileUploadWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentFileUploadWorker4(DocumentFileUploadWorker documentFileUploadWorker, ProgressRequestBody progressRequestBody, Continuation<? super DocumentFileUploadWorker4> continuation) {
        super(2, continuation);
        this.this$0 = documentFileUploadWorker;
        this.$fileReqBody = progressRequestBody;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DocumentFileUploadWorker4(this.this$0, this.$fileReqBody, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super NetworkCallResult<DocumentFileUploadResponse>> continuation) {
        return ((DocumentFileUploadWorker4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: DocumentFileUploadWorker.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$result$1$1", m3645f = "DocumentFileUploadWorker.kt", m3646l = {55}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$result$1$1 */
    static final class C435761 extends ContinuationImpl7 implements Function1<Continuation<? super Response<DocumentFileUploadResponse>>, Object> {
        final /* synthetic */ ProgressRequestBody $fileReqBody;
        int label;
        final /* synthetic */ DocumentFileUploadWorker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C435761(DocumentFileUploadWorker documentFileUploadWorker, ProgressRequestBody progressRequestBody, Continuation<? super C435761> continuation) {
            super(1, continuation);
            this.this$0 = documentFileUploadWorker;
            this.$fileReqBody = progressRequestBody;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C435761(this.this$0, this.$fileReqBody, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Response<DocumentFileUploadResponse>> continuation) {
            return ((C435761) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            DocumentService documentService = this.this$0.service;
            String str = this.this$0.sessionToken;
            MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
            MultipartBody.Part partCreateFormData = companion.createFormData("data[type]", "document-file");
            MultipartBody.Part partCreateFormData2 = companion.createFormData("data[attributes][document-id]", this.this$0.documentId);
            MultipartBody.Part partCreateFormData3 = companion.createFormData("data[attributes][capture-method]", this.this$0.localDocument.getCaptureMethod().getType());
            MultipartBody.Part partCreateFormData4 = companion.createFormData("data[attributes][originals][]", this.this$0.localDocument.getAbsoluteFilePath(), this.$fileReqBody);
            String name = new File(this.this$0.localDocument.getAbsoluteFilePath()).getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            List<MultipartBody.Part> listListOf = CollectionsKt.listOf((Object[]) new MultipartBody.Part[]{partCreateFormData, partCreateFormData2, partCreateFormData3, partCreateFormData4, companion.createFormData("data[attributes][name]", name)});
            this.label = 1;
            Object objAddFile = documentService.addFile(str, listListOf, this);
            return objAddFile == coroutine_suspended ? coroutine_suspended : objAddFile;
        }
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
        C435761 c435761 = new C435761(this.this$0, this.$fileReqBody, null);
        this.label = 1;
        Object objEnqueueVerificationRequestWithRetry = NetworkUtilsKt.enqueueVerificationRequestWithRetry(c435761, this);
        return objEnqueueVerificationRequestWithRetry == coroutine_suspended ? coroutine_suspended : objEnqueueVerificationRequestWithRetry;
    }
}
