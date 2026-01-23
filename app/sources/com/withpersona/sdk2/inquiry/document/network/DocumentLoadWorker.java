package com.withpersona.sdk2.inquiry.document.network;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileData;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import java.util.ArrayList;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: DocumentLoadWorker.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentLoadWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentLoadWorker$Response;", "sessionToken", "", "service", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentService;", "documentId", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/network/DocumentService;Ljava/lang/String;)V", "getDocumentId", "()Ljava/lang/String;", "doesSameWorkAs", "", "otherWorker", "run", "Lkotlinx/coroutines/flow/Flow;", "Response", "Factory", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class DocumentLoadWorker implements Worker<Response> {
    private final String documentId;
    private final DocumentService service;
    private final String sessionToken;

    public /* synthetic */ DocumentLoadWorker(String str, DocumentService documentService, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, documentService, str2);
    }

    private DocumentLoadWorker(String str, DocumentService documentService, String str2) {
        this.sessionToken = str;
        this.service = documentService;
        this.documentId = str2;
    }

    public final String getDocumentId() {
        return this.documentId;
    }

    @Override // com.squareup.workflow1.Worker
    public boolean doesSameWorkAs(Worker<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof DocumentLoadWorker)) {
            return false;
        }
        DocumentLoadWorker documentLoadWorker = (DocumentLoadWorker) otherWorker;
        return Intrinsics.areEqual(this.sessionToken, documentLoadWorker.sessionToken) && Intrinsics.areEqual(this.documentId, documentLoadWorker.documentId);
    }

    /* compiled from: DocumentLoadWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentLoadWorker$Response;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.document.network.DocumentLoadWorker$run$1", m3645f = "DocumentLoadWorker.kt", m3646l = {25, 42, 44, 55}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.withpersona.sdk2.inquiry.document.network.DocumentLoadWorker$run$1 */
    static final class C435771 extends ContinuationImpl7 implements Function2<FlowCollector<? super Response>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        C435771(Continuation<? super C435771> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C435771 c435771 = DocumentLoadWorker.this.new C435771(continuation);
            c435771.L$0 = obj;
            return c435771;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Response> flowCollector, Continuation<? super Unit> continuation) {
            return ((C435771) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: DocumentLoadWorker.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.document.network.DocumentLoadWorker$run$1$1", m3645f = "DocumentLoadWorker.kt", m3646l = {26}, m3647m = "invokeSuspend")
        /* renamed from: com.withpersona.sdk2.inquiry.document.network.DocumentLoadWorker$run$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function1<Continuation<? super retrofit2.Response<CreateDocumentResponse>>, Object> {
            int label;
            final /* synthetic */ DocumentLoadWorker this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DocumentLoadWorker documentLoadWorker, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = documentLoadWorker;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super retrofit2.Response<CreateDocumentResponse>> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
                String documentId = this.this$0.getDocumentId();
                this.label = 1;
                Object objLoadDocuments = documentService.loadDocuments(str, documentId, this);
                return objLoadDocuments == coroutine_suspended ? coroutine_suspended : objLoadDocuments;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
        
            if (r1.emit(r3, r14) == r0) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00c7, code lost:
        
            r3 = r1;
            r1 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00e8, code lost:
        
            if (r1.emit(r4, r14) == r0) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0105, code lost:
        
            if (r1.emit(r4, r14) == r0) goto L48;
         */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Object objEnqueueRetriableRequestWithRetry;
            NetworkCallResult networkCallResult;
            List listEmptyList;
            List<DocumentFileData.RemoteDocumentFile> originals;
            DocumentFileData.RemoteDocumentFile remoteDocumentFile;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DocumentLoadWorker.this, null);
                this.L$0 = flowCollector;
                this.label = 1;
                objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(anonymousClass1, this);
                if (objEnqueueRetriableRequestWithRetry != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                NetworkCallResult networkCallResult2 = (NetworkCallResult) this.L$1;
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                networkCallResult = networkCallResult2;
                flowCollector = flowCollector2;
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    Response.Error error = new Response.Error(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
                    this.L$0 = networkCallResult;
                    this.L$1 = null;
                    this.label = 4;
                }
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            objEnqueueRetriableRequestWithRetry = obj;
            networkCallResult = (NetworkCallResult) objEnqueueRetriableRequestWithRetry;
            if (networkCallResult instanceof NetworkCallResult.Success) {
                CreateDocumentResponse createDocumentResponse = (CreateDocumentResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                if (createDocumentResponse != null) {
                    List<DocumentFileData> included = createDocumentResponse.getIncluded();
                    if (included == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = new ArrayList();
                        for (DocumentFileData documentFileData : included) {
                            DocumentFileData.Attributes attributes = documentFileData.getAttributes();
                            DocumentFile.Remote remote = (attributes == null || (originals = attributes.getOriginals()) == null || (remoteDocumentFile = (DocumentFileData.RemoteDocumentFile) CollectionsKt.first((List) originals)) == null) ? null : new DocumentFile.Remote(null, remoteDocumentFile.getFilename(), remoteDocumentFile.getUrl(), documentFileData.getId());
                            if (remote != null) {
                                listEmptyList.add(remote);
                            }
                        }
                    }
                    Response.Success success = new Response.Success(listEmptyList);
                    this.L$0 = flowCollector;
                    this.L$1 = networkCallResult;
                    this.label = 2;
                } else {
                    Response.Error error2 = new Response.Error(new InternalErrorInfo.NetworkErrorInfo(0, "Expected body to be non-null", false, null, 8, null));
                    this.L$0 = flowCollector;
                    this.L$1 = networkCallResult;
                    this.label = 3;
                }
                networkCallResult = networkCallResult2;
                flowCollector = flowCollector2;
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                }
                return Unit.INSTANCE;
            }
            if (networkCallResult instanceof NetworkCallResult.Failure) {
            }
            return Unit.INSTANCE;
            return coroutine_suspended;
        }
    }

    @Override // com.squareup.workflow1.Worker
    public Flow<Response> run() {
        return FlowKt.flow(new C435771(null));
    }

    /* compiled from: DocumentLoadWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentLoadWorker$Response;", "", "<init>", "()V", "Success", "Error", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentLoadWorker$Response$Error;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentLoadWorker$Response$Success;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class Response {
        public /* synthetic */ Response(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: DocumentLoadWorker.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentLoadWorker$Response$Success;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentLoadWorker$Response;", "documents", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "<init>", "(Ljava/util/List;)V", "getDocuments", "()Ljava/util/List;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Success extends Response {
            private final List<DocumentFile> documents;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Success(List<? extends DocumentFile> documents) {
                super(null);
                Intrinsics.checkNotNullParameter(documents, "documents");
                this.documents = documents;
            }

            public final List<DocumentFile> getDocuments() {
                return this.documents;
            }
        }

        private Response() {
        }

        /* compiled from: DocumentLoadWorker.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentLoadWorker$Response$Error;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentLoadWorker$Response;", "cause", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "getCause", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Error extends Response {
            private final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(InternalErrorInfo cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            public final InternalErrorInfo getCause() {
                return this.cause;
            }
        }
    }

    /* compiled from: DocumentLoadWorker.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0002\b\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentLoadWorker$Factory;", "", "service", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentService;", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/network/DocumentService;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/document/network/DocumentLoadWorker;", "sessionToken", "", "documentId", "create$document_release", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Factory {
        private final DocumentService service;

        public Factory(DocumentService service) {
            Intrinsics.checkNotNullParameter(service, "service");
            this.service = service;
        }

        public final DocumentLoadWorker create$document_release(String sessionToken, String documentId) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            return new DocumentLoadWorker(sessionToken, this.service, documentId, null);
        }
    }
}
