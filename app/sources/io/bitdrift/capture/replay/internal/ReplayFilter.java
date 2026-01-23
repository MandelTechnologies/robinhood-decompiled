package io.bitdrift.capture.replay.internal;

import io.bitdrift.capture.replay.ReplayType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReplayFilter.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u00062\u0016\u0010\b\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004j\u0002`\tR\u001c\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lio/bitdrift/capture/replay/internal/ReplayFilter;", "", "()V", "previousCapture", "", "Lio/bitdrift/capture/replay/internal/ReplayRect;", "Lio/bitdrift/capture/replay/internal/FilteredCapture;", "filter", "capture", "Lio/bitdrift/capture/replay/internal/Capture;", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class ReplayFilter {
    private List<ReplayRect> previousCapture;

    public final List<ReplayRect> filter(List<? extends List<ReplayRect>> capture) {
        Intrinsics.checkNotNullParameter(capture, "capture");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends List<ReplayRect>> it = capture.iterator();
        while (it.hasNext()) {
            for (ReplayRect replayRect : it.next()) {
                if (!Intrinsics.areEqual(replayRect.getType(), ReplayType.Ignore.INSTANCE)) {
                    arrayList.add(replayRect);
                }
            }
        }
        if (Intrinsics.areEqual(arrayList, this.previousCapture) || arrayList.isEmpty()) {
            return null;
        }
        this.previousCapture = arrayList;
        return arrayList;
    }
}
