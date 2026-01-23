package io.ktor.client.network.sockets;

import io.ktor.client.request.HttpRequestData;
import io.ktor.util.PlatformUtils;
import io.ktor.utils.p478io.ByteChannelCtor;
import io.ktor.utils.p478io.ByteReadChannel2;
import io.ktor.utils.p478io.ByteReadChannelJVM;
import io.ktor.utils.p478io.Coroutines3;
import io.ktor.utils.p478io.Coroutines6;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TimeoutExceptionsCommon.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lio/ktor/utils/io/ByteReadChannel;", "input", "Lio/ktor/client/request/HttpRequestData;", "request", "mapEngineExceptions", "(Lkotlinx/coroutines/CoroutineScope;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/client/request/HttpRequestData;)Lio/ktor/utils/io/ByteReadChannel;", "ktor-client-core"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.client.network.sockets.TimeoutExceptionsCommonKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class TimeoutExceptionsCommon {
    public static final ByteReadChannelJVM mapEngineExceptions(CoroutineScope coroutineScope, ByteReadChannelJVM input, HttpRequestData request) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(request, "request");
        if (PlatformUtils.INSTANCE.getIS_NATIVE()) {
            return input;
        }
        ByteChannelCtor byteChannelCtorByteChannelWithMappedExceptions = TimeoutExceptions3.ByteChannelWithMappedExceptions(request);
        Coroutines3.writer$default(coroutineScope, (CoroutineContext) null, byteChannelCtorByteChannelWithMappedExceptions, new C455691(input, byteChannelCtorByteChannelWithMappedExceptions, null), 1, (Object) null);
        return byteChannelCtorByteChannelWithMappedExceptions;
    }

    /* compiled from: TimeoutExceptionsCommon.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.client.network.sockets.TimeoutExceptionsCommonKt$mapEngineExceptions$1", m3645f = "TimeoutExceptionsCommon.kt", m3646l = {39}, m3647m = "invokeSuspend")
    /* renamed from: io.ktor.client.network.sockets.TimeoutExceptionsCommonKt$mapEngineExceptions$1 */
    static final class C455691 extends ContinuationImpl7 implements Function2<Coroutines6, Continuation<? super Unit>, Object> {
        final /* synthetic */ ByteReadChannelJVM $input;
        final /* synthetic */ ByteChannelCtor $replacementChannel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C455691(ByteReadChannelJVM byteReadChannelJVM, ByteChannelCtor byteChannelCtor, Continuation<? super C455691> continuation) {
            super(2, continuation);
            this.$input = byteReadChannelJVM;
            this.$replacementChannel = byteChannelCtor;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C455691(this.$input, this.$replacementChannel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Coroutines6 coroutines6, Continuation<? super Unit> continuation) {
            return ((C455691) create(coroutines6, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C455691 c455691;
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    ByteReadChannelJVM byteReadChannelJVM = this.$input;
                    ByteChannelCtor byteChannelCtor = this.$replacementChannel;
                    this.label = 1;
                    c455691 = this;
                    try {
                        if (ByteReadChannel2.copyAndClose$default(byteReadChannelJVM, byteChannelCtor, 0L, c455691, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        c455691.$input.cancel(th);
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c455691 = this;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th4) {
                    th = th4;
                    c455691 = this;
                    c455691.$input.cancel(th);
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
    }
}
