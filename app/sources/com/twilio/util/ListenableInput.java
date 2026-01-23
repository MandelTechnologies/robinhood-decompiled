package com.twilio.util;

import io.ktor.utils.p478io.core.Input;
import io.ktor.utils.p478io.core.InputArrays;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ListenableInput.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B2\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012!\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\tH\u0014J'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/twilio/util/ListenableInput;", "Lio/ktor/utils/io/core/Input;", "input", "onProgress", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "bytesRead", "", "<init>", "(Lio/ktor/utils/io/core/Input;Lkotlin/jvm/functions/Function1;)V", "getBytesRead", "()J", "setBytesRead", "(J)V", "closeSource", "fill", "", "destination", "Lio/ktor/utils/io/bits/Memory;", "offset", "length", "fill-62zg_DM", "(Ljava/nio/ByteBuffer;II)I", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
final class ListenableInput extends Input {
    private long bytesRead;
    private final Input input;
    private final Function1<Long, Unit> onProgress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ListenableInput(Input input, Function1<? super Long, Unit> onProgress) {
        super(null, 0L, null, 7, null);
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(onProgress, "onProgress");
        this.input = input;
        this.onProgress = onProgress;
    }

    public final long getBytesRead() {
        return this.bytesRead;
    }

    public final void setBytesRead(long j) {
        this.bytesRead = j;
    }

    @Override // io.ktor.utils.p478io.core.Input
    protected void closeSource() {
        this.input.close();
    }

    @Override // io.ktor.utils.p478io.core.Input
    /* renamed from: fill-62zg_DM, reason: not valid java name */
    protected int mo27243fill62zg_DM(ByteBuffer destination, int offset, int length) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        int iM28483readAvailableUAd2zVI = 0;
        while (iM28483readAvailableUAd2zVI == 0) {
            iM28483readAvailableUAd2zVI = InputArrays.m28483readAvailableUAd2zVI(this.input, destination, offset, length);
        }
        if (iM28483readAvailableUAd2zVI == -1) {
            return 0;
        }
        long j = this.bytesRead + iM28483readAvailableUAd2zVI;
        this.bytesRead = j;
        this.onProgress.invoke(Long.valueOf(j));
        return iM28483readAvailableUAd2zVI;
    }
}
