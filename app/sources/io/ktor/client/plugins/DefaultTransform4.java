package io.ktor.client.plugins;

import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponse2;
import io.ktor.utils.p478io.ByteReadChannelJVM;
import io.ktor.utils.p478io.ByteReadChannelJVM3;
import io.ktor.utils.p478io.ByteWriteChannel;
import io.ktor.utils.p478io.Coroutines6;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: DefaultTransform.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2$result$channel$1", m3645f = "DefaultTransform.kt", m3646l = {100}, m3647m = "invokeSuspend")
/* renamed from: io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2$result$channel$1, reason: use source file name */
/* loaded from: classes14.dex */
final class DefaultTransform4 extends ContinuationImpl7 implements Function2<Coroutines6, Continuation<? super Unit>, Object> {
    final /* synthetic */ Object $body;
    final /* synthetic */ HttpResponse $response;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultTransform4(Object obj, HttpResponse httpResponse, Continuation<? super DefaultTransform4> continuation) {
        super(2, continuation);
        this.$body = obj;
        this.$response = httpResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultTransform4 defaultTransform4 = new DefaultTransform4(this.$body, this.$response, continuation);
        defaultTransform4.L$0 = obj;
        return defaultTransform4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Coroutines6 coroutines6, Continuation<? super Unit> continuation) {
        return ((DefaultTransform4) create(coroutines6, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Coroutines6 coroutines6 = (Coroutines6) this.L$0;
                ByteReadChannelJVM byteReadChannelJVM = (ByteReadChannelJVM) this.$body;
                ByteWriteChannel channel = coroutines6.getChannel();
                this.label = 1;
                if (ByteReadChannelJVM3.copyTo(byteReadChannelJVM, channel, Long.MAX_VALUE, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                try {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th) {
                    HttpResponse2.complete(this.$response);
                    throw th;
                }
            }
            HttpResponse2.complete(this.$response);
            return Unit.INSTANCE;
        } catch (CancellationException e) {
            CoroutineScope2.cancel(this.$response, e);
            throw e;
        } catch (Throwable th2) {
            CoroutineScope2.cancel(this.$response, "Receive failed", th2);
            throw th2;
        }
    }
}
