package com.withpersona.sdk2.inquiry.document.network;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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

/* compiled from: DocumentFileDeleteWorker.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB)\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileDeleteWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileDeleteWorker$Response;", "", "sessionToken", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentService;", "service", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "remoteDocument", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/network/DocumentService;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)V", "otherWorker", "", "doesSameWorkAs", "(Lcom/squareup/workflow1/Worker;)Z", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentService;", "getDocumentId", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "getRemoteDocument", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "Response", "Factory", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class DocumentFileDeleteWorker implements Worker<Response> {
    private final String documentId;
    private final DocumentFile.Remote remoteDocument;
    private final DocumentService service;
    private final String sessionToken;

    public /* synthetic */ DocumentFileDeleteWorker(String str, DocumentService documentService, String str2, DocumentFile.Remote remote, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, documentService, str2, remote);
    }

    private DocumentFileDeleteWorker(String str, DocumentService documentService, String str2, DocumentFile.Remote remote) {
        this.sessionToken = str;
        this.service = documentService;
        this.documentId = str2;
        this.remoteDocument = remote;
    }

    public final DocumentFile.Remote getRemoteDocument() {
        return this.remoteDocument;
    }

    @Override // com.squareup.workflow1.Worker
    public boolean doesSameWorkAs(Worker<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof DocumentFileDeleteWorker)) {
            return false;
        }
        DocumentFileDeleteWorker documentFileDeleteWorker = (DocumentFileDeleteWorker) otherWorker;
        return Intrinsics.areEqual(this.sessionToken, documentFileDeleteWorker.sessionToken) && Intrinsics.areEqual(this.remoteDocument, documentFileDeleteWorker.remoteDocument);
    }

    /* compiled from: DocumentFileDeleteWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileDeleteWorker$Response;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileDeleteWorker$run$1", m3645f = "DocumentFileDeleteWorker.kt", m3646l = {25, 31, 33}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.withpersona.sdk2.inquiry.document.network.DocumentFileDeleteWorker$run$1 */
    static final class C435721 extends ContinuationImpl7 implements Function2<FlowCollector<? super Response>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        C435721(Continuation<? super C435721> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C435721 c435721 = DocumentFileDeleteWorker.this.new C435721(continuation);
            c435721.L$0 = obj;
            return c435721;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Response> flowCollector, Continuation<? super Unit> continuation) {
            return ((C435721) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: DocumentFileDeleteWorker.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileDeleteWorker$run$1$1", m3645f = "DocumentFileDeleteWorker.kt", m3646l = {26}, m3647m = "invokeSuspend")
        /* renamed from: com.withpersona.sdk2.inquiry.document.network.DocumentFileDeleteWorker$run$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function1<Continuation<? super retrofit2.Response<?>>, Object> {
            int label;
            final /* synthetic */ DocumentFileDeleteWorker this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DocumentFileDeleteWorker documentFileDeleteWorker, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = documentFileDeleteWorker;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super retrofit2.Response<?>> continuation) {
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
                String documentFileId = this.this$0.getRemoteDocument().getDocumentFileId();
                this.label = 1;
                Object objDeleteFile = documentService.deleteFile(str, documentFileId, this);
                return objDeleteFile == coroutine_suspended ? coroutine_suspended : objDeleteFile;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
        
            if (r1.emit(r5, r8) == r0) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            NetworkCallResult networkCallResult;
            FlowCollector flowCollector2;
            NetworkCallResult networkCallResult2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DocumentFileDeleteWorker.this, null);
                this.L$0 = flowCollector3;
                this.label = 1;
                Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(anonymousClass1, this);
                if (objEnqueueRetriableRequestWithRetry != coroutine_suspended) {
                    flowCollector = flowCollector3;
                    obj = objEnqueueRetriableRequestWithRetry;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                networkCallResult2 = (NetworkCallResult) this.L$1;
                flowCollector2 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                networkCallResult = networkCallResult2;
                flowCollector = flowCollector2;
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    Response.Error error = new Response.Error(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
                    this.L$0 = networkCallResult;
                    this.L$1 = null;
                    this.label = 3;
                }
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            networkCallResult = (NetworkCallResult) obj;
            if (networkCallResult instanceof NetworkCallResult.Success) {
                ((NetworkCallResult.Success) networkCallResult).getResponse();
                Response.Success success = Response.Success.INSTANCE;
                this.L$0 = flowCollector;
                this.L$1 = networkCallResult;
                this.label = 2;
                if (flowCollector.emit(success, this) != coroutine_suspended) {
                    flowCollector2 = flowCollector;
                    networkCallResult2 = networkCallResult;
                    networkCallResult = networkCallResult2;
                    flowCollector = flowCollector2;
                    if (networkCallResult instanceof NetworkCallResult.Failure) {
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
    }

    @Override // com.squareup.workflow1.Worker
    public Flow<Response> run() {
        return FlowKt.flow(new C435721(null));
    }

    /* compiled from: DocumentFileDeleteWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileDeleteWorker$Response;", "", "<init>", "()V", "Success", "Error", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileDeleteWorker$Response$Error;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileDeleteWorker$Response$Success;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class Response {
        public /* synthetic */ Response(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: DocumentFileDeleteWorker.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileDeleteWorker$Response$Success;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileDeleteWorker$Response;", "<init>", "()V", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Success extends Response {
            public static final Success INSTANCE = new Success();

            private Success() {
                super(null);
            }
        }

        private Response() {
        }

        /* compiled from: DocumentFileDeleteWorker.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileDeleteWorker$Response$Error;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileDeleteWorker$Response;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "getCause", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Error extends Response {
            private final InternalErrorInfo cause;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.cause, ((Error) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            public String toString() {
                return "Error(cause=" + this.cause + ")";
            }

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

    /* compiled from: DocumentFileDeleteWorker.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileDeleteWorker$Factory;", "", "service", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentService;", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/network/DocumentService;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileDeleteWorker;", "sessionToken", "", "documentId", "remoteDocument", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "create$document_release", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Factory {
        private final DocumentService service;

        public Factory(DocumentService service) {
            Intrinsics.checkNotNullParameter(service, "service");
            this.service = service;
        }

        public final DocumentFileDeleteWorker create$document_release(String sessionToken, String documentId, DocumentFile.Remote remoteDocument) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            Intrinsics.checkNotNullParameter(remoteDocument, "remoteDocument");
            return new DocumentFileDeleteWorker(sessionToken, this.service, documentId, remoteDocument, null);
        }
    }
}
