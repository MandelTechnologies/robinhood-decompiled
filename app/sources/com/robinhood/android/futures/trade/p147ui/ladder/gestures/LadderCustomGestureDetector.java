package com.robinhood.android.futures.trade.p147ui.ladder.gestures;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LadderCustomGestureDetector.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/gestures/DragDirection;", "", "<init>", "(Ljava/lang/String;I)V", "VERTICAL", "HORIZONTAL", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.trade.ui.ladder.gestures.DragDirection, reason: use source file name */
/* loaded from: classes10.dex */
public final class LadderCustomGestureDetector {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LadderCustomGestureDetector[] $VALUES;
    public static final LadderCustomGestureDetector VERTICAL = new LadderCustomGestureDetector("VERTICAL", 0);
    public static final LadderCustomGestureDetector HORIZONTAL = new LadderCustomGestureDetector("HORIZONTAL", 1);

    private static final /* synthetic */ LadderCustomGestureDetector[] $values() {
        return new LadderCustomGestureDetector[]{VERTICAL, HORIZONTAL};
    }

    public static EnumEntries<LadderCustomGestureDetector> getEntries() {
        return $ENTRIES;
    }

    private LadderCustomGestureDetector(String str, int i) {
    }

    static {
        LadderCustomGestureDetector[] ladderCustomGestureDetectorArr$values = $values();
        $VALUES = ladderCustomGestureDetectorArr$values;
        $ENTRIES = EnumEntries2.enumEntries(ladderCustomGestureDetectorArr$values);
    }

    public static LadderCustomGestureDetector valueOf(String str) {
        return (LadderCustomGestureDetector) Enum.valueOf(LadderCustomGestureDetector.class, str);
    }

    public static LadderCustomGestureDetector[] values() {
        return (LadderCustomGestureDetector[]) $VALUES.clone();
    }
}
