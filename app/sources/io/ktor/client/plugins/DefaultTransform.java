package io.ktor.client.plugins;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.car.result.CarResultComposable2;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequest2;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.http.ContentTypes2;
import io.ktor.http.Headers3;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessage2;
import io.ktor.http.HttpMessageProperties;
import io.ktor.http.HttpMethod;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.content.TextContent;
import io.ktor.util.ByteChannels;
import io.ktor.util.PlatformUtils;
import io.ktor.util.logging.KtorSimpleLoggerJvm;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.p478io.ByteReadChannel2;
import io.ktor.utils.p478io.ByteReadChannelJVM;
import io.ktor.utils.p478io.Coroutines3;
import io.ktor.utils.p478io.Coroutines5;
import io.ktor.utils.p478io.core.ByteReadPacket;
import io.ktor.utils.p478io.core.Input;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.slf4j.Logger;

/* compiled from: DefaultTransform.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\"\u0012\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"LOGGER", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "defaultTransformers", "", "Lio/ktor/client/HttpClient;", "ktor-client-core"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.client.plugins.DefaultTransformKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class DefaultTransform {
    private static final Logger LOGGER = KtorSimpleLoggerJvm.KtorSimpleLogger("io.ktor.client.plugins.defaultTransformers");

    /* compiled from: DefaultTransform.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", CarResultComposable2.BODY}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1", m3645f = "DefaultTransform.kt", m3646l = {57}, m3647m = "invokeSuspend")
    /* renamed from: io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1 */
    static final class C455741 extends ContinuationImpl7 implements Function3<PipelineContext<Object, HttpRequest2>, Object, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C455741(Continuation<? super C455741> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(PipelineContext<Object, HttpRequest2> pipelineContext, Object obj, Continuation<? super Unit> continuation) {
            C455741 c455741 = new C455741(continuation);
            c455741.L$0 = pipelineContext;
            c455741.L$1 = obj;
            return c455741.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            OutgoingContent outgoingContentPlatformRequestDefaultTransform;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final PipelineContext pipelineContext = (PipelineContext) this.L$0;
                final Object obj2 = this.L$1;
                Headers3 headers = ((HttpRequest2) pipelineContext.getContext()).getHeaders();
                HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
                if (headers.get(httpHeaders.getAccept()) == null) {
                    ((HttpRequest2) pipelineContext.getContext()).getHeaders().append(httpHeaders.getAccept(), "*/*");
                }
                final ContentTypes2 contentTypes2ContentType = HttpMessageProperties.contentType((HttpMessage2) pipelineContext.getContext());
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (contentTypes2ContentType == null) {
                        contentTypes2ContentType = ContentTypes2.Text.INSTANCE.getPlain();
                    }
                    outgoingContentPlatformRequestDefaultTransform = new TextContent(str, contentTypes2ContentType, null, 4, null);
                } else if (obj2 instanceof byte[]) {
                    outgoingContentPlatformRequestDefaultTransform = new OutgoingContent.ByteArrayContent(contentTypes2ContentType, obj2) { // from class: io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1$content$1
                        final /* synthetic */ Object $body;
                        private final long contentLength;
                        private final ContentTypes2 contentType;

                        {
                            this.$body = obj2;
                            this.contentType = contentTypes2ContentType == null ? ContentTypes2.Application.INSTANCE.getOctetStream() : contentTypes2ContentType;
                            this.contentLength = ((byte[]) obj2).length;
                        }

                        @Override // io.ktor.http.content.OutgoingContent
                        public ContentTypes2 getContentType() {
                            return this.contentType;
                        }

                        @Override // io.ktor.http.content.OutgoingContent
                        public Long getContentLength() {
                            return Long.valueOf(this.contentLength);
                        }

                        @Override // io.ktor.http.content.OutgoingContent.ByteArrayContent
                        /* renamed from: bytes */
                        public byte[] getBytes() {
                            return (byte[]) this.$body;
                        }
                    };
                } else if (obj2 instanceof ByteReadChannelJVM) {
                    outgoingContentPlatformRequestDefaultTransform = new OutgoingContent.ReadChannelContent(pipelineContext, contentTypes2ContentType, obj2) { // from class: io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1$content$2
                        final /* synthetic */ Object $body;
                        private final Long contentLength;
                        private final ContentTypes2 contentType;

                        {
                            this.$body = obj2;
                            String str2 = pipelineContext.getContext().getHeaders().get(HttpHeaders.INSTANCE.getContentLength());
                            this.contentLength = str2 != null ? Long.valueOf(Long.parseLong(str2)) : null;
                            this.contentType = contentTypes2ContentType == null ? ContentTypes2.Application.INSTANCE.getOctetStream() : contentTypes2ContentType;
                        }

                        @Override // io.ktor.http.content.OutgoingContent
                        public Long getContentLength() {
                            return this.contentLength;
                        }

                        @Override // io.ktor.http.content.OutgoingContent
                        public ContentTypes2 getContentType() {
                            return this.contentType;
                        }

                        @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
                        public ByteReadChannelJVM readFrom() {
                            return (ByteReadChannelJVM) this.$body;
                        }
                    };
                } else {
                    outgoingContentPlatformRequestDefaultTransform = obj2 instanceof OutgoingContent ? (OutgoingContent) obj2 : DefaultTransformersJvm.platformRequestDefaultTransform(contentTypes2ContentType, (HttpRequest2) pipelineContext.getContext(), obj2);
                }
                if ((outgoingContentPlatformRequestDefaultTransform != null ? outgoingContentPlatformRequestDefaultTransform.getContentType() : null) != null) {
                    ((HttpRequest2) pipelineContext.getContext()).getHeaders().remove(httpHeaders.getContentType());
                    DefaultTransform.LOGGER.trace("Transformed with default transformers request body for " + ((HttpRequest2) pipelineContext.getContext()).getUrl() + " from " + Reflection.getOrCreateKotlinClass(obj2.getClass()));
                    this.L$0 = null;
                    this.label = 1;
                    if (pipelineContext.proceedWith(outgoingContentPlatformRequestDefaultTransform, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public static final void defaultTransformers(HttpClient httpClient) {
        Intrinsics.checkNotNullParameter(httpClient, "<this>");
        httpClient.getRequestPipeline().intercept(HttpRequestPipeline.INSTANCE.getRender(), new C455741(null));
        httpClient.getResponsePipeline().intercept(HttpResponsePipeline.INSTANCE.getParse(), new C455752(null));
        DefaultTransformersJvm.platformResponseDefaultTransformers(httpClient);
    }

    /* compiled from: DefaultTransform.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "<name for destructuring parameter 0>"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2", m3645f = "DefaultTransform.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE, EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE, EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE, 78, 78, 82, 90, 116, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2 */
    static final class C455752 extends ContinuationImpl7 implements Function3<PipelineContext<HttpResponseContainer, HttpClientCall>, HttpResponseContainer, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        Object L$3;
        int label;

        C455752(Continuation<? super C455752> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(PipelineContext<HttpResponseContainer, HttpClientCall> pipelineContext, HttpResponseContainer httpResponseContainer, Continuation<? super Unit> continuation) {
            C455752 c455752 = new C455752(continuation);
            c455752.L$0 = pipelineContext;
            c455752.L$1 = httpResponseContainer;
            return c455752.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x015e  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01b4  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01f9  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x022a  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x022e  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0268  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x02f1  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            PipelineContext pipelineContext;
            TypeInfo expectedType;
            HttpResponse response;
            Object objProceedWith;
            PipelineContext pipelineContext2;
            Object objProceedWith2;
            Object byteArray;
            PipelineContext pipelineContext3;
            Object remaining$default;
            PipelineContext pipelineContext4;
            PipelineContext pipelineContext5;
            TypeInfo typeInfo;
            Object remaining$default2;
            PipelineContext pipelineContext6;
            PipelineContext pipelineContext7;
            Object objProceedWith3;
            Object objProceedWith4;
            PipelineContext pipelineContext8;
            Object objProceedWith5;
            byte[] bArr;
            Long lContentLength;
            boolean z;
            Object objProceedWith6;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            HttpResponseContainer httpResponseContainer = null;
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    pipelineContext = (PipelineContext) this.L$0;
                    HttpResponseContainer httpResponseContainer2 = (HttpResponseContainer) this.L$1;
                    expectedType = httpResponseContainer2.getExpectedType();
                    Object response2 = httpResponseContainer2.getResponse();
                    if (!(response2 instanceof ByteReadChannelJVM)) {
                        return Unit.INSTANCE;
                    }
                    response = ((HttpClientCall) pipelineContext.getContext()).getResponse();
                    KClass<?> type2 = expectedType.getType();
                    if (Intrinsics.areEqual(type2, Reflection.getOrCreateKotlinClass(Unit.class))) {
                        ByteReadChannel2.cancel((ByteReadChannelJVM) response2);
                        HttpResponseContainer httpResponseContainer3 = new HttpResponseContainer(expectedType, Unit.INSTANCE);
                        this.L$0 = pipelineContext;
                        this.L$1 = expectedType;
                        this.label = 1;
                        objProceedWith3 = pipelineContext.proceedWith(httpResponseContainer3, this);
                        if (objProceedWith3 != coroutine_suspended) {
                            pipelineContext2 = pipelineContext;
                            httpResponseContainer = (HttpResponseContainer) objProceedWith3;
                            pipelineContext = pipelineContext2;
                            if (httpResponseContainer != null) {
                                DefaultTransform.LOGGER.trace("Transformed with default transformers response body for " + ((HttpClientCall) pipelineContext.getContext()).getRequest().getUrl() + " to " + expectedType.getType());
                            }
                            return Unit.INSTANCE;
                        }
                    } else if (Intrinsics.areEqual(type2, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                        this.L$0 = pipelineContext;
                        this.L$1 = expectedType;
                        this.L$2 = pipelineContext;
                        this.L$3 = expectedType;
                        this.label = 2;
                        remaining$default2 = ByteReadChannelJVM.DefaultImpls.readRemaining$default((ByteReadChannelJVM) response2, 0L, this, 1, null);
                        if (remaining$default2 != coroutine_suspended) {
                            pipelineContext6 = pipelineContext;
                            pipelineContext7 = pipelineContext6;
                            typeInfo = expectedType;
                            HttpResponseContainer httpResponseContainer4 = new HttpResponseContainer(expectedType, boxing.boxInt(Integer.parseInt(Input.readText$default((Input) remaining$default2, 0, 0, 3, null))));
                            this.L$0 = pipelineContext7;
                            this.L$1 = typeInfo;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 3;
                            objProceedWith4 = pipelineContext6.proceedWith(httpResponseContainer4, this);
                            if (objProceedWith4 != coroutine_suspended) {
                                pipelineContext8 = pipelineContext7;
                                httpResponseContainer = (HttpResponseContainer) objProceedWith4;
                                pipelineContext = pipelineContext8;
                                expectedType = typeInfo;
                                if (httpResponseContainer != null) {
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    } else {
                        if (Intrinsics.areEqual(type2, Reflection.getOrCreateKotlinClass(ByteReadPacket.class)) ? true : Intrinsics.areEqual(type2, Reflection.getOrCreateKotlinClass(Input.class))) {
                            this.L$0 = pipelineContext;
                            this.L$1 = expectedType;
                            this.L$2 = pipelineContext;
                            this.L$3 = expectedType;
                            this.label = 4;
                            remaining$default = ByteReadChannelJVM.DefaultImpls.readRemaining$default((ByteReadChannelJVM) response2, 0L, this, 1, null);
                            if (remaining$default != coroutine_suspended) {
                                pipelineContext4 = pipelineContext;
                                pipelineContext5 = pipelineContext4;
                                typeInfo = expectedType;
                                HttpResponseContainer httpResponseContainer5 = new HttpResponseContainer(expectedType, remaining$default);
                                this.L$0 = pipelineContext5;
                                this.L$1 = typeInfo;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 5;
                                objProceedWith5 = pipelineContext4.proceedWith(httpResponseContainer5, this);
                                if (objProceedWith5 != coroutine_suspended) {
                                    pipelineContext8 = pipelineContext5;
                                    httpResponseContainer = (HttpResponseContainer) objProceedWith5;
                                    pipelineContext = pipelineContext8;
                                    expectedType = typeInfo;
                                    if (httpResponseContainer != null) {
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        } else if (Intrinsics.areEqual(type2, Reflection.getOrCreateKotlinClass(byte[].class))) {
                            this.L$0 = pipelineContext;
                            this.L$1 = expectedType;
                            this.L$2 = response;
                            this.label = 6;
                            byteArray = ByteChannels.toByteArray((ByteReadChannelJVM) response2, this);
                            if (byteArray != coroutine_suspended) {
                                pipelineContext3 = pipelineContext;
                                bArr = (byte[]) byteArray;
                                lContentLength = HttpMessageProperties.contentLength(response);
                                z = PlatformUtils.INSTANCE.getIS_BROWSER() && response.getHeaders().get(HttpHeaders.INSTANCE.getContentEncoding()) == null;
                                boolean zAreEqual = Intrinsics.areEqual(((HttpClientCall) pipelineContext3.getContext()).getRequest().getMethod(), HttpMethod.INSTANCE.getHead());
                                if (z && !zAreEqual && lContentLength != null && lContentLength.longValue() > 0) {
                                    if (!(bArr.length == ((int) lContentLength.longValue()))) {
                                        throw new IllegalStateException(("Expected " + lContentLength + ", actual " + bArr.length).toString());
                                    }
                                }
                                HttpResponseContainer httpResponseContainer6 = new HttpResponseContainer(expectedType, bArr);
                                this.L$0 = pipelineContext3;
                                this.L$1 = expectedType;
                                this.L$2 = null;
                                this.label = 7;
                                objProceedWith6 = pipelineContext3.proceedWith(httpResponseContainer6, this);
                                if (objProceedWith6 != coroutine_suspended) {
                                    pipelineContext2 = pipelineContext3;
                                    httpResponseContainer = (HttpResponseContainer) objProceedWith6;
                                    pipelineContext = pipelineContext2;
                                    if (httpResponseContainer != null) {
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        } else {
                            if (!Intrinsics.areEqual(type2, Reflection.getOrCreateKotlinClass(ByteReadChannelJVM.class))) {
                                if (Intrinsics.areEqual(type2, Reflection.getOrCreateKotlinClass(HttpStatusCode.class))) {
                                    ByteReadChannel2.cancel((ByteReadChannelJVM) response2);
                                    HttpResponseContainer httpResponseContainer7 = new HttpResponseContainer(expectedType, response.getStatus());
                                    this.L$0 = pipelineContext;
                                    this.L$1 = expectedType;
                                    this.label = 9;
                                    objProceedWith = pipelineContext.proceedWith(httpResponseContainer7, this);
                                    if (objProceedWith != coroutine_suspended) {
                                        pipelineContext2 = pipelineContext;
                                        httpResponseContainer = (HttpResponseContainer) objProceedWith;
                                        pipelineContext = pipelineContext2;
                                    }
                                }
                                if (httpResponseContainer != null) {
                                }
                                return Unit.INSTANCE;
                            }
                            final CompletableJob completableJobJob = JobKt.Job((Job) response.getCoroutineContext().get(Job.INSTANCE));
                            Coroutines5 coroutines5Writer$default = Coroutines3.writer$default((CoroutineScope) pipelineContext, response.getCoroutineContext(), false, (Function2) new DefaultTransform4(response2, response, null), 2, (Object) null);
                            coroutines5Writer$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2$result$channel$2$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                    invoke2(th);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Throwable th) {
                                    completableJobJob.complete();
                                }
                            });
                            HttpResponseContainer httpResponseContainer8 = new HttpResponseContainer(expectedType, coroutines5Writer$default.getChannel());
                            this.L$0 = pipelineContext;
                            this.L$1 = expectedType;
                            this.label = 8;
                            objProceedWith2 = pipelineContext.proceedWith(httpResponseContainer8, this);
                            if (objProceedWith2 != coroutine_suspended) {
                                pipelineContext2 = pipelineContext;
                                httpResponseContainer = (HttpResponseContainer) objProceedWith2;
                                pipelineContext = pipelineContext2;
                                if (httpResponseContainer != null) {
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    TypeInfo typeInfo2 = (TypeInfo) this.L$1;
                    pipelineContext2 = (PipelineContext) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    expectedType = typeInfo2;
                    objProceedWith3 = obj;
                    httpResponseContainer = (HttpResponseContainer) objProceedWith3;
                    pipelineContext = pipelineContext2;
                    if (httpResponseContainer != null) {
                    }
                    return Unit.INSTANCE;
                case 2:
                    TypeInfo typeInfo3 = (TypeInfo) this.L$3;
                    pipelineContext6 = (PipelineContext) this.L$2;
                    typeInfo = (TypeInfo) this.L$1;
                    pipelineContext7 = (PipelineContext) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    expectedType = typeInfo3;
                    remaining$default2 = obj;
                    HttpResponseContainer httpResponseContainer42 = new HttpResponseContainer(expectedType, boxing.boxInt(Integer.parseInt(Input.readText$default((Input) remaining$default2, 0, 0, 3, null))));
                    this.L$0 = pipelineContext7;
                    this.L$1 = typeInfo;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 3;
                    objProceedWith4 = pipelineContext6.proceedWith(httpResponseContainer42, this);
                    if (objProceedWith4 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 3:
                    TypeInfo typeInfo4 = (TypeInfo) this.L$1;
                    pipelineContext8 = (PipelineContext) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    typeInfo = typeInfo4;
                    objProceedWith4 = obj;
                    httpResponseContainer = (HttpResponseContainer) objProceedWith4;
                    pipelineContext = pipelineContext8;
                    expectedType = typeInfo;
                    if (httpResponseContainer != null) {
                    }
                    return Unit.INSTANCE;
                case 4:
                    TypeInfo typeInfo5 = (TypeInfo) this.L$3;
                    pipelineContext4 = (PipelineContext) this.L$2;
                    typeInfo = (TypeInfo) this.L$1;
                    pipelineContext5 = (PipelineContext) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    expectedType = typeInfo5;
                    remaining$default = obj;
                    HttpResponseContainer httpResponseContainer52 = new HttpResponseContainer(expectedType, remaining$default);
                    this.L$0 = pipelineContext5;
                    this.L$1 = typeInfo;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 5;
                    objProceedWith5 = pipelineContext4.proceedWith(httpResponseContainer52, this);
                    if (objProceedWith5 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 5:
                    TypeInfo typeInfo6 = (TypeInfo) this.L$1;
                    pipelineContext8 = (PipelineContext) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    typeInfo = typeInfo6;
                    objProceedWith5 = obj;
                    httpResponseContainer = (HttpResponseContainer) objProceedWith5;
                    pipelineContext = pipelineContext8;
                    expectedType = typeInfo;
                    if (httpResponseContainer != null) {
                    }
                    return Unit.INSTANCE;
                case 6:
                    HttpResponse httpResponse = (HttpResponse) this.L$2;
                    TypeInfo typeInfo7 = (TypeInfo) this.L$1;
                    pipelineContext3 = (PipelineContext) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    expectedType = typeInfo7;
                    response = httpResponse;
                    byteArray = obj;
                    bArr = (byte[]) byteArray;
                    lContentLength = HttpMessageProperties.contentLength(response);
                    if (PlatformUtils.INSTANCE.getIS_BROWSER()) {
                        boolean zAreEqual2 = Intrinsics.areEqual(((HttpClientCall) pipelineContext3.getContext()).getRequest().getMethod(), HttpMethod.INSTANCE.getHead());
                        if (z) {
                            if (!(bArr.length == ((int) lContentLength.longValue()))) {
                            }
                            break;
                        }
                        HttpResponseContainer httpResponseContainer62 = new HttpResponseContainer(expectedType, bArr);
                        this.L$0 = pipelineContext3;
                        this.L$1 = expectedType;
                        this.L$2 = null;
                        this.label = 7;
                        objProceedWith6 = pipelineContext3.proceedWith(httpResponseContainer62, this);
                        if (objProceedWith6 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (httpResponseContainer != null) {
                    }
                    return Unit.INSTANCE;
                case 7:
                    TypeInfo typeInfo8 = (TypeInfo) this.L$1;
                    pipelineContext2 = (PipelineContext) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    expectedType = typeInfo8;
                    objProceedWith6 = obj;
                    httpResponseContainer = (HttpResponseContainer) objProceedWith6;
                    pipelineContext = pipelineContext2;
                    if (httpResponseContainer != null) {
                    }
                    return Unit.INSTANCE;
                case 8:
                    TypeInfo typeInfo9 = (TypeInfo) this.L$1;
                    pipelineContext2 = (PipelineContext) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    expectedType = typeInfo9;
                    objProceedWith2 = obj;
                    httpResponseContainer = (HttpResponseContainer) objProceedWith2;
                    pipelineContext = pipelineContext2;
                    if (httpResponseContainer != null) {
                    }
                    return Unit.INSTANCE;
                case 9:
                    TypeInfo typeInfo10 = (TypeInfo) this.L$1;
                    pipelineContext2 = (PipelineContext) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    expectedType = typeInfo10;
                    objProceedWith = obj;
                    httpResponseContainer = (HttpResponseContainer) objProceedWith;
                    pipelineContext = pipelineContext2;
                    if (httpResponseContainer != null) {
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
