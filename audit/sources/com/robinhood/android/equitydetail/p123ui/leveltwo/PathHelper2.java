package com.robinhood.android.equitydetail.p123ui.leveltwo;

import android.graphics.Path;
import android.graphics.RectF;
import com.robinhood.models.p355ui.Pricebook;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PathHelper.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¨\u0006\u000b"}, m3636d2 = {"populateWithEntries", "", "Landroid/graphics/Path;", "entries", "", "Lcom/robinhood/models/ui/Pricebook$Entry;", "isBid", "", "measureRect", "Landroid/graphics/RectF;", "validBounds", "feature-equity-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitydetail.ui.leveltwo.PathHelperKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class PathHelper2 {
    static /* synthetic */ void populateWithEntries$default(Path path, List list, boolean z, RectF rectF, RectF rectF2, int i, Object obj) {
        if ((i & 8) != 0) {
            rectF2 = null;
        }
        populateWithEntries(path, list, z, rectF, rectF2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void populateWithEntries(Path path, List<Pricebook.Entry> list, boolean z, RectF rectF, RectF rectF2) {
        path.reset();
        path.incReserve(list.size());
        path.moveTo(((Pricebook.Entry) CollectionsKt.first((List) list)).getPriceFloat(), 0.0f);
        BigDecimal element = BigDecimal.ZERO;
        int size = list.size();
        Float fValueOf = null;
        for (int i = 0; i < size; i++) {
            Pricebook.Entry entry = list.get(i);
            Intrinsics.checkNotNullExpressionValue(element, "element");
            element = element.add(entry.getQuantity());
            Intrinsics.checkNotNullExpressionValue(element, "add(...)");
            float priceFloat = entry.getPriceFloat();
            float fFloatValue = element.floatValue();
            if (rectF2 != null && !rectF2.contains(priceFloat, fFloatValue)) {
                float f = z ? rectF2.left : rectF2.right;
                if (fValueOf != null) {
                    path.lineTo(f, fValueOf.floatValue());
                }
            } else {
                if (fValueOf != null) {
                    path.lineTo(priceFloat, fValueOf.floatValue());
                }
                path.lineTo(priceFloat, fFloatValue);
                fValueOf = Float.valueOf(fFloatValue);
            }
        }
        path.computeBounds(rectF, false);
        path.rLineTo(0.0f, -rectF.height());
        if (z) {
            path.rLineTo(rectF.width(), 0.0f);
        } else {
            path.rLineTo(-rectF.width(), 0.0f);
        }
        path.close();
    }
}
