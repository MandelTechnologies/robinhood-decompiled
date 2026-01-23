package io.ktor.utils.p478io.jvm.javaio;

import io.ktor.utils.p478io.ByteReadChannelJVM;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;

/* compiled from: Blocking.kt */
@Metadata(m3635d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u0094@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, m3636d2 = {"io/ktor/utils/io/jvm/javaio/InputAdapter$loop$1", "Lio/ktor/utils/io/jvm/javaio/BlockingAdapter;", "loop", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class InputAdapter$loop$1 extends BlockingAdapter {
    final /* synthetic */ InputAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InputAdapter$loop$1(Job job, InputAdapter inputAdapter) {
        super(job);
        this.this$0 = inputAdapter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        if (r10 != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061 A[PHI: r2 r10
      0x0061: PHI (r2v2 io.ktor.utils.io.jvm.javaio.InputAdapter$loop$1) = (r2v3 io.ktor.utils.io.jvm.javaio.InputAdapter$loop$1), (r2v8 io.ktor.utils.io.jvm.javaio.InputAdapter$loop$1) binds: [B:20:0x005e, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x0061: PHI (r10v3 java.lang.Object) = (r10v7 java.lang.Object), (r10v1 java.lang.Object) binds: [B:20:0x005e, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0081 -> B:25:0x0084). Please report as a decompilation issue!!! */
    @Override // io.ktor.utils.p478io.jvm.javaio.BlockingAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Object loop(Continuation<? super Unit> continuation) {
        InputAdapter$loop$1$loop$1 inputAdapter$loop$1$loop$1;
        int iIntValue;
        InputAdapter$loop$1 inputAdapter$loop$1;
        if (continuation instanceof InputAdapter$loop$1$loop$1) {
            inputAdapter$loop$1$loop$1 = (InputAdapter$loop$1$loop$1) continuation;
            int i = inputAdapter$loop$1$loop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inputAdapter$loop$1$loop$1.label = i - Integer.MIN_VALUE;
            } else {
                inputAdapter$loop$1$loop$1 = new InputAdapter$loop$1$loop$1(this, continuation);
            }
        }
        Object available = inputAdapter$loop$1$loop$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = inputAdapter$loop$1$loop$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(available);
            iIntValue = 0;
            inputAdapter$loop$1 = this;
            inputAdapter$loop$1.result = iIntValue;
            inputAdapter$loop$1$loop$1.L$0 = inputAdapter$loop$1;
            inputAdapter$loop$1$loop$1.L$1 = inputAdapter$loop$1;
            inputAdapter$loop$1$loop$1.label = 1;
            available = inputAdapter$loop$1.rendezvousBlock(inputAdapter$loop$1$loop$1);
            if (available == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            }
            if (available != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            inputAdapter$loop$1 = (InputAdapter$loop$1) inputAdapter$loop$1$loop$1.L$0;
            ResultKt.throwOnFailure(available);
            iIntValue = ((Number) available).intValue();
            if (iIntValue == -1) {
                inputAdapter$loop$1.this$0.context.complete();
                inputAdapter$loop$1.finish(iIntValue);
                return Unit.INSTANCE;
            }
            inputAdapter$loop$1.result = iIntValue;
            inputAdapter$loop$1$loop$1.L$0 = inputAdapter$loop$1;
            inputAdapter$loop$1$loop$1.L$1 = inputAdapter$loop$1;
            inputAdapter$loop$1$loop$1.label = 1;
            available = inputAdapter$loop$1.rendezvousBlock(inputAdapter$loop$1$loop$1);
            if (available == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbes.probeCoroutineSuspended(inputAdapter$loop$1$loop$1);
            }
            if (available != coroutine_suspended) {
                Intrinsics.checkNotNull(available, "null cannot be cast to non-null type kotlin.ByteArray");
                ByteReadChannelJVM byteReadChannelJVM = inputAdapter$loop$1.this$0.channel;
                int offset = inputAdapter$loop$1.getOffset();
                int length = inputAdapter$loop$1.getLength();
                inputAdapter$loop$1$loop$1.L$0 = inputAdapter$loop$1;
                inputAdapter$loop$1$loop$1.L$1 = null;
                inputAdapter$loop$1$loop$1.label = 2;
                available = byteReadChannelJVM.readAvailable((byte[]) available, offset, length, inputAdapter$loop$1$loop$1);
            }
            return coroutine_suspended;
        }
        inputAdapter$loop$1 = (InputAdapter$loop$1) inputAdapter$loop$1$loop$1.L$0;
        ResultKt.throwOnFailure(available);
        Intrinsics.checkNotNull(available, "null cannot be cast to non-null type kotlin.ByteArray");
        ByteReadChannelJVM byteReadChannelJVM2 = inputAdapter$loop$1.this$0.channel;
        int offset2 = inputAdapter$loop$1.getOffset();
        int length2 = inputAdapter$loop$1.getLength();
        inputAdapter$loop$1$loop$1.L$0 = inputAdapter$loop$1;
        inputAdapter$loop$1$loop$1.L$1 = null;
        inputAdapter$loop$1$loop$1.label = 2;
        available = byteReadChannelJVM2.readAvailable((byte[]) available, offset2, length2, inputAdapter$loop$1$loop$1);
    }
}
