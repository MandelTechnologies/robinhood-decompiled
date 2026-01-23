package androidx.work.impl.constraints.trackers;

import androidx.work.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BatteryNotLowTracker.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"", "TAG", "Ljava/lang/String;", "work-runtime_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.work.impl.constraints.trackers.BatteryNotLowTrackerKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class BatteryNotLowTracker2 {
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("BatteryNotLowTracker");
        Intrinsics.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(\"BatteryNotLowTracker\")");
        TAG = strTagWithPrefix;
    }
}
