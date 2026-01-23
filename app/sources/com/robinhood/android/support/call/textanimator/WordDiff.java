package com.robinhood.android.support.call.textanimator;

import android.graphics.Point;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bitbucket.cowwoc.diffmatchpatch.DiffMatchPatch;

/* compiled from: WordDiff.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R$\u0010\u001a\u001a\u0004\u0018\u00010\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001b\u0010\u0016R$\u0010\u001d\u001a\u0004\u0018\u00010\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u001c\u0010%\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0011\u0010.\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/support/call/textanimator/WordDiff;", "", "diff", "Lorg/bitbucket/cowwoc/diffmatchpatch/DiffMatchPatch$Diff;", "<init>", "(Lorg/bitbucket/cowwoc/diffmatchpatch/DiffMatchPatch$Diff;)V", "operation", "Lorg/bitbucket/cowwoc/diffmatchpatch/DiffMatchPatch$Operation;", "getOperation", "()Lorg/bitbucket/cowwoc/diffmatchpatch/DiffMatchPatch$Operation;", "text", "", "getText", "()Ljava/lang/String;", "startPositions", "", "", "Landroid/graphics/Point;", "getStartPositions", "()Ljava/util/Map;", "startPositionX", "getStartPositionX", "()Ljava/lang/Integer;", "startPositionY", "getStartPositionY", "value", "endPositionX", "getEndPositionX", "Ljava/lang/Integer;", "endPositionY", "getEndPositionY", "hasStartPosition", "", "getHasStartPosition", "()Z", "hasEndPosition", "getHasEndPosition", "anchor", "getAnchor", "()Lcom/robinhood/android/support/call/textanimator/WordDiff;", "setAnchor", "(Lcom/robinhood/android/support/call/textanimator/WordDiff;)V", "setEndPosition", "", "x", "y", "deltaX", "getDeltaX", "()I", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class WordDiff {
    public static final int $stable = 8;
    private WordDiff anchor;
    private Integer endPositionX;
    private Integer endPositionY;
    private final DiffMatchPatch.Operation operation;
    private final Map<Integer, Point> startPositions;
    private final String text;

    public WordDiff(DiffMatchPatch.Diff diff) {
        Intrinsics.checkNotNullParameter(diff, "diff");
        DiffMatchPatch.Operation operation2 = diff.f10819operation;
        Intrinsics.checkNotNullExpressionValue(operation2, "operation");
        this.operation = operation2;
        String text = diff.text;
        Intrinsics.checkNotNullExpressionValue(text, "text");
        this.text = text;
        this.startPositions = new LinkedHashMap();
    }

    public final DiffMatchPatch.Operation getOperation() {
        return this.operation;
    }

    public final String getText() {
        return this.text;
    }

    public final Map<Integer, Point> getStartPositions() {
        return this.startPositions;
    }

    public final Integer getStartPositionX() {
        Point point = (Point) CollectionsKt.firstOrNull(this.startPositions.values());
        if (point != null) {
            return Integer.valueOf(point.x);
        }
        return null;
    }

    public final Integer getStartPositionY() {
        Point point = (Point) CollectionsKt.firstOrNull(this.startPositions.values());
        if (point != null) {
            return Integer.valueOf(point.y);
        }
        return null;
    }

    public final Integer getEndPositionX() {
        return this.endPositionX;
    }

    public final Integer getEndPositionY() {
        return this.endPositionY;
    }

    public final boolean getHasStartPosition() {
        return (getStartPositionX() == null || getStartPositionY() == null) ? false : true;
    }

    public final boolean getHasEndPosition() {
        return (this.endPositionX == null || this.endPositionY == null) ? false : true;
    }

    public final WordDiff getAnchor() {
        return this.anchor;
    }

    public final void setAnchor(WordDiff wordDiff) {
        this.anchor = wordDiff;
    }

    public final void setEndPosition(int x, int y) {
        this.endPositionX = Integer.valueOf(x);
        this.endPositionY = Integer.valueOf(y);
    }

    public final int getDeltaX() {
        Integer num = this.endPositionX;
        if (num != null) {
            int iIntValue = num.intValue();
            Integer startPositionX = getStartPositionX();
            if (startPositionX != null) {
                return iIntValue - startPositionX.intValue();
            }
        }
        return 0;
    }
}
