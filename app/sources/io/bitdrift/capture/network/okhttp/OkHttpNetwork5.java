package io.bitdrift.capture.network.okhttp;

import io.bitdrift.capture.network.ICaptureNetwork3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OkHttpNetwork.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: io.bitdrift.capture.network.okhttp.OkHttpNetwork$StreamState$streamId$1, reason: use source file name */
/* loaded from: classes14.dex */
/* synthetic */ class OkHttpNetwork5 extends FunctionReferenceImpl implements Function1<Long, Unit> {
    OkHttpNetwork5(Object obj) {
        super(1, obj, ICaptureNetwork3.class, "releaseApiStream", "releaseApiStream(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l) {
        invoke(l.longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(long j) {
        ((ICaptureNetwork3) this.receiver).releaseApiStream(j);
    }
}
