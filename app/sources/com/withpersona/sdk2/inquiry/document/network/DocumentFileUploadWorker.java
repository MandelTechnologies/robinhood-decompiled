package com.withpersona.sdk2.inquiry.document.network;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.shared.FileHelper;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job6;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.MediaType;

/* compiled from: DocumentFileUploadWorker.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadWorker$Response;", "sessionToken", "", "service", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentService;", "documentId", "localDocument", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "fileHelper", "Lcom/withpersona/sdk2/inquiry/shared/FileHelper;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/network/DocumentService;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/shared/FileHelper;)V", "serviceCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "doesSameWorkAs", "", "otherWorker", "run", "Lkotlinx/coroutines/flow/Flow;", "Response", "Factory", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class DocumentFileUploadWorker implements Worker<Response> {
    private final String documentId;
    private final FileHelper fileHelper;
    private final DocumentFile.Local localDocument;
    private final DocumentService service;
    private final CoroutineScope serviceCoroutineScope;
    private final String sessionToken;

    public /* synthetic */ DocumentFileUploadWorker(String str, DocumentService documentService, String str2, DocumentFile.Local local, FileHelper fileHelper, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, documentService, str2, local, fileHelper);
    }

    private DocumentFileUploadWorker(String str, DocumentService documentService, String str2, DocumentFile.Local local, FileHelper fileHelper) {
        this.sessionToken = str;
        this.service = documentService;
        this.documentId = str2;
        this.localDocument = local;
        this.fileHelper = fileHelper;
        this.serviceCoroutineScope = CoroutineScope2.CoroutineScope(Dispatchers.getDefault().plus(Job6.Job$default(null, 1, null)));
    }

    @Override // com.squareup.workflow1.Worker
    public boolean doesSameWorkAs(Worker<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof DocumentFileUploadWorker)) {
            return false;
        }
        DocumentFileUploadWorker documentFileUploadWorker = (DocumentFileUploadWorker) otherWorker;
        return Intrinsics.areEqual(this.sessionToken, documentFileUploadWorker.sessionToken) && Intrinsics.areEqual(this.localDocument, documentFileUploadWorker.localDocument);
    }

    /* compiled from: DocumentFileUploadWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadWorker$Response;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1", m3645f = "DocumentFileUploadWorker.kt", m3646l = {151}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1 */
    static final class C435731 extends ContinuationImpl7 implements Function2<FlowCollector<? super Response>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C435731(Continuation<? super C435731> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C435731 c435731 = DocumentFileUploadWorker.this.new C435731(continuation);
            c435731.L$0 = obj;
            return c435731;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Response> flowCollector, Continuation<? super Unit> continuation) {
            return ((C435731) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                ProgressRequestBody progressRequestBody = new ProgressRequestBody(new File(DocumentFileUploadWorker.this.localDocument.getAbsoluteFilePath()), MediaType.INSTANCE.parse(DocumentFileUploadWorker.this.fileHelper.getMimeTypeFromPath(DocumentFileUploadWorker.this.localDocument.getAbsoluteFilePath())));
                Flow flowMerge = FlowKt.merge(FlowKt.flow(new DocumentFileUploadWorker5(BuildersKt__Builders_commonKt.async$default(DocumentFileUploadWorker.this.serviceCoroutineScope, Dispatchers.getIO(), null, new DocumentFileUploadWorker4(DocumentFileUploadWorker.this, progressRequestBody, null), 2, null), DocumentFileUploadWorker.this, null)), FlowKt.flow(new DocumentFileUploadWorker3(progressRequestBody, null)));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(flowCollector);
                this.label = 1;
                if (flowMerge.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: DocumentFileUploadWorker.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ FlowCollector<Response> $$this$flow;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(FlowCollector<? super Response> flowCollector) {
                this.$$this$flow = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Response response, Continuation<? super Unit> continuation) {
                DocumentFileUploadWorker2 documentFileUploadWorker2;
                if (continuation instanceof DocumentFileUploadWorker2) {
                    documentFileUploadWorker2 = (DocumentFileUploadWorker2) continuation;
                    int i = documentFileUploadWorker2.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        documentFileUploadWorker2.label = i - Integer.MIN_VALUE;
                    } else {
                        documentFileUploadWorker2 = new DocumentFileUploadWorker2(this, continuation);
                    }
                }
                Object obj = documentFileUploadWorker2.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = documentFileUploadWorker2.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    FlowCollector<Response> flowCollector = this.$$this$flow;
                    documentFileUploadWorker2.L$0 = response;
                    documentFileUploadWorker2.label = 1;
                    if (flowCollector.emit(response, documentFileUploadWorker2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    response = (Response) documentFileUploadWorker2.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if ((response instanceof Response.DocumentUploadError) || (response instanceof Response.NetworkError)) {
                    Job6.cancel$default(documentFileUploadWorker2.get$context(), null, 1, null);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Response) obj, (Continuation<? super Unit>) continuation);
            }
        }
    }

    @Override // com.squareup.workflow1.Worker
    public Flow<Response> run() {
        return FlowKt.flow(new C435731(null));
    }

    /* compiled from: DocumentFileUploadWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadWorker$Response;", "", "<init>", "()V", "Success", "ProgressUpdate", "DocumentUploadError", "NetworkError", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadWorker$Response$DocumentUploadError;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadWorker$Response$NetworkError;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadWorker$Response$ProgressUpdate;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadWorker$Response$Success;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class Response {
        public /* synthetic */ Response(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Response() {
        }

        /* compiled from: DocumentFileUploadWorker.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadWorker$Response$Success;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadWorker$Response;", "oldLocalDocument", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "newRemoteDocument", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)V", "getOldLocalDocument", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "getNewRemoteDocument", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Success extends Response {
            private final DocumentFile.Remote newRemoteDocument;
            private final DocumentFile.Local oldLocalDocument;

            public final DocumentFile.Local getOldLocalDocument() {
                return this.oldLocalDocument;
            }

            public final DocumentFile.Remote getNewRemoteDocument() {
                return this.newRemoteDocument;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(DocumentFile.Local oldLocalDocument, DocumentFile.Remote newRemoteDocument) {
                super(null);
                Intrinsics.checkNotNullParameter(oldLocalDocument, "oldLocalDocument");
                Intrinsics.checkNotNullParameter(newRemoteDocument, "newRemoteDocument");
                this.oldLocalDocument = oldLocalDocument;
                this.newRemoteDocument = newRemoteDocument;
            }
        }

        /* compiled from: DocumentFileUploadWorker.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadWorker$Response$ProgressUpdate;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadWorker$Response;", "progressPercentage", "", "<init>", "(I)V", "getProgressPercentage", "()I", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class ProgressUpdate extends Response {
            private final int progressPercentage;

            public ProgressUpdate(int i) {
                super(null);
                this.progressPercentage = i;
            }

            public final int getProgressPercentage() {
                return this.progressPercentage;
            }
        }

        /* compiled from: DocumentFileUploadWorker.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadWorker$Response$DocumentUploadError;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadWorker$Response;", "cause", "Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;)V", "getCause", "()Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class DocumentUploadError extends Response {
            private final GenericFileUploadErrorResponse.DocumentErrorResponse cause;

            public final GenericFileUploadErrorResponse.DocumentErrorResponse getCause() {
                return this.cause;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DocumentUploadError(GenericFileUploadErrorResponse.DocumentErrorResponse cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }
        }

        /* compiled from: DocumentFileUploadWorker.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadWorker$Response$NetworkError;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadWorker$Response;", "cause", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "getCause", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class NetworkError extends Response {
            private final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NetworkError(InternalErrorInfo cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            public final InternalErrorInfo getCause() {
                return this.cause;
            }
        }
    }

    /* compiled from: DocumentFileUploadWorker.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadWorker$Factory;", "", "service", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentService;", "fileHelper", "Lcom/withpersona/sdk2/inquiry/shared/FileHelper;", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/network/DocumentService;Lcom/withpersona/sdk2/inquiry/shared/FileHelper;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadWorker;", "sessionToken", "", "documentId", "localDocument", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Factory {
        private final FileHelper fileHelper;
        private final DocumentService service;

        public Factory(DocumentService service, FileHelper fileHelper) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(fileHelper, "fileHelper");
            this.service = service;
            this.fileHelper = fileHelper;
        }

        public final DocumentFileUploadWorker create(String sessionToken, String documentId, DocumentFile.Local localDocument) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            Intrinsics.checkNotNullParameter(localDocument, "localDocument");
            return new DocumentFileUploadWorker(sessionToken, this.service, documentId, localDocument, this.fileHelper, null);
        }
    }
}
