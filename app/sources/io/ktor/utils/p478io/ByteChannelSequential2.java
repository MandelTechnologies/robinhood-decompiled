package io.ktor.utils.p478io;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelSequential.kt */
@Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "io.ktor.utils.io.ByteChannelSequentialBase", m3645f = "ByteChannelSequential.kt", m3646l = {88}, m3647m = "awaitAtLeastNBytesAvailableForRead$ktor_io")
/* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1, reason: use source file name */
/* loaded from: classes14.dex */
final class ByteChannelSequential2 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ByteChannelSequential this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ByteChannelSequential2(ByteChannelSequential byteChannelSequential, Continuation<? super ByteChannelSequential2> continuation) {
        super(continuation);
        this.this$0 = byteChannelSequential;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitAtLeastNBytesAvailableForRead$ktor_io(0, this);
    }
}
