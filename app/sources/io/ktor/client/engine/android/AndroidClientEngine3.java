package io.ktor.client.engine.android;

import io.ktor.client.call.UnsupportedContentTypeException;
import io.ktor.http.HttpMethod;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.p478io.ByteReadChannelJVM;
import io.ktor.utils.p478io.Coroutines3;
import io.ktor.utils.p478io.jvm.javaio.Writing2;
import java.io.OutputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.p481io.Closeable;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope3;

/* compiled from: AndroidClientEngine.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\n\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m3636d2 = {"METHODS_WITHOUT_BODY", "", "Lio/ktor/http/HttpMethod;", "writeTo", "", "Lio/ktor/http/content/OutgoingContent;", "stream", "Ljava/io/OutputStream;", "callContext", "Lkotlin/coroutines/CoroutineContext;", "(Lio/ktor/http/content/OutgoingContent;Ljava/io/OutputStream;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-android"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.client.engine.android.AndroidClientEngineKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class AndroidClientEngine3 {
    private static final List<HttpMethod> METHODS_WITHOUT_BODY;

    /* compiled from: AndroidClientEngine.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.client.engine.android.AndroidClientEngineKt", m3645f = "AndroidClientEngine.kt", m3646l = {116, 123}, m3647m = "writeTo")
    /* renamed from: io.ktor.client.engine.android.AndroidClientEngineKt$writeTo$1 */
    static final class C455671 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C455671(Continuation<? super C455671> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidClientEngine3.writeTo(null, null, null, this);
        }
    }

    static {
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        METHODS_WITHOUT_BODY = CollectionsKt.listOf((Object[]) new HttpMethod[]{companion.getGet(), companion.getHead()});
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
    
        if (io.ktor.utils.p478io.jvm.javaio.Writing2.copyTo$default(r0, r1, 0, r4, 2, null) == r7) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r15v0, types: [io.ktor.http.content.OutgoingContent] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object writeTo(OutgoingContent outgoingContent, OutputStream outputStream, CoroutineContext coroutineContext, Continuation<? super Unit> continuation) {
        C455671 c455671;
        Object obj;
        OutputStream outputStream2 = outputStream;
        if (continuation instanceof C455671) {
            c455671 = (C455671) continuation;
            int i = c455671.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c455671.label = i - Integer.MIN_VALUE;
            } else {
                c455671 = new C455671(continuation);
            }
        }
        C455671 c4556712 = c455671;
        Object objCopyTo$default = c4556712.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4556712.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCopyTo$default);
                try {
                } catch (Throwable th) {
                    th = th;
                    outputStream2 = outputStream;
                }
                try {
                    if (!(outgoingContent instanceof OutgoingContent.ByteArrayContent)) {
                        if (outgoingContent instanceof OutgoingContent.ReadChannelContent) {
                            ByteReadChannelJVM from = ((OutgoingContent.ReadChannelContent) outgoingContent).readFrom();
                            c4556712.L$0 = outputStream2;
                            c4556712.label = 1;
                            objCopyTo$default = Writing2.copyTo$default(from, outputStream2, 0L, c4556712, 2, null);
                            if (objCopyTo$default != coroutine_suspended) {
                                obj = outputStream2;
                                ((Number) objCopyTo$default).longValue();
                                outgoingContent = obj;
                            }
                        } else if (outgoingContent instanceof OutgoingContent.WriteChannelContent) {
                            ByteReadChannelJVM channel = Coroutines3.writer$default((CoroutineScope) CoroutineScope3.INSTANCE, coroutineContext, false, (Function2) new AndroidClientEngine4(outgoingContent, null), 2, (Object) null).getChannel();
                            c4556712.L$0 = outputStream2;
                            c4556712.label = 2;
                        } else if (!(outgoingContent instanceof OutgoingContent.NoContent)) {
                            throw new UnsupportedContentTypeException(outgoingContent);
                        }
                        return coroutine_suspended;
                    }
                    outputStream2.write(((OutgoingContent.ByteArrayContent) outgoingContent).getBytes());
                    outgoingContent = outputStream;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        Closeable.closeFinally(outputStream2, th3);
                        throw th4;
                    }
                }
            } else if (i2 == 1) {
                Object obj2 = (java.io.Closeable) c4556712.L$0;
                ResultKt.throwOnFailure(objCopyTo$default);
                obj = obj2;
                ((Number) objCopyTo$default).longValue();
                outgoingContent = obj;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.io.Closeable closeable = (java.io.Closeable) c4556712.L$0;
                ResultKt.throwOnFailure(objCopyTo$default);
                outgoingContent = closeable;
            }
            Unit unit = Unit.INSTANCE;
            Closeable.closeFinally(outgoingContent, null);
            return Unit.INSTANCE;
        } catch (Throwable th5) {
            th = th5;
            outputStream2 = outgoingContent;
        }
    }
}
