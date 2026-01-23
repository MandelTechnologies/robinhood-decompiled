package androidx.compose.foundation.lazy.layout;

import androidx.collection.ScatterMap6;
import androidx.collection.ScatterMap7;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LazyLayoutPrefetchState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\u000e\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\fJ\u0018\u0010\u0011\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\fR\u001c\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;", "", "()V", "averagesByContentType", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/foundation/lazy/layout/Averages;", "lastUsedAverage", "lastUsedContentType", "overallAverage", "getAverage", "contentType", "getCompositionTimeNanos", "", "getMeasureTimeNanos", "saveCompositionTime", "", "timeNanos", "saveMeasureTime", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PrefetchMetrics {
    private Averages lastUsedAverage;
    private Object lastUsedContentType;
    private final Averages overallAverage = new Averages();
    private final ScatterMap6<Object, Averages> averagesByContentType = ScatterMap7.mutableScatterMapOf();

    private final Averages getAverage(Object contentType) {
        Averages averages = this.lastUsedAverage;
        if (this.lastUsedContentType == contentType && averages != null) {
            return averages;
        }
        ScatterMap6<Object, Averages> scatterMap6 = this.averagesByContentType;
        Averages averagesCopy = scatterMap6.get(contentType);
        if (averagesCopy == null) {
            averagesCopy = this.overallAverage.copy();
            scatterMap6.set(contentType, averagesCopy);
        }
        Averages averages2 = averagesCopy;
        this.lastUsedContentType = contentType;
        this.lastUsedAverage = averages2;
        return averages2;
    }

    public final long getCompositionTimeNanos(Object contentType) {
        return getAverage(contentType).getCompositionTimeNanos();
    }

    public final long getMeasureTimeNanos(Object contentType) {
        return getAverage(contentType).getMeasureTimeNanos();
    }

    public final void saveCompositionTime(Object contentType, long timeNanos) {
        this.overallAverage.saveCompositionTimeNanos(timeNanos);
        getAverage(contentType).saveCompositionTimeNanos(timeNanos);
    }

    public final void saveMeasureTime(Object contentType, long timeNanos) {
        this.overallAverage.saveMeasureTimeNanos(timeNanos);
        getAverage(contentType).saveMeasureTimeNanos(timeNanos);
    }
}
