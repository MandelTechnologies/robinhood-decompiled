package com.robinhood.android.eventcontracts.sharedeventui.animation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MovingDeltasAnimation.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/animation/Side;", "", "rowOffsetMultiplier", "", "<init>", "(Ljava/lang/String;II)V", "getRowOffsetMultiplier", "()I", "LEFT", "RIGHT", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.animation.Side, reason: use source file name */
/* loaded from: classes3.dex */
public final class MovingDeltasAnimation8 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MovingDeltasAnimation8[] $VALUES;
    public static final MovingDeltasAnimation8 LEFT = new MovingDeltasAnimation8("LEFT", 0, 0);
    public static final MovingDeltasAnimation8 RIGHT = new MovingDeltasAnimation8("RIGHT", 1, -1);
    private final int rowOffsetMultiplier;

    private static final /* synthetic */ MovingDeltasAnimation8[] $values() {
        return new MovingDeltasAnimation8[]{LEFT, RIGHT};
    }

    public static EnumEntries<MovingDeltasAnimation8> getEntries() {
        return $ENTRIES;
    }

    private MovingDeltasAnimation8(String str, int i, int i2) {
        this.rowOffsetMultiplier = i2;
    }

    public final int getRowOffsetMultiplier() {
        return this.rowOffsetMultiplier;
    }

    static {
        MovingDeltasAnimation8[] movingDeltasAnimation8Arr$values = $values();
        $VALUES = movingDeltasAnimation8Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(movingDeltasAnimation8Arr$values);
    }

    public static MovingDeltasAnimation8 valueOf(String str) {
        return (MovingDeltasAnimation8) Enum.valueOf(MovingDeltasAnimation8.class, str);
    }

    public static MovingDeltasAnimation8[] values() {
        return (MovingDeltasAnimation8[]) $VALUES.clone();
    }
}
