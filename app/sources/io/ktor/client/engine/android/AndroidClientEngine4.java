package io.ktor.client.engine.android;

import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.p478io.ByteWriteChannel;
import io.ktor.utils.p478io.Coroutines6;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AndroidClientEngine.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "io.ktor.client.engine.android.AndroidClientEngineKt$writeTo$2$channel$1", m3645f = "AndroidClientEngine.kt", m3646l = {120}, m3647m = "invokeSuspend")
/* renamed from: io.ktor.client.engine.android.AndroidClientEngineKt$writeTo$2$channel$1, reason: use source file name */
/* loaded from: classes14.dex */
final class AndroidClientEngine4 extends ContinuationImpl7 implements Function2<Coroutines6, Continuation<? super Unit>, Object> {
    final /* synthetic */ OutgoingContent $this_writeTo;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidClientEngine4(OutgoingContent outgoingContent, Continuation<? super AndroidClientEngine4> continuation) {
        super(2, continuation);
        this.$this_writeTo = outgoingContent;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AndroidClientEngine4 androidClientEngine4 = new AndroidClientEngine4(this.$this_writeTo, continuation);
        androidClientEngine4.L$0 = obj;
        return androidClientEngine4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Coroutines6 coroutines6, Continuation<? super Unit> continuation) {
        return ((AndroidClientEngine4) create(coroutines6, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Coroutines6 coroutines6 = (Coroutines6) this.L$0;
            OutgoingContent.WriteChannelContent writeChannelContent = (OutgoingContent.WriteChannelContent) this.$this_writeTo;
            ByteWriteChannel channel = coroutines6.getChannel();
            this.label = 1;
            if (writeChannelContent.writeTo(channel, this) == coroutine_suspended) {
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
}
