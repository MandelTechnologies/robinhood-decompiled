package sprig.graphics;

import com.singular.sdk.internal.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m3636d2 = {"Lsprig/e/l;", "", "Lsprig/e/i;", "type", "", "time", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "", "I", "getThresholdMs", "()I", "thresholdMs", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function1;", "onThresholdExceeded", "", "Lsprig/e/j;", "c", "Ljava/util/Map;", "metrics", "<init>", "(ILkotlin/jvm/functions/Function1;)V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
/* renamed from: sprig.e.l */
/* loaded from: classes28.dex */
public final class C49020l {

    /* renamed from: a, reason: from kotlin metadata */
    private final int thresholdMs;

    /* renamed from: b, reason: from kotlin metadata */
    private final Function1<Integer, Unit> onThresholdExceeded;

    /* renamed from: c, reason: from kotlin metadata */
    private final Map<EnumC49017i, RecordingMetric> metrics;

    /* JADX WARN: Multi-variable type inference failed */
    public C49020l(int i, Function1<? super Integer, Unit> onThresholdExceeded) {
        Intrinsics.checkNotNullParameter(onThresholdExceeded, "onThresholdExceeded");
        this.thresholdMs = i;
        this.onThresholdExceeded = onThresholdExceeded;
        this.metrics = new LinkedHashMap();
    }

    /* renamed from: a */
    public final void m4195a(EnumC49017i type2, long time) {
        Intrinsics.checkNotNullParameter(type2, "type");
        RecordingMetric recordingMetric = this.metrics.get(type2);
        if (recordingMetric == null) {
            recordingMetric = new RecordingMetric(0, 0L, 3, null);
        }
        recordingMetric.m4192a(recordingMetric.getSampleCount() + 1);
        recordingMetric.m4193a(recordingMetric.getTotal() + time);
        long total = recordingMetric.getTotal() / recordingMetric.getSampleCount();
        int i = this.thresholdMs;
        if (total > i) {
            this.onThresholdExceeded.invoke(Integer.valueOf(i));
        }
        this.metrics.put(type2, recordingMetric);
    }
}
