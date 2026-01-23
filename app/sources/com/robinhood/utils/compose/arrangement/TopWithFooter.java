package com.robinhood.utils.compose.arrangement;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p011ui.unit.Density;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TopWithFooter.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/utils/compose/arrangement/TopWithFooter;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "footerElementCount", "", "<init>", "(I)V", "arrange", "", "Landroidx/compose/ui/unit/Density;", "totalSize", "sizes", "", "outPositions", "lib-utils-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class TopWithFooter implements Arrangement.Vertical {
    public static final int $stable = 0;
    private final int footerElementCount;

    @Override // androidx.compose.foundation.layout.Arrangement.Vertical
    /* renamed from: getSpacing-D9Ej5fM */
    public /* bridge */ /* synthetic */ float getSpacing() {
        return super.getSpacing();
    }

    public TopWithFooter(int i) {
        this.footerElementCount = i;
    }

    @Override // androidx.compose.foundation.layout.Arrangement.Vertical
    public void arrange(Density density, int i, int[] sizes, int[] outPositions) {
        Intrinsics.checkNotNullParameter(density, "<this>");
        Intrinsics.checkNotNullParameter(sizes, "sizes");
        Intrinsics.checkNotNullParameter(outPositions, "outPositions");
        int length = sizes.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = sizes[i2];
            outPositions[i4] = i3;
            i3 += i5;
            i2++;
            i4++;
        }
        if (i3 >= i) {
            return;
        }
        int lastIndex = ArraysKt.getLastIndex(outPositions);
        int i6 = this.footerElementCount;
        for (int i7 = 0; i7 < i6; i7++) {
            i -= sizes[lastIndex];
            outPositions[lastIndex] = i;
            lastIndex--;
        }
    }
}
