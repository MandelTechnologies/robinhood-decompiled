package com.withpersona.sdk2.inquiry.document.network;

import com.plaid.internal.EnumC7081g;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileData;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.ResponseBody;

/* compiled from: DocumentFileUploadWorker.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadWorker$Response;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$resultFlow$1", m3645f = "DocumentFileUploadWorker.kt", m3646l = {80, 84, 96, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, 123, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 136}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$resultFlow$1, reason: use source file name */
/* loaded from: classes18.dex */
final class DocumentFileUploadWorker5 extends ContinuationImpl7 implements Function2<FlowCollector<? super DocumentFileUploadWorker.Response>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Deferred<NetworkCallResult<DocumentFileUploadResponse>> $result;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DocumentFileUploadWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DocumentFileUploadWorker5(Deferred<? extends NetworkCallResult<DocumentFileUploadResponse>> deferred, DocumentFileUploadWorker documentFileUploadWorker, Continuation<? super DocumentFileUploadWorker5> continuation) {
        super(2, continuation);
        this.$result = deferred;
        this.this$0 = documentFileUploadWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DocumentFileUploadWorker5 documentFileUploadWorker5 = new DocumentFileUploadWorker5(this.$result, this.this$0, continuation);
        documentFileUploadWorker5.L$0 = obj;
        return documentFileUploadWorker5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super DocumentFileUploadWorker.Response> flowCollector, Continuation<? super Unit> continuation) {
        return ((DocumentFileUploadWorker5) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x013a, code lost:
    
        if (r3.emit(r4, r10) == r0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0157, code lost:
    
        if (r3.emit(r11, r10) == r0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017a, code lost:
    
        if (r3.emit(r11, r10) == r0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x018d, code lost:
    
        if (r3.emit(r4, r10) == r0) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013d  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        NetworkCallResult networkCallResult;
        DocumentFileData data;
        DocumentFileData.Attributes attributes;
        List<DocumentFileData.RemoteDocumentFile> originals;
        GenericFileUploadErrorResponse genericFileUploadErrorResponse;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                Deferred<NetworkCallResult<DocumentFileUploadResponse>> deferred = this.$result;
                this.L$0 = flowCollector2;
                this.label = 1;
                Object objAwait = deferred.await(this);
                if (objAwait != coroutine_suspended) {
                    flowCollector = flowCollector2;
                    obj = objAwait;
                    networkCallResult = (NetworkCallResult) obj;
                    DocumentFileUploadWorker documentFileUploadWorker = this.this$0;
                    if (networkCallResult instanceof NetworkCallResult.Success) {
                        DocumentFileUploadResponse documentFileUploadResponse = (DocumentFileUploadResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                        DocumentFileData.RemoteDocumentFile remoteDocumentFile = (documentFileUploadResponse == null || (data = documentFileUploadResponse.getData()) == null || (attributes = data.getAttributes()) == null || (originals = attributes.getOriginals()) == null) ? null : (DocumentFileData.RemoteDocumentFile) CollectionsKt.firstOrNull((List) originals);
                        if (documentFileUploadResponse != null && remoteDocumentFile != null) {
                            DocumentFileUploadWorker.Response.Success success = new DocumentFileUploadWorker.Response.Success(documentFileUploadWorker.localDocument, new DocumentFile.Remote(documentFileUploadWorker.localDocument.getAbsoluteFilePath(), remoteDocumentFile.getFilename(), remoteDocumentFile.getUrl(), documentFileUploadResponse.getData().getId()));
                            this.L$0 = flowCollector;
                            this.L$1 = networkCallResult;
                            this.label = 2;
                            if (flowCollector.emit(success, this) != coroutine_suspended) {
                            }
                        } else {
                            DocumentFileUploadWorker.Response.DocumentUploadError documentUploadError = new DocumentFileUploadWorker.Response.DocumentUploadError(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                            this.L$0 = flowCollector;
                            this.L$1 = networkCallResult;
                            this.label = 3;
                            if (flowCollector.emit(documentUploadError, this) != coroutine_suspended) {
                            }
                        }
                    }
                    if (networkCallResult instanceof NetworkCallResult.Failure) {
                        InternalErrorInfo.NetworkErrorInfo networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                        if (networkErrorInfo.isRecoverable() && (networkErrorInfo.getResponseError() instanceof ErrorResponse.Error.UnknownError)) {
                            ErrorResponse.Error responseError = networkErrorInfo.getResponseError();
                            Intrinsics.checkNotNull(responseError, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error.UnknownError");
                            ResponseBody errorBody = ((ErrorResponse.Error.UnknownError) responseError).getErrorBody();
                            if (errorBody != null) {
                                try {
                                    genericFileUploadErrorResponse = (GenericFileUploadErrorResponse) new Moshi.Builder().add(GenericFileUploadErrorResponse.Companion.getAdapter()).build().adapter(GenericFileUploadErrorResponse.class).fromJson(errorBody.getSource());
                                } catch (Exception unused) {
                                }
                                if (genericFileUploadErrorResponse == null) {
                                    DocumentFileUploadWorker.Response.DocumentUploadError documentUploadError2 = new DocumentFileUploadWorker.Response.DocumentUploadError(genericFileUploadErrorResponse.getErrors().get(0));
                                    this.L$0 = networkCallResult;
                                    this.L$1 = null;
                                    this.label = 4;
                                    break;
                                } else {
                                    DocumentFileUploadWorker.Response.DocumentUploadError documentUploadError3 = new DocumentFileUploadWorker.Response.DocumentUploadError(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                                    this.L$0 = networkCallResult;
                                    this.L$1 = null;
                                    this.label = 5;
                                    break;
                                }
                            }
                            genericFileUploadErrorResponse = null;
                            if (genericFileUploadErrorResponse == null) {
                            }
                        } else if (networkErrorInfo.isRecoverable()) {
                            DocumentFileUploadWorker.Response.DocumentUploadError documentUploadError4 = new DocumentFileUploadWorker.Response.DocumentUploadError(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                            this.L$0 = networkCallResult;
                            this.L$1 = null;
                            this.label = 6;
                            break;
                        } else {
                            DocumentFileUploadWorker.Response.NetworkError networkError = new DocumentFileUploadWorker.Response.NetworkError(networkErrorInfo);
                            this.L$0 = networkCallResult;
                            this.L$1 = null;
                            this.label = 7;
                            break;
                        }
                    }
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            case 1:
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                flowCollector = flowCollector3;
                networkCallResult = (NetworkCallResult) obj;
                DocumentFileUploadWorker documentFileUploadWorker2 = this.this$0;
                if (networkCallResult instanceof NetworkCallResult.Success) {
                }
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                }
                return Unit.INSTANCE;
            case 2:
            case 3:
                networkCallResult = (NetworkCallResult) this.L$1;
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                }
                return Unit.INSTANCE;
            case 4:
            case 5:
            case 6:
            case 7:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
