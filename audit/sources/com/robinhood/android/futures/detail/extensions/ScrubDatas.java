package com.robinhood.android.futures.detail.extensions;

import com.robinhood.futures.charts.contracts.models.ScrubData;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ScrubDatas.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"getScrubDisplay", "", "", "Lcom/robinhood/futures/charts/contracts/models/ScrubData;", "x", "", "feature-futures-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.detail.extensions.ScrubDatasKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ScrubDatas {
    public static final String getScrubDisplay(List<ScrubData> list, float f) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ScrubData scrubData = (ScrubData) next;
            double d = f;
            if (d >= scrubData.getStartX() && d <= scrubData.getEndX()) {
                break;
            }
        }
        ScrubData scrubData2 = (ScrubData) next;
        if (scrubData2 != null) {
            return scrubData2.getScrubDisplay();
        }
        return null;
    }
}
