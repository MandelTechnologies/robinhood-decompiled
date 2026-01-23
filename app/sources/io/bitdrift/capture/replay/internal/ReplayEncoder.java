package io.bitdrift.capture.replay.internal;

import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p481io.Closeable;

/* compiled from: ReplayEncoder.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b¨\u0006\t"}, m3636d2 = {"Lio/bitdrift/capture/replay/internal/ReplayEncoder;", "", "()V", "encode", "", "scanResult", "", "Lio/bitdrift/capture/replay/internal/ReplayRect;", "Lio/bitdrift/capture/replay/internal/FilteredCapture;", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class ReplayEncoder {
    public final byte[] encode(List<ReplayRect> scanResult) {
        Intrinsics.checkNotNullParameter(scanResult, "scanResult");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            Iterator<ReplayRect> it = scanResult.iterator();
            while (it.hasNext()) {
                it.next().m3329to(byteArrayOutputStream);
            }
            Unit unit = Unit.INSTANCE;
            Closeable.closeFinally(byteArrayOutputStream, null);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
            return byteArray;
        } finally {
        }
    }
}
