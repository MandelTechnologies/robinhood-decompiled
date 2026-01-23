package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpSend;
import io.ktor.client.request.HttpRequest2;
import io.ktor.http.HttpMessage2;
import io.ktor.http.HttpMessageProperties;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.content.OutgoingContent2;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.reflect.TypeInfoJvm;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.Progressions2;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVM5;
import kotlin.text.StringsKt;

/* compiled from: HttpSend.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "content"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "io.ktor.client.plugins.HttpSend$Plugin$install$1", m3645f = "HttpSend.kt", m3646l = {104, 105}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: io.ktor.client.plugins.HttpSend$Plugin$install$1, reason: use source file name */
/* loaded from: classes14.dex */
final class HttpSend3 extends ContinuationImpl7 implements Function3<PipelineContext<Object, HttpRequest2>, Object, Continuation<? super Unit>, Object> {
    final /* synthetic */ HttpSend $plugin;
    final /* synthetic */ HttpClient $scope;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpSend3(HttpSend httpSend, HttpClient httpClient, Continuation<? super HttpSend3> continuation) {
        super(3, continuation);
        this.$plugin = httpSend;
        this.$scope = httpClient;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<Object, HttpRequest2> pipelineContext, Object obj, Continuation<? super Unit> continuation) {
        HttpSend3 httpSend3 = new HttpSend3(this.$plugin, this.$scope, continuation);
        httpSend3.L$0 = pipelineContext;
        httpSend3.L$1 = obj;
        return httpSend3.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e0, code lost:
    
        if (r1.proceedWith((io.ktor.client.call.HttpClientCall) r11, r10) == r0) goto L27;
     */
    /* JADX WARN: Type inference failed for: r11v15, types: [T, io.ktor.client.plugins.HttpSend$DefaultSender] */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, io.ktor.client.plugins.HttpSend$InterceptedSender] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PipelineContext pipelineContext;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            pipelineContext = (PipelineContext) this.L$0;
            Object obj2 = this.L$1;
            if (!(obj2 instanceof OutgoingContent)) {
                throw new IllegalStateException(StringsKt.trimMargin$default("\n|Fail to prepare request body for sending. \n|The body type is: " + Reflection.getOrCreateKotlinClass(obj2.getClass()) + ", with Content-Type: " + HttpMessageProperties.contentType((HttpMessage2) pipelineContext.getContext()) + ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header.", null, 1, null).toString());
            }
            HttpRequest2 httpRequest2 = (HttpRequest2) pipelineContext.getContext();
            if (obj2 == null) {
                httpRequest2.setBody(OutgoingContent2.INSTANCE);
                KType kTypeTypeOf = Reflection.typeOf(OutgoingContent.class);
                httpRequest2.setBodyType(TypeInfoJvm.typeInfoImpl(TypesJVM5.getJavaType(kTypeTypeOf), Reflection.getOrCreateKotlinClass(OutgoingContent.class), kTypeTypeOf));
            } else if (obj2 != null) {
                httpRequest2.setBody(obj2);
                httpRequest2.setBodyType(null);
            } else {
                httpRequest2.setBody(obj2);
                KType kTypeTypeOf2 = Reflection.typeOf(OutgoingContent.class);
                httpRequest2.setBodyType(TypeInfoJvm.typeInfoImpl(TypesJVM5.getJavaType(kTypeTypeOf2), Reflection.getOrCreateKotlinClass(OutgoingContent.class), kTypeTypeOf2));
            }
            ?? defaultSender = new HttpSend.DefaultSender(this.$plugin.maxSendCount, this.$scope);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = defaultSender;
            Progressions2 progressions2DownTo = RangesKt.downTo(CollectionsKt.getLastIndex(this.$plugin.interceptors), 0);
            HttpSend httpSend = this.$plugin;
            Iterator<Integer> it = progressions2DownTo.iterator();
            while (it.hasNext()) {
                objectRef.element = new HttpSend.InterceptedSender((Function3) httpSend.interceptors.get(((PrimitiveIterators6) it).nextInt()), (HttpSend5) objectRef.element);
            }
            HttpSend5 httpSend5 = (HttpSend5) objectRef.element;
            HttpRequest2 httpRequest22 = (HttpRequest2) pipelineContext.getContext();
            this.L$0 = pipelineContext;
            this.label = 1;
            obj = httpSend5.execute(httpRequest22, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        pipelineContext = (PipelineContext) this.L$0;
        ResultKt.throwOnFailure(obj);
        this.L$0 = null;
        this.label = 2;
    }
}
