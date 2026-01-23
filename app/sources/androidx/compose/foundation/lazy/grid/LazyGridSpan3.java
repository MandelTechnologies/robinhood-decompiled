package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LazyGridSpan.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"GridItemSpan", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "currentLineSpan", "", "(I)J", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.lazy.grid.LazyGridSpanKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class LazyGridSpan3 {
    public static final long GridItemSpan(int i) {
        if (!(i > 0)) {
            InlineClassHelper.throwIllegalArgumentException("The span value should be higher than 0");
        }
        return LazyGridSpan.m5219constructorimpl(i);
    }
}
