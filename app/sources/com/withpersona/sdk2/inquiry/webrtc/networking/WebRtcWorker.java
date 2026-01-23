package com.withpersona.sdk2.inquiry.webrtc.networking;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.workflow1.Worker;
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

/* compiled from: WebRtcWorker.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/webrtc/networking/WebRtcWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/WebRtcWorker$Response;", "service", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/WebRtcService;", "jwt", "", "<init>", "(Lcom/withpersona/sdk2/inquiry/webrtc/networking/WebRtcService;Ljava/lang/String;)V", "run", "Lkotlinx/coroutines/flow/Flow;", "Response", "Factory", "webrtc_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class WebRtcWorker implements Worker<Response> {
    private final String jwt;
    private final WebRtcService service;

    public WebRtcWorker(WebRtcService service, String str) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.service = service;
        this.jwt = str;
    }

    @Override // com.squareup.workflow1.Worker
    public boolean doesSameWorkAs(Worker<?> worker) {
        return Worker.DefaultImpls.doesSameWorkAs(this, worker);
    }

    /* compiled from: WebRtcWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/webrtc/networking/WebRtcWorker$Response;", "", "<init>", "()V", "Success", "Error", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/WebRtcWorker$Response$Error;", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/WebRtcWorker$Response$Success;", "webrtc_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class Response {
        public /* synthetic */ Response(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: WebRtcWorker.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/webrtc/networking/WebRtcWorker$Response$Success;", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/WebRtcWorker$Response;", "result", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;", "<init>", "(Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;)V", "getResult", "()Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;", "webrtc_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Success extends Response {
            private final AuthorizeWebRtcResponse result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(AuthorizeWebRtcResponse result) {
                super(null);
                Intrinsics.checkNotNullParameter(result, "result");
                this.result = result;
            }

            public final AuthorizeWebRtcResponse getResult() {
                return this.result;
            }
        }

        private Response() {
        }

        /* compiled from: WebRtcWorker.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/webrtc/networking/WebRtcWorker$Response$Error;", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/WebRtcWorker$Response;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "getCause", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "webrtc_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
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
        }
    }

    /* compiled from: WebRtcWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/webrtc/networking/WebRtcWorker$Factory;", "", "service", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/WebRtcService;", "<init>", "(Lcom/withpersona/sdk2/inquiry/webrtc/networking/WebRtcService;)V", "getService", "()Lcom/withpersona/sdk2/inquiry/webrtc/networking/WebRtcService;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/webrtc/networking/WebRtcWorker;", "jwt", "", "webrtc_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Factory {
        private final WebRtcService service;

        public Factory(WebRtcService service) {
            Intrinsics.checkNotNullParameter(service, "service");
            this.service = service;
        }

        public final WebRtcService getService() {
            return this.service;
        }

        public final WebRtcWorker create(String jwt) {
            return new WebRtcWorker(this.service, jwt);
        }
    }

    /* compiled from: WebRtcWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/WebRtcWorker$Response;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1", m3645f = "WebRtcWorker.kt", m3646l = {36, 40, 42, 53}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1 */
    static final class C437831 extends ContinuationImpl7 implements Function2<FlowCollector<? super Response>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        C437831(Continuation<? super C437831> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C437831 c437831 = WebRtcWorker.this.new C437831(continuation);
            c437831.L$0 = obj;
            return c437831;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Response> flowCollector, Continuation<? super Unit> continuation) {
            return ((C437831) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: WebRtcWorker.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1$1", m3645f = "WebRtcWorker.kt", m3646l = {37}, m3647m = "invokeSuspend")
        /* renamed from: com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function1<Continuation<? super retrofit2.Response<AuthorizeWebRtcResponse>>, Object> {
            int label;
            final /* synthetic */ WebRtcWorker this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(WebRtcWorker webRtcWorker, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = webRtcWorker;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super retrofit2.Response<AuthorizeWebRtcResponse>> continuation) {
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
                WebRtcService webRtcService = this.this$0.service;
                String str = this.this$0.jwt;
                this.label = 1;
                Object objRequestServerConfig = webRtcService.requestServerConfig(str, this);
                return objRequestServerConfig == coroutine_suspended ? coroutine_suspended : objRequestServerConfig;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
        
            if (r1.emit(r4, r14) == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
        
            r4 = r1;
            r1 = r15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
        
            if (r1.emit(r5, r14) == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
        
            if (r1.emit(r5, r14) == r0) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            NetworkCallResult networkCallResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(WebRtcWorker.this, null);
                this.L$0 = flowCollector2;
                this.label = 1;
                Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(anonymousClass1, this);
                if (objEnqueueRetriableRequestWithRetry != coroutine_suspended) {
                    flowCollector = flowCollector2;
                    obj = objEnqueueRetriableRequestWithRetry;
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
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                networkCallResult = networkCallResult2;
                flowCollector = flowCollector3;
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
            networkCallResult = (NetworkCallResult) obj;
            if (networkCallResult instanceof NetworkCallResult.Success) {
                AuthorizeWebRtcResponse authorizeWebRtcResponse = (AuthorizeWebRtcResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                if (authorizeWebRtcResponse != null) {
                    Response.Success success = new Response.Success(authorizeWebRtcResponse);
                    this.L$0 = flowCollector;
                    this.L$1 = networkCallResult;
                    this.label = 2;
                } else {
                    Response.Error error2 = new Response.Error(new InternalErrorInfo.NetworkErrorInfo(0, "Expected body to be non-null.", false, null, 8, null));
                    this.L$0 = flowCollector;
                    this.L$1 = networkCallResult;
                    this.label = 3;
                }
                networkCallResult = networkCallResult2;
                flowCollector = flowCollector3;
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
        return FlowKt.flow(new C437831(null));
    }
}
