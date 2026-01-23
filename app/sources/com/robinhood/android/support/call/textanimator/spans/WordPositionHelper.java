package com.robinhood.android.support.call.textanimator.spans;

import android.graphics.Point;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WordPositionHelper.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/call/textanimator/spans/WordPositionHelper;", "", "startPositions", "", "Landroid/graphics/Point;", "<init>", "(Ljava/util/List;)V", "step", "", "previousStart", "getStartPosition", "start", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class WordPositionHelper {
    public static final int $stable = 8;
    private int previousStart;
    private final List<Point> startPositions;
    private int step;

    /* JADX WARN: Multi-variable type inference failed */
    public WordPositionHelper(List<? extends Point> startPositions) {
        Intrinsics.checkNotNullParameter(startPositions, "startPositions");
        this.startPositions = startPositions;
        this.previousStart = -1;
    }

    public final Point getStartPosition(int start) {
        int i = this.previousStart;
        if (i != -1) {
            if (start > i) {
                this.step++;
            } else if (start < i) {
                this.step = 0;
            }
        }
        this.previousStart = start;
        return this.startPositions.get(this.step);
    }
}
