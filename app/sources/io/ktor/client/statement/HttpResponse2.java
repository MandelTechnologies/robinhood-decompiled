package io.ktor.client.statement;

import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequest;
import io.ktor.http.HttpMessageProperties;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.util.reflect.TypeInfoJvm;
import io.ktor.utils.p478io.charsets.Encoding2;
import io.ktor.utils.p478io.core.ByteReadPacket;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVM5;
import kotlin.text.Charsets;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;

/* compiled from: HttpResponse.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\b\u001a\u00020\u0007*\u00020\u00002\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0015\u0010\r\u001a\u00020\n*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m3636d2 = {"Lio/ktor/client/statement/HttpResponse;", "", "complete", "(Lio/ktor/client/statement/HttpResponse;)V", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "fallbackCharset", "", "bodyAsText", "(Lio/ktor/client/statement/HttpResponse;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/request/HttpRequest;", "getRequest", "(Lio/ktor/client/statement/HttpResponse;)Lio/ktor/client/request/HttpRequest;", "request", "ktor-client-core"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.client.statement.HttpResponseKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class HttpResponse2 {

    /* compiled from: HttpResponse.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.client.statement.HttpResponseKt", m3645f = "HttpResponse.kt", m3646l = {97}, m3647m = "bodyAsText")
    /* renamed from: io.ktor.client.statement.HttpResponseKt$bodyAsText$1 */
    static final class C455871 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C455871(Continuation<? super C455871> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpResponse2.bodyAsText(null, null, this);
        }
    }

    public static final HttpRequest getRequest(HttpResponse httpResponse) {
        Intrinsics.checkNotNullParameter(httpResponse, "<this>");
        return httpResponse.getCall().getRequest();
    }

    @PublishedApi
    public static final void complete(HttpResponse httpResponse) {
        Intrinsics.checkNotNullParameter(httpResponse, "<this>");
        CoroutineContext.Element element = httpResponse.getCoroutineContext().get(Job.INSTANCE);
        Intrinsics.checkNotNull(element);
        ((CompletableJob) element).complete();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bodyAsText(HttpResponse httpResponse, Charset charset, Continuation<? super String> continuation) {
        C455871 c455871;
        CharsetDecoder decoder;
        if (continuation instanceof C455871) {
            c455871 = (C455871) continuation;
            int i = c455871.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c455871.label = i - Integer.MIN_VALUE;
            } else {
                c455871 = new C455871(continuation);
            }
        }
        Object objBodyNullable = c455871.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c455871.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objBodyNullable);
            Charset charset2 = HttpMessageProperties.charset(httpResponse);
            if (charset2 != null) {
                charset = charset2;
            }
            CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
            HttpClientCall call = httpResponse.getCall();
            KType kTypeTypeOf = Reflection.typeOf(ByteReadPacket.class);
            TypeInfo typeInfoTypeInfoImpl = TypeInfoJvm.typeInfoImpl(TypesJVM5.getJavaType(kTypeTypeOf), Reflection.getOrCreateKotlinClass(ByteReadPacket.class), kTypeTypeOf);
            c455871.L$0 = charsetDecoderNewDecoder;
            c455871.label = 1;
            objBodyNullable = call.bodyNullable(typeInfoTypeInfoImpl, c455871);
            if (objBodyNullable == coroutine_suspended) {
                return coroutine_suspended;
            }
            decoder = charsetDecoderNewDecoder;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            decoder = (CharsetDecoder) c455871.L$0;
            ResultKt.throwOnFailure(objBodyNullable);
        }
        if (objBodyNullable != null) {
            Intrinsics.checkNotNullExpressionValue(decoder, "decoder");
            return Encoding2.decode$default(decoder, (ByteReadPacket) objBodyNullable, 0, 2, null);
        }
        throw new NullPointerException("null cannot be cast to non-null type io.ktor.utils.io.core.ByteReadPacket");
    }

    public static /* synthetic */ Object bodyAsText$default(HttpResponse httpResponse, Charset charset, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return bodyAsText(httpResponse, charset, continuation);
    }
}
