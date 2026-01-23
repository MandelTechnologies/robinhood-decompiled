package com.robinhood.shared.tradeladder.p398ui.ladder.gestures;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LadderCustomGestureDetector.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/gestures/DragDirection;", "", "<init>", "(Ljava/lang/String;I)V", "VERTICAL", "HORIZONTAL", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.gestures.DragDirection, reason: use source file name */
/* loaded from: classes12.dex */
public final class LadderCustomGestureDetector3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LadderCustomGestureDetector3[] $VALUES;
    public static final LadderCustomGestureDetector3 VERTICAL = new LadderCustomGestureDetector3("VERTICAL", 0);
    public static final LadderCustomGestureDetector3 HORIZONTAL = new LadderCustomGestureDetector3("HORIZONTAL", 1);

    private static final /* synthetic */ LadderCustomGestureDetector3[] $values() {
        return new LadderCustomGestureDetector3[]{VERTICAL, HORIZONTAL};
    }

    public static EnumEntries<LadderCustomGestureDetector3> getEntries() {
        return $ENTRIES;
    }

    private LadderCustomGestureDetector3(String str, int i) {
    }

    static {
        LadderCustomGestureDetector3[] ladderCustomGestureDetector3Arr$values = $values();
        $VALUES = ladderCustomGestureDetector3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(ladderCustomGestureDetector3Arr$values);
    }

    public static LadderCustomGestureDetector3 valueOf(String str) {
        return (LadderCustomGestureDetector3) Enum.valueOf(LadderCustomGestureDetector3.class, str);
    }

    public static LadderCustomGestureDetector3[] values() {
        return (LadderCustomGestureDetector3[]) $VALUES.clone();
    }
}
